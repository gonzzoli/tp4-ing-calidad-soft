import org.ing_calidad_soft.tp4.ExceptionLimiteVariantesAlcanzado;
import org.ing_calidad_soft.tp4.ExceptionVarianteNoPuedeSerProductoBase;
import org.ing_calidad_soft.tp4.Producto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Bueno aca cada uno hara sus tests magicos
public class ProductoTest {

    @Test
    void TestValidarAplicacionDescuento() {
        Producto producto = new Producto();
        producto.setPrecio(100.0);
        producto.setDescuentoAplicado(0.3);
        assertEquals(producto.getPrecioConDescuento(), 70.0);
    }

    @Test
    void TestValidarLimiteVariantes() throws ExceptionLimiteVariantesAlcanzado, ExceptionVarianteNoPuedeSerProductoBase {
        Producto producto = new Producto();
        for (int i = 0; i < 10; i++) {
            Producto variante = new Producto();
            producto.agregarVariante(variante);
        }
        Producto varianteProhibida = new Producto();
        Exception exceptionLanzada = assertThrows(ExceptionLimiteVariantesAlcanzado.class, () -> producto.agregarVariante(varianteProhibida));
        assertEquals(exceptionLanzada.getMessage(), "No puedes agregar mas de " + Producto.maximoVariantes + " variantes al producto.");
    }

    @Test
    void TestValidarVarianteNoPuedeSerProductoBase() throws ExceptionLimiteVariantesAlcanzado, ExceptionVarianteNoPuedeSerProductoBase {
        Producto productoBase = new Producto();
        Producto productoVariante = new Producto();
        productoBase.agregarVariante(productoVariante);
        Producto productoVarianteDeVariante = new Producto();
        assertThrows(ExceptionVarianteNoPuedeSerProductoBase.class, () -> productoVariante.agregarVariante(productoVarianteDeVariante));
    }

    @Test
    void TestValidarCompraConStock(){
        assertTrue(Producto.validarCompraConStock(60, 5));
    }

    @Test
    void TestValidarTipoProductos(){
        assertFalse(Producto.compararTipoDeProductos("remera","pantalon"));
    }

    @Test
    void TestValidarVariantes(){
        assertEquals(Producto.validarVariantes("remera"),"tiene variantes");
    }

    @Test
    void TestValidarCategoria(){
        assertTrue(Producto.categoriaValida("ropa"));
    }

    @Test
    void TestValidarSubtotal(){
        assertEquals(Producto.subTotal(2, 4),8);
    }

    @Test
    void TestEstadoCompraRealizada(){
        assertTrue(Producto.compraRealizada("Celular", "Pendiente"));
    }

    @Test
    void TestProductoVisible(){ assertTrue(Producto.productoVisible("Pantalon azul", "Visible"));}

    @Test
    void TestCompararPreciosProducto(){ assertEquals(Producto.CompararPreciosProducto( 10, 12), "precio 1 menor a precio 2");}

    @Test
    void TestValidarStockMayorA0(){ assertTrue(Producto.validarStockMayorA0( "Remera roja", 15));}

}

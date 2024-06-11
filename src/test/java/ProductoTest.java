import org.ing_calidad_soft.tp4.Producto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Bueno aca cada uno hara sus tests magicos
public class ProductoTest {

    @Test
    void TestSumar() {
        assertEquals(Producto.sumar(1,2), 3);
    }

    @Test
    void TestMultiplicar() {
        // se que es 63, pero para probar
        assertEquals(Producto.multiplicar(9,7), 64);
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
}

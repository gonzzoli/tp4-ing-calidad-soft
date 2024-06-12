package org.ing_calidad_soft.tp4;

import java.util.ArrayList;

public class Producto {
    public static int maximoVariantes = 10;
    private double precio;
    private double descuentoAplicado;
    private boolean esVariante;
    private ArrayList<Producto> productosVariantes = new ArrayList<>();

    public static boolean validarCompraConStock(int stockActual, int productos){
        return stockActual > productos;
    }

    public static boolean compararTipoDeProductos(String tipoProducto1, String tipoProducto2){
        return tipoProducto1.equals(tipoProducto2);
    }

    public static String validarVariantes(String producto){
        if(producto.equals("remera")){
            return "tiene variantes";
        }else{
            return "no tiene variantes";
        }
    }
    public static boolean categoriaValida(String categoria) {
        if (categoria.equals("ropa")) {
            return true;
        }
        else{return false;}
    }

    public static double subTotal(Integer cantidad, double precio) {

            return cantidad*precio;
    }

    public static boolean compraRealizada(String producto,String estado) {
        if (estado.equals("Realizada")) {
            return true;
        }
        else{return false;}
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuentoAplicado() {
        return descuentoAplicado;
    }

    public void setDescuentoAplicado(double descuentoAplicado) {
        this.descuentoAplicado = descuentoAplicado;
    }

    public double getPrecioConDescuento() {
        return precio - precio*descuentoAplicado;
    }

    public void agregarVariante(Producto variante) throws ExceptionLimiteVariantesAlcanzado, ExceptionVarianteNoPuedeSerProductoBase {
        if (!productosVariantes.isEmpty() && productosVariantes.size() == maximoVariantes) throw new ExceptionLimiteVariantesAlcanzado(maximoVariantes);
        if (this.esVariante) throw new ExceptionVarianteNoPuedeSerProductoBase();
        variante.setEsVariante(true);
        productosVariantes.add(variante);
    }

    public boolean getEsVariante() {
        return esVariante;
    }

    public void setEsVariante(boolean esVariante) {
        this.esVariante = esVariante;
    }
}



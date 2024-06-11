package org.ing_calidad_soft.tp4;

public class Producto {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

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
}



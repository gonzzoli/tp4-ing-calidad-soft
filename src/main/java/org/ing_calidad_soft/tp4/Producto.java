package org.ing_calidad_soft.tp4;

public class Producto {
    public static Integer sumar(Integer a, Integer b) {
        return a + b;
    }

    public static Integer multiplicar(Integer a, Integer b) {
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

}

package org.ing_calidad_soft.tp4;

public class Producto {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static boolean validarCompraConStock(int stockActual, int productos) {
        return stockActual > productos;
    }

    public static boolean compararTipoDeProductos(String tipoProducto1, String tipoProducto2) {
        return tipoProducto1.equals(tipoProducto2);
    }

    public static String validarVariantes(String producto) {
        if (producto.equals("remera")) {
            return "tiene variantes";
        } else {
            return "no tiene variantes";
        }
    }

    public static boolean categoriaValida(String categoria) {
        if (categoria.equals("ropa")) {
            return true;
        } else {
            return false;
        }
    }

    public static double subTotal(Integer cantidad, double precio) {

        return cantidad * precio;
    }

    public static boolean compraRealizada(String producto, String estado) {
        if (estado.equals("Realizada")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean productoVisible(String producto, String estado) {
        if (estado.equals("Visible")) {
            return true;
        } else {
            return false;
        }
    }

    public static String CompararPreciosProducto(int precio1, int precio2) {
        if (precio1 < precio2) {
            return "precio 1 menor a precio 2";
        } else if (precio1 > precio2) {
            return "precio 1 mayor a precio 2";
        } else {
            return "precio 1 igual a precio 2";
        }
    }
    public static boolean validarStockMayorA0(String producto, int stock ) {
        if (stock > 0 ) {
            return true;
        } else {
            return false;
        }
    }
}



package org.ing_calidad_soft.tp4;

public class ExceptionVarianteNoPuedeSerProductoBase extends Exception{
    public ExceptionVarianteNoPuedeSerProductoBase() {
        super("Un producto variante no puede ser producto base para otros productos.");
    }
}

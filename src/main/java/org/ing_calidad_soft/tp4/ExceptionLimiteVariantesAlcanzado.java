package org.ing_calidad_soft.tp4;

public class ExceptionLimiteVariantesAlcanzado extends Exception{
    public int limite;
    public ExceptionLimiteVariantesAlcanzado(int limite) {
        super("No puedes agregar mas de " + limite + " variantes al producto.");
        this.limite = limite;
    }
}

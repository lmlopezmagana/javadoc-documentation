package net.openwebinars.javadoc.estadistica;

import net.openwebinars.javadoc.avanzada.CalculadoraExtendida;

public interface CalculadoraEstadistica extends CalculadoraExtendida {

    double media(double ...argumentos);

    double max(double ...argumentos);

    /**
     * Calcular el valor mínimo de una serie de argumentos
     * @param argumentos
     * @return Double.MAX_VALUE, si no se pasan argumentos. El menor de los argumentos, si se proporciona más de uno
     * @deprecated
     */
    double min(double ...argumentos);



}

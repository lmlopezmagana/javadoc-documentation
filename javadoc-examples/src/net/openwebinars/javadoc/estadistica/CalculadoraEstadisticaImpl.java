package net.openwebinars.javadoc.estadistica;

import net.openwebinars.javadoc.avanzada.CalculadoraAvanzada;

public class CalculadoraEstadisticaImpl extends CalculadoraAvanzada implements CalculadoraEstadistica {

    @Override
    public double media(double... argumentos) {
        double resultado = 0;

        for(int i = 0; i < argumentos.length; i++) {
            resultado += argumentos[i];
        }

        resultado = resultado / argumentos.length;

        return resultado;
    }

    @Override
    public double max(double... argumentos) {
        double result = Double.MIN_VALUE;

        for(double arg : argumentos) {
            result = (arg > result) ? arg : result;
        }

        return result;
    }


    @Override
    public double min(double... argumentos) {
        double result = Double.MAX_VALUE;

        for (double arg : argumentos) {
            result = (arg < result) ? arg : result;
        }

        return result;

    }

    /**
     * Calcular el valor mínimo de una serie de argumentos
     * @param a Primer valor numérico
     * @param argumentos Resto de números
     * @return El primer valor, si solamente se pasa un argumento. El menor de todos, si se proporcionan dos o más argumentos
     */
    public double minValue(double a, double ...argumentos) {
        double result = a;

        for (double arg : argumentos) {
            result = (arg < result) ? arg : result;
        }

        return result;

    }
}

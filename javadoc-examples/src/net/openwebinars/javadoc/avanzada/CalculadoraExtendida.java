package net.openwebinars.javadoc.avanzada;

import net.openwebinars.javadoc.basica.Calculadora;

/**
 * Extensión de la calculadora básica con otras operaciones
 * @author Luis Miguel López
 */
public interface CalculadoraExtendida extends Calculadora {

    /**
     * División entera de dos números enteros
     * @param dividendo Operando 1
     * @param divisor Operando 2
     * @return Cociente de ambos números
     * @throws ArithmeticException Si se trata de dividir entre 0
     */
    int divisionEntera(int dividendo, int divisor);

    /**
     * Resto de la división entera de dos números
     * @param dividendo
     * @param divisor
     * @return Resto de la división
     */
    int resto(int dividendo, int divisor);

    /**
     * Resultado de realizar la operación base^exponente
     * @param base
     * @param exponente
     * @return Resultado de la potencia
     */
    double potencia(double base, double exponente);



}

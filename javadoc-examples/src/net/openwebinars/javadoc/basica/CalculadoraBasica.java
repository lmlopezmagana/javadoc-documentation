package net.openwebinars.javadoc.basica;

/**
 * Implementación básica de una calculadora elemental.
 * <strong>Todas las operaciones se realizan con decimales</strong>
 * @author Luis Miguel López
 * @version 1.0
 *
 */
public class CalculadoraBasica implements Calculadora{

    @Override
    public double sumar(double a, double b) {
        return a+b;
    }


    @Override
    public double restar(double a, double b) {
        return a-b;
    }


    @Override
    public double multiplicar(double a, double b) {
        return a*b;
    }


    @Override
    public double dividir(double a, double b) {
        return a/b;
    }
}

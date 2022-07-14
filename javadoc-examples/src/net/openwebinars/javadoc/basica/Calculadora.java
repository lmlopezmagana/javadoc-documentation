package net.openwebinars.javadoc.basica;

/**
 * Contrato de las operaciones más básicas de una calculadora
 * con decimales de tipo <code>double</code>.
 *
 * @author Luis Miguel López Magaña
 */
public interface Calculadora {


    /**
     * Suma de dos números decimales
     * @param a Operando 1
     * @param b Operando 2
     * @return resultado de la suma
     */
    double sumar(double a, double b);

    /**
     * Resta de dos números decimales
     * @param a Operando 1
     * @param b Operando 2
     * @return resultado de la resta
     */
    double restar(double a, double b);

    /**
     * Multiplicación de dos números decimales
     * @param a Operando 1
     * @param b Operando 2
     * @return resultado de la multiplicación
     */
    double multiplicar(double a, double b);

    /**
     * División con decimales de dos números
     * @param a Operando 1
     * @param b Operando 2
     * @return resultado de la divisón con decimales
     * @throws ArithmeticException Si se trata de dividir entre 0
     */
    double dividir(double a, double b);

}

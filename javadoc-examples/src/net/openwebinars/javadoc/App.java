package net.openwebinars.javadoc;

import net.openwebinars.javadoc.avanzada.CalculadoraAvanzada;
import net.openwebinars.javadoc.avanzada.CalculadoraExtendida;
import net.openwebinars.javadoc.estadistica.CalculadoraEstadisticaImpl;

public class App {

    public static void main(String[] args) {

        CalculadoraExtendida c = new CalculadoraAvanzada();

        System.out.println(String.format("%.2f^%.2f=%.2f",2.0, 3.0, c.potencia(2,3)));

        try {
            c.divisionEntera(7, 0);
        } catch (ArithmeticException ex) {
            System.err.println("Intento de división entre 0");
        }

        CalculadoraEstadisticaImpl calculadoraEstadistica = new CalculadoraEstadisticaImpl();

        System.out.println("Menor: " + calculadoraEstadistica.min(3.0, 4.0, 7.0, 2.0));
        System.out.println("Menor: " + calculadoraEstadistica.minValue(3.0, 4.0, 7, 2));





    }

}

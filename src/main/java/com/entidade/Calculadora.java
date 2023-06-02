package com.entidade;

/**
 *
 * @author osmar
 */
public class Calculadora {

    public CalculadoraResultado getSoma(double a, double b) {
        double resultado = a + b;
        System.out.println("A = " + a + " + B = " + b + " Resultado: " + resultado);

        CalculadoraResultado calculadoraResultado = new CalculadoraResultado(a, b, "+", resultado);

        return calculadoraResultado;
    }

    public CalculadoraResultado getDiferenca(double a, double b) {
        double resultado = a - b;
        System.out.println("A = " + a + " - B = " + b + " Resultado: " + resultado);
        CalculadoraResultado calculadoraResultado = new CalculadoraResultado(a, b, "-", resultado);

        return calculadoraResultado;
    }

    public CalculadoraResultado getProduto(double a, double b) {
        double resultado = a * b;
        System.out.println("A = " + a + " * B = " + b + " Resultado: " + resultado);
        CalculadoraResultado calculadoraResultado = new CalculadoraResultado(a, b, "*", resultado);

        return calculadoraResultado;
    }

    public CalculadoraResultado getQuociente(double a, double b) {
        double resultado = a / b;
        System.out.println("A = " + a + " / B = " + b + " Resultado: " + resultado);
        CalculadoraResultado calculadoraResultado = new CalculadoraResultado(a, b, "/", resultado);

        return calculadoraResultado;
    }
}

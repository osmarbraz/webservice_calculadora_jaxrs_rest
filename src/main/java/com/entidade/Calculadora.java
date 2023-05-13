package com.entidade;

/**
 *
 * @author osmar
 */
public class Calculadora {

    public CalculadoraResultado getAdicao(double a, double b) {
        double resultado = a + b;
        System.out.println("A = " + a + " + B = " + b + " Resultado: " + resultado);

        CalculadoraResultado calculadoraResultado = new CalculadoraResultado(a, b, "+", resultado);

        return calculadoraResultado;
    }

    public CalculadoraResultado getSubtracao(double a, double b) {
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

    public CalculadoraResultado getDivisao(double a, double b) {
        double resultado = a / b;
        System.out.println("A = " + a + " / B = " + b + " Resultado: " + resultado);
        CalculadoraResultado calculadoraResultado = new CalculadoraResultado(a, b, "/", resultado);

        return calculadoraResultado;
    }
}

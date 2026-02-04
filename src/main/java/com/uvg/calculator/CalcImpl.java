package com.uvg.calculator;

public class CalcImpl implements Calc {

    private Stack<Integer> pila;

    public CalcImpl(Stack<Integer> pila) {
        this.pila = pila;
    }

    @Override
    public int operate(String expresion) {

        String[] tokens = expresion.split(" ");

        for (String token : tokens) {

            if (esNumero(token)) {
                pila.push(Integer.parseInt(token));
            } 
//por si es operador
            else {
                int b = pila.pop();
                int a = pila.pop();
                int resultado = 0;

                if (token.equals("+")) {
                    resultado = a + b;
                } else if (token.equals("-")) {
                    resultado = a - b;
                } else if (token.equals("*")) {
                    resultado = a * b;
                } else if (token.equals("/")) {
                    resultado = a / b;
                }

                pila.push(resultado);
            }
        }

        return pila.pop();
    }

    private boolean esNumero(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

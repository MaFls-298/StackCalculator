package com.uvg.calculator;

import java.io.IOException; 

public class Main {

    public static void main(String[] args) throws IOException { 

        TxtReader lector = new TxtReader("datos.txt");

        Stack<Integer> pila = new StackArrayList<>();
        Calc calculadora = new CalcImpl(pila);

        String linea;
        while ((linea = lector.nextLine()) != null) {
            System.out.println(calculadora.operate(linea));
        }
    }
}

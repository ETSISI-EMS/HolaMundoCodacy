package org.example;
public class HolaMundo {
    public String saludo() {
        return "¡Hola Mundo!";
    }

    public static void main(String[] args) {
        System.out.println(new HolaMundo().saludo());
    }
}
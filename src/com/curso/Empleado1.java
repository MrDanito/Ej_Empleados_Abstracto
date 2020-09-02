package com.curso;

public class Empleado1 extends Empleados {

    public Empleado1(int vacaciones) {

        super(vacaciones);

    }

    public void picarPiedra(){

        System.out.println("Estoy picando piedra");

    }

    @Override
    public void trabajar() {

        picarPiedra();

    }

}

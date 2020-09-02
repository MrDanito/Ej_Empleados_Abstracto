package com.curso;

public class Empleado3 extends Empleados {

    public Empleado3() {
        super();
    }

    public Empleado3(int vacaciones) {

        super(vacaciones);

    }

    @Override
    public void trabajar() {
        echarAgua();
    }

    public void echarAgua(){

        System.out.println("Estoy echando agua");

    }

    public void vacaciones(){

        System.out.println("No tiene vacaciones.");

    }

}

package com.curso;

public class Empleado2 extends Empleados {

    public Empleado2(int vacaciones) {

        super(vacaciones);

    }

    @Override
    public void trabajar() {

        sacarArena();

    }

    public void sacarArena(){

        System.out.println("Estoy sacando arena");

    }

}

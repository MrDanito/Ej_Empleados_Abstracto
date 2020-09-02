package com.curso;

public abstract class Empleados{

    private int vacaciones;


    public Empleados(int vacaciones) {
        this.vacaciones = vacaciones;
    }

    public Empleados() {

    }

    public void cobrarNomina(){

        System.out.println("Nomina cobrada");

    }

    public void vacaciones(){

        StringBuilder sb = new StringBuilder();

        sb.append("Te quedan ");
        sb.append(vacaciones);
        sb.append(" días de vacacciones.");

        System.out.println(sb.toString());

    }

    public abstract void trabajar();

}

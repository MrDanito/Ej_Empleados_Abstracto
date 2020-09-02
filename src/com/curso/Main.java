package com.curso;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Empleado1 empleado1 = new Empleado1(10);

        empleado1.trabajar();
        empleado1.cobrarNomina();
        empleado1.vacaciones();

        Empleado2 empleado2 = new Empleado2(20);

        empleado2.trabajar();
        empleado2.cobrarNomina();
        empleado2.vacaciones();

        Empleado3 empleado3 = new Empleado3();

        empleado3.trabajar();
        empleado3.cobrarNomina();
        empleado3.vacaciones();

    }
}

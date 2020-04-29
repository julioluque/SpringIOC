package ar.jluque.IoC;

public class UsoEmpleados {
	public static void main(String[] args) {

		// Creacion de objetos tipo empleado
		Empleados empleado1 = new JefeEmpleado();

		// Uso de los objetos creados
		System.out.println(empleado1.getTareas());

		Empleados empleado2 = new secretarioEmpleado();
		System.out.println(empleado2.getTareas());

		Empleados empleado3 = new directorEmpleado();
		System.out.println(empleado3.getTareas());

	}
}

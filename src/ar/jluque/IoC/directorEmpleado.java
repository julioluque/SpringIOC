package ar.jluque.IoC;

public class directorEmpleado implements Empleados {

	@Override
	public String getTareas() {
		return "Soy el director. Gestion la plantilla de la empresa";
	}

}

package ar.jluque.ioc;

public class DirectorEmpleado implements Empleados {

	@Override
	public String getTareas() {
		return "Soy el director. Gestion la plantilla de la empresa";
	}

}

package ar.jluque.IoC;

public class secretarioEmpleado implements Empleados {

	@Override
	public String getTareas() {
		return "Soy la clase Secretario. Gestiono la agenda de los jefes";
	}

}

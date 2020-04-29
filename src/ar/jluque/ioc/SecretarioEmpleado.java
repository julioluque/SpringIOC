package ar.jluque.ioc;

public class SecretarioEmpleado implements Empleados {

	@Override
	public String getTareas() {
		return "Soy la clase Secretario. Gestiono la agenda de los jefes";
	}

}

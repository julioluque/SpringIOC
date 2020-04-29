package ar.jluque.IoC;

public class JefeEmpleado implements Empleados {

	@Override
	public String getTareas() {
		return "Soy la clase JefeEmpleado. Gestiono tareas relativas a mis empleados de seccion";
	}
	
}

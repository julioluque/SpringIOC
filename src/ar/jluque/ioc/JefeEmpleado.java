package ar.jluque.ioc;

public class JefeEmpleado implements Empleados {

	private Informes informeNuevo;

	public JefeEmpleado(Informes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		return "Tareas de un Jefe: Gestionar tareas relativas a mis empleados de seccion";
	}

	@Override
	public String getInfomres() {
		return "Informe presentado por el Jefe con arreglos :" + informeNuevo.getInformes();
	}

}

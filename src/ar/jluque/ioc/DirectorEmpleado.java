package ar.jluque.ioc;

public class DirectorEmpleado implements Empleados {

//	Creacion de campo tipo Informe (Interfaz)
	private Informes informeNuevo;

//	Creacion de constructor que inyecta la dependencia
	public DirectorEmpleado(Informes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		return "Tareas del Director : Gestion la plantilla de la empresa";
	}

	@Override
	public String getInfomres() {
		return "Informe del Director :" + informeNuevo.getInformes();
	}
}

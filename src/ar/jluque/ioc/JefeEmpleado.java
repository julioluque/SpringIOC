package ar.jluque.ioc;

public class JefeEmpleado implements Empleados {

	private String email;
	private String nombreEmpresa;

	private Informes informeNuevo;
	
	public JefeEmpleado(Informes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}


	@Override
	public String getTareas() {
		return "Tareas de un Jefe: Gestionar la seccion empleados";
	}

	@Override
	public String getInfomres() {
		return "Informe presentado por el Jefe con arreglos :" + informeNuevo.getInformes();
	}

}

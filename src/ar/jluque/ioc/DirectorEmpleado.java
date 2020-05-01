package ar.jluque.ioc;

import com.sun.org.apache.xml.internal.security.Init;

public class DirectorEmpleado implements Empleados {

	private String email;
	private String nombreEmpresa;

//	 Creacion de campo tipo Informe (Interfaz)
	private Informes informeNuevo;

//	Creacion de constructor que inyecta la dependencia
	public DirectorEmpleado(Informes informeNuevo) {
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
		return "Tareas del Director : Gestion la plantilla de la empresa";
	}

	@Override
	public String getInfomres() {
		return "Informe del Director :" + informeNuevo.getInformes();
	}
	
//	init-method="metodoInit" ->  Encargado de ejecutar tareas antes qeu el bean este disponible 
	public void metodoInit() {		 
		System.out.println("METODO init() - Tareas a ejecutar antes de que el bean este listo");
	}
	
//	destroy-method="metodoDestroy" -> Encargado de ejecutar tareas despues de que el bean haya sido utilizado
	public void metodoDestroy() {	
		System.out.println("METODO destroy() -> Tareas a ejecutar despues de utilizar el bean");
	}
}


package ar.jluque.ioc;

public class SecretarioEmpleado implements Empleados {

	private String email;
	private String nombreEmpresa;

	private Informes informeNuevo;

	public void setInformeNuevo(Informes informeNuevo) {
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
		return "Soy la clase Secretario. Gestiono la agenda de los jefes";
	}

	@Override
	public String getInfomres() {
		return "Informe diario de secretaria :" + informeNuevo.getInformes();
	}

}

package ar.jluque.ioc;

public class SecretarioEmpleado implements Empleados {

	private Informes informeNuevoSecretario;
	
//	public void setInformeNuevo(Informes informeNuevo) {
//		this.informeNuevo = informeNuevo;
//	}

	public void setMiSecretarioInformeNuevo(Informes secretarioInformeNuevo) {
		this.informeNuevoSecretario = secretarioInformeNuevo;
	}
	
	@Override
	public String getTareas() {
		return "Soy la clase Secretario. Gestiono la agenda de los jefes";
	}

	@Override
	public String getInfomres() {
		return "Informe diario de secretaria :" + informeNuevoSecretario.getInformes(); 
	}

}

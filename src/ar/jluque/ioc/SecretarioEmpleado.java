package ar.jluque.ioc;

public class SecretarioEmpleado implements Empleados {

	private Informes informe;
	
	public SecretarioEmpleado(Informes informe) {
		this.informe = informe;
	}
	
	@Override
	public String getTareas() {
		return "Soy la clase Secretario. Gestiono la agenda de los jefes";
	}

	@Override
	public String getInfomres() {
		return "Informe diario de secretaria :" + informe.getInformes(); 
	}

}

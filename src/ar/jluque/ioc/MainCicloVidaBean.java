package ar.jluque.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext contextCicloVida = new ClassPathXmlApplicationContext("ApplicationContext3.xml");
		
//		Empleados Julio = contextCicloVida.getBean("miDirector", Empleados.class);
		
		DirectorEmpleado Julio = contextCicloVida.getBean("miDirector", DirectorEmpleado.class);

		
		System.out.println(Julio.getTareas());
		System.out.println(Julio.getInfomres());
		System.out.println(Julio.getEmail());
		System.out.println(Julio.getNombreEmpresa());
		
		contextCicloVida.close();
		
	}

}

package ar.jluque.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleadosMain {
	public static void main(String[] args) {

		/*
		Empleados empleado1 = new JefeEmpleado();
		System.out.println(empleado1.getTareas());

		Empleados empleado2 = new secretarioEmpleado();
		System.out.println(empleado2.getTareas());

		Empleados empleado3 = new DirectorEmpleado();
		System.out.println(empleado3.getTareas());
		*/
		
//		1 -> CARGAMOS EL ARCHIVO XML
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		2 -> PEDIMOS EL BEAN
		Empleados julio = contexto.getBean("miDirector", Empleados.class);
		Empleados luis = contexto.getBean("miJefe", Empleados.class);
		Empleados delfina = contexto.getBean("miSecretario", Empleados.class);
		
//		3 -> USAMOS EL BEAN
		System.out.println("--- POR CONSTRUCTOR --- ");
		System.out.println(julio.getTareas() + " ==> " + julio.getInfomres());
		
		System.out.println(luis.getTareas() + " ==> " + luis.getInfomres());
		
		System.out.println("--- POR SETTER ---");
		System.out.println(delfina.getTareas() + " ==> " + delfina.getInfomres());
		
		
//		4 -> CERRAMOS EL XML
		contexto.close();
				

	}
}

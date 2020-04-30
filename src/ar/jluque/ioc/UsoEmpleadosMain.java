package ar.jluque.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleadosMain {
	public static void main(String[] args) {

//		1 -> CARGAMOS EL ARCHIVO XML
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

//		2 -> PEDIMOS EL BEAN
		Empleados julio = contexto.getBean("miDirector", Empleados.class);
		Empleados luis = contexto.getBean("miJefe", Empleados.class);
		Empleados delfina = contexto.getBean("miSecretario", Empleados.class);
		
		DirectorEmpleado direccion = contexto.getBean("miDirector", DirectorEmpleado.class);
		JefeEmpleado responsable = contexto.getBean("miJefe", JefeEmpleado.class);
		SecretarioEmpleado secretaria= contexto.getBean("miSecretario", SecretarioEmpleado.class);
		
//		3 -> USAMOS EL BEAN
		System.out.println("GENERADO POR CONSTRUCTOR | " + julio.getTareas() + " ==> " + julio.getInfomres());
		System.out.println("EMAIL: " + direccion.getEmail() + " | EMPRESA: " + direccion.getNombreEmpresa());
		
		System.out.println();
		System.out.println("GENERADO POR CONSTRUCTOR | " + luis.getTareas() + " ==> " + luis.getInfomres());
		System.out.println("EMAIL: " + responsable.getEmail() + " | EMPRESA: " + responsable.getNombreEmpresa());
		
		System.out.println();
		System.out.println("GENERADO POR SETTER | " + delfina.getTareas() + " ==> " + delfina.getInfomres());
		System.out.println("EMAIL: " + secretaria.getEmail() + " | EMPRESA: " + secretaria.getNombreEmpresa());

//		4 -> CERRAMOS EL XML
		contexto.close();

		/*
		 * @Deprecated : NO APLICA INYECCION DE DEPENDENCIAS
		 * 
		 * Empleados empleado1 = new JefeEmpleado();
		 * System.out.println(empleado1.getTareas());
		 * 
		 * Empleados empleado2 = new secretarioEmpleado();
		 * System.out.println(empleado2.getTareas());
		 * 
		 * Empleados empleado3 = new DirectorEmpleado();
		 * System.out.println(empleado3.getTareas());
		 */

	}
}

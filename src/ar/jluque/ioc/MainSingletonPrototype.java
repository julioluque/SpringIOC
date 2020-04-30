package ar.jluque.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSingletonPrototype {
	public static void main(String[] args) {

//		Carga de xml de configuracion
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

//		peticion de beans
		SecretarioEmpleado delfi = context.getBean("miSecretario", SecretarioEmpleado.class);
		SecretarioEmpleado ceci = context.getBean("miSecretario", SecretarioEmpleado.class);

		System.out.println(delfi);	//ar.jluque.ioc.SecretarioEmpleado@26aa12dd  <- ambos apuntan a la misma direccion en memoria
		System.out.println(ceci);	//ar.jluque.ioc.SecretarioEmpleado@26aa12dd  <- ambos apuntan a la misma direccion en memoria

		if(delfi.equals(ceci)) {
			System.out.println("mismo hashcode: " + ceci.hashCode());
			System.out.println("mismo hashcode: " + delfi.hashCode());
		} else {
			System.out.println("distinto hashcode: " + ceci.hashCode());
			System.out.println("distinto hashcode: " + delfi.hashCode());
		}
		
	}
}

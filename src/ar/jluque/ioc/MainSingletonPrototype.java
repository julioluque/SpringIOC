package ar.jluque.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSingletonPrototype {
	public static void main(String[] args) {

//		Carga de xml de configuracion
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

//		peticion de beans
		SecretarioEmpleado delfi = context.getBean("miSecretario", SecretarioEmpleado.class);
		SecretarioEmpleado ceci = context.getBean("miSecretario", SecretarioEmpleado.class);
		SecretarioEmpleado a = context.getBean("miSecretario", SecretarioEmpleado.class);
		SecretarioEmpleado b = context.getBean("miSecretario", SecretarioEmpleado.class);
		SecretarioEmpleado c = context.getBean("miSecretario", SecretarioEmpleado.class);
		SecretarioEmpleado d = context.getBean("miSecretario", SecretarioEmpleado.class);
		SecretarioEmpleado e = context.getBean("miSecretario", SecretarioEmpleado.class);
		SecretarioEmpleado f = context.getBean("miSecretario", SecretarioEmpleado.class);
		SecretarioEmpleado g = context.getBean("miSecretario", SecretarioEmpleado.class);

		System.out.println(delfi);	
		System.out.println(ceci);	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);

		
//		CON SINGLETON
//		ar.jluque.ioc.SecretarioEmpleado@26aa12dd  <- ambos apuntan a la misma direccion en memoria
//		ar.jluque.ioc.SecretarioEmpleado@26aa12dd  <- ambos apuntan a la misma direccion en memoria
		
//		CON PROTOTYPE
//		ar.jluque.ioc.SecretarioEmpleado@26aa12dd
//		ar.jluque.ioc.SecretarioEmpleado@3fd7a715
		
		/**
		 * La configuracion en applicationContext scope="singleton" / scope"prototype" hace que el objeto se ubique en posiciones diferentes de memmoria. por ende,  
		 */
		 
		if(delfi.equals(ceci)) {  	//scope="singleton"
			System.out.println("mismo hashcode: " + ceci.hashCode());
			System.out.println("mismo hashcode: " + delfi.hashCode());
			
		} else {					//scope"prototype"
			System.out.println("distinto hashcode: " + ceci.hashCode());
			System.out.println("distinto hashcode: " + delfi.hashCode());
		}
		
	}
}

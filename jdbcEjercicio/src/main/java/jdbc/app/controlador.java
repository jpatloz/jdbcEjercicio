package jdbc.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jdbc.dao.alumnoServicioImpl;

public class controlador {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		alumnoServicioImpl obj = (alumnoServicioImpl) context.getBean("alumnoDao");
		obj.insertar(null);
	}

}

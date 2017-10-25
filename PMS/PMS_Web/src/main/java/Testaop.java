/*import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.Aartek.Model.EmployeeDTO;
import Com.Aartek.aop.EmployeeManager;

public class Testaop {
	//@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		EmployeeManager manager = context.getBean(EmployeeManager.class);

		 manager.getEmployeeById(1);
		// manager.createEmployee(new EmployeeDTO());
		// manager.getAllEmployee();
		try {
			manager.validate(19);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("calling validate again...");

		try {
			manager.validate(11);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
*/
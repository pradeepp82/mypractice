package Com.Artek;
import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;  
public class EmployeeDao {

	HibernateTemplate template;  
	
	public void setTemplate(HibernateTemplate template){
		this.template=template;
	}
	//for save employee
	public void saveEmployee(Employee e){
		template.save(e);
	}
	
	//for update employee
	public void updateEmployee(Employee e){
		template.update(e);
	}
	
	//fr delete employee
	public void deleteEmployee(Employee e){
		template.delete(e);
	}
	// for returnone employee of given id
	public Employee getById(int id){
		
		Employee e = (Employee)template.get(Employee.class, id);
		return e;
	}
	// for return all employees
	public List<Employee> getEmployees(){
		List<Employee> list  = new ArrayList<Employee>();
		list= template.loadAll(Employee.class);
		return list;
	}
}

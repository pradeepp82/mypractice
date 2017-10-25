package Com.Aartek.aop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import Com.Aartek.Model.EmployeeDTO;

@Component
public class EmployeeManager {

	public EmployeeDTO getEmployeeById(Integer employeeid) {

		System.out.println("method getemployeeid called");
		return new EmployeeDTO();
	}

	public List<EmployeeDTO> getAllEmployee() {

		System.out.println("method getall employee called");
		return new ArrayList<EmployeeDTO>();
	}

	public void createEmployee(EmployeeDTO employee) {
		System.out.println("method create  employee called");
	}
	
	public void deleteEmployee(Integer employeeId) {
		System.out.println("method delete  employee called");
	}
	
	public void updateEmployee(EmployeeDTO employee) {
		System.out.println("method update   employee called");
	}
	
	public void validate(int age)throws Exception{  
	    if(age<18){  
	        throw new ArithmeticException("Not valid age");  
	    }  
	    else{  
	        System.out.println("Thanks for vote");  
	    }  
	    }  
	
	
}

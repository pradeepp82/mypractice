package Com.Aartek.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import Com.Aartek.Controller.LoginController;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

@Aspect
public class EmployeeCRUDAspect {

	private static final Logger log = Logger.getLogger(LoginController.class);

	//("execution(* com.test.model..*.*(..))")
	@Before("execution(* EmployeeManager.getEmployeeById(..))")
	public void logbeforeV1(JoinPoint joinpoint) {

		log.info("--------------EmployeeCRUDAspect before  getEmployeeById----------");
		System.out.println("EmployeeCRUDAspect before  getEmployeeById");

	}

	@Before("execution(* EmployeeManager.getAllEmployee(..))")
	public void logbeforeV3(JoinPoint joinpoint) {

		System.out.println("EmployeeCRUDAspect before getAllEmployee");
	} 

	@Before("execution(* EmployeeManager.*(..))")
	public void logBeforev2(JoinPoint joinpoint) {

		System.out.println("EmployeeCRUDAspect before all");
	}

	@After("execution(* EmployeeManager.getEmployeeById(..))")
	public void logAfterV1(JoinPoint joinpoint) {
		System.out.println("EmployeeCRUDAspect After getEmployeeById");

	}

	@After("execution(* EmployeeManager.*(..))")
	public void logAfterv2(JoinPoint joinpoint) {

		System.out.println("EmployeeCRUDAspect After all");
	}
	
	 @AfterReturning(  
             pointcut = "execution(* EmployeeManager.*(..))",  
             returning= "result")  
	 public void myadvice(JoinPoint jp,Object result)  
	    {  
	          
	        System.out.println("Method Signature: "  + jp.getSignature());  
	        System.out.println("Result in advice: "+result);  
	        System.out.println("end of after returning advice...");  
	    }  
	 
	 
	/* @AfterThrowing(  
             pointcut = "execution(* EmployeeManager.*(..))",  
             throwing= "error")  
               
   public void myadvice(JoinPoint jp,Throwable error)//it is advice  
   {  
       System.out.println("additional concern");  
       System.out.println("Method Signature: "  + jp.getSignature());  
       System.out.println("Exception is: "+error);  
       System.out.println("end of after throwing advice...");  
   }  */

}

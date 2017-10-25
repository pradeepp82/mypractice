package Com.Artek.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import Com.Aartek.Model.User;
import Com.Aartek.Repo.RegistrationRepository;

@Component
public class RegistrationValidator implements Validator {

	@Autowired
	RegistrationRepository regrepo;
	
	
	public boolean supports(Class<?> clazz) {
		 
		
		return User.class.isAssignableFrom(clazz);
	}

	
	
    public void validate(Object target, Errors errors) {
       
	     User user = (User)target;
	   /* forblank values*/
	     if((user.getName()).equals("")) {
	    	 
	         ValidationUtils.rejectIfEmpty(errors, "Name", "error.name.empty");
	       }else if((user.getEmail()).equals("")) {
	    	 
		     ValidationUtils.rejectIfEmpty(errors, "email", "error.emailId.empty");
		     
	       }else if((user.getPassword()).equals("")) {
		     ValidationUtils.rejectIfEmpty(errors, "password", "error.password.empty");
		   }else if((user.getAddress()).equals("")) {
	         ValidationUtils.rejectIfEmpty(errors, "Address", "error.address.empty");
	       }else if((user.getCity()).equals("")) {
		     ValidationUtils.rejectIfEmpty(errors, "City", "error.city.empty");
		   }
	     
	     
	    /* foremail*/
	     if (user.getEmail()!= null && user.getEmail().trim().length() > 0) {
	    	 
	    	 
	    	 if (user.getEmail().contains("@") != true ) {
					errors.rejectValue("email", "error.email.first.rule");
				} 
	    	    else if (user.getEmail().contains(".com") != true
						&& user.getEmail().contains(".net") != true
						&& user.getEmail().contains(".co.in") != true) {
					errors.rejectValue("email", "error.email.second.rule");
				} else if(regrepo.UserReg(user)==true) {
					errors.rejectValue("email", "error.email.db.rule");
				}
	     }
	     
	     
	     	 
	     	  
	    	  
	     
	     
	     
	     
	     
	     
	
	 }  

     /*forcustom checking*/
    
    
	
	
}

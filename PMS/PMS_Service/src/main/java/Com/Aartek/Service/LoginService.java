package Com.Aartek.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.Aartek.Model.User;
import Com.Aartek.Repo.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;

	public List<User> userlogin1(User p) {
		List<User> projectList = (List<User>) loginRepository.Userlog(p);
		return (List<User>) projectList;
	}
	
	
	public List<User> get(Integer id) {
		
		System.out.println("inside web service");
		
		List<User> projectList = (List<User>) loginRepository.get(id);
		return projectList;
		
	}

}

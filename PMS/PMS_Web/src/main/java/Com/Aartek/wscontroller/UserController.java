package Com.Aartek.wscontroller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import Com.Aartek.Model.Project;
import Com.Aartek.Model.User;
import Com.Aartek.Service.Projectservice;

@Controller
public class UserController {

	@Autowired
	Projectservice proservice;
	User user = new User();

	@RequestMapping(value = "user/{userid}/{Name}", method = RequestMethod.GET)

	public @ResponseBody User getEmployeeInJSON(@PathVariable("userid") Integer userid,
			@PathVariable("Name") String name1) {
		user.setUserid(4);
		user.setName(name1);
		user.setEmail("panwarp82@gmail.com");

		return user;

	}
	
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public @ResponseBody Map<Object, Object> studentsImage(@RequestBody Project project) throws IOException {
		Map<Object, Object> map = new HashMap<Object, Object>();
		
		Project project1 =proservice.projservice(project);
		
		
		//map.put("key", project1);
		
		/*System.out.println(project1.getProjectid());
		System.out.println(project1.getProjectName());
		System.out.println(project1.getClient());
	    System.out.println(project1.getStartDate());
	    System.out.println(project1.getEndDate());*/
	
		return map;
	}

}

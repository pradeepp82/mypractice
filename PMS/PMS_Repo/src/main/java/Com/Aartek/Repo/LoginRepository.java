package Com.Aartek.Repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import Com.Aartek.Model.User;

@Repository
public class LoginRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public List<User> Userlog(User p) {

		System.out.println("repo" + p.getEmail());

		List<User> projectList = (List<User>) hibernateTemplate
				.find("from User al where al.email = ? and al.password = ?", p.getEmail(), p.getPassword());
		return projectList;
	}

	public List<User> get(Integer id) {
		System.out.println("inside web repo");
		List<User> projectList = (List<User>) hibernateTemplate.find("from User where userid=?", id);

		return projectList;

	}

}

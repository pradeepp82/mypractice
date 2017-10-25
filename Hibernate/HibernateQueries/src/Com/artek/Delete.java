package Com.Aartek.Repo;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import Com.Aartek.Model.Project;
 
@Transactional
@Repository("Project")
public class ProjectRepo {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	 	/*for delete data from db*/
	
	public void delete(Project project) {
		System.out.println("repo"+project.getProjectid());
		
		  hibernateTemplate.delete(project);
		
	}
	
	
}

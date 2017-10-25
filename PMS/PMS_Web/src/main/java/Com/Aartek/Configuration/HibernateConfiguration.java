package Com.Aartek.Configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.core.env.Environment;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan("Com.Aartek")
@PropertySource("classpath:messages.properties")
public class HibernateConfiguration {

	@Autowired
	private Environment environment;

	 @Bean
	 public LocalSessionFactoryBean sessionfactory(){
		 LocalSessionFactoryBean sessionfactory =new LocalSessionFactoryBean();
		 sessionfactory.setDataSource(datasource());
		 sessionfactory.setPackagesToScan(new String[] {"Com.Aartek.Model"});
		 sessionfactory.setHibernateProperties(hibernateProperties());
		 
		return sessionfactory;
		 
		 
		 
	 }

	@Bean
	public DataSource datasource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName(environment.getRequiredProperty("jdbc.Driver"));
		datasource.setUrl(environment.getProperty("jdbc.url"));
		datasource.setUsername(environment.getProperty("root"));
		datasource.setPassword(environment.getProperty("root"));
		return datasource;

	}
	
	private Properties hibernateProperties(){
		Properties properties = new  Properties();
		properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
		properties.put("hibernate.hbm2ddl.auto",environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
		properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
		return properties;
		
	}
	
	
	 @Bean
	    @Autowired
	    public HibernateTemplate getHibernateTemplate(SessionFactory sessionFactory)
	    {
	        HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
	        return hibernateTemplate;
	    }
	
	
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory s){
		HibernateTransactionManager txmanager = new HibernateTransactionManager();
		txmanager.setSessionFactory(s);
		return txmanager;
		
	}
}

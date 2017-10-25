package Com.Aartek.Configuration;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.ViewRendererServlet;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="Com.Aartek")
public class AppConfig {
	
	@Bean  
    public UrlBasedViewResolver urlBasedViewResolver() {  
      UrlBasedViewResolver resolver = new UrlBasedViewResolver();  
      resolver.setPrefix("/WEB-INF/jsp");  
      resolver.setSuffix(".jsp");
      resolver.setCache(false);
      resolver.setViewClass(TilesView.class);  
      return resolver;  
    }
	
	
	
	@Bean
	public TilesConfigurer tilesConfigurer(){
	    TilesConfigurer tilesConfigurer = new TilesConfigurer();
	    tilesConfigurer.setDefinitions(new String[] {"WEB-INF/tiles.xml"});
	    tilesConfigurer.setCheckRefresh(true);
	    return tilesConfigurer;
	}
	
	 @Bean
	    public MessageSource messageSource() {
	        
		 ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
	        messageSource.setBasename("messages");
	        return messageSource;
	    }
	
}

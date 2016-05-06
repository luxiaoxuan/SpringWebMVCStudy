package lxx.demo.springwebmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
@EnableAutoConfiguration
public class ShoudeApp extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ShoudeApp.class);
	}
	
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext cac = SpringApplication.run(ShoudeApp.class, args);
		String[] profiles = cac.getEnvironment().getActiveProfiles();
		for (String p : profiles) {
			System.out.println("profile: " + p);
		}
	}
}

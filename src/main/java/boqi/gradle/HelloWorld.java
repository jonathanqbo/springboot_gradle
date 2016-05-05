package boqi.gradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloWorld {
	
	/**
	 * Spring boot embeded tomcat will set this application as root application
	 * which means the url is: http://localhost:8080
	 * 
	 * @return
	 */
	@RequestMapping("/")
	@ResponseBody
	public String sayHello(){
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloWorld.class, args);
	}
	
}

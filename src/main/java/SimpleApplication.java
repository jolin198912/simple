import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@EnableAutoConfiguration
public class SimpleApplication {
	@RequestMapping("/")
	@ResponseBody
	public String home() {
        return "Hello Spring Boot";
    }
	
//	@RequestMapping("/firstspringboot/")
//	@ResponseBody
//	public String query() {
//        return "select * from user;";
//    }
	public static void main(String[] args) throws Exception{
		SpringApplication.run(SimpleApplication.class, args);
	}
}

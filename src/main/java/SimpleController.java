import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@RequestMapping("/")
@Controller
public class SimpleController {
	@RequestMapping("home")
	@ResponseBody
	public String home() {
        return "Hello SimpleController";
    }
}

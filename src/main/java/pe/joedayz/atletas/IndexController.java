package pe.joedayz.atletas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author josediaz
 **/
@Controller
public class IndexController {

  @RequestMapping(value = "/") //http://localhost:8080
//	@ResponseBody
  public String welcome() {
    return "main-menu";
  }
}

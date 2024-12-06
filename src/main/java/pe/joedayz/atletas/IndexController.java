package pe.joedayz.atletas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author josediaz
 **/
@Controller
public class IndexController {

  @RequestMapping(value = "/")
//	@ResponseBody
  public String welcome() {
    return "main-menu";
  }
}

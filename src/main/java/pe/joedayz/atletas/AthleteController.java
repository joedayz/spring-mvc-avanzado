package pe.joedayz.atletas;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author josediaz
 **/
@Controller
@RequestMapping("/player")
public class AthleteController {


  @RequestMapping("/showPlayerForm")
  public String showForm(Model model){
    model.addAttribute("athlete", new Athlete());
    return "add-player-form";
  }
  @RequestMapping("/processPlayerForm")
  public String processForm(@ModelAttribute("athlete") Athlete athlete){
    return "player-confirmation";
  }
}

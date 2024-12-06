package pe.joedayz.atletas;

import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author josediaz
 **/
@Controller
@RequestMapping("/player")
public class AthleteController {

  @InitBinder
  public void initBinder(WebDataBinder binder) {
    StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
    binder.registerCustomEditor(String.class, stringTrimmerEditor);
    //binder.addValidators()
    //binder.addCustomFormatter()
  }

  @RequestMapping("/showPlayerForm")
  public String showForm(Model model) {
    model.addAttribute("athlete", new Athlete());
    return "add-player-form";
  }

  @RequestMapping("/processPlayerForm")
  public String processForm(@Valid @ModelAttribute("athlete") Athlete athlete,
      BindingResult result) {
    if (result.hasErrors()) {
      return "add-player-form";
    } else {
      return "player-confirmation";
    }
  }
}

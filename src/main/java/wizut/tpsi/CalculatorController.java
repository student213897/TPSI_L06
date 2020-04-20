package wizut.tpsi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculatorController {

    @RequestMapping("/")
    public String home(Model model) {

        return "home";
    }

    @RequestMapping("/hello")
    public String hello(Model model,KalkulatorForm k/* Integer x, String operacja, Integer y*/) {
        model.addAttribute("x",k.getx());
        model.addAttribute("y", k.gety());
        model.addAttribute("znak", k.getOperacja() );
        if ( k.getOperacja().contentEquals("+")) {model.addAttribute("wynik", k.getx()+k.gety());}
        else if ( k.getOperacja().contentEquals("-")) {model.addAttribute("wynik", k.getx()-k.gety());}
        else if( k.getOperacja().contentEquals("*")) {model.addAttribute("wynik", k.getx()*k.gety());}
        //model.addAttribute(model);

        return "hello";
    }

}

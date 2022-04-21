package ch.bzz.bildgalerie;

        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/index")
    String index(Model model){
        return "index.html";
    }


}

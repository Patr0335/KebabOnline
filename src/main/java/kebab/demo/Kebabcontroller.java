package kebab.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Kebabcontroller {
    @GetMapping("/")
    public String renderHome(Model model) {
        Boolean isUserLoggedIn = true;
        model.addAttribute("isUserLoggedIn", isUserLoggedIn);

        String userType = "free";
        model.addAttribute("userType", userType);

        return "index.html";
    }

    @GetMapping("/about")
    public String renderAbout(Model model) {
//        model.addAttribute("");
        return "about.html";
    }

    @GetMapping("/contact")
    public String renderContact(Model model) {
//        model.addAttribute("");
        return "contact.html";

    }
}

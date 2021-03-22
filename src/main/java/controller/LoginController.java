package controller;

import model.Credential;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class LoginController {
    @GetMapping("/login")
    public String login(@ModelAttribute Credential credential){
        return "login";
    }
    @PostMapping("/login")
    public String dashboard(@ModelAttribute Credential credential, Model model){
        User user=new User();
        user.setUserName(credential.getUsername());
        model.addAttribute("user",user);
        return "redirect:dashboar";
    }
}

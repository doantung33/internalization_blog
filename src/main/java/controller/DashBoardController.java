package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class DashBoardController {
    @GetMapping("/dashboar")
    public String login(){
        return "dashboar";
    }
}

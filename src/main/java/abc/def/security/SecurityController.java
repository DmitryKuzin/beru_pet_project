package abc.def.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class SecurityController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "security/login";
    }

    @GetMapping("/403")
    public String error403() {
        return "security/error403";
    }

    @GetMapping("/signup")
    public String registrationPage() {
        return "security/register";
    }

    @PostMapping("/register")
    public String registerUser(String username, String password) {
        log.info("Register new user with username={} and password={}", username, password);
        User user = userService.saveNewUser(username, password);
        if (user != null) {
            return "redirect:/";
        }
        return "redirect:/error";
    }
}

package abc.def.mainPage;

import abc.def.security.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
public class MainPageController {


    @RequestMapping("/")
    public String renderMainPage(HttpServletRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object principal = authentication.getPrincipal();
        log.info("principal :{}", principal);
        String username = null;
        if(!authentication.getName().equals("anonymousUser")) {
            username = authentication.getName();
        }

        request.setAttribute("username", username);
        return "mainPage";
    }

}

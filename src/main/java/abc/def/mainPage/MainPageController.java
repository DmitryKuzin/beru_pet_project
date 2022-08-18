package abc.def.mainPage;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
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

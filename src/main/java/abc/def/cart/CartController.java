package abc.def.cart;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CartController {

    @GetMapping("/cart")
    public String renderCart(HttpServletRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = null;
        if(!authentication.getName().equals("anonymousUser")) {
            username = authentication.getName();
        }

        request.setAttribute("username", username);
        return "cart/cartMain";
    }
}

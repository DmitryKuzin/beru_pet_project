package abc.def.lk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LkController {

    @RequestMapping("/lk")
    public String renderLK() {
        return "lk/lk";
    }


}

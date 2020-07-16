package cloud.itsu.worldly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class news {

    @GetMapping("/news/home-page")
    public String get() {
        return "temp";
    }

}

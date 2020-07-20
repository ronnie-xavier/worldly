package cloud.itsu.worldly.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

    @GetMapping("/news/home-page")
    public String get() {
        return "temp";
    }

}

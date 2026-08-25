package app.netlify.jinzo.ulkona.common.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class WelcomeController {
    @GetMapping
    public Map<String, String> welcome() {
        return Map.of(
                "application", "Ulkona",
                "status", "running"
        );
    }
}

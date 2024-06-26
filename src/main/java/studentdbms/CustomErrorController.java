package studentdbms;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error(Model model) {
        // Add custom error handling logic here
        model.addAttribute("errorMessage", "Oops! Something went wrong.");
        return "error"; // Assuming you have an error.html template in your templates directory
    }

    public String getErrorPath() {
        return PATH;
    }
}

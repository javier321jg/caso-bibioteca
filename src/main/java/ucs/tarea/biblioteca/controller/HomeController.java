
package ucs.tarea.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author javier
 */
@Controller

public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    
}

package org.example.clothingstore.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class CustomerController {

    @RequestMapping("/display-customer")
    public String home() {
        return "admin/display-customer";
    }
}

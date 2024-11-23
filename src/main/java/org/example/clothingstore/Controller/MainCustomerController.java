package org.example.clothingstore.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main-customer")
public class MainCustomerController {
    @GetMapping("/home-customer")
    public String mainCustomer() {
        return "main-customer/home-customer";
    }
}

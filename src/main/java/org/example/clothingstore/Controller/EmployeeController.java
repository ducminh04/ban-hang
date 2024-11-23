package org.example.clothingstore.Controller;

import org.example.clothingstore.Model.entity.EmployeeEntity;
import org.example.clothingstore.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/display-employee")
    public String showEmployeePage(Model model){
        model.addAttribute("employeeList",employeeService.findAll());
            return "admin/display-employee";
    }
    @GetMapping("/create-employee")
    public String showFormCreate(Model model){
        model.addAttribute("employee",new EmployeeEntity());
        return "admin/create-employee";
    }
    @PostMapping("/create-employee")
    public String createEmployee(@ModelAttribute("employee") EmployeeEntity employee){
        employeeService.saveEmployee(employee);
        return "redirect:/admin/display-employee";
    }
    @GetMapping("/details-employee/{id}")
    public String showDetails(@PathVariable("id") int id, Model model){
        EmployeeEntity employee = employeeService.findEmployeeById(id);
        model.addAttribute("employee",employee);
        return "admin/details-employee";
    }

}

package com.sultan.spring.mvc_hibernate_aop.controller;



import com.sultan.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.sultan.spring.mvc_hibernate_aop.entity.Employee;
import com.sultan.spring.mvc_hibernate_aop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {


    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model) {

        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);

        return "all-employees";
    }


    //Adding new employee page
    @RequestMapping("/addNewEmployee")
    public String addEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee-info";
    }


    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {

        employeeService.saveEmployee(employee);

        return "redirect:/";
    }

     @RequestMapping("/updateInfo")
    public String updateEmployee(@RequestParam("empId") int id, Model model) {
        Employee employee = employeeService.getEmployeeById(id);

        model.addAttribute("employee", employee);

        return "employee-info";

    }


    @RequestMapping("/deleteInfo")
    public String deleteEmployee(@RequestParam("empId") int id) {

        employeeService.deleteEmployee(id);


        return "redirect:/";
    }

}

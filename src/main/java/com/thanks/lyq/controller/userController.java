package com.thanks.lyq.controller;

import com.thanks.lyq.Repository.EmployeeRepository;
import com.thanks.lyq.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by mac on 16/5/24.
 */
@Controller
@RequestMapping("/user")
public class userController {

    @Resource EmployeeRepository employeeRepository;

    @ResponseBody
    @RequestMapping("/add")
    public Employee add(){
        Employee employee = new Employee("程", "文席", "1.0");
        System.out.println(employee.getFirstName());
        return employeeRepository.insert(employee);
    }

    @ResponseBody
    @RequestMapping("/find")
    public List<Employee> find(){
        return employeeRepository.findAll();
    }
}

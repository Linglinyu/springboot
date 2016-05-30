package com.thanks.lyq;


import com.thanks.lyq.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoDataAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SpringBootApplication
public class Application  {

    @RequestMapping("/")
    @ResponseBody
    public  Employee home(){
        Employee employee = new Employee("程", "文席", "1.0");
        System.out.println(employee.getFirstName());
        return employee;
    }

    @RequestMapping("/view")
    public ModelAndView view(){
        Employee employee = new Employee("程", "文席", "1.0");
        System.out.println(employee.getFirstName());


        return new ModelAndView("home","employee",employee);
    }



    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
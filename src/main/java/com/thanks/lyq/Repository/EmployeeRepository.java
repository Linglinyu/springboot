package com.thanks.lyq.Repository;

import com.thanks.lyq.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by mac on 16/5/20.
 */
public interface EmployeeRepository extends MongoRepository<Employee,String> {

    List<Employee> findAll();

    Employee insert(Employee employee);
}

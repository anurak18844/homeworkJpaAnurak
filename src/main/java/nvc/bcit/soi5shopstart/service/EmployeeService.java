package nvc.bcit.soi5shopstart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.bcit.soi5shopstart.model.Employee;
import nvc.bcit.soi5shopstart.repository.EmployeeRepository;
@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }


    public List<Employee> getEmployeeBySalary(double salary){
        return employeeRepository.findBySalaryEquals(salary);
    }
}

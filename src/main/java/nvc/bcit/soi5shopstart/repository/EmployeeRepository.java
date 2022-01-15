package nvc.bcit.soi5shopstart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.bcit.soi5shopstart.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    public List<Employee> findByNameContaining(String name);

    public List<Employee> findBySalaryEquals(double salary);
    
}

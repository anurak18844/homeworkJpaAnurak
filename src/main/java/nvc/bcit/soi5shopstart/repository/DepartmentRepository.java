package nvc.bcit.soi5shopstart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.bcit.soi5shopstart.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{
    public List<Department> findByNameContaining(String name);
}

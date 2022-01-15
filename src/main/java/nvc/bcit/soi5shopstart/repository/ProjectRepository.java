package nvc.bcit.soi5shopstart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.bcit.soi5shopstart.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{
    public List<Project> findByNameContaining(String name);
}

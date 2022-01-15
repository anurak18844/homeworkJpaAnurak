package nvc.bcit.soi5shopstart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.bcit.soi5shopstart.model.Project;
import nvc.bcit.soi5shopstart.repository.ProjectRepository;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    public List<Project> getAllProject(){
        return projectRepository.findAll();
    }

    public List<Project> getProjectByName(String name){
        return projectRepository.findByNameContaining(name);
    }
}

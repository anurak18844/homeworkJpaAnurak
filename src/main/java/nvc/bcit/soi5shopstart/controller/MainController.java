package nvc.bcit.soi5shopstart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import nvc.bcit.soi5shopstart.model.Department;
import nvc.bcit.soi5shopstart.model.Employee;
import nvc.bcit.soi5shopstart.model.Product;
import nvc.bcit.soi5shopstart.model.Project;
import nvc.bcit.soi5shopstart.service.DepartmentService;
import nvc.bcit.soi5shopstart.service.EmployeeService;
import nvc.bcit.soi5shopstart.service.ProductService;
import nvc.bcit.soi5shopstart.service.ProjectService;

@Controller
public class MainController {
    // @Autowired
    // ProductService productService;

    @GetMapping("/")
    public String index () {
        return "index";
    }

    @Autowired
    EmployeeService employeeService;

    @Autowired
    DepartmentService departmentService;

    @Autowired
    ProjectService projectService;

    @GetMapping("/employee")
    public ModelAndView employee(){
        List<Employee> employees = employeeService.getAllEmployee();
        return new ModelAndView("employee", "employees", employees);
    }

    @GetMapping("/employee/salary/{salary}")
    public ModelAndView getEmployeeBySalary(@PathVariable("salary") double salary){
        List<Employee> employees = employeeService.getEmployeeBySalary(salary);
        return new ModelAndView("employee", "employees", employees);
    }
    
    @GetMapping("/department")
    public ModelAndView department(){
        List<Department> departments = departmentService.getAllDepartment();
        return new ModelAndView("department", "departments", departments);
    }
    
    @GetMapping("/department/name/{name}")
    public ModelAndView getDepartmentByName(@PathVariable("name") String name){
        List<Department> departments = departmentService.getDepartmentByName(name);
        return new ModelAndView("department", "departments", departments);
    }

    @GetMapping("/project")
    public ModelAndView project(){
        List<Project> projects = projectService.getAllProject();
        return new ModelAndView("project", "projects", projects);
    }

    @GetMapping("/project/name/{project}")
    public ModelAndView getProjectByName(@PathVariable("project") String project){
        List<Project> projects = projectService.getProjectByName(project);
        return new ModelAndView("project", "projects", projects);
    }
    // @GetMapping("/product")
    // public ModelAndView product () {
    //     List<Product> products = productService.findAll();
    //     return new ModelAndView("product", "products", products);
    // }

    // @GetMapping("/product/new")
    // public String newProduct () {
    //     return "newproduct";
    // }

    // @GetMapping("/product/edit")
    // public String editProduct () {
    //     return "editproduct";
    // }
}

package DepartmentMicroservice.Controller;

import DepartmentMicroservice.Entity.Department;
import DepartmentMicroservice.Service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/dept")
@Slf4j
public class DepartmentController {

    @Autowired
    public DeptService service;

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable(value = "id") UUID uuid){
        log.info("Inside getDepartmentById of DepartmentController with dept id - " + uuid);
        Optional<Department> deptartmentIn = service.getDepartmentById(uuid);
        ResponseEntity departemntFound = deptartmentIn
                .map(i -> new ResponseEntity(i, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity(Map.of("Error", "No department with id =" + uuid + " found"), HttpStatus.NOT_FOUND));

        return departemntFound;
    }

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment of DepartmentController");
        return service.saveDepartment(department);
    }
}

package DepartmentMicroservice.Service;

import DepartmentMicroservice.Entity.Department;
import DepartmentMicroservice.Repository.DeptRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
public class DeptService {

    @Autowired
    public DeptRepository repository;

    public Optional<Department> getDepartmentById(UUID id){
        log.info("Inside getDepartmentById of DeptService with id - " + id);
        return repository.getDepartmentById(id);
    }

    public Department saveDepartment(Department department) {
        return repository.save(department);
    }
}

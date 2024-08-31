package DepartmentMicroservice.Repository;

import DepartmentMicroservice.Entity.Department;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface DeptRepository extends JpaRepository<Department, UUID> {

    @Transactional
    @Query(nativeQuery = true, value = "Select * from deptmicroservice where deptId=?1")
    public Optional<Department> getDepartmentById(UUID id);

}

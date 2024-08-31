package DepartmentMicroservice.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "DeptMicroService")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "deptId")
    private UUID deptId;
    private String deptName;
    private String deptAddress;
    private Long deptZip;
}

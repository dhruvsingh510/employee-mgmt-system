package javacourse.microservices.employeeservice.repository;

import javacourse.microservices.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

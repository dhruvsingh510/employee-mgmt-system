package javacourse.microservices.employeeservice.service;

import javacourse.microservices.employeeservice.dto.APIResponseDto;
import javacourse.microservices.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    APIResponseDto getEmployeeById(Long employeeId);
}

package javacourse.microservices.departmentservice.service;

import javacourse.microservices.departmentservice.dto.DepartmentDto;

public interface DepartmentService {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartmentByCode(String code);

}

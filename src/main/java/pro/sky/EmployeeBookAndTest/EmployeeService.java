package pro.sky.EmployeeBookAndTest;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    String hello();
    Employee addEmployee(String firstName, String lastName, int salary, int departmentId);
    String removeEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);
    List<Employee> allEmployees();

}
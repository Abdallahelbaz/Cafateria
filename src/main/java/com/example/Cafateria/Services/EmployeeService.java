package com.example.Cafateria.Services;

import com.example.Cafateria.Database.Employee;
import com.example.Cafateria.Repos.EmployeeRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@AllArgsConstructor
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    public Employee updateEmployee(Long id, Employee employeeDetails) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));

        employee.setActive(employeeDetails.getActive());
        employee.setShift(employeeDetails.getShift());
        employee.setSalary(employeeDetails.getSalary());
        employee.setAddress(employeeDetails.getAddress());
        employee.setJobDescription(employeeDetails.getJobDescription());

        return employeeRepository.save(employee);
    }
}

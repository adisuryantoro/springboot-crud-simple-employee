package id.suryasoftwaredevelopment.simpleemployee.controller;

import id.suryasoftwaredevelopment.simpleemployee.exception.ResourceNotFoundException;
import id.suryasoftwaredevelopment.simpleemployee.model.Employee;
import id.suryasoftwaredevelopment.simpleemployee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // get employee
    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return this.employeeRepository.findAll();
    }

    // get employee by id
    @GetMapping("/employee/{id")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId) throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id : $employeeId"));
        return ResponseEntity.ok().body(employee);
    }
    // add employee
    // update employee
    // delete employee
}

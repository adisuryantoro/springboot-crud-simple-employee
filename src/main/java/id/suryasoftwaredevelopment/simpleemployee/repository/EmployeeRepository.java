package id.suryasoftwaredevelopment.simpleemployee.repository;

import id.suryasoftwaredevelopment.simpleemployee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

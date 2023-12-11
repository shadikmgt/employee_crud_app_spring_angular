package com.employeemanage.employeecrud.repo;

import com.employeemanage.employeecrud.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
     @Transactional
     Optional<?> deleteEmployeeById(Long id);

     Optional <Employee> findEmployeeById(Long id);
}

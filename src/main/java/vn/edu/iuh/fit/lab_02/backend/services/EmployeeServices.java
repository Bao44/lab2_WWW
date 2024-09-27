package vn.edu.iuh.fit.lab_02.backend.services;

import org.joda.time.DateTime;
import vn.edu.iuh.fit.lab_02.backend.models.Employee;
import vn.edu.iuh.fit.lab_02.backend.models.EmployeeStatus;
import vn.edu.iuh.fit.lab_02.backend.models.Order;
import vn.edu.iuh.fit.lab_02.backend.repositories.EmployeeRepository;

import java.util.List;
import java.util.Optional;

public class EmployeeServices {
    private EmployeeRepository repository;
    public EmployeeServices() {
        repository = new EmployeeRepository();
    }
    public void insertEmp(Employee employee) {
        repository.insertEmp(employee);
    }
    public Optional<Employee> findById(long id) {
        return repository.findbyId(id);
    }
    public boolean delete(long id) {
        Optional<Employee> op = findById(id);
        if (op.isPresent()) {
            Employee employee = op.get();
            employee.setStatus(EmployeeStatus.TERMINATED);
            return true;
        }
        return false;
    }
    public boolean activeEmp(long id) {
        Optional<Employee> op = findById(id);
        if (op.isPresent()) {
            Employee employee = op.get();
            employee.setStatus(EmployeeStatus.ACTIVE);
            return true;
        }
        return false;
    }
    public List<Employee> getAll() {
        return repository.getAllEmp();
    }
    public List<Order> getOrdersByPeriod(long empId, DateTime from, DateTime to) {
        return null;
    }
}
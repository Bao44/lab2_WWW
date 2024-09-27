package vn.edu.iuh.fit.lab_02.backend.services;


import vn.edu.iuh.fit.lab_02.backend.models.Customer;
import vn.edu.iuh.fit.lab_02.backend.repositories.CustomerRepository;

import java.util.List;

public class CustomerServices {
    private final CustomerRepository repository;
    public CustomerServices(){
        repository = new CustomerRepository();
    }
    public CustomerServices(CustomerRepository repository) {
        this.repository = repository;
    }

    public void insertCus(Customer customer) {
        repository.insertCus(customer);
    }

    public List<Customer> getAll() {
        return repository.getAllCust();
    }
}

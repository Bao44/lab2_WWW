package vn.edu.iuh.fit.lab_02.models;

import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class Employee {
    @Id
    private long id;
    private String address;
    private LocalDateTime dob;
    private String email;
    private String fullname;
    private String phone;
    private EmployeeStatus status;
}

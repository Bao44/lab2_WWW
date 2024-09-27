package vn.edu.iuh.fit.lab_02.backend.models;

import jakarta.persistence.*;
import org.joda.time.DateTime;

import java.util.List;

@Entity
@Table(name = "employee")
@NamedQueries({
        @NamedQuery(name = "Employee.findAll", query = "select e from Employee e where e.status = ?1"),
        @NamedQuery(name = "Employee.findByID", query = "select e from Employee e where e.id=: id")
})
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long emp_id;
    @Column(length = 150, nullable = false)
    private String full_name;
    @Column(nullable = false)
    private DateTime dob;
    @Column(unique = true, length = 150)
    private String email;
    @Column(length = 15, nullable = false)
    private String phone;
    @Column(length = 250, nullable = false)
    private String address;
    @Column(columnDefinition = "int", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private EmployeeStatus status;
    @OneToMany(mappedBy = "employee")
    private List<Order> orderList;

    public Employee() {
    }

    public Employee(String full_name, DateTime dob, String email, String phone, String address) {
        this.full_name = full_name;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public Employee(long emp_id, String full_name, DateTime dob, String email, String phone, String address, EmployeeStatus status, List<Order> orderList) {
        this.emp_id = emp_id;
        this.full_name = full_name;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = status;
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", full_name='" + full_name + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", status=" + status +
                ", orderList=" + orderList +
                '}';
    }

    public long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public DateTime getDob() {
        return dob;
    }

    public void setDob(DateTime dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public EmployeeStatus getStatus() {
        return status;
    }

    public void setStatus(EmployeeStatus status) {
        this.status = status;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
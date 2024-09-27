package vn.edu.iuh.fit.lab_02.backend.models;

import jakarta.persistence.*;
import org.joda.time.DateTime;

import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", nullable = false)
    private long order_id;
    @Column(nullable = false)
    private DateTime order_date;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "cus_id")
    private Customer customer;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetailList;

    public Order() {
    }

    public Order(long order_id, DateTime order_date, Employee employee, Customer customer, List<OrderDetail> orderDetailList) {
        this.order_id = order_id;
        this.order_date = order_date;
        this.employee = employee;
        this.customer = customer;
        this.orderDetailList = orderDetailList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", order_date=" + order_date +
                ", employee=" + employee +
                ", customer=" + customer +
                ", orderDetailList=" + orderDetailList +
                '}';
    }

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public DateTime getOrder_date() {
        return order_date;
    }

    public void setOrder_date(DateTime order_date) {
        this.order_date = order_date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }
}
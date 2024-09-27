package vn.edu.iuh.fit.lab_02.backend;


import vn.edu.iuh.fit.lab_02.backend.connection.MySessionFactory;

public class Main {
    public static void main(String[] args) {
        MySessionFactory.getInstance();

//        EmployeeServices employeeServices = new EmployeeServices();
//        List<Employee> list =  employeeServices.getAll();
//        list.forEach(System.out::println);

    }
}

package vn.edu.iuh.fit.lab_02.backend.models;

public enum EmployeeStatus {
    ACTIVE(1),
    INACTIVE(0),
    TERMINATED(-1);
    private final int value;
    EmployeeStatus(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
package vn.edu.iuh.fit.lab_02.backend.models;

public enum ProductStatus {
    ACTIVE(1),
    INACTIVE(0),
    TERMINATED(-1);
    private final int value;
    ProductStatus(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

}
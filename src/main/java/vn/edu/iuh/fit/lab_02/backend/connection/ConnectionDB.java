package vn.edu.iuh.fit.lab_02.backend.connection;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnectionDB {
    private static ConnectionDB instance;
    private EntityManagerFactory emf;
    public ConnectionDB() {
        emf = Persistence.createEntityManagerFactory("dbweek2");
    }
    public static ConnectionDB getInstance() {
        if(instance == null)
            instance = new ConnectionDB();
        return instance;
    }
    public EntityManagerFactory getEmf() {
        return emf;
    }
}

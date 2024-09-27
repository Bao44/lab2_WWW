package vn.edu.iuh.fit.lab_02.backend.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.edu.iuh.fit.lab_02.backend.models.Product;

import java.util.List;

public class ProductRepository {
    private EntityManager em;
    private EntityTransaction trans;
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    public ProductRepository(){
        em = Persistence.createEntityManagerFactory("lab_week_2")
                .createEntityManager();
        trans = em.getTransaction();
    }

    public void insert(Product product){
        try {
            trans.begin();
            em.persist(product);
            trans.commit();
        } catch (Exception e){
            trans.rollback();
            logger.error(e.getMessage());
        }
    }

    public List<Product> getAll(){
        return em.createNamedQuery("Product.findAll", Product.class).getResultList();
    }

    public List<Product> getActiveProduct(){
        return em.createNamedQuery("Product.findAll", Product.class).getResultList();
    }
}
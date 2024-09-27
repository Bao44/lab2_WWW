package vn.edu.iuh.fit.lab_02.backend.services;

import vn.edu.iuh.fit.lab_02.backend.models.Product;
import vn.edu.iuh.fit.lab_02.backend.repositories.ProductRepository;

import java.util.List;

public class ProductServices {
    private final ProductRepository repository;

    public ProductServices() {
        repository = new ProductRepository();
    }

    public void insertProduct(Product product){
        repository.insert(product);
    }

    public List<Product> getActiveProducts(){
        return repository.getActiveProduct();
    }
}

package vn.edu.iuh.fit.lab_02.frontend.models;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.lab_02.backend.models.Product;
import vn.edu.iuh.fit.lab_02.backend.models.ProductStatus;
import vn.edu.iuh.fit.lab_02.backend.services.ProductServices;

import java.io.IOException;

public class ProductModel {
    private final ProductServices productServices = new ProductServices();
    public void insertProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        String desc = req.getParameter("desc");
        String unit = req.getParameter("unit");
        String manu = req.getParameter("manu");
        String status = req.getParameter("status");

        Product product;
        product = new Product(name,desc,unit,manu, ProductStatus.valueOf(status));
        productServices.insertProduct(product);
        resp.sendRedirect("product.jsp");
    }
}
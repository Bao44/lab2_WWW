package vn.edu.iuh.fit.lab_02.backend.converters;

import jakarta.persistence.AttributeConverter;
import vn.edu.iuh.fit.lab_02.backend.models.ProductStatus;

import java.util.stream.Stream;

public class ProductStatusConverter implements AttributeConverter<ProductStatus, Integer> {
    @Override
    public Integer convertToDatabaseColumn(ProductStatus attribute) {
        if(attribute == null) {
            return null;
        }
        return attribute.getValue();
    }

    @Override
    public ProductStatus convertToEntityAttribute(Integer dbData) {
        if (dbData == null) {
            return null;
        }
        return Stream.of(ProductStatus.values())
                .filter(c -> c.getValue() == dbData)
                .findFirst()
                .orElseThrow(IllegalAccessError::new);

    }
}
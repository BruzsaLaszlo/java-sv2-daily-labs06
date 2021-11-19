package day05;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<ProductWithPiece> numberOfProductByType() {
        List<ProductWithPiece> result = new ArrayList<>();

        for (Product actual : products) {
            ProductWithPiece productWithPiece = containProduct(actual, result);
            if (productWithPiece == null) {
                result.add(new ProductWithPiece(actual.getType()));
            } else {
                productWithPiece.inreaseCount();
            }
        }
        return result;
    }

    private ProductWithPiece containProduct(Product actual, List<ProductWithPiece> productWithPieces) {
        for (ProductWithPiece pwp : productWithPieces) {
            if (actual.getType() == pwp.getType()) {
                return pwp;
            }
        }
        return null;
    }

    public List<Product> getProducts() {
        return List.copyOf(products);
    }
}

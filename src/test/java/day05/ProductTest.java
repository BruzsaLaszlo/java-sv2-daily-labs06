package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void create() {

         Product product = new Product("kifli", Type.BAKERY, 22);

         assertEquals("kifli",product.getName());
         assertEquals(22 ,product.getPrice());
         assertEquals(Type.BAKERY,product.getType());

    }

}
package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StoreTest {

    Store store = new Store();

    @BeforeEach
    void init() {

        store.addProduct(new Product("alma", Type.FRUIT, 200));
        store.addProduct(new Product("körte", Type.FRUIT, 250));
        store.addProduct(new Product("barack", Type.FRUIT, 240));
        store.addProduct(new Product("csirke", Type.MEAT, 2240));
        store.addProduct(new Product("liba", Type.MEAT, 2244));
        store.addProduct(new Product("kifli", Type.BAKERY, 22));
        store.addProduct(new Product("zsömle", Type.BAKERY, 44));

    }


    @Test
    void numberOfProductByTypeTest() {

        assertEquals(3, getCount(Type.FRUIT));
        assertEquals(2, getCount(Type.MEAT));
        assertEquals(2, getCount(Type.BAKERY));

    }

    @Test
    void addProductTest() {
        assertEquals(7, store.getProducts().size());
    }


    private int getCount(Type type) {

        int count = 0;
        for (ProductWithPiece pwp : store.numberOfProductByType()) {
            if (pwp.getType() == type) {
                count = pwp.getCount();
                break;
            }
        }
        return count;

    }
}
package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductWithPieceTest {

    ProductWithPiece productWithPiece = new ProductWithPiece(Type.FRUIT);

    @Test
    void create() {

        assertEquals(Type.FRUIT, productWithPiece.getType());
        assertEquals(1, productWithPiece.getCount());

    }

    @Test
    void increaseCountTest() {

        productWithPiece.inreaseCount();

        assertEquals(2, productWithPiece.getCount());

    }

}
package day02.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car = new Car("Toyota", 1.2, Color.BLACK, 1_000_000);

    @Test
    void decreasePrice() {

        car.decreasePrice(50);
        assertEquals(500_000,car.getPrice());

    }

    @Test
    void getBrand() {

        assertEquals("Toyota", car.getBrand());

    }

    @Test
    void getEngineCapacity() {

        assertEquals(1.2, car.getEngineCapacity(), 0.001);

    }

    @Test
    void getColor() {

        assertEquals(Color.BLACK, car.getColor());

    }

    @Test
    void getPrice() {

        assertEquals(1_000_000, car.getPrice());

    }
}
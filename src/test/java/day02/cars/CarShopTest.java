package day02.cars;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarShopTest {

    CarShop carShop = new CarShop("Best Car", 10_000_000);

    Car car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
    Car car2 = new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000);
    Car car3 = new Car("Suzuki", 1.4, Color.RED, 1_500_000);
    Car car4 = new Car("Toyota", 1.4, Color.GREY, 2_700_000);


    @Test
    void addCar() {

        assertTrue(carShop.addCar(car1));

        assertFalse(carShop.addCar(car2));

    }

    @Test
    void sumCarPrice() {

        carShop.addCar(car1);
        carShop.addCar(car2);
        carShop.addCar(car3);
        carShop.addCar(car4);

        assertEquals(6500000, carShop.sumCarPrice());

    }

    @Test
    void numberOfCarsCheaperThan() {

        carShop.addCar(car3);
        carShop.addCar(car4);

        assertEquals(1, carShop.numberOfCarsCheaperThan(2_000_000));

        assertEquals(0, carShop.numberOfCarsCheaperThan(1_000_000));

    }

    @Test
    void carsWithBrand() {

        carShop.addCar(car1);
        carShop.addCar(car2);
        carShop.addCar(car3);
        carShop.addCar(car4);

        assertEquals(2, carShop.carsWithBrand("Toyota").size());

        assertEquals(0, carShop.carsWithBrand("BMW").size());

    }

    @Test
    void getName() {

        assertEquals("Best Car", carShop.getName());

    }

    @Test
    void getMaxPrice() {

        assertEquals(10_000_000, carShop.getMaxPrice());

    }

    @Test
    void getCarsForSell() {

        carShop.addCar(car1);

        assertEquals(1, carShop.getCarsForSell().size());

        carShop.addCar(car2);

        assertEquals(1, carShop.getCarsForSell().size());

    }


}
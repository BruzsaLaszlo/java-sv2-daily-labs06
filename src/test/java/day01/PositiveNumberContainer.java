package day01;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PositiveNumberContainer {

    private List<Double> positiveDoubles = new ArrayList<>();

    public void add(double positiveDouble) {
        positiveDoubles.add(positiveDouble);
    }

    public List<Double> getList() {
        return new ArrayList<>(positiveDoubles);
    }

}

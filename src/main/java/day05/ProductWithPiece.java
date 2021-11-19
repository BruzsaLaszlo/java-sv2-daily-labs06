package day05;

public class ProductWithPiece {

    private final Type type;
    private int count;

    public void inreaseCount() {
        count++;
    }

    public ProductWithPiece(Type type) {
        this.type = type;
        count = 1;
    }

    public Type getType() {
        return type;
    }

    public int getCount() {
        return count;
    }
}

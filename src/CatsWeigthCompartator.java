import java.util.Comparator;

public class CatsWeigthCompartator implements Comparator<Cat> {
    @Override
    public int compare(Cat c1, Cat c2) {
        return c2.weight - c1.weight;
    }
}

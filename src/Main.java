import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", LocalDate.of(2021, 11,1), 3);
        Cat cat2 = new Cat("Tom", LocalDate.of(2022, 10,1), 5);
        Cat cat3 = new Cat("Рыжик", LocalDate.of(2019, 1,1), 1);
        Cat cat4 = new Cat("Рыжик", LocalDate.of(2018, 1,1), 1);

        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);

        System.out.println(cats);
        //Collections.sort(cats, new CatsWeigthCompartator());
        Collections.sort(cats, (c1, c2) -> c2.weight - c1.weight );
        System.out.println(cats);

        // ====================================================
        List<Integer> nums = new ArrayList<>(Set.of(99, 33,22,1,7,3,6,9,10));
        System.out.println(nums);
        Collections.sort(nums, new IntegerDescComparator());
        System.out.println(nums);

    }
}
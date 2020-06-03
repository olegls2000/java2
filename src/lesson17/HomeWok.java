package lesson17;

import data.Auto;

import java.util.*;

public class HomeWok {

    public static void main(String[] args) {
        Set<Auto> autoSet = new HashSet<>();
        autoSet.add(new Auto());
        autoSet.add(new Auto());
        autoSet.add(new Auto());

        Auto maxPriceAuto = getMaxPriceAuto(autoSet);
        System.out.println(maxPriceAuto);
        System.out.println(autoSet);

        TreeSet<Auto> autoTreeSet = new TreeSet<>(new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        autoTreeSet.add(new Auto());
        autoTreeSet.add(new Auto());
        autoTreeSet.add(new Auto());
        Auto maxPriceAutoFromTree = autoTreeSet.last();

        System.out.println(maxPriceAutoFromTree);
        System.out.println(autoTreeSet);

    }

    public static Auto getMaxPriceAuto(Set<Auto> autos) {
        Auto result = null;
        if (autos != null && autos.iterator().hasNext()) {
            result = autos.iterator().next();
            for (Auto current : autos) {
                if (current.getPrice() > result.getPrice()) {
                    result = current;
                }
            }
        }
        return result;

      /*  final Iterator<Auto> iterator = autos.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
*/

    }
}

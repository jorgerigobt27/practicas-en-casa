package JavaStandard.Clase9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iteradores {

    public static void main(String[] args) {

        Map<String, Double> mp = new HashMap<>();

        mp.put("lu", new Double(10.5));
        mp.put("ma", new Double(11.5));
        mp.put("mi", new Double(12.5));
        mp.put("ju", new Double(13.5));
        mp.put("vi", new Double(14.5));
        mp.put("sa", new Double(15.5));
        mp.put("do", new Double(16.5));

        //ITERADORES
        Iterator<Map.Entry<String, Double>> itMap = mp.entrySet().iterator();

        while (itMap.hasNext()) {
            Map.Entry<String, Double> element = itMap.next();
            System.out.println(element.getKey());
            System.out.println(element.getValue());
            System.out.println();
            itMap.remove();

        }
        System.out.println(mp.isEmpty());
    }

}

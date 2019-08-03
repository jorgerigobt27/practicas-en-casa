package JavaStandard.Clase9;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {

    public static void main(String[] args) {
        //map para agregar
        Map<String, Double> mp1 = new HashMap<>();
        mp1.put("sa", new Double(15.5));
        mp1.put("do", new Double(16.5));

        Map<String, Double> mp = new HashMap<>();

        //System.out.println(mp.isEmpty());
        mp1.remove("sa");//eliminar
        mp1.remove("do");

        System.out.println(mp1);
        //agrego

        mp.put("lu", new Double(10.5));
        mp.put("ma", new Double(11.5));
        mp.put("mi", new Double(12.5));
        mp.put("ju", new Double(13.5));
        mp.put("vi", new Double(14.5));

//        System.out.println(mp.toString());
//        
//        //vacio
//        System.out.println(mp.isEmpty());
//        
//        //map unidos en dos
//        mp.putAll(mp1);
//        System.out.println(mp);
        //recorrido sobre el mapa
        Set<String> claves = mp.keySet();
        Collection<Double> values = mp.values();
        //recorrido por clave
//        for (String clave: claves){
//            System.out.println(clave);
//        }
        //recorrido por valor
        for (Double value : values) {
            System.out.println(value);
            value += 0.5D;
        }
        //como recorrer el mapa entero porclave + valor
//        Set<Map.Entry<String, Double>> valoresDelMapa = mp.entrySet();
//        for (Map.Entry<String, Double> value: valoresDelMapa){
//            String clave = value.getKey();
//            Double valor = value.getValue();
//            System.out.println(clave + " " + valor);
//        }

        //actualizar 
        Double valorMiercoles = mp.get("mi");//12.5
        valorMiercoles += 0.5D;
        mp.put("mi", valorMiercoles);
        System.out.println(mp.toString());
//        System.out.println(mp.get("mi"));//13.0

        Set<Map.Entry<String, Double>> valoresDelMapa = mp.entrySet();
        for (Map.Entry<String, Double> value : valoresDelMapa) {
            String clave = value.getKey();
            Double valor = value.getValue();
            System.out.println(clave + " " + valor);
            valor += 0.5D;//modifica completo mi mapa
            mp.put(clave, valor);

        }
        System.out.println(mp.toString());
    }
}

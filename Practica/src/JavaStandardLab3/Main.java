package JavaStandardLab3;

public class Main {

    public static void main(String[] args) {

        Auto A1 = new Auto("polo", "volkswagen", "rojo", 150, 230, 560);
        System.out.println(A1.toString());

        Comprador c1 = new Comprador(1.20, "juan", "perez", "9557259");
        System.out.println(c1.toString());

        Vendedor v1 = new Vendedor(10, "maria", "magdalena", "95571904");
        //System.out.println(v1.toString());

        //ejemplo de set:
        v1.setApellido("doritos");
        System.out.println(v1.toString());
    }

}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Roupa> roupas = new ArrayList<>();
        roupas.add(new Camisa("G", "Vermelha", "Jesse", "Nacional", 100));
        roupas.add(new Calca("G", "Preta", "Grandona", "Calvin Klein", 500));
        roupas.add(new Vestido("PP", "Preto", "Tomara que caia", "Arezzo", 300));

        System.out.println("Catálogo");
        for (Roupa roupa: roupas) {
            if(roupa instanceof Camisa) {
                System.out.println("CAMISAS");
            } else if (roupa instanceof Calca) {
                System.out.println("CALCAS");
            } else {
                System.out.println("VESTIDOS");
            }
            System.out.println(roupa.getNome());
            System.out.println(roupa.getTamanho());
            System.out.println(roupa.getPreco());
            System.out.println(roupa.getCor());
            System.out.println(roupa.getMarca());
            System.out.println();
        }
        System.out.println("----------------------");
    }
}
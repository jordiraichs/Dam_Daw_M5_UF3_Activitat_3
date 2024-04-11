package local.damw;

public class Main {
    public static void main(String[] args) {
      
        Cotxe a1 = new Cotxe("Audi", "Turbo","1232HLZ",10000,"Diesel");
        System.out.println(a1.mostrarCotxe());  // crida a mostrar cotxe
        System.out.println(" Litres consumits : " + a1.consumBenzina(7));

        Cotxe a2 = new Cotxe();
        a2.setMarca("Ferrari");
        a2.setModel("Lafer");
        a2.setMatricula("123W4ABC");
        a2.setCombustible("Gasolina");
        a2.km = 200000;
        System.out.println(a2.mostrarDades()); // crida a mostrar dades
        System.out.println(" Litres consumits : " + a2.consumBenzina(6));

        /* Accessos a l'atribut totalAutos */
        System.out.println("\n Número total d'automòbils (des de Automòbil) : " + Automobil.getTotalAutos());
        System.out.println("\n Número total d'automòbils (des de cotxe) : " + Cotxe.getTotalAutos());
    }
}
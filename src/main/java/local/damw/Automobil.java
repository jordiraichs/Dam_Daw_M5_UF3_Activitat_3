package local.damw;

/**
 * Definició de la classe Automobil
 */
public class Automobil {

    // variables de instància (atributs)
    protected String marca;
    protected String model;
    protected String matricula;
    protected float km;

    //Aactivitat 3, punt 2
    private static int totalAutos = 0;   // atribut estàtic, compartida per tots els objectes d'aquesta clase

    // constructor Activitat 3, punt 3
    public Automobil(String marca, String model, String matricula, float km) {
        this.marca = marca;
        this.model = model;
        this.matricula = matricula;
        this.km = km;
        totalAutos++; // podem accedir: Automobil.totalAutos ++
    }

    // constructor sense parametres crea espai a memòria (constructor per defecte)
    public Automobil() { totalAutos++; }
    
    // mètodes setter 
    public void setMarca(String marca) { this.marca = marca; }
    public void setModel(String model) { this.model = model; }
    public void setMatricula(String matricula){ this.matricula=matricula; }

    // mètodes getter
    public String getMarca() { return marca; }
    public String getModel() { return  model; }
    public String getMatricula(){ return matricula; }

    // Activitat 3, punt 2 ,  mètode per  mostrar les dades de l'automòbil
    // el podriem deixar buit --> Abstracte , ja que el sobrescivim en cada classe que hereti
    public String mostrarDades(){
        return  "\n Marca: "+ this.marca +", Model: " + this.model 
                + ", Matrícula: " + this.matricula + " (" + matriculaCorrecta(this.matricula)  + " )";
    }

    /* ******  Activitat 3, punt 3 **** 

    // aquesta funció podria ser perfectament statica, ja que no modifica cap atribut de la classe
     protected float consumBenzina(float litresX100){
        float litresTotal = this.km * litresX100 / 100;
        return litresTotal;
    }

    // Com que en totes les classes que deriven de Automobil sobreescriurem el mètode --> @Override
    // la deixem buida de contingut --> Podem condiderar un mètode " ABSTRACTE */
    protected float consumBenzina(float litresX100){return 0;};
    
    /* ***************** */

    //Aactivitat 3, punt 2
    protected static int getTotalAutos() { return totalAutos; }


    // Funció estàtica ens retorna true si matricula correcta
    public static boolean matriculaCorrecta (String matricula){
        char[] mat = matricula.toCharArray();
        int longitud = matricula.length();
        boolean correcta = true;
        int i = 0;
        
        if(longitud != 7) correcta = false; 
        while (correcta == true && i < longitud){ 
            char c = mat[i];
    
            if( i < 4 && Character.isDigit(c)){
                i = i + 1; 
            } else if ( i >= 4 && i < longitud && Character.isUpperCase(c)) {
                i = i + 1;
            } else {
                correcta = false;
            }
        }

        return correcta;
    }

}

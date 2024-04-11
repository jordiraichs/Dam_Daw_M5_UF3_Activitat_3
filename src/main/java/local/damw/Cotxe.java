package local.damw;

public class Cotxe extends Automobil {
    private String combustible; // Diesel, Gasolina, Hybrid, Elèctric

    // constructor per defecte
    public Cotxe(){}

    // constructor
    public Cotxe(String marca, String model, String matricula,float km ,String combustible){
      /*** PROVEU *** : accedir als atributs protected , o a través dels setters 
        this.marca = marca;
        this.model = model;
        this.matricula = matricula;
        this.km = km;
        ------
        this.setMarca(marca);
        this.setModel(model);
        this.setMatricula(matricula);
         */

        super(marca,model,matricula,km); // FORMA ELEGANT: cridem al constructor de la  clase pare
        this.combustible = combustible; 
    }
    
    // getters y setters
    public void setCombustible(String combustible) {this.combustible=combustible;}
    public String getCombustible() {return combustible;}

    // sobreescrivim el mètode de la classe pare 
    // aquesta funció podria ser perfectament statica, ja que no modifica cap atribut de la classe
    @Override
    public float consumBenzina(float litresX100){
        float litresTotal = this.km * litresX100 / 100;
        if(this.combustible == "Hybrid"){
            litresTotal = litresTotal - ((litresTotal/100) * 20); 
        } else if(this.combustible == "Elèctric"){
            litresTotal = 0;
        }
        return litresTotal;
    }

    // ** Dos mètodes per mostrar la informació del cotxe **

    // metode per mostrar cotches
    public String mostrarCotxe(){
        return super.mostrarDades() + " Combustible: " 
        + this.combustible; 
    }

    // VERSIÓ ELEGANT : sobrecarreguem el mètode mostrarDades() de la clase pare  
    @Override
    public String mostrarDades(){
        return super.mostrarDades() + " Combustible: " + this.combustible ;    
    }

}

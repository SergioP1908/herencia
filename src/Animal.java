public class Animal {

    private String nombre;

    private double peso;

    /*public Animal (){

    }*/ //Si se llama a un contructor vacio la clase leon si funciona

    /*public Animal(){
        super();
    }*/

    public Animal(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    

}

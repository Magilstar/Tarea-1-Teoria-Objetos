public class Usopersonas {
    public static void main(String[] args){
        // TODO
    }
}

abstract class Persona{
    String nombre;
    public Persona(String nom){
        nombre = nom;
    }
    public String dameNombre(){
        return nombre;
    }
    public abstract String dameDescripcion();

}
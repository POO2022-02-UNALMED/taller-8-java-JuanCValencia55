package futbol;

public abstract class Futbolista implements Comparable{
    private String nombre;
    private int edad;
    private final String posicion;

    //Constructores
    public Futbolista(){
        this.nombre = "Maradona";
        this.edad = 30;
        this.posicion = "delantero";
    }
    public Futbolista(String nombre, int edad, String POSICION) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = POSICION;
    }

    //setters y getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    //Metodos

    @Override
    public String toString() {
        return("El futbolista " + this.nombre + " tiene " + this.edad + ", y juega de " + this.posicion);
    }

    public boolean equals(Futbolista f){
        if(this.nombre==f.getNombre() && this.edad == f.getEdad()){
            return true;
        }
        return false;
    }

    public abstract boolean jugarConLasManos();
}

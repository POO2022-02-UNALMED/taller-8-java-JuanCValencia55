package futbol;

public abstract class Futbolista implements Comparable<Futbolista>{
    private String nombre;
    private int edad;
    private final String POSICION;

    //Constructores
    public Futbolista(){
        this.nombre = "Maradona";
        this.edad = 30;
        this.POSICION = "delantero";
    }
    public Futbolista(String nombre, int edad, String POSICION) {
        this.nombre = nombre;
        this.edad = edad;
        this.POSICION = POSICION;
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

    public String getPOSICION() {
        return POSICION;
    }

    //Metodos

    @Override
    public String toString() {
        return("El futbolista " + this.nombre + " tiene " + this.edad + " y, juega de " + this.POSICION);
    }

    public boolean equals(Futbolista f){
        return (this.equals(f));
    }

    public abstract boolean jugarConLasManos();
}

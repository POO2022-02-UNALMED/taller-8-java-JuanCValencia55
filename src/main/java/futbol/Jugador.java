package futbol;

public class Jugador extends Futbolista{
    public short golesMarcados;
    public byte dorsal;

    //Constructores

    public Jugador() {
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    public Jugador(String nombre, int edad, String POSICION, short golesMarcados, byte dorsal) {
        super(nombre, edad, POSICION);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    //metodos

    @Override
    public int compareTo(Object o) {
        int dif;
        Futbolista f = (Futbolista) o;
        if(this.getEdad()>=f.getEdad()){
            dif = this.getEdad()-f.getEdad();
        } else {
            dif = f.getEdad()-this.getEdad();
        }
        return dif;
    }

    @Override
    public String toString() {
        return (super.toString() + " con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados);
    }

    @Override
    public boolean jugarConLasManos() {
        return false;
    }
}

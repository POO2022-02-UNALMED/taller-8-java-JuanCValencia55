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
    public int compareTo(Futbolista o) {
        int dif;
        if(this.getEdad()>=o.getEdad()){
            dif = this.getEdad()-o.getEdad();
        } else {
            dif = o.getEdad()-this.getEdad();
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

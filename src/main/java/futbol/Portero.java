package futbol;

import javax.sound.sampled.Port;

public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;

    //Constructor

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    //Metodos

    @Override
    public String toString() {
        return (super.toString() + " con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos);
    }

    @Override
    public int compareTo(Object o) {
        int dif;
        Portero p = (Portero) o;
        if(this.golesRecibidos >= p.golesRecibidos){
            dif = this.golesRecibidos - p.golesRecibidos;
        } else{
            dif = p.golesRecibidos - this.golesRecibidos;
        }
        return dif;
    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }
}

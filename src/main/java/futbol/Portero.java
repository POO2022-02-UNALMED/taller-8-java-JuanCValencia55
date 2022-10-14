package futbol;

import javax.sound.sampled.Port;

public class Portero extends Futbolista{
    public short golesRecividos;
    public byte dorsal;

    //Constructor

    public Portero(String nombre, int edad, short golesRecividos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecividos = golesRecividos;
        this.dorsal = dorsal;
    }

    //Metodos

    @Override
    public String toString() {
        return (super.toString() + " con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecividos);
    }

    @Override
    public int compareTo(Futbolista o) {
        int dif;
        Portero p = (Portero) o;
        if(this.golesRecividos >= p.golesRecividos){
            dif = this.golesRecividos - p.golesRecividos;
        } else{
            dif = p.golesRecividos - this.golesRecividos;
        }
        return dif;
    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }
}

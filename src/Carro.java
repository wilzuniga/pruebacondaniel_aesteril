
import java.util.ArrayList;


public class Carro {
    Motor Motor;
    Llantas llantas;
    String Conductor;
    String Placa;

    public Carro() {
    }

    public Carro(Motor Motor, Llantas llantas, String Conductor, String Placa) {
        this.Motor = Motor;
        this.llantas = llantas;
        this.Conductor = Conductor;
        this.Placa = Placa;
    }

    public Motor getMotor() {
        return Motor;
    }

    public void setMotor(Motor Motor) {
        this.Motor = Motor;
    }

    public Llantas getLlantas() {
        return llantas;
    }

    public void setLlantas(Llantas llantas) {
        this.llantas = llantas;
    }

    public String getConductor() {
        return Conductor;
    }

    public void setConductor(String Conductor) {
        this.Conductor = Conductor;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }
    
    


    @Override
    public String toString() {
        return "Carro{" + "Motor=" + Motor + ", llantas=" + llantas + ", Conductor=" + Conductor + ", Placa=" + Placa + '}';
    }
    
}

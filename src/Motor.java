
public class Motor {

    int Combustible;
    String Material;
    int Cilindros;
    int Caballos_fuerza;

    public Motor() {
    }

    
    
    public Motor(int Combustible, String Material, int Cilindros, int Caballos_fuerza) {
        this.Combustible = Combustible;
        this.Material = Material;
        this.Cilindros = Cilindros;
        this.Caballos_fuerza = Caballos_fuerza;
    }

    public int getCombustible() {
        return Combustible;
    }

    public void setCombustible(int Combustible) {
        this.Combustible = Combustible;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public int getCilindros() {
        return Cilindros;
    }

    public void setCilindros(int Cilindros) {
        this.Cilindros = Cilindros;
    }

    public int getCaballos_fuerza() {
        return Caballos_fuerza;
    }

    public void setCaballos_fuerza(int Caballos_fuerza) {
        this.Caballos_fuerza = Caballos_fuerza;
    }

    @Override
    public String toString() {
        return "Motor{" + "Combustible=" + Combustible + ", Material=" + Material + ", Cilindros=" + Cilindros + ", Caballos_fuerza=" + Caballos_fuerza + '}';
    }
    
    
}

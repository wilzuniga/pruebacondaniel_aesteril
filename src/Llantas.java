public class Llantas {
    String Material;
    int Kilometraje;
    int Tamaño;

    public Llantas() {
    }
    
    public Llantas(String Material, int Kilometraje, int Tamaño) {
        this.Material = Material;
        this.Kilometraje = Kilometraje;
        this.Tamaño = Tamaño;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public int getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(int Kilometraje) {
        this.Kilometraje = Kilometraje;
    }

    public int getTamaño() {
        return Tamaño;
    }

    public void setTamaño(int Tamaño) {
        this.Tamaño = Tamaño;
    }

    @Override
    public String toString() {
        return "Llantas{" + "Material=" + Material + ", Kilometraje=" + Kilometraje + ", Tama\u00f1o=" + Tamaño + '}';
    }
    
    
}

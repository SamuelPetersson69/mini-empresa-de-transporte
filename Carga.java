public class Carga {
    private int id;
    private float peso;
    private String origen;
    private String destino;
    private Camion camionAsignado;

    public Carga(int id, float peso, String origen, String destino) {
        this.id = id;
        this.peso = peso;
        this.origen = origen;
        this.destino = destino;
        this.camionAsignado = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Camion getCamionAsignado() {
        return camionAsignado;
    }

    public void setCamionAsignado(Camion camionAsignado) {
        this.camionAsignado = camionAsignado;
    }
}

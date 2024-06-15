public class Camion {
    private String matricula;
    private float capacidadCarga;
    private float consumoGasolina;
    private float cargaActual;

    public Camion(String matricula, float capacidadCarga, float consumoGasolina) {
        this.matricula = matricula;
        this.capacidadCarga = capacidadCarga;
        this.consumoGasolina = consumoGasolina;
        this.cargaActual = 0; // Inicialmente, la carga actual es 0.
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public float getConsumoGasolina() {
        return consumoGasolina;
    }

    public void setConsumoGasolina(float consumoGasolina) {
        this.consumoGasolina = consumoGasolina;
    }

    public float getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(float cargaActual) {
        this.cargaActual = cargaActual;
    }

    public boolean cargar(float peso) {
        if (this.cargaActual + peso <= this.capacidadCarga) {
            this.cargaActual += peso;
            return true;
        } else {
            return false;
        }
    }

    public void descargar(float peso) {
        this.cargaActual = Math.max(this.cargaActual - peso, 0); // No permitir que la carga sea negativa.
    }
}

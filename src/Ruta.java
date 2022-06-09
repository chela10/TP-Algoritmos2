public abstract class Ruta {
    // Atributos
    protected Terminal origen;
    protected Terminal destino;
    protected float distancia;
    protected float consumo;
    protected float tarifa;
    protected float tiempo;
    
    // Metodos

    public Terminal obtenerOrigen() {
        return this.origen;
    }

    public Terminal obtenerDestino() {
        return this.destino;
    }

    public float obtenerDistancia() {
        return this.distancia;
    }

    public float obtenerConsumo() {
        return this.consumo;
    }

    public float obtenerTarifa() {
        return this.tarifa;
    }

    public float obtenerTiempo() {
        return this.tiempo;
    }
}

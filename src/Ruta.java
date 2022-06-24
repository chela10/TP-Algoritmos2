public abstract class Ruta {
    // Atributos
    protected Terminal origen;
    protected Terminal destino;
    protected float distancia;
    protected float consumo;
    protected double tarifa;
    protected double tiempo;
    
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

    public double obtenerTarifa() {
        return this.tarifa;
    }

    public double obtenerTiempo() {
        return this.tiempo;
    }
}

public class rutaAerea extends Ruta {
    public rutaAerea(Terminal origen, Terminal destino, float distancia, float consumo, double tarifa, double tiempo) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.consumo = consumo;
        this.tarifa = tarifa;
        this.tiempo = tiempo;
    }
}

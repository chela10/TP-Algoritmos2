public class rutaAcuatica extends Ruta {
    public rutaAcuatica(Terminal origen, Terminal destino, float distancia, float consumo, float tarifa, float tiempo) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.consumo = consumo;
        this.tarifa = tarifa;
        this.tiempo = tiempo;
    }
}
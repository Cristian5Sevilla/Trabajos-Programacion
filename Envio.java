public abstract class Envio {
    //ATRIBUTOS
    protected String codigo;
    protected String destino;
    protected double peso;
    protected double distancia;

    public Envio() {
    }

    public Envio(String codigo, String destino, double distancia, double peso) {
        this.codigo = codigo;
        this.destino = destino;
        this.distancia = distancia;
        this.peso = peso;
    }

    //METODOS
    public abstract double calcularcosto();
    public abstract int tiempoentrega();
    public void mostrarinformacion(){
            System.out.println("Código: " + codigo);
            System.out.println("Destino: " + destino);
            System.out.println("Peso: " + peso + " kg");
            System.out.println("Distancia: " + distancia + " km");
            System.out.println("Costo total: " + calcularcosto());
            System.out.println("Tiempo de entrega: " + tiempoentrega() + " días");
    }
}

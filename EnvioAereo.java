public class EnvioAereo extends Envio{
    private double costobase;

    public EnvioAereo() {
    }

    public EnvioAereo(String codigo, String destino, double distancia, double peso) {
        super(codigo, destino, distancia, peso);
        this.costobase = 20000.0;
    }

    @Override
    public String toString() {
        return "EnvioAereo{" +
                "costobase=" + costobase +
                ", codigo='" + codigo + '\'' +
                ", destino='" + destino + '\'' +
                ", distancia=" + distancia +
                ", peso=" + peso +
                '}';
    }

    //METODOS PROPIOS.
    public double calcularcosto(){
        costobase = 20000;
        double costotal;
        costotal = costobase + ((4000*peso) + (600*distancia));
        double costorecargo;
        double costofinal;

        if(peso > 10){
            System.out.println("El costo tendra un recargo del 20% debido al peso del producto.");
            costorecargo = costotal + (costotal * 0.20);

        }else if (peso > 0 && peso <= 10){
            System.out.println("No se realizara recargo a la compra.");
            costorecargo = costotal + 0;
        }else{
            costotal = 1*0;
            System.out.println("Peso no viable.");
            return costotal;
        }

        if(distancia > 1000){
            System.out.println("Se realizara un descuento del 5% debido a la distancia recorrida.");
            costofinal = costorecargo - (costorecargo*0.05);
            return costofinal;
        }else if(distancia > 0 && distancia <= 1000){
            System.out.println("No se realiza descuento a la compra");
            costofinal = costorecargo+0;
            return costofinal;
        }else{
            costotal = 1*0;
            System.out.println("Distancia no viable.");
            return costotal;
        }
    }
    public int tiempoentrega (){
        int Dias;
        Dias = 0;
        if(distancia > 0 && distancia <= 500 && peso > 0){
            Dias = 1;
            return Dias;
        } else if (distancia > 500 && distancia <= 1500 && peso > 0) {
            Dias = 2;
            return Dias;
        }else if(distancia > 1500 && peso > 0) {
            Dias = 3;
            return Dias;
        }else{
            return Dias;
        }
    }
}


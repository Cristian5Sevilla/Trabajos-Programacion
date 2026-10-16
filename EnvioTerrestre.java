public class EnvioTerrestre extends Envio {
    private double costobase;

    public EnvioTerrestre() {
    }

    public EnvioTerrestre(String codigo, String destino, double distancia, double peso) {
        super(codigo, destino, distancia, peso);
        this.costobase = 8000.0;
    }

    @Override
    public String toString() {
        return "EnvioTerrestre{" +
                "costobase=" + costobase +
                ", codigo='" + codigo + '\'' +
                ", destino='" + destino + '\'' +
                ", distancia=" + distancia +
                ", peso=" + peso +
                '}';
    }

    //METODOS PROPIOS.
    public double calcularcosto(){
        costobase = 8000;
        double costotal;
        costotal = costobase + ((1500*peso) + (400*distancia));
        double costorecargo;
        double costofinal;

        if(peso > 20){
            System.out.println("El costo tendra un recargo del 20% debido al peso del producto.");
            costorecargo = costotal + (costotal * 0.10);

        }else if (peso > 0 && peso <= 20){
            System.out.println("No se realizara recargo a la compra.");
            costorecargo = costotal + 0;
        }else{
            costotal = 1*0;
            System.out.println("Peso no viable.");
            return costotal;
        }

        if(distancia > 500){
            System.out.println("Se realizara un recargo del 15% debido a la distancia recorrida.");
            costofinal = costorecargo + (costorecargo*0.15);
            return costofinal;
        }else if(distancia > 0 && distancia <= 500){
            System.out.println("No se realiza recargo a la compra");
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
        if(distancia > 0 && distancia <= 200 && peso > 0){
            Dias = 1;
            return Dias;
        } else if (distancia > 200 && distancia <= 500 && peso > 0) {
            Dias = 2;
            return Dias;
        }else if(distancia > 500 && distancia <=1000 && peso > 0) {
            Dias = 3;
            return Dias;
        } else if (distancia > 1000 && peso > 0) {
            Dias = 5;
            return Dias;
        }else{
            return Dias;
        }
    }
}


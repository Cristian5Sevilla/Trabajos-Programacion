public class Vehiculo {
    //ATRIBUTOS
    private String Placa;
    private String Marca;
    private int Modelo;
    private double KilometrosRecorridos;
    private double LitrosConsumidos;
    private double PrecioLitro;
    private boolean Activo;

    public Vehiculo() {
    }


    public Vehiculo(String placa, String marca, int modelo, double kilometrosRecorridos, double litrosConsumidos, double precioLitro, boolean activo) {
        this.Placa = placa;
        this.Marca = marca;
        this.Modelo = modelo;
        this.KilometrosRecorridos = kilometrosRecorridos;
        this.LitrosConsumidos = litrosConsumidos;
        this.PrecioLitro = precioLitro;
        this.Activo = activo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int modelo) {
        Modelo = modelo;
    }

    public double getKilometrosRecorridos() {
        return KilometrosRecorridos;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        KilometrosRecorridos = kilometrosRecorridos;
    }

    public double getLitrosConsumidos() {
        return LitrosConsumidos;
    }

    public void setLitrosConsumidos(double litrosConsumidos) {
        LitrosConsumidos = litrosConsumidos;
    }

    public double getPrecioLitro() {
        return PrecioLitro;
    }

    public void setPrecioLitro(double precioLitro) {
        PrecioLitro = precioLitro;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean activo) {
        Activo = activo;
    }

    //METODOS Vehiculos
    public double CalcularRendimiento(){
        double Rendimiento = (KilometrosRecorridos/LitrosConsumidos);
        return Rendimiento;
    }
    public String ClasificarRendimiento() {
        double Rendimiento = CalcularRendimiento();
        if (Rendimiento < 8) {
            System.out.println("El consumo de su vehiculo es alto.");
        }
        if (Rendimiento < 12) {
            System.out.println("El consumo de su vehiculo es moderado.");
        }
        if (Rendimiento < 16) {
            System.out.println("El consumo de su vehiculo es eficiente.");
        }
        if (Rendimiento = > 16) {
            System.out.println("El consumo de su vehiculo es muy eficiente");
        }
    }
    public double CalcularCostoCombustible() {
        double Costo = (LitrosConsumidos * PrecioLitro);
        return Costo;
    }
    public double CalcularCostoPorKilometro() {
        double Costo = CalcularCostoCombustible();
        double CostoPorKilometro = (Costo / KilometrosRecorridos);
        return CostoPorKilometro;
    }
    public boolean ActualizarKilometraje (double NuevosKilometros){

    }
}

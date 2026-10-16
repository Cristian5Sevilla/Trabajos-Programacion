//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Envio> listaEnvios = new ArrayList<>();

        listaEnvios.add(new EnvioAereo("Drss stk", "Barrancabermeja", -800.0, -5.0));
        listaEnvios.add(new EnvioTerrestre("T-100", "Choachi", -100.0, 3.5));

        for (Envio envio : listaEnvios) {
            envio.mostrarinformacion();
            System.out.println("-----------------------------------");
        }
    }
}
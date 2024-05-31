package primercodigo;

public class ArqueroFutbol extends Jugador{

    private int nivelReflejos;

    public ArqueroFutbol(String nombre, String posicion, String nacionalidad, String equipoActual, int numeroCamiseta, int nivelReflejos) {
        super(nombre, posicion, nacionalidad, equipoActual, numeroCamiseta);
        this.nivelReflejos = nivelReflejos;
    }

    //4. Polimorfismo
    @Override
    public void preparcion() {
        System.out.println("Ejercicios de preparacion de un arquero");
    }
}

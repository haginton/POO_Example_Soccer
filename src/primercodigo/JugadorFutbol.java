package primercodigo;

public class JugadorFutbol extends Jugador{ //3. Herencia

    private int nivelAtacar; //1. encapsulamiento
    private int nivelDefender;


    public JugadorFutbol(String nombre, String posicion, String nacionalidad, String equipoActual, int numeroCamiseta, int nivelAtacar, int nivelDefender) {
        super(nombre, posicion, nacionalidad, equipoActual, numeroCamiseta);
        this.nivelAtacar = nivelAtacar;
        this.nivelDefender = nivelDefender;
    }

    @Override
    public void preparcion() {
        System.out.println("Ejercicios de calentamiento de un jugador de campo");
    }

    public void patearBalon(){
        System.out.println("El jugador " + super.getNombre() + " Patea el balon");
    }
}

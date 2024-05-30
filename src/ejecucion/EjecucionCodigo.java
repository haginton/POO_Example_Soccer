package ejecucion;

import primercodigo.JugadorFutbol;

public class EjecucionCodigo {
    public static void main(String[] args) {
        JugadorFutbol pepito = new JugadorFutbol(
                "Pepito",
                "Delantero",
                "Guatemala",
                "Ada Soccer",
                10
        ); //Genere un objeto a partir de la clase JugadorFutbol
        JugadorFutbol juan = new JugadorFutbol(
                "Juan",
                "Delantero",
                "Guatemala",
                "Ada Soccer",
                10
        );
        System.out.println("Nombre del jugador: " + juan.getNombre());
        System.out.println("Nombre del jugador: " + pepito.getNombre());

        System.out.println("Nacionalidad de " + juan.getNombre() + " tiene la nacionalidad " + juan.getNacionalidad());
        juan.setNacionalidad("Colombia");
        System.out.println("Nacionalidad de " + juan.getNombre() + " tiene la nacionalidad " + juan.getNacionalidad());
        juan.setNacionalidad("Mexico");
        System.out.println("Nacionalidad de " + juan.getNombre() + " tiene la nacionalidad " + juan.getNacionalidad());
    }
}

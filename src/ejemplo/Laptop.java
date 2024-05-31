package ejemplo;

public class Laptop extends DispositivoElectronico{ //herencia

    //atributos
    private String color;
    private int pulgadas;
    private String marca;

    //metodo constructor
    public Laptop(String color, int pulgadas, String marca) {
        this.color = color;
        this.pulgadas = pulgadas;
        this.marca = marca;
    }

    //metodos
    public void digitar(){
        System.out.println("Digitando en la laptop");
    }

    public void proyectar(){
        System.out.println("Proyectando información");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Polimorfismo
    @Override
    public void encender() {
        System.out.println("Encendiendo Laptop");
    }
}

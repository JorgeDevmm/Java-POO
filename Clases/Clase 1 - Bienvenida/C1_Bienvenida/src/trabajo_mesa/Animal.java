package trabajo_mesa;

public class Animal {

    private String nombre;
    private int edad;
    private String cantidadAlimento;
    private String sonidoEmite;


    public Animal(String nombre, int edad, String cantidadAlimento, String sonidoEmite) {
        this.nombre = nombre;
        this.edad = edad;
        this.cantidadAlimento = cantidadAlimento;
        this.sonidoEmite = sonidoEmite;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCantidadAlimento() {
        return cantidadAlimento;
    }

    public String getSonidoEmite() {
        return sonidoEmite;
    }

    public String mostrarDatos(){

        return getNombre() + " tiene " + getEdad() + " años\n" +
                getNombre() + " come " + getCantidadAlimento() + " y hace " + getSonidoEmite() + "\n";
    }
}




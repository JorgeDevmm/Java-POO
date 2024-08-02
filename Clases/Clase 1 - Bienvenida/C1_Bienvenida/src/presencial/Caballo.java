package presencial;

public class Caballo {

    private String name;
    private String color;
    private String raza;
    private Double costoAlimentacion;

    Boolean nobleza = true;

    public Caballo(String name, String color, String raza, Double costoAlimentacion,Boolean nobleza) {
        this.name = name;
        this.color = color;
        this.raza = raza;
        this.costoAlimentacion = costoAlimentacion;
        this.nobleza = nobleza;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Double getCostoAlimentacion() {
        return costoAlimentacion;
    }

    public void setCostoAlimentacion(int cantidadSemanas) {
        this.costoAlimentacion = costoAlimentacion * cantidadSemanas;
    }

    public String  getNobleza() {

        if(nobleza){
           return "SI";
        }else{
            return "NO";
        }
    }

    public void setNobleza(Boolean nobleza) {
        this.nobleza = nobleza;
    }

    public String mostrarMensaje(){
        return "El caballo: " + getName() + " de Color: " + getColor()  + " es de raza: " + getRaza() + " y el costo de Alimentación: " + getCostoAlimentacion() + " el caballo es no" +
                "ble " + getNobleza();
    }
}

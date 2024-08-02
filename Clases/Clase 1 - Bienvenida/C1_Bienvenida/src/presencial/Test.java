package presencial;

public class Test {
    public static void main(String[] args) {

        Caballo caballo = new Caballo("Braulio","Blanco","Criollo",1250.40,true);
        Caballo caballo2 = new Caballo("Braulio2","Marrón", "De Paso",3000.50,false);

        caballo.setCostoAlimentacion(5);
        caballo2.setCostoAlimentacion(4);

        System.out.println(caballo.mostrarMensaje());
        System.out.println(caballo2.mostrarMensaje());

    }
}

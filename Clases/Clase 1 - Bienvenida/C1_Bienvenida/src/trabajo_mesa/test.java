package trabajo_mesa;

public class test {

    public static void main(String[] args) {

        Animal perro = new Animal("Manchitas",2,"un 1 kilo y medio","gua gua");
        Animal pez = new Animal("Nemo",1,"140 gramos","bru bru");
        Animal gato = new Animal("Silvestre",3,"medio kilo","miau miau");
        Animal tortuga = new Animal("Manuelita",12,"300 gramos","cro cro");
        Animal pajaro = new Animal("Gardel",1,"350 gramos","cri cri");

        System.out.println(perro.mostrarDatos());
        System.out.println(pez.mostrarDatos());
        System.out.println(gato.mostrarDatos());
        System.out.println(tortuga.mostrarDatos());
        System.out.println(pajaro.mostrarDatos());

    }
}

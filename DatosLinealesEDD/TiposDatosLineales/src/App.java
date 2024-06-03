import Materia.Models.Pantallas;
import Materia.Pilas.Pila;
import Materia.Pilas.PilaGenerica;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        Pila pila1 = new Pila();
        pila1.push (10);
        pila1.push (20);
        pila1.push (30);
        pila1.push (40);
        pila1.push (50);
        pila1.push (60);
        pila1.push (70);
        System.out.println("Elementos en la cima de la pila es: " +pila1.peek());
        System.out.println("Elemento eliminado de la pila es: " +pila1.pop());
        System.out.println("Elementos en la cima de la pila es: " +pila1.peek());

        System.out.println();

        //Implementación de pila genérica
        PilaGenerica  <Pantallas> pilaPantallas = new PilaGenerica<>();
        pilaPantallas.push (new Pantallas("Home Page", "/home"));
        pilaPantallas.push (new Pantallas("Menu Page", "/home/menu"));
        pilaPantallas.push (new Pantallas("Setting Page", "/home/menu/settings"));

        System.out.println("Estoy en la pantalla :\n\t ---> "  +pilaPantallas.peek().getNombre());
        System.out.println("Estoy en la pantalla :\n\t --->  " +pilaPantallas.pop().getNombre());
        System.out.println("Estoy en la pantalla : \n\t ---> " +pilaPantallas.peek().getNombre());
        pilaPantallas.push(new Pantallas("User Page", "/home/menu/user"));
        System.out.println("Estoy en la pantalla : " +pilaPantallas.peek().getNombre());




    }
}

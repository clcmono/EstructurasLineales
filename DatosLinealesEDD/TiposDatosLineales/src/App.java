import Materia.Models.Pantallas;
import Materia.Pilas.Pila;
import Materia.Cola;
import Materia.ColaGenerica;
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
 
    //Implementación de cola 
        Cola queue = new Cola(null, null);
        queue.addNode(10);
        queue.addNode(20);
        queue.addNode(30);
        //Mostrar elemento en el frente
        System.out.println("Elemento retirado :" + queue.peek());
        //Retirar elemento
        System.out.println("Elemento retirado :" + queue.remove());
        System.out.println("Elemento retirado :" + queue.peek());

        System.out.println("Elemento retirado :" + queue.remove());
        System.out.println("Elemento retirado :" + queue.peek());

        System.out.println("Elemento retirado :" + (queue.isEmpty() ? "Si": "No"));
        //Implementación de cola Genérica
        ColaGenerica<Pantallas> colaPantallas = new ColaGenerica<>(null, null);
        queue.addNode(10);
        queue.addNode(20);
        queue.addNode(30);
        //Mostrar elemento en el frente
        colaPantallas.addNode(new Pantallas("Home Page", "/home"));
        colaPantallas.addNode(new Pantallas("Menu Page", "/home/menu"));
        colaPantallas.addNode(new Pantallas("Setting Page", "/home/menu/settings"));
        System.out.println("La cola tiene:  " +colaPantallas.size() +  "  Elementos");
        System.out.println("Estoy en la pantalla :\n\t ---> "  +colaPantallas.peek().getNombre());
        System.out.println("Pantalla destruida :\n\t --->  " +colaPantallas.remove().getNombre());
        System.out.println("Estoy en la pantalla : \n\t ---> " +colaPantallas.peek().getNombre());
        System.out.println("Pantalla destruida :\n\t --->  " +colaPantallas.remove().getNombre());
        System.out.println("Pantalla destruida :\n\t --->  " +colaPantallas.remove().getNombre());
        //System.out.println("Estoy en la pantalla : " +colaPantallas.peek().getNombre());
        System.out.println("La cola tiene:  " +colaPantallas.size() +  " Elementos");
    


    }
}

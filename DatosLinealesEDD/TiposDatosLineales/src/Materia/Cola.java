package Materia;
import Materia.Models.Node;
import java.util.NoSuchElementException;

public class Cola {
    private Node first;
    private Node last;

    public Cola(Node first, Node last) {
        this.first = first;
        this.last = last;
    }
///Metodo para agregar el node a la cola
    public void addNode (int value){
        Node nuevoNodo = new Node (value);
        if (isEmpty()){
            first = nuevoNodo;
            last = nuevoNodo;
        }else{
            last.next = nuevoNodo;
            last = nuevoNodo;
        }
    }
    public boolean isEmpty (){
        return first == null;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("La cola está vacía");
            throw new NoSuchElementException();
        }
        return first.value;
    }

    public int remove (){
        if (isEmpty()){
            System.out.println("La cola está vacía");
            throw new NoSuchElementException();
        }
        int value = first.value;
        first = first.next;
        if (first == null){
            last = null;
        }
        return value;
       
    }
}

package Materia;
import java.util.NoSuchElementException;
import Materia.Models.NodoGenerico;

public class ColaGenerica <T> {
    private NodoGenerico <T> first ;
    private NodoGenerico <T> last;
    private int size;

    public ColaGenerica(NodoGenerico<T> first, NodoGenerico<T> last) {
        this.first = first;
        this.last = last;
    }
    //Metodo para agregar el node a la cola
    public void addNode (T data){
        NodoGenerico<T> nuevoNodo = new NodoGenerico<T>(data);
        if (isEmpty()){
            first = nuevoNodo;
            last = nuevoNodo;
        }else{
            last.next = nuevoNodo;
            last = nuevoNodo;
        }
        size++;
    }
    public boolean isEmpty (){
        return first == null;
    }
    public T peek(){
        if (isEmpty()){
            System.out.println("La cola está vacía");
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public T remove (){
        if (isEmpty()){
            System.out.println("La cola está vacía");
            throw new NoSuchElementException();
        }
        T data = first.data;
        first = first.next;
        if (first == null){
            last = null;
        }
        size--;
        return data;
        
       
    }

public int size (){
    return size;
}

    
    
}

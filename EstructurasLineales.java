import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class EstructurasLineales {
    public static void main(String[] args) {
        // Crear una pila, una lista y una cola
        Stack<Integer> pila = new Stack<>();
        List<String> lista = new ArrayList<>();
        Queue<Character> cola = new LinkedList<>();

        // Agregar elementos a cada estructura
        pila.push(10);
        pila.push(20);
        lista.add("Manzana");
        lista.add("Banana");
        cola.add('A');
        cola.add('B');

        // Acceder y modificar elementos
        System.out.println("Elemento superior de la pila: " + pila.peek());
        pila.pop(); // Elimina el elemento superior

        System.out.println("Segundo elemento de la lista: " + lista.get(1));
        lista.remove(0); // Elimina el primer elemento

        System.out.println("Primer elemento de la cola: " + cola.peek());
        cola.poll(); // Elimina el primer elemento

        // Iterar sobre cada estructura
        System.out.println("Elementos de la pila:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }

        System.out.println("Elementos de la lista:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        System.out.println("Elementos de la cola:");
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }
}

package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte el contenido de una cola de nombres utilizando una pila auxiliar.
     * 
     * Ejemplo:
     * Entrada: ["Ana", "Luis", "Pedro"]
     * Salida: ["Pedro", "Luis", "Ana"]
     *
     * @param cola cola original de nombres
     * @return nueva cola con los nombres en orden invertido
     */
    public Queue<String> invertirColaNombres(Queue<String> cola) {
        Stack<Character> colaa = new Stack<>();
        for(char colita : colaa){
            colaa.add(colita);
        }
        StringBuilder invertido = new StringBuilder();
        while(!cola.isEmpty()){
            invertido.append(cola.poll());
        }
        return new LinkedList<>(Arrays.asList()); // Simulación de resultado
    }


    /**
     * Verifica si la palabra formada por los elementos de una cola es un
     * palíndromo.
     *
     * Se considera que la cola contiene letras individuales como strings.
     * Ejemplo:
     * Entrada: ["r", "a", "d", "a", "r"] → true
     * Entrada: ["c", "a", "s", "a"] → false
     *
     * @param cola Cola de letras en minúsculas
     * @return true si forman un palíndromo, false si no
     */
    public boolean verificarPalindromoCola(Queue<String> cola) {
        Queue<Character> colaw = new LinkedList<>();
        for(char colita : colaw){
            colaw.add(colita);
        }
        if(cola.isEmpty()){
            return false;
        } 
        return false;
    }
}

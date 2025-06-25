package main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ
       
       
        LogicaClasificacion logica = new LogicaClasificacion();
        // PRIMER EJERCICIO
        Queue<String> caso1 = new LinkedList<>(Arrays.asList("r", "a", "d", "a", "r"));
        boolean resultado1 =  logica.verificarPalindromoCola(caso1);
        System.out.println("La entrada es :\"c\", \"a\", \"s\", \"a\" " + " y el resultado es : " + resultado1);


        Queue<String> entrada = new LinkedList<>(Arrays.asList("Ana", "Luis", "Pedro"));
        Queue<String> resultado = logica.invertirColaNombres(entrada);
        System.out.println("El original es :['Ana', 'Luis', 'Marta]"+  " el final es :" + resultado);



    }
}

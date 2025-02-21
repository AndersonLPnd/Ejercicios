package com.mycompany.adivinanumero;

import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAdivinar = random.nextInt(100) + 1; 
        int intentos = 10;
        int numeroUsuario;
        boolean acertado = false;
        
        System.out.println("Bienvenido al juego de adivinar el numero");
        System.out.println("Tienes 10 intentos para adivinar el numero entre 1 y 100.");
        
        while (intentos > 0 && !acertado) {
            System.out.print("Introduce un numero: ");
            numeroUsuario = scanner.nextInt();
            
            if (numeroUsuario == numeroAdivinar) {
                acertado = true;
                System.out.println("Felicidades, Has adivinado el numero en " + (11 - intentos) + " intentos.");
            } else if (numeroUsuario < numeroAdivinar) {
                System.out.println("El numero a adivinar es mayor.");
            } else {
                System.out.println("El numero a adivinar es menor.");
            }
            
            intentos--;
            if (!acertado && intentos > 0) {
                System.out.println("Te quedan " + intentos + " intentos.");
            }
        }
        
        if (!acertado) {
            System.out.println("Lo siento, has agotado tus intentos. El numero era " + numeroAdivinar);
        }
        
        scanner.close();
    }
}



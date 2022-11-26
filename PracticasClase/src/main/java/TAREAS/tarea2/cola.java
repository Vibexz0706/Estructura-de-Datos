/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREAS.tarea2;

/**
 *
 * @author VIBEXZ
 */
import java.util.Scanner;

public class cola {

    Node1 head; //cabeza de la cola
    Node1 tail; // ultimo de la cola
    Scanner Teclado = new Scanner(System.in);

    public cola() {
        this.head = null;
        this.tail = null;
    }

    public void ingresoPersona() {

        Node1 newNode = new Node1();
        Node1 aux = new Node1();
        
        System.out.println("Ingrese el sector: ");
        System.out.println("Ingrese el horario: ");
        System.out.println("Ingrese su numero de Cedula: ");
        newNode.dato = Teclado.nextLine();
        newNode.horario = Teclado.nextLine();
        newNode.cedula = Teclado.nextLine();
        
        /*
        
        
        
        
        // SI HEAD ES DIFERENTE DE NULO Y EL DATO DE HEAD ES IGUAL AL DATO DEL NUEVO NODO
        // HEAD VA A APUNTAR A EL NUEVO NODO
        
        if (head != null && "Palco".equals(newNode.dato)) {
            
            head = aux;
                        
           
            
        }
        */
        
        if (head == null) {

            head = newNode;
            head.next = null;
            tail = newNode;

        } else {

            tail.next = newNode;
            newNode.next = null;
            tail = newNode;

        }

    }

    public void Mostrar() {

        Node1 aux = new Node1();
        aux = head;
        if (head != null) {

            while (aux != null) {

                System.out.print(" SECTOR:"+aux.dato + " " + "HORARIO:"+aux.horario  + " " +"CEDULA:"+aux.cedula);
                aux = aux.next;

            }

        } else {

            System.out.print("\n la cola esta vacia\n ");

        }

    }

}

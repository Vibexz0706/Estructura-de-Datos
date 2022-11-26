/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoClase;

import java.util.Scanner;

/**
 *
 * @author VIBEXZ
 */
public class ListaDobleCircula {

    private Node2 head;
    private Node2 tail;
    Scanner sc = new Scanner(System.in);

    public ListaDobleCircula(Node2 head, Node2 tail) {
        this.head = head;
        this.tail = tail;
    }

    public ListaDobleCircula() {

    }

    public void insertar(Nombres a) {

        Node2 newNode = new Node2(a);

        if (head == null) {
            head = newNode;
            tail = head;
            head.setBack(tail);
            tail.setNext(head);

        } else if (head.getDato().getId() > a.getId()) {

            Node2 aux = new Node2(a);

            aux.setNext(head);
            head.setBack(aux);
            head = aux;
            tail.setNext(head);
            head.setBack(tail);

        } else if (tail.getDato().getId() <= a.getId()) {

            newNode.setBack(tail);
            tail.setNext(newNode);
            tail = tail.getNext();
            tail.setNext(head);
            head.setBack(tail);

        } else {

            Node2 aux = head;

            while (aux.getNext().getDato().getId() < a.getId()) {

                aux = aux.getNext();

            }
            Node2 temp = new Node2(a);

            temp.setNext(aux.getNext());
            temp.setBack(aux);
            aux.setNext(temp);
            temp.getNext().setBack(temp);

        }
        tail.setNext(head);
        head.setBack(tail);

    }

    public void mostrar() {

        Node2 aux = head;

        if (head != null) {

            do {
                System.out.println(aux.getDato());
                aux = aux.getNext();

            } while (aux != head);

        }

    }

    public boolean existe(int id) {

        Node2 aux = new Node2();
        boolean existe = false;
        aux = tail;

        do {

            if (aux.getDato().getId() == id) {

                existe = true;

            }

            aux = aux.getNext();

        } while (aux != tail);
        System.out.print(existe);
        return existe;

    }

    public void modificar(Nombres p) {

        if (head != null) {
            Node2 aux = head;

            while (aux != null && aux.getDato().getId() < p.getId()) {

                aux = aux.getNext();

            }

            if (aux != null && aux.getDato().getId() == p.getId()) {

                aux.getDato().setNombre(p.getNombre());

            }

        }

    }

    public void eliminar(int id) {

        if (head != null) {

            if (head.getDato().getId() == id) {

                head = head.getNext();

            } else {
                Node2 aux = head;

                while (aux.getNext() != null && aux.getNext().getDato().getId() < id) {

                    aux = aux.getNext();

                }

                // si es el de adelante, se borra
                if (aux.getNext() != null && aux.getNext().getDato().getId() == id) {

                    Node2 aux1 = aux;

                    aux.setNext(aux.getNext().getNext());
                    aux = aux.getNext().getNext();
                    aux.setBack(aux1);

                }

            }

        }

    }

    /*public Nombres extraer(int id) {

        Nombres p = null;

        if (head != null) {

            if (head.getDato().getId() == id) {

                head = head.getNext();

            } else {

                Node2 aux = head;

                while (aux.getNext() != null && aux.getNext().getDato().getId() < id) {

                    aux = aux.getNext();

                }  
                
                // SI ES EL DEL DATO DE ADELANTE, GUARDO LA PERSONA Y LO BROO
                
                if (aux.getNext() != null && aux.getNext().getDato().getId() == id) {
                    
                    p = aux.getNext().getDato();
                    
                     
                    Node2 aux1 = aux;
                    aux.setNext(aux.getNext().getNext());
                    aux = aux.getNext().getNext();
                    aux.setBack(aux1);

                }

                
                

            }

        }
        return p;*/
}

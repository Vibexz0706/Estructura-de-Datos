/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoClase;

/**
 *
 * @author VIBEXZ
 */
public class list {

    private node<Persona> cabeza;

    public list() {

    }

    public void insertar(Persona value) {
        node<Persona> newNodo = new node<Persona>(value);
        if (cabeza == null) {

            cabeza = newNodo;

        } else if (cabeza.getValue().getId() > newNodo.getValue().getId()) {
            newNodo.setNext(cabeza);
            cabeza = newNodo;

        } else if (cabeza.getValue().getId() < newNodo.getValue().getId() && cabeza.getNext() == null) {
            cabeza.setNext(newNodo);

        } else {
            node<Persona> aux = cabeza;

            while (aux.getNext() != null && aux.getNext().getValue().getId() < newNodo.getValue().getId()) {
                aux = aux.getNext();

            }
            newNodo.setNext(aux.getNext());
            aux.setNext(newNodo);

        }

    }

    public void imprimirLista() {
        node<Persona> aux = cabeza;
        while (aux != null) {

            System.out.println(aux.getValue().toString());
            aux = aux.getNext();

        }

    }

}

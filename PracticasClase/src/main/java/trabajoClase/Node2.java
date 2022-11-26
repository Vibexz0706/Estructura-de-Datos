/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoClase;

/**
 *
 * @author VIBEXZ
 */
public class Node2 {

    private Nombres dato;
    private Node2 next;
    private Node2 back;

    @Override
    public String toString() {

        return "Node {" + "dato=" + dato + '}';

    }

    public Node2(Nombres dato) {
        this.dato = dato;
    }
    
     public Node2() {
        
    }

    public Nombres getDato() {
        return dato;
    }

    public void setDato(Nombres dato) {
        this.dato = dato;
    }

    public Node2 getNext() {
        return next;
    }

    public void setNext(Node2 next) {
        this.next = next;
    }

    public Node2 getBack() {
        return back;
    }

    public void setBack(Node2 back) {
        this.back = back;
    }
    

}

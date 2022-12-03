/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoClase;

/**
 *
 * @author Vibexz
 */
public class NODOARBOL {
    
    private int id;
    private NODOARBOL hijoIzq;
    private NODOARBOL hijoDerech;

    public NODOARBOL(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NODOARBOL getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NODOARBOL hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NODOARBOL getHijoDerech() {
        return hijoDerech;
    }

    public void setHijoDerech(NODOARBOL hijoDerech) {
        this.hijoDerech = hijoDerech;
    }
    
    
    
}

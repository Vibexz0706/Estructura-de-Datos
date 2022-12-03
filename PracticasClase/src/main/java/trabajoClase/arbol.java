/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoClase;

/**
 *
 * @author Vibexz
 */
public class arbol {
    private NODOARBOL raiz;
    
    public void inserta(int x){
        
        if(raiz == null){
            raiz = new NODOARBOL (x);
            
        }else{
            insertaR(raiz,x);
        }
    
    
    
    }
    
    private void insertaR(NODOARBOL n, int x){
        
        if(x <= n.getId()){
            if(n.getHijoIzq() == null){
                n.setHijoIzq(new NODOARBOL(x));
            }else{
                insertaR(n.getHijoIzq(),x);
            }
        }else{
            if(n.getHijoDerech() == null){
                n.setHijoDerech(new NODOARBOL(x));
            }else{
                insertaR(n.getHijoDerech(),x);
            }
        }
    }
    
    public void inOrden(){
        if(raiz!= null){
            inOrdenR(raiz);
        }else{
            System.out.println("arbol vacio");
        }
    }
    
    public void inOrdenR(NODOARBOL n){
        if(n!= null){
            inOrdenR(n.getHijoIzq());
            System.out.print(n.getId() + ", ");
            inOrdenR(n.getHijoDerech());
        }
    }
    
}

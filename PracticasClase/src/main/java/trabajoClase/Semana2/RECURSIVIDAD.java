/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoClase.Semana2;

/**
 *
 * @author VIBEXZ
 */
public class RECURSIVIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //COMO EL METODO ES ESTATICO, NO SE PUEDE INSTANCIAR POR ESO SOLO SE LLAMA
        int arr[] = {12, 34, 64, 2, 3};
        
        System.out.println(RECURSION.factorial(3));
        System.out.println(RECURSION.encontrarMax(arr, 1, arr[0]));
    }

}

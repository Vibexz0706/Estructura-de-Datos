/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREAS.tarea1;

/**
 *
 * @author VIBEXZ
 */
public class EJE3 {
    
     public static String anagrama(String anagrama,int tamaño)  {
         if(tamaño==0){
             return anagrama.charAt(tamaño)+"";
         }else{
             return anagrama.charAt (tamaño) + (anagrama(anagrama,tamaño -1));
             
       
          }
     }
    
    
    
    
    
    
    
    
    
    
    
    
    
}

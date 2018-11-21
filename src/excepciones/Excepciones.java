/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author soporte
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // TODO code application logic here
        
        int arreglo[] = new int [5];
       
        try{
        arreglo[5] = 1;
        }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("ERROR: " + e.getMessage());
                    
                   
                }
         
         System.out.println("Mensaje");
        
         String arreglo2[] = {"1", "2", "10", "n", "54" };
         int suma = 0;
         
         for (int contador = 0;
                 contador < arreglo.length; contador ++){
             try{
                    int numero = 
                         Integer.parseInt(arreglo2[contador]);
                 suma = suma + numero;
             }catch(NumberFormatException e){
             System.out.println("Error al convertir" +
                     "el string a numero");
             
             }
         }
             
         System.out.println("Suma: " + suma);
            try{
                int cantidad = Integer.parseInt(null);
                
                int deuda = cantidad * 2 ;
                 }catch(NumberFormatException e){
                 String valor = null;
                 
                 }  
                 try{
                 String valor = null;
                 int longitud = valor.length();
                 }catch(NullPointerException e){
                 System.out.println("El valos no existe");    
                          
                          
                     
             }
         
    }
    
    
    
}

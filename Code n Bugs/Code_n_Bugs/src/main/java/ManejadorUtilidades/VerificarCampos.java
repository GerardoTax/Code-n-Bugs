/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejadorUtilidades;

/**
 *
 * @author dell
 */
public class VerificarCampos {
    
    public int convertir(String valor)throws ExcepcionCampos{
         
         try{
            int tipo=Integer.valueOf(valor);
               if(tipo<1){
                     throw new ExcepcionCampos("Error en el"+valor+ "campo  esta intentando ingresar un mumero negativo");  
                } 
               else {
                    return tipo;
                }
       }
        catch(NumberFormatException e){
           
           throw new ExcepcionCampos("Error en el campo  "+valor+"  esta intentado ingresar una letra en ves de un numero"); 
         }
        
    }
    
     public double convertirdouble(String valor)throws ExcepcionCampos{
         
         try{
            double precio=Double.parseDouble(valor);
               if(precio<1){
                     throw new ExcepcionCampos("Error en el"+valor+ "campo  esta intentando ingresar un mumero negativo");  
                } 
               else {
                    return precio;
                }
       }
        catch(NumberFormatException e){
           
           throw new ExcepcionCampos("Error en el campo  "+valor+"  esta intentado ingresar una letra en ves de un numero"); 
         }
        
    }

}
    


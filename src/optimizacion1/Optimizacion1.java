/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optimizacion1;

/**
 *
 * @author SirGomez
 */
public class Optimizacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CCuenta cuenta1 = operativa_Cuenta(null);
        
        try{
            cuenta1.retirar(2500);
            
        }catch(Exception e){
            System.out.println("Fallo al Retirar");
        }
        try{
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
            
        }catch(Exception e){
            System.out.println("Fallo al Ingresar");
        }
    }

    private static CCuenta operativa_Cuenta(java.lang.Float cantidad) {
        CCuenta cuenta1;
        double saldoActual;
        cuenta1=new CCuenta("Antonio Lopez","1000-2365-85-1230456789",2500,0);
        saldoActual=cuenta1.estado();
        System.out.println("El saldo actual es:"+saldoActual);
        return cuenta1;
    }
    
}

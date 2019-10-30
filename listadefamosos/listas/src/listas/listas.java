/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Luis Enrique
 */
public class listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ListasCant listaDeCantantes1=new ListasCant();
       
        String opcion=new String();
        Scanner sc =new Scanner(System.in);
        char continuar;
       
        do{
            //char continuar;
            System.out.println("Por favor introduzca los datos de otro cantante.");

            System.out.println("Nombre :");
            Cantantes entradaTeclado1=new Cantantes();
            System.out.println("Disco con más ventas: :");
            Cantantes entradaTeclado2=new Cantantes();
           
            CantanteFamoso cantante=new CantanteFamoso();
            cantante.setNombre(entradaTeclado1.getEntradaTeclado());
            cantante.setDiscoConMasVentas(entradaTeclado2.getEntradaTeclado());
           
             listaDeCantantes1.setCantanteFamoso(cantante);
           
            System.out.println("La lista actualizada contiene los siguientes datos: \n");
            listaDeCantantes1.listarCantantesFamosos();
            System.out.println("¿Desea introducir los datos de otro cantante (s/n)?");
            opcion=sc.nextLine();
             continuar = opcion.charAt(0);
        }while(continuar=='s' || continuar=='S');
    }
   
}
    


    
    


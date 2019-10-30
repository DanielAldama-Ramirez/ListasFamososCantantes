
package listas;
 import java.util.Scanner;

public class Cantantes {
    private String entradaTeclado;

    public Cantantes() {
        Scanner sc= new Scanner(System.in);
       
        this.entradaTeclado = sc.nextLine();
    }

 
    public String getEntradaTeclado() {
        return entradaTeclado;
    }

    
    public void setEntradaTeclado(String entradaTeclado) {
        this.entradaTeclado = entradaTeclado;
    }
   
}


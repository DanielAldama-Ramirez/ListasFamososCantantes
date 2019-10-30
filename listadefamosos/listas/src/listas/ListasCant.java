
package listas;

import java.util.ArrayList;
import java.util.Iterator;


public class ListasCant {
   
    private ArrayList<CantanteFamoso>listaCantantesFamosos;

    public ListasCant() {
        this.listaCantantesFamosos = new <CantanteFamoso>ArrayList();
       
    }
   
   
   
    public void listarCantantesFamosos(){
        CantanteFamoso c;
        Iterator<CantanteFamoso>it=listaCantantesFamosos.iterator();
        while (it.hasNext()) {
            c = it.next();
            System.out.println("Cantante: "+ c.getNombre());
            System.out.println("Disco con más ventas:"+c.getDiscoConMasVentas());
        }
    }
   
    public ArrayList<CantanteFamoso> getListaCantantesFamosos() {
        return listaCantantesFamosos;
    }

    
    public void setListaCantantesFamosos(ArrayList<CantanteFamoso> listaCantantesFamosos) {
        this.listaCantantesFamosos = listaCantantesFamosos;
    }
    public void setCantanteFamoso(CantanteFamoso Cantante){
        listaCantantesFamosos.add(Cantante);
    }
}


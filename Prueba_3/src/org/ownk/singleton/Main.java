package org.ownk.singleton;

public class Main {

    public static void main(String[] args) {
        
        SoyUnico ricardo = SoyUnico.getSingletonInstance("Ricardo Moya");
        SoyUnico ramon = SoyUnico.getSingletonInstance("Ram�n Invarato");
        
        // ricardo y ramon son referencias a un �nico objeto de la clase SoyUnico
        //System.out.println(ramon.get());
       // System.out.println(ricardo.getNombre());   
    }
}
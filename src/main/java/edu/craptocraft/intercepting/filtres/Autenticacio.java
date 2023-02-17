package edu.craptocraft.intercepting.filtres;

public class Autenticacio implements Filtre {

    public Autenticacio(){};

    @Override
    public void execucio(String id){
        System.out.println("Auntenticación OK para " + id);
    }    
}

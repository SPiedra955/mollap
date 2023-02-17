package edu.craptocraft.intercepting.filtres;

public class Autoritzacio implements Filtre{

    public Autoritzacio(){};

    @Override
    public void execucio(String id){
        System.out.println("Autorización OK para " + id);
    }

    
}

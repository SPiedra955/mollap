package edu.craptocraft.filtres;

public class Autoritzacio implements Filtre{

    public Autoritzacio(){};

    @Override
    public void execucio(String id){
        System.out.println("Autoriztació OK per a : " + id);

    }

    
}

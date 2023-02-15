package edu.craptocraft.filtres;

public class Autenticacio implements Filtre{

    public Autenticacio(){};
    
    @Override
    public void execucio(String id){
        System.out.println("Autenticació OK per a : " + id);
    }
}

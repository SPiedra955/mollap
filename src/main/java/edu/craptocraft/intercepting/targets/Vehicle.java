package edu.craptocraft.intercepting.targets;

public class Vehicle implements Target{

    public Vehicle(){};

    public void execucio(String id){
        System.out.println("Puerta abierta " + id + "!");
    }
    
}

package edu.craptocraft.clients;

import edu.craptocraft.administrador.ProgramadorTasques;

public class Mollap implements Client {

    private ProgramadorTasques programador = null;


    public Mollap(){};

    @Override
    public void setProgramadorTasques(ProgramadorTasques programador){
        this.programador = programador;
    }

    @Override
    public void enviarPeticio(String id){

        programador.executarTasques(id);


    }
    
}

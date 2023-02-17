package edu.craptocraft.intercepting.clients;

import edu.craptocraft.intercepting.administrador.ProgramadorTasques;

public class Mollapp implements Client{

    public Mollapp(){};

    private ProgramadorTasques programador;

    @Override
    public void setProgramadorTasques(ProgramadorTasques programador){
        this.programador = programador;
    }

    @Override
    public void enviarPeticio(String sms){
        programador.executarTasques(sms);
    }
}

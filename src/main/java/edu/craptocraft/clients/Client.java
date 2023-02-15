package edu.craptocraft.clients;
import edu.craptocraft.administrador.ProgramadorTasques;

public interface Client {
    
    public void setProgramadorTasques(ProgramadorTasques programador);
    public void enviarPeticio(String peticio);
    
}

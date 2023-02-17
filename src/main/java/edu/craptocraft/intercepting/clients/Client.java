package edu.craptocraft.intercepting.clients;

import edu.craptocraft.intercepting.administrador.ProgramadorTasques;

public interface Client {
    public void setProgramadorTasques(ProgramadorTasques programador);
    public void enviarPeticio(String peticio);
}

package edu.craptocraft.intercepting.administrador;

import edu.craptocraft.intercepting.filtres.Filtre;
import edu.craptocraft.intercepting.targets.Target;

public class ProgramadorTasques {

    private Tasques tasques;

    public ProgramadorTasques(Target target){
        tasques = new Tasques();
        tasques.setTarget(target);
    }

    public Tasques getTasques(){
        return this.tasques;
    }

    public void setTasca(Filtre tasca){
        getTasques().afegirTasca(tasca);
    }

    public void executarTasques(String sms){
        tasques.execucio(sms);
    }
}


package edu.craptocraft.administrador;
import edu.craptocraft.filtres.Filtre;
import edu.craptocraft.targets.*;

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

    public void executarTasques(String missatge){
        tasques.execucio(missatge);
    }

    
}

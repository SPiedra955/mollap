package edu.craptocraft.intercepting.administrador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import edu.craptocraft.intercepting.filtres.Filtre;
import edu.craptocraft.intercepting.targets.Target;

public class Tasques {

    private List<Filtre> tasques = new ArrayList<>();
    private Optional<Target> target;

    public Tasques(){};

    public List<Filtre> getTasques(){
        return this.tasques;
    }

    public Optional<Target> getTarget(){
        return this.target;
    }

    public void afegirTasca(Filtre missatge){
        getTasques().add(missatge);
    }

    public void setTarget(Target target){
        this.target = Optional.ofNullable(target);
    }
    
    public void execucio(String missatge){

        if(getTarget().isEmpty()){
            System.out.println("Sense vehicles per assignar");
        } else {
            getTasques().stream().forEach(ordre -> ordre.execucio(missatge));
            getTarget().get().execucio(missatge);
        }
    }  
}

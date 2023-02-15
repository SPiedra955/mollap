package edu.craptocraft.administrador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import edu.craptocraft.filtres.Filtre;
import edu.craptocraft.targets.Target;

public class Tasques {

    private List<Filtre> tasques = new ArrayList<>();
    private Optional<Target> target;

    Tasques(){};

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

        getTasques().stream().forEach(sms -> sms.execucio(missatge));
        if(getTarget().isPresent()){
            getTarget().get().execucio(missatge);;
        }else{
            System.out.println("target sense afegir al sistema");
        }
    }
}

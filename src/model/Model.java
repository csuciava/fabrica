package model;

import java.util.HashSet;

public class Model extends Vehicle {
    private String name;
    private HashSet<Integer> motorisationList = new HashSet<>();
    private HashSet<String> engineList = new HashSet<>();

    public Model(String name){this.name = name;}

    public String getName() {
        return name;
    }

    public HashSet<Integer> getMotorisationList(){
        return motorisationList;
    }

    public HashSet<String> getEngineList(){
        return engineList;
    }

    public boolean addMotorisation(int cmc) {
        try {
            return motorisationList.add(cmc);
        } catch(Exception e){
            return false;
        }
    }

    public boolean addEngineType(String EngineType) {
        try {
            return engineList.add(EngineType);
        } catch(Exception e){
            return false;
        }
    }

}

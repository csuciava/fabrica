package model;

import java.util.HashSet;

public class Factory {
    private String name;
    private String country;
    private HashSet<Model> modelsProduced = new HashSet<Model>();

    public Factory(String name, String country){this.name = name; this.country = country;}

    public HashSet<Model> getModelsProduced() {
        return modelsProduced;
    }

    public boolean addProducedModel(Model model) {
        try {
            return modelsProduced.add(model);
        } catch(Exception e){
            return false;
        }
    }
}

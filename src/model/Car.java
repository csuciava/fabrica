package model;

import java.util.HashSet;

public class Car extends Vehicle {
    private Model model;
    private HashSet<String> accessoriesList = new HashSet<String>();

    public HashSet<String> getAccessoriesList(){
        return accessoriesList;
    }

    public boolean addEngineType(String Accesorry) {
        try {
            return accessoriesList.add(Accesorry);
        } catch(Exception e){
            return false;
        }
    }
}

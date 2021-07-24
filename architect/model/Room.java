package architect.model;

public class Room {
    private int numberOfDoors;
    private int numberOfLightBulbs;
    private int numberofWindows;
    private boolean isNeedDishWashArea = false;

    public Room(int numberOfDoors, int numberOfLightBulbs, int numberofWindows, boolean isNeedDishWashArea){
            this.numberOfDoors = numberOfDoors;
            this.numberOfLightBulbs = numberOfLightBulbs;
            this.numberofWindows = numberofWindows;
            this.isNeedDishWashArea = isNeedDishWashArea;
    }

    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    public int getNumberOfWindows(){
        return numberofWindows;
    }

    public int getNumberOfLightBulb(){
        return numberOfLightBulbs;
    }

    public boolean isNeedDishWashArea() {
        return isNeedDishWashArea;
    }

    @Override 
    public String toString() {
        return "numberOfDoors =" + numberOfDoors + "numberOfLightBulbs = " + numberOfLightBulbs 
        + "numberofWindows = " + numberofWindows + "isNeedDishWashArea =" + isNeedDishWashArea;
    }
}

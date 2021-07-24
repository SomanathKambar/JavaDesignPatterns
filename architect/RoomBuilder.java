package architect;

import architect.model.Room;
import architect.room_interface.RoomBuilderInterface;

public class RoomBuilder implements RoomBuilderInterface {
    private int numberOfDoors = 1;
    private int numberOfLightBulbs = 1;
    private int numberofWindows = 1;
    private boolean isNeedDishWashArea = false;

    public static RoomBuilder get(){
        return new RoomBuilder();
    }
    @Override
    public architect.RoomBuilder setNumberOfDoors(int doorCount) {
        numberOfDoors = doorCount;
        return this;
    }

    @Override
    public architect.RoomBuilder setNumberOfWindows(int windowCount) {
        numberofWindows = windowCount;
        return this;
    }

    @Override
    public architect.RoomBuilder setNumberLightBulbs(int lightBulbCount) {
        this.numberOfLightBulbs= lightBulbCount;
        return this;
    }

    @Override
    public architect.RoomBuilder setNeedDishWashArea(boolean isNeedDishWashArea) {
        this.isNeedDishWashArea = isNeedDishWashArea;
        return this;
    }

    @Override
    public Room createRoom() {
        return new Room(numberOfDoors,numberOfLightBulbs,numberofWindows,isNeedDishWashArea);
    }
    
}
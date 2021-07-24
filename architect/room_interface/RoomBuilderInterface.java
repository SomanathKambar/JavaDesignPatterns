package architect.room_interface;
import architect.RoomBuilder;
import architect.model.Room;

public interface RoomBuilderInterface {
    RoomBuilder setNumberOfDoors(int doorCount);
    RoomBuilder setNumberOfWindows(int windowCount);
    RoomBuilder setNumberLightBulbs(int lightBulbCount);
    RoomBuilder setNeedDishWashArea(boolean isNeedDishWashArea);
    Room createRoom();
}
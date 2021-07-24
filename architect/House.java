package architect;

import architect.model.Room;

public class House {
    public static void main(String[] args) {
        Room room1 = RoomBuilder.get()
        .setNumberOfDoors(2).setNumberLightBulbs(3).createRoom();
        Room room2 = RoomBuilder.get()
    .setNumberOfDoors(2).setNumberLightBulbs(2).setNeedDishWashArea(true).createRoom();
                    
        System.out.println(room1.toString());
        System.out.println(room2.toString());
    }
}

package DiagnosticTest3;

import java.util.*;

public class Building {
    private Set<Room> rooms = new HashSet<Room>();
    private int totalCapacity;

    /**
     * Returns all properties from the offer.
     */
    public Set<Room> getRooms() {
        return rooms;
    }

    /**
     * Returns the name of the building.
     */
    public int getTotalCapacity() {
        return totalCapacity;
    }

    /**
     * Returns a map containing the rooms grouped according
     * to the capacity.
     */
    public Map<Integer, Set<Room>> groupRoomsByCapacity() {
        Map<Integer, Set<Room>> result = new HashMap<>();
        for (Room room : rooms) {
            int capacity = room.getCapacity();
            if (result.containsKey(capacity)) {
                result.get(capacity).add(room);
            } else {
                Set<Room> Properties = new HashSet<>();
                Properties.add(room);
                result.put(capacity, Properties);
            }
        }
        return result;
    }

    /**
     * Returns a sorted list of Rooms in this building
     * from low to high size.
     */
    public List<Room> sortBySize() {
        List<Room> result = new ArrayList<>();
        for (Room o : rooms)
            result.add(o);
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.size() - 1; j++) {
                if (result.get(j).getSize() > result.get(j + 1).getSize()) {

                    Room temp = result.get(j);
                    result.set(j, result.get(j + 1));
                    result.set(j + 1, temp);
                }

            }
        }
        return result;
    }

        public void addRoom (Room room){
            rooms.add(room);
            totalCapacity += room.getCapacity();
        }

       public void removeRoom(Room room) throws RemoveRoomException{
        if (rooms.contains(room) ){
            rooms.remove(room);
            totalCapacity=totalCapacity-room.getCapacity();
        }
        else{
            throw new RemoveRoomException();
        }
       }
        /*
        tries to remove all rooms from the portofolio, and returns a set with the rooms that
        were not found in the building and therefore have not been removed.
         */
       public Set<Room> removeRooms(Set<Room> rooms){
        Set<Room> result=new HashSet<>();
        for(Room r: rooms){
            try{
                removeRoom(r);
            }
            catch(RemoveRoomException ex){
                result.add(r);
            }
        }
        return result;
       }
    }

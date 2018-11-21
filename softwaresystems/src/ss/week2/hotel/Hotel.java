package ss.week2.hotel;

public class Hotel {
	private Room room1;
	private Room room2;
	private Password hotelPass;
	private String name;
	
	public Hotel(String name) {
		room1 = new Room(101);
		room2 = new Room(102);
		hotelPass = new Password();
		name = "koekjes";
		
	}
	
	
	public Room checkIn(String pass, String guestName) { 
		
		// Receives the password for checking in and the name of the guest. 
		// Returns a Room object with a (new) Guest of the given name checked in; 
		// or null if either the password is wrong, there is already a guest with this name, or the hotel is full.
		
		hotelPass.setWord(Password.INITIAL, pass);
		
		if(isFree(pass, room1)) {
			room1.setGuest(new Guest(guestName));
			return room1;
		}
		else if(isFree(pass, room2)) {
			room2.setGuest(new Guest(guestName));
			return room2;
		}
		else {
			return null;
		}	
	}
	
	public void checkOut(String guestName) {
		
		// Receives the name of a guest.
		// The guest is checked out and the safe in the room is deactivated.
		// Nothing happens if there is no guest with this name.
		
		if(room1.getGuest() != null && room1.getGuest().getName().equals(guestName)) {
			room1.getGuest().checkout();
			room1.getSafe().deactivate();
		}
		else if(room2.getGuest() != null && room2.getGuest().getName().equals(guestName)) {
			room2.getGuest().checkout();
			room2.getSafe().deactivate();
		}
	}
	
	public Room getFreeRoom() {
		
		// Returns a Room where there is no guest checked in.
		// Returns null if there is no free room available.
		
		if(room1.getGuest() == null) {
			return room1;
		}
		else if(room2.getGuest() == null) {
			return room2;
		}
		else {
			return null;
		}
	}
	
	public Room getRoom(String guestName) {
		
		// Receives the name of the guest.
		// Returns the Room object where the guest is checked in.
		// Returns null if there is no such room.
		
		if(room1.getGuest() != null && room1.getGuest().getName().equals(guestName)) {
			return room1;
		}
		else if (room2.getGuest() != null && room2.getGuest().getName().equals(guestName)) {
			return room2;
		}
		else {
			return null;
		}
	}
	
	public Password getPassword() {
		
		// Returns the Password object of the hotel (which is used by checkIn).
		
		return hotelPass;
		
	}
	
	public String getName() {
		return name;
	}
	
	
	private boolean isFree(String pass, Room room) {
		
		// Checks if room is free and password is correct.
		
		if(room.getSafe().getPassword().testWord(pass) 
				&& room.getGuest() == null) {
			return true;			
		}
		else {
			return false;
		}
	}
	

	@Override
	public String toString() {
		String result = "";
		if (room1.getGuest()!= null) {
			result += room1.getGuest().getName() + " " + (room1.getSafe().isActive() ? "active" : "deactive");
		}
		if (room2.getGuest()!= null) {
			result += room2.getGuest().getName() + " " + (room2.getSafe().isActive() ? "active" : "deactive");
		}
		return result;
	}
}

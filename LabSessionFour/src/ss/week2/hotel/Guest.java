package ss.week2.hotel;

/**
 * Hotel guest with name and possibly a room.
 * @author Laurine Hetterscheid
 */
public class Guest {
    // ------------------ Instance variables ----------------
	private String name;
	private Room room;
	
    // ------------------ Constructor ------------------------
    /**
     * Creates a <code>Guest</code> with the given name, without a room.
     * @param guestName name of the new <code>Guest</code>
     */

	public Guest(String guestName) {
		name = guestName;
	}

	// ------------------ Queries --------------------------
    /**
     * Returns the name of this <code>Guest</code>.
     * @return the name of this <code>Guest</code>;
     *       <code>null</code> if this <code>Guest</code> 
     *       does not exist.
     */
	public String getName () {
		return name;
	}
	
	/**
     * Returns the current room where this <code>Guest</code> is staying.
     * @return the room of this <code>Guest</code>;
     *         <code>null</code> if this <code>Guest</code> 
     *         is not currently in a room.
     */
	public Room getRoom () {
		return room;
	}
	
	/**
     * Rents a room to this <code>Guest</code>.
     * @param room room number to be rented to this <code>Guest</code>; 
     * @return true if <code>Room</code> is rented to this <code>Guest</code>;
     *         <code>false</code> if this <code>Guest</code> 
     *         already had a room or <code>Room</code> already had a Guest.
     */
	public boolean checkin (Room room) {
		if (this.getRoom() == null) {
				if (room.getGuest() == null) {
					room.setGuest(this);
					this.room = room;
					System.out.println("Guest checked in");
					return true;
				}
				else {
					System.out.println("Other guest in room");
					return false;
				}
		}
		else {
			System.out.println("Guest already in a room, room number:" + this.getRoom());
			return false;
		}
	}
	
	/**
     * Sets the room of this <code>Guest</code> to <code>null</code>.
     * @return <code>true</code> if this <code>Room</code> is <code>null</code>;
     *         <code>false</code> if this <code>Guest</code> 
     *         is not currently in a room.
     */
	public boolean checkout () {
		if (this.getRoom() != null) {
			if (this.getRoom().getGuest() == this) {
				this.getRoom().setGuest(null);
				this.room = null;
				System.out.println("Guest checked out");
				return true;
			}
			else {
				System.out.println("No guest in room");
				return false;
			}
		}
		else {
			System.out.println("Guest does not have a room");
			return false;
		}
	}
	
	public String toString() {
		return null;
		
	}
		
	
	
}

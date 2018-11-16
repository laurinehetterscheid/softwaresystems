package ss.week1.hotel;

/**
 * Hotel guest with name and possibly a room.
 * @author Laurine Hetterscheid
 */
public class Guest {
    // ------------------ Instance variables ----------------
	private String name;
	
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
     *         <code>0</code> if this <code>Guest</code> 
     *         is not currently in a room.
     */
	public int getRoom () {
		return 0;
	}
	
	/**
     * Rents a room to this <code>Guest</code>.
     * @param no roomnumber to be rented to this <code>Guest</code>; 
     * @return true if <code>Room</code> is rented to this <code>Guest</code>;
     *         <code>false</code> if this <code>Guest</code> 
     *         already had a room or <code>Room</code> already had a Guest.
     */
	public boolean checkin (Room no) {
		return false;		
	}
	
	/**
     * Sets the room of this <code>Guest</code> to <code>null</code>.
     * @return <code>true</code> if this <code>Room</code> is <code>null</code>;
     *         <code>false</code> if this <code>Guest</code> 
     *         is not currently in a room.
     */
	public boolean checkout () {
		return false;
	}
	
}

/**
 * 
 */
package ss.week7.bounce;

/**
 * @author laurine.hetterscheid
 *
 */
public class AnimateThread extends Thread {

	AnimateThread(BallPanel bpArg) {
		this.bp = bpArg;
	}
	
	public void run() {
		bp.animate();
	}
	
	private BallPanel bp;

}

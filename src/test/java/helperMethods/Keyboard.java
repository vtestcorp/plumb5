package helperMethods;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Keyboard {

	private static Robot r;

	public static void pressEscape() {
		try {
			r = new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
			r.keyRelease(KeyEvent.VK_ESCAPE);
		} catch (Exception e) {
			e.getMessage();
		}
	}
}

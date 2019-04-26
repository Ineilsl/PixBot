package aimbot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class AimbotProcess {

	public static void shot(String Values) throws AWTException {
	    Robot robot = new Robot();
		if (Values != "") {
			System.out.println(Values);
		    String[] data = Values.split(";");
		    int XCoord = Integer.parseInt(data[0]);
		    int YCoord = Integer.parseInt(data[1]);
			robot.mouseMove(XCoord, YCoord);
			robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
		}
	}

}

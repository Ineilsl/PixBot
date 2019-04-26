package aimbot;

import aimbot.AimbotProcess;
import screenShot.PixelProcess;
import screenShot.Screenshot;

public class Controller {
	static public void main(String[] args) throws Exception {
		Boolean flag = true;
		while(flag.equals(true)) {
			Screenshot.shot();
	    	String Values = PixelProcess.analyth();
			AimbotProcess.shot(Values);
		}
    }

}
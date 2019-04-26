package screenShot;

import java.awt.*;
import java.awt.image.*;
import java.io.File;

import javax.imageio.ImageIO;
public class Screenshot{
		static public void shot() throws Exception {
            String format = "png";
            String fileName = ".\\shot.png";
			Robot robot = new Robot();
			Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle screenRectangle = new Rectangle(screenSize);
			BufferedImage image = robot.createScreenCapture(screenRectangle);
			ImageIO.write(image, format, new File(fileName));
		}
}
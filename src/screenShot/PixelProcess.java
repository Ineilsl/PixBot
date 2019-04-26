package screenShot;

import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class PixelProcess {

	static public String analyth() throws IOException{
		  int Rtarget = 248, BTarget = 133, GTarget = 172;
		  File file= new File(".\\shot.png");
		  BufferedImage image = ImageIO.read(file);
		  int height = image.getHeight(), width = image.getWidth();
		  for (int y = 0; y < height; y++) {
	            for (int x = 0; x < width; x++) {
	               int RGBA = image.getRGB(x, y);
	                //int alpha = (RGBA >> 24) & 255;
	                int red = (RGBA >> 16) & 255;
	                int green = (RGBA >> 8) & 255;
	                int blue = RGBA & 255;
				  if(Rtarget == red && BTarget == blue && GTarget == green) {
					  String var = x + ";" + y;
						return var;
				  }
	            }
		  }
			String zero = "";
			return zero;
	  }
}


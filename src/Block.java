import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Block extends Rectangle {
	Image pic;
	int dx = 3;
	int dy = -3;
	boolean destroyed = false;
	Rectangle left, right;
	Boolean powerup = false;

	public Block(int a, int b, int w, int h, String s) {

		x = a;
		y = b;
		width = w;
		height = h;
		left = new Rectangle(a - 1, b, 1, h);
		right = new Rectangle(a + w + 1, b, 1, h);
		try {
			pic = ImageIO.read(ResurceLoader.load(s));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image loadImages(String s) {
		try {
			pic = ImageIO.read(ResurceLoader.load(s));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pic;
	}

	public void draw(Graphics g, Component c) {
		if (!destroyed)
			g.drawImage(pic, x, y, width, height, c);
	}
}

package hairyPotter;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Panel extends JPanel {

	private BufferedImage map;
	private Player p1, p2, p3;

	public Panel(Player p1, Player p2, Player p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.add(p1.getPlayer());
		this.add(p3.getPlayer());
		this.add(p2.getPlayer());
		try {
			map = ImageIO.read(new File("src/Map.png"));
		} catch (IOException e) {
			System.out.println("Hi");
		}

		this.setPreferredSize(new Dimension(map.getWidth(), map.getHeight()));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(map, 0, 0, this);
		p1.movePlayer();
		p2.movePlayer();
		p3.movePlayer();
	}

}

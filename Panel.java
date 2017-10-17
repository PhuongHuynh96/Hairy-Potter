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

	// private JLabel map;
	private BufferedImage map;
	private Player p1, p2, p3;

	public Panel(Player p1, Player p2, Player p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		//this.add(p1.getPlayer());
		//this.add(p2.getPlayer());
		//this.add(p3.getPlayer());
		try {
			map = ImageIO.read(new File("src/Map.png"));
		} catch (IOException e) {
			System.out.println("Hi");
		}

		this.setPreferredSize(new Dimension(map.getWidth(), map.getHeight()));
		/*
		 * // ImageIcon icon = new ImageIcon("Map.png"); // map = new
		 * JLabel(icon); // map.setBackground(Color.BLACK); / JScrollPane jsp =
		 * new JScrollPane(map, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		 * JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); jsp.setPreferredSize(new
		 * Dimension(1230,550));
		 * jsp.getVerticalScrollBar().setUnitIncrement(16);
		 * jsp.setViewportView(map); // this.add(Box.createRigidArea(new
		 * Dimension(0,5))); this.add(jsp);
		 */
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(map, 0, 0, this);
		g.setColor(Color.MAGENTA);
		Font currentFont = g.getFont();
		Font newFont = currentFont.deriveFont(currentFont.getSize() * 3.0F);
		g.setFont(newFont);
		//g.drawString("", 0, 0);
		g.drawString(p1.getName(), (int) p1.getPoint().getX(), (int) (p1.getPoint().getY()));
		g.drawString(p2.getName(), (int) p2.getPoint().getX(), (int) p2.getPoint().getY());
		g.drawString(p3.getName(), (int) p3.getPoint().getX(), (int) p3.getPoint().getY());
	}

}

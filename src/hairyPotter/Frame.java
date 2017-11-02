package hairyPotter;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class Frame extends JFrame {

	public Frame() {
		setBounds(10, 10, 1250, 880);
		Panel2 control = new Panel2();
		this.add(control);

		setTitle("Hairy Potter!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1920, 1080);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
		setResizable(false);

		Thread t = new Thread(control);
		t.start();
	}
}

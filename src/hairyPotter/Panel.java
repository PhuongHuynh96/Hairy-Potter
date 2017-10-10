package hairyPotter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;

public class Panel extends JPanel implements ActionListener, Runnable
{
    private BufferedImage img;
    private JLabel map, gary;
    private int countDown;

    public Panel()
    {
        this.setBackground(Color.BLACK);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setFocusable(true);

        gary = new JLabel("Gary");
        gary.setForeground(Color.MAGENTA);
        gary.setBounds(50, 50, 100, 100);
        this.add(gary);
        
        ImageIcon icon = new ImageIcon("../Map.png");
        map = new JLabel(icon);
        map.setBackground(Color.BLACK);
        JScrollPane jsp = new JScrollPane(map, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jsp.setPreferredSize(new Dimension(1230,550));
        jsp.setViewportView(map);
        this.add(jsp);

        
   /*     
        //making JList to display map options 
        String[] data = {"George Allen Field", "Japanese Garden", "Student Parking",
        		"Rec Center","Forbidden Parking","West Walkway","Computer Lab",
        		"ECS 302","EAT Club","CECS Conference Room","East Walkway",
        		"North Hall","South Hall","Room of Retirement","Elevators",
        		"ECS 308","Lactation Lounge","Library","LA 5","Bratwurst Hall"};
        JList<String> options = new JList<String>(data);
        
*/
    
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);    
    }

	@Override
    public void run() 
    {
        while(countDown > 0)
        {
            try
            {
                Thread.sleep(50);
                repaint();
            }
            catch(InterruptedException e)
            {
                System.out.println("Error in the label reading.");
            }
        }
	}

	@Override
    public void actionPerformed(ActionEvent e) 
    {
        	
	}
}


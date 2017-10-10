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
    private JLabel map;
    private int countDown;

    public Panel()
    {
        this.setBackground(Color.BLACK);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setFocusable(true);
        // try
        // {
        //     img = ImageIO.read(new File("../Map.png"));
        // }
        // catch(IOException e)
        // {
        //     System.out.println("No Image Found!!");
        //     e.printStackTrace();
        // }
        ImageIcon icon = new ImageIcon("Map.png");
        map = new JLabel(icon);
        map.setBackground(Color.BLACK);
        JScrollPane jsp = new JScrollPane(map, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jsp.setPreferredSize(new Dimension(1230,550));
        jsp.setViewportView(map);
        this.add(jsp);
        //this.add(map);
        
        // making button arrays
        JButton Button[] = new JButton[4];
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
        g.setColor(Color.MAGENTA);
        g.drawString("Gary", 50, 50);
        g.drawRect(50, 50, 500, 500);
        
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


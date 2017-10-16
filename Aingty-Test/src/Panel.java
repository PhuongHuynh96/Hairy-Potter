import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;

/**
 * Displays the map and the markers (players on the map)
 * @author Phuong Huynh
 *
 */
public class Panel extends JPanel implements ActionListener, Runnable
{
    private BufferedImage img;
    private JLabel map;
	private JLabel gary;
	private JLabel patrick;
	private JLabel pearl;
    private int countDown;
    private JLabel m;

    public Panel()
    {
        this.setBackground(Color.BLACK);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setFocusable(true);

        gary = new JLabel("Gary");
        gary.setForeground(Color.BLUE);
        gary.setFont(new Font("Serif", Font.BOLD, 40) );
        gary.setBounds(610, 930, 100, 100);
        
        patrick = new JLabel("Patrick");
        patrick.setForeground(Color.PINK);
        patrick.setFont(new Font("Serif", Font.BOLD, 40) );
        patrick.setBounds(610, 1000, 200, 200);
        
        pearl = new JLabel("Pearl");
        pearl.setForeground(Color.DARK_GRAY);
        pearl.setFont(new Font("Serif", Font.BOLD, 40) );
        pearl.setBounds(610, 980, 100, 100);
       
        m=new JLabel("Marker");
        m.setForeground(Color.CYAN);
        m.setFont(new Font("Serif", Font.BOLD, 40));
        m.setBounds(610, 950, 200, 200);

        
        ImageIcon icon = new ImageIcon("../Map.png");
        map = new JLabel(icon);
        map.setBackground(Color.BLACK);
        JScrollPane jsp = new JScrollPane(map, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jsp.setPreferredSize(new Dimension(1230,550));
        jsp.setViewportView(map);
        this.add(jsp);
        
       
        map.add(gary);
        map.add(patrick);
        map.add(pearl);
        map.add(m);
        map.revalidate();    
    }

    @Override
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


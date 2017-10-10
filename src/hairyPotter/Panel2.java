package hairyPotter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Panel2 extends JPanel implements ActionListener, Runnable {
	 private int countDown;
	 public Panel2(){
		 
		 this.setBackground(Color.GREEN);
		 JPanel buttonPanel = new JPanel();
		 buttonPanel.setLayout(new BoxLayout(buttonPanel,BoxLayout.Y_AXIS));
		 	this.setLayout(new BorderLayout());
		    String[] data = {"North Hall", "South Hall"};
		    JList<String> options = new JList<String>(data);
		    setFocusable(true);

		    
		    // making button arrays
	        JButton Button[] = new JButton[4];
	        Button[0]= new JButton("Draw Card");
	        Button[0].setVisible(true);
	        Button[0].setMaximumSize(new Dimension(100,30));
	        Button[0].setHorizontalAlignment(SwingConstants.LEFT);
	        buttonPanel.add(Button[0]);
	        
	        Button[1] = new JButton("Move");
	        Button[1].setVisible(true);
	        Button[1].setMaximumSize(new Dimension(100,30));
	        buttonPanel.add(Button[1], BorderLayout.WEST);
	  //      this.add(buttonPanel, BorderLayout.WEST);
	        
	        
	        Button[2] = new JButton("Play Card");
	        Button[2].setVisible(true);
	        Button[2].setMaximumSize(new Dimension(100,30));
	        buttonPanel.add(Button[2], BorderLayout.WEST);
	//        this.add(buttonPanel, BorderLayout.WEST);
			
			
	        this.add(buttonPanel, BorderLayout.WEST);
	        buttonPanel.setPreferredSize(new Dimension(200,500));
	        buttonPanel.setVisible(true);
	        setVisible(true);
	        setPreferredSize(new Dimension(1200,500));
	        
		    data=new String[]{"North Hall", "South Hall"};
		    buttonPanel.add(options, BorderLayout.AFTER_LAST_LINE);
		    
	 }

	 public void paintComponent(Graphics g)
	 {
		 super.paintComponent(g);    
	 }

    

	@Override
	public void run() {
		// TODO Auto-generated method stub
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}

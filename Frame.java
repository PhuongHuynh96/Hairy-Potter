package hairyPotter;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class Frame extends JFrame
{
    private Panel panel;

    public Frame()
    {
        setBounds(10, 10, 1250, 880);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel = new Panel();
        getContentPane().add(panel);
        Panel2 control = new Panel2();
        getContentPane().add(control);

 //       panel.getContentPane().add(control,BorderLayout.SOUTH);
 /*       
        //making JList to display map options 
        String[] data = {"George Allen Field", "Japanese Garden", "Student Parking",
        		"Rec Center","Forbidden Parking","West Walkway","Computer Lab",
        		"ECS 302","EAT Club","CECS Conference Room","East Walkway",
        		"North Hall","South Hall","Room of Retirement","Elevators",
        		"ECS 308","Lactation Lounge","Library","LA 5","Bratwurst Hall"};
        JList<String> options = new JList<String>(data);
        getContentPane().add(options);
        pack();
        setMinimumSize(new Dimension(200,200));
        setVisible(true);
   */     
        setTitle("Hairy Potter!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        
        Thread t = new Thread(panel);
        t.start();
    }
}


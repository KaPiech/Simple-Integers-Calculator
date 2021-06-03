
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ex14_Calculator {

	static JFrame jframe = null;
	
    public static void createAndShowGUI() {
    	
    	JFrame jf = new JFrame("Integer Calculator");
    	jf.setPreferredSize(new Dimension(300, 330));
    	jframe=jf;
        
        JTextField text_field = new JTextField();
        text_field.setPreferredSize(new Dimension(300, 50));
        Font font1 = new Font("SansSerif", Font.BOLD, 25);
        text_field.setFont(font1);
        jf.add(text_field, BorderLayout.NORTH);
        text_field.setText("0");
        text_field.setHorizontalAlignment(SwingConstants.RIGHT);
        
        JPanel panel = new JPanel();
        jf.add(panel,BorderLayout.CENTER);
        
        GridLayout buttons_layout = new GridLayout(4,4);
        panel.setLayout(buttons_layout);

        MyActionListener myActionListener = new MyActionListener(text_field);
        
        JButton button1 = new JButton("1");
        panel.add(button1);
        button1.addActionListener(myActionListener);
        button1.setBackground(Color.gray);
        
        JButton button2 = new JButton("2");
        panel.add(button2);
        button2.addActionListener(myActionListener);
        button2.setBackground(Color.gray);
        
        JButton button3 = new JButton("3");
        panel.add(button3);
        button3.addActionListener(myActionListener);
        button3.setBackground(Color.gray);

        JButton button4 = new JButton("+");
        panel.add(button4);
        button4.addActionListener(myActionListener);
        button4.setBackground(Color.orange);
        
        JButton button5 = new JButton("4");
        panel.add(button5);
        button5.addActionListener(myActionListener);
        button5.setBackground(Color.gray);
      
        JButton button6 = new JButton("5");
        panel.add(button6);
        button6.addActionListener(myActionListener);
        button6.setBackground(Color.gray);
        
        JButton button7 = new JButton("6");
        panel.add(button7);
        button7.addActionListener(myActionListener);
        button7.setBackground(Color.gray);
       
        JButton button8 = new JButton("-");
        panel.add(button8);
        button8.addActionListener(myActionListener);
        button8.setBackground(Color.orange);
        
        JButton button9 = new JButton("7");
        panel.add(button9);
        button9.addActionListener(myActionListener);
        button9.setBackground(Color.gray);
        
        JButton button10 = new JButton("8");
        panel.add(button10);
        button10.addActionListener(myActionListener);
        button10.setBackground(Color.gray);
                
        JButton button11 = new JButton("9");
        panel.add(button11);
        button11.addActionListener(myActionListener);
        button11.setBackground(Color.gray);
               
        JButton button12 = new JButton("*");
        panel.add(button12);
        button12.addActionListener(myActionListener);
        button12.setBackground(Color.orange);
                
        JButton button13 = new JButton("0");
        panel.add(button13);
        button13.addActionListener(myActionListener);
        button13.setBackground(Color.gray);
              
        JButton button14 = new JButton("=");
        panel.add(button14);
        button14.addActionListener(myActionListener);
        button14.setBackground(Color.orange);
              
        JButton button15 = new JButton("C");
        panel.add(button15);
        button15.addActionListener(myActionListener);
        button15.setBackground(Color.orange);
               
        JButton button16 = new JButton("/");
        panel.add(button16);
        button16.addActionListener(myActionListener);
        button16.setBackground(Color.orange);
        
        
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

	
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() { createAndShowGUI();}
        });        
    }

    
}

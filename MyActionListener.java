import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;


public class MyActionListener implements ActionListener{
	
	char operator = '0'; 
	char input;
	int a = 0;
	int b = 0;
	boolean n = true;
	boolean equal_check = false;
	boolean equal_check_2 = false;
	boolean downside = false;
	boolean b_check = false;
	boolean a_check = false;			
	JTextField text_field;
	
	public MyActionListener(JTextField text) {
		 text_field = text;
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		input = e.getActionCommand().charAt(0);
		
		switch(input) {
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
		case '0':
			if(equal_check == true) {
				a = 0;
				b = 0;
				operator = '0';
				n = true;
				equal_check=false; 
				equal_check_2=false; 
				a_check = false;			
			}
			if(n == true) {
				if(a == 0 && a_check == false) {		
					a = Character.getNumericValue(input);
					text_field.setText(String.valueOf(a));
					a_check = true;					
				}else if (b == 0) {
					b = Character.getNumericValue(input);
					text_field.setText(String.valueOf(b));
					b_check = true;
				}
			n = false;
			}
			else {	
				if(operator == '0') {
					a = Integer.valueOf(String.valueOf(a) + Character.toString(input)); 
					text_field.setText(String.valueOf(a));
				}else {
					b = Integer.valueOf(String.valueOf(b) + Character.toString(input));
					text_field.setText(String.valueOf(b));
				}
			}
			break;
		case '+':
		case '-':
		case '*':
		case '/':
			if(equal_check == true) {
				b = 0;
				n = true;
				equal_check=false; 
				equal_check_2=false; 
			}
			if(equal_check_2 == false) {
			if(input == '-' && a == 0 && b == 0 && a_check == false) { 
				downside = true;
				break;
			}
			if(downside == true) {
				a = -a;
				downside = false;
			}
			
			if(operator == '/' && b == 0 && b_check == true) {
				text_field.setText("error->division by 0");
				break;
			}
			
			if(operator != '0' && b != 0) {
				if(operator == '+') {
					a = a + b;
				}else if (operator == '-') {
					a = a - b;
				}else if (operator == '*') {
					a = a * b;
				}else if (operator == '/') {
					a = a / b;
					}
				}	
			
			b = 0;
			operator = input;
			n = true;
			b_check = false;
			text_field.setText(String.valueOf(a));
			break;}
		case 'C':
			a = 0;
			b = 0;
			operator = '0';
			n = true;
			equal_check=false; 
			equal_check_2=false; 
			downside = false;
			b_check = false;
			a_check = false;			
			text_field.setText("0");
			break;
		case '=':
			if(downside == true) {
				a = -a;
				downside = false;
			}
			if(operator == '+') {
				a = a + b;
			}else if (operator == '-') {
				a = a - b;
			}else if (operator == '*') {
				a = a * b;
			}else if (operator == '/') {
				if(b != 0) {
					a = a / b;
					}else {
						text_field.setText("error->division by 0");
						break;
					}
			}
			text_field.setText(String.valueOf(a));
			n=true;
			equal_check=true;
			b_check = false;
			equal_check_2=true;
			a_check = false;			
			break;
		}
	}
}  
	
	


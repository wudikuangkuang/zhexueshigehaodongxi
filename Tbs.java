

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class Tbs extends JFrame{
	 int[] lei=new int[10];
	 JButton[] button=new JButton[50];
      public Tbs() {
    	setSize(500,400);
      for(int j=0;j<10;j++) {
    	  lei[j]= ((int)(Math.random()*50+1));
    	  System.out.println(lei[j]);
   				}
    	for(int i=0;i<50;i++) {
    		button[i]=new JButton(i+1+"");
    		add(button[i]);
    	button[i].addActionListener(new  ActionListener() {
    	public void actionPerformed(ActionEvent e) {
   
              JButton ww=(JButton)(e.getSource());
               boolean flag=true;
              for(int j=0;j<10;j++) 
              if(ww.getText().equals(lei[j]+""))
              {flag =true;}
             if(flag=true)  JOptionPane.showMessageDialog(null, "´íÎó","²ÝÄàÂí",3);
             else ww.setText("°²È«"); 
           
    			}
    		});
    	 FlowLayout f=new  FlowLayout();
    	 setLayout(f);
    	 setVisible(true);
    	 setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    	}
    	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     new Tbs();
	}

}
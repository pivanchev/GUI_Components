/*
JButton,JLabel,JTextfield,JCheckBox,JRadioButton,JComboBox
JPanel
*/
package gui;
import javax.swing.*;


public class GUI {

    public static void main(String[] args) {
        
        JButton jbok=new JButton("OK");//create a button
        JButton jbtcancel=new JButton("CANCEL");//create a button
        JLabel jlblname=new JLabel("Enter your name");//create a label
        JTextField jtxtfield=new JTextField("Type your name here");//create a text field
        JCheckBox jchkBold=new JCheckBox("Bold");//create a check box
        JCheckBox jchkItalic=new JCheckBox("Italic");//create a check box
        JRadioButton jrbRed=new JRadioButton("Red");//create a radio button
        JRadioButton jrbYellow=new JRadioButton("Yellow");//create a radio button
        JComboBox jcbColor=new JComboBox(new String[]{"Freshman","Sophomore","Junior","Senior"});//create a combo box
        
        JPanel panel=new JPanel();//create a panel
        panel.add(jbok);//add to panel
        panel.add(jbtcancel);
        panel.add(jlblname);
        panel.add(jtxtfield);
        panel.add(jchkBold);
        panel.add(jchkItalic);
        panel.add(jrbRed);
        panel.add(jrbYellow);
        panel.add(jcbColor);
        
        JFrame frame=new JFrame();
        frame.add(panel);
        frame.setTitle("Show GUI components");
        frame.setSize(450,100);
        frame.setLocation(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
      
   
    }
    
}

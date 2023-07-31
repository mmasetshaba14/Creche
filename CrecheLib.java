
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CrecheLib extends JFrame{
   
    //Labels
    private JLabel nameLab;
    private JLabel genderLab;
    
    //TextField

    private JTextField nameTextF;
    
    //RadioButtons
    private JRadioButton maleRad;
    private JRadioButton femaleRad;
    
    //Buttons
    private JButton regBut;
    private JButton disBut;
    
    //Groupbutton
    private ButtonGroup groupBut;
     
    //TextArea
    private JTextArea area;
    
    //ScrollPane
    private JScrollPane areaScrollPane;
    
    //Panels
    private JPanel namePan;
    private JPanel genderPan;
    private JPanel buttonsPan;
    private JPanel areaPan;
    private JPanel combinedPan;
    private JPanel mainPan;
    private JPanel combinedPan1;
    
    public CrecheLib(){
    
        setTitle("CRECHE 4 YOUR KIDDIE");
        setSize(300,350);
        
        //CREATE Labels
        nameLab = new JLabel("Name: ");
        genderLab  = new JLabel("Gender: ");
        
        //CREATE TextField
        nameTextF = new JTextField(15);
        
        //CREATE RadioButtons
        maleRad = new JRadioButton("Male");
        femaleRad = new JRadioButton("Female");
       
        //CREATE Buttons
        regBut = new JButton("Register kiddie");
        disBut = new JButton("Display kiddie");
    
        //CREATE Groupbutton
        groupBut = new ButtonGroup();
        groupBut.add(maleRad);
        groupBut.add(femaleRad);
        
        //CREATE TextArea
        area = new JTextArea(10,35);
        
        //CREATE ScrollPane
        areaScrollPane = new JScrollPane(area,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        //CREATE Panels
        namePan = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPan = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonsPan = new JPanel(new FlowLayout(FlowLayout.LEFT));
        areaPan = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        namePan.add(nameLab);
        namePan.add(nameTextF);
        
        genderPan.add(genderLab);
        genderPan.add(maleRad);
        genderPan.add(femaleRad);
        
        buttonsPan.add(regBut);
        buttonsPan.add(disBut);
        
        combinedPan = new JPanel(new GridLayout(3,3));
        combinedPan.add(namePan);
        combinedPan.add(genderPan);
        combinedPan.add(buttonsPan);
    
        areaPan.add(areaScrollPane);
        
        mainPan = new JPanel(new BorderLayout());
        mainPan.add(combinedPan,BorderLayout.CENTER);
        mainPan.add(areaPan,BorderLayout.SOUTH);
       
        add(mainPan);
        pack();
        setVisible(true);
    }
}

package model;



import javax.swing.ImageIcon;
import javax.swing.JLabel; 

public class Car extends JLabel{
    public Car(int x,int y,int W,int H,String fileName){
        setBounds(x,y,W,H);
        setIcon(new ImageIcon(getClass().getResource(fileName)));
        
    }
    
    
}

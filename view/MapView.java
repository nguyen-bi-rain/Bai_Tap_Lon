package view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import  utils.contants;

public class MapView extends JFrame{
    private JLabel label;
    private JLabel map;
    private JLabel hero;
    public MapView(String map1,String cat){
        hero = new JLabel();
        map = new JLabel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(contants.WIDTH,contants.HEIGHT);


        map.setName("map");
        map.setMaximumSize(new Dimension(contants.WIDTH,contants.HEIGHT));
        map.setMinimumSize(new Dimension(contants.WIDTH,contants.HEIGHT));
        map.setPreferredSize(new Dimension(contants.WIDTH,contants.HEIGHT));

        map.setIcon(new ImageIcon(getClass().getResource("../images/Street.png")));
        map.setBounds(0,0,map.getIcon().getIconWidth(),map.getIcon().getIconHeight());
        hero.setIcon(new ImageIcon(getClass().getResource("../images/"+cat+".png")));
        hero.setBounds(500,550,100,100);
        hero.setBackground(Color.BLACK);
        add(hero);
        add(map);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(true);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MapView(null, "mouse");
    }
}


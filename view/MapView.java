package view;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MapView extends JFrame{
    private JLabel label;
    private JLabel map;
    private JLabel hero;
    public MapView(String map1){
        hero = new JLabel();
        label = new JLabel("Hello");
        map = new JLabel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(660,500);
        label.setBounds(100,100,100,100);
        map.setName("map");
        map.setMaximumSize(new Dimension(660,500));
        map.setMinimumSize(new Dimension(660,500));
        map.setPreferredSize(new Dimension(660,500));
        map.setBounds(0,0,660,500);
        map.setIcon(new ImageIcon(getClass().getResource("../images/"+map1+".png")));

        hero.setIcon(new ImageIcon(getClass().getResource("../images/"+map1+".png")));
        hero.setBounds(400,240,100,100);

        add(label);
        add(map);
        add(hero);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        // MapView map = new MapView("map");
    }
}


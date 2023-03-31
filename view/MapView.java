package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Hero;
import utils.contants;

public class MapView extends JFrame {
    private JLabel score;
    private JLabel map;
    private Hero hero;

    public MapView(String map1, String character) {
        hero = new Hero();
        map = new JLabel();

        score = new JLabel("0");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(contants.WIDTH, contants.HEIGHT);
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    hero.moveForward();
                }
            }
        });

        map.setName("map");
        map.setMaximumSize(new Dimension(contants.WIDTH, contants.HEIGHT));
        map.setMinimumSize(new Dimension(contants.WIDTH, contants.HEIGHT));
        map.setPreferredSize(new Dimension(contants.WIDTH, contants.HEIGHT));

        map.setIcon(new ImageIcon(getClass().getResource("../images/"+map1+".png")));
        map.setBounds(0, 0, map.getIcon().getIconWidth(), map.getIcon().getIconHeight());
        hero.setIcon(new ImageIcon(getClass().getResource("../images/" + character + ".png")));
        hero.setBounds(500, 550, 100, 100);
        hero.setBackground(Color.BLACK);

        add(hero);
        add(map);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(true);
        setVisible(true);
    }

}

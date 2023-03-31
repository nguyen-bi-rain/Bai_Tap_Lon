package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import utils.contants;

public class HeroView extends JFrame implements ActionListener {
    private final static int WIDTH = contants.WIDTH;
    private final static int HEIGHT = contants.HEIGHT;

    private JLabel gameName;
    private JRadioButton map1;
    private JRadioButton map2;
    private JRadioButton map3;
    private JButton startButton;
    private ButtonGroup group;
    private JLabel mapSelected;

    public HeroView(String map) {
        
        gameName = new JLabel();
        map1 = new JRadioButton("map1", true);
        map2 = new JRadioButton();
        map3 = new JRadioButton();
        group = new ButtonGroup();
        mapSelected = new JLabel("Ban dang chon nhan nhan vat 1");
        startButton = new JButton("start game");
        startButton.setBounds(300, 400, 50, 50);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setMaximumSize(new Dimension(WIDTH, HEIGHT));
        setMinimumSize(new Dimension(WIDTH, HEIGHT));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        getContentPane().setBackground(new Color(83, 145, 101));

        group.add(map1);
        group.add(map2);
        gameName.setFont(new Font("Tahoma", Font.BOLD, 30));
        gameName.setText("CROSS GAME");
        gameName.setForeground(Color.WHITE);
        gameName.setBounds(400, 20, 300, 100);

        map1.setName("mouse");
        map1.setSelected(true);
        map1.setIcon(new ImageIcon(getClass().getResource("../images/homemouse.png")));
        map1.setBounds(130, 130, map1.getIcon().getIconWidth(), map1.getIcon().getIconHeight());

        map2.setName("cat");
        map2.setIcon(new ImageIcon(getClass().getResource("../images/homecat.png")));
        map2.setBounds(430, 130, map2.getIcon().getIconWidth(), map2.getIcon().getIconHeight());

        map3.setName("dog");
        map3.setIcon(new ImageIcon(getClass().getResource("../images/homedog.png")));
        map3.setBounds(730, 130, map3.getIcon().getIconWidth(), map3.getIcon().getIconHeight());

        mapSelected.setFont(new Font("Tohama", Font.BOLD, 25));
        mapSelected.setBounds(300, 300, 400, 200);
        mapSelected.setForeground(Color.PINK);

        startButton.setBounds(400, 450, 200, 100);


        map1.addActionListener(this);
        map2.addActionListener(this);
        map3.addActionListener(this);
        startButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (map1.isSelected()) {
                    dispose();
                    new MapView(map,map1.getName());
                } else if (map2.isSelected()) {
                    dispose();
                    new MapView(map,map2.getName());
                }else if (map3.isSelected()) {
                    dispose();
                    new MapView(map,map3.getName());
                } else {

                    throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
                }
            }

        });
        add(mapSelected);
        add(map1);
        add(map2);
        add(map3);
        add(gameName);
        add(startButton);
        setResizable(false);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new HeroView("cat");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (map1.isSelected()) {
            mapSelected.setText("map 1 is selected");
        }
        if (map2.isSelected()) {
            mapSelected.setText("map 2 is selected");
        }
        if (map3.isSelected()) {
            mapSelected.setText("map 4 is selected");
        }
    }
}

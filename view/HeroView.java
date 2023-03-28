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

public class HeroView extends JFrame implements ActionListener {
    private final static int WIDTH = 660;
    private final static int HEIGHT = 500;

    private JLabel gameName;
    private JRadioButton map1;
    private JRadioButton map2;
    private JRadioButton map3;
    private JButton startButton;
    private ButtonGroup group;
    private JLabel request;
    private JLabel mapSelected;

    public HeroView(String map) {
        
        gameName = new JLabel();
        map1 = new JRadioButton("map1", true);
        map2 = new JRadioButton();
        map3 = new JRadioButton();
        group = new ButtonGroup();
        mapSelected = new JLabel("Seleted map: ");
        request = new JLabel("Please Choose your map");
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
        group.add(map3);
        gameName.setFont(new Font("Tahoma", Font.BOLD, 30));
        gameName.setText("CROSS GAME");
        gameName.setForeground(Color.WHITE);
        gameName.setBounds(230, 20, 300, 100);

        map1.setName("map1");
        map1.setBounds(50, 150, 125, 125);
        map1.setIcon(new ImageIcon(getClass().getResource("../images/cat2.png")));
        map1.setBackground(Color.GREEN);

        map2.setName("map2");
        map2.setBounds(275, 150, 125, 125);
        map2.setIcon(new ImageIcon(getClass().getResource("../images/cat2.png")));

        map3.setName("map");
        map3.setBounds(500, 150, 125, 125);
        map3.setIcon(new ImageIcon(getClass().getResource("../images/cat2.png")));

        request.setFont(new Font("Tohama", Font.BOLD, 25));
        request.setBounds(180, 30, 400, 200);
        request.setForeground(Color.PINK);

        mapSelected.setFont(new Font("Tohama", Font.BOLD, 25));
        mapSelected.setBounds(180, 250, 400, 200);
        mapSelected.setForeground(Color.PINK);

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
                } else if (map3.isSelected()) {
                    dispose();
                    new MapView(map,map3.getName());
                } else {

                    throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
                }
            }

        });
        add(mapSelected);
        add(request);
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
            mapSelected.setText("map 3 is selected");
        }
    }
}

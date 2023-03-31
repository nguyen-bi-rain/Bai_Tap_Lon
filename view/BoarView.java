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

public class BoarView extends JFrame implements ActionListener {

    private JLabel gameName;
    private JRadioButton map1;
    private JRadioButton map2;
    private JButton startButton;
    private ButtonGroup group;
    private JLabel mapSelected;

    public BoarView() {
        // khoi tao cac doi tuong cua mot frame
        gameName = new JLabel();
        map1 = new JRadioButton("map1", true);
        map2 = new JRadioButton();
        group = new ButtonGroup();
        mapSelected = new JLabel("Ban dang chon map 1");
        startButton = new JButton("Choose map");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setMaximumSize(new Dimension(contants.WIDTH, contants.HEIGHT));
        setMinimumSize(new Dimension(contants.WIDTH, contants.HEIGHT));
        setPreferredSize(new Dimension(contants.WIDTH, contants.HEIGHT));
        setTitle("Game danh cho tre con");

        getContentPane().setBackground(new Color(83, 145, 101));

        group.add(map1);
        group.add(map2);
        gameName.setFont(new Font("Tahoma", Font.BOLD, 30));
        gameName.setText("CROSS GAME");
        gameName.setForeground(Color.WHITE);
        gameName.setBounds(400, 20, 300, 100);

        map1.setName("Street");
        map1.setSelected(true);
        map1.setIcon(new ImageIcon(getClass().getResource("../images/streethome.png")));
        map1.setBounds(200, 130, map1.getIcon().getIconWidth(), map1.getIcon().getIconHeight());

        map2.setName("Mountain");
        map2.setIcon(new ImageIcon(getClass().getResource("../images/moutainhome.png")));
        map2.setBounds(580, 130, map2.getIcon().getIconWidth(), map2.getIcon().getIconHeight());

        mapSelected.setFont(new Font("Tohama", Font.BOLD, 25));
        mapSelected.setBounds(380, 300, 400, 200);
        mapSelected.setForeground(Color.PINK);

        map1.addActionListener(this);
        map2.addActionListener(this);

        startButton.setBounds(400, 450, 200, 100);

        startButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (map1.isSelected()) {
                    dispose();
                    new HeroView(map1.getName());
                } else if (map2.isSelected()) {
                    dispose();
                    new HeroView(map2.getName());
                } else {

                    throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
                }
            }

        });
        add(mapSelected);
        add(map1);
        add(map2);
        add(gameName);
        add(startButton);
        setResizable(false);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new BoarView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (map1.isSelected()) {
            mapSelected.setText("Ban dang chon map 1");
        }
        if (map2.isSelected()) {
            mapSelected.setText("Ban dang chon map 2");
        }

    }
}

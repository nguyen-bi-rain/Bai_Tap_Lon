package Bai_Tap_Lon.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BoarView extends JFrame implements ActionListener {

    private JLabel gameName;
    private JButton map1;
    private JButton map2;
    private JButton map3;
    private JLabel request;
    public BoarView(){


        gameName = new JLabel();
        map1 = new JButton();
        map2 = new JButton();
        map3 = new JButton();
        request = new JLabel("Please Choose your map");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setMaximumSize(new Dimension(660,500));
        setMinimumSize(new Dimension(660,500));
        setPreferredSize(new Dimension(660,500));



        gameName.setFont(new Font("Tahoma", Font.BOLD,30 ));
        gameName.setText("CROSS GAME");
        gameName.setForeground(Color.WHITE);
        gameName.setBounds(230,20,300,100);

        map1.setName("map1");
        map1.setBounds(50,150,125,125);
        map1.setIcon(new ImageIcon(getClass().getResource("/Bai_Tap_lon/images/map1.png")));
        map1.setBackground(Color.GREEN);

        map2.setName("map2");
        map2.setBounds(275,150,125,125);
        map2.setIcon(new ImageIcon(getClass().getResource("/Bai_Tap_Lon/images/map2.png")));

        map3.setName("map3");
        map3.setBounds(500,150,125,125);
        map3.setIcon(new ImageIcon(getClass().getResource("/Bai_Tap_Lon/images/map.png")));

        request.setFont(new Font("Tohama", Font.BOLD, 25));
        request.setBounds(180,250,400,200);
        request.setForeground(Color.PINK);


        map1.addActionListener(this);
        map2.addActionListener(this);
        map3.addActionListener(this);
        add(request);
        add(map1);
        add(map2);
        add(map3);
        add(gameName);
        setResizable(false);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        BoarView game = new BoarView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == map1){
            System.out.println(map1.getName());
        }
    }
}

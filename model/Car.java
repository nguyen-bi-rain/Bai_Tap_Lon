package model;

import java.util.concurrent.ThreadFactory;

import javax.swing.JLabel; 

public class Car extends JLabel implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
            
        return new Thread();
    }
    public static void main(String[] args) {
        

    }

}

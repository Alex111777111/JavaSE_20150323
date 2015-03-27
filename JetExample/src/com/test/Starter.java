package com.test;

import com.test.plane.AirPlane;

import javax.swing.*;

public class Starter
{
    public static void main(String[] args) {

        AirPlane airPlane = new AirPlane();

        airPlane.changeX(60);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 200, 300, 300);
        frame.setVisible(true);
    }
}

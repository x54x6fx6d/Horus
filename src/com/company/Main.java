package com.company;

// Imports
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // Create new Frame
        JFrame frame = new JFrame("Minecraft Client");

        // Create a new JPanel
        JPanel panel = new JPanel();

        // Set the layout of the panel
        panel.setLayout(new FlowLayout());

        // Create a new JLabel
        JLabel label = new JLabel("Minecraft - 1.18.2");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // Create a new JButton
        JButton button = new JButton();
        // Button Settingss
        button.setText("Start");
        button.setPreferredSize(new Dimension(100, 50));
        button.setBackground(Color.CYAN);
        button.setForeground(Color.BLACK);
        button.setFont(new Font("Arial", Font.BOLD, 20));
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        // Button Event
        button.addActionListener(l -> {
            test();
        });


        panel.add(label);
        panel.add(button);
        frame.add(panel);

        // Frame Settings
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

	}

    private static void test() {
        minecraft.startMinecraft();
        }
}
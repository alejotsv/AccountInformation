package com.java21days;

import javax.swing.*;
import java.awt.*;

public class AccountInformation extends JFrame {
    Dimension dim = new Dimension(300, 220);

    AccountInformation(String title, JPanel panel){
        super(title);
        setSize(dim);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panel);
        setVisible(true);
    }
}

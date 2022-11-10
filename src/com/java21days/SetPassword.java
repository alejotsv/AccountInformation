package com.java21days;

import javax.swing.*;
import java.util.ArrayList;

public class SetPassword {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        String[] labels = { "Username", "Password", "Comments" };
        ArrayList<JLabel> jLabels = createLabels(labels);
        JTextField username = new JTextField(12);

        panel.add(jLabels.get(0));
        panel.add(username);

        AccountInformation passwordWindow = new AccountInformation("Account Information", panel);
    }

    static ArrayList<JLabel> createLabels(String[] labels){
        ArrayList<JLabel> jLabels = new ArrayList<>();
        for(int i=0; i<labels.length; i++){
            JLabel jl = new JLabel(labels[i]);
            jLabels.add(jl);
        }
        return jLabels;
    }
}

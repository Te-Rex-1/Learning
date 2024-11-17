package Gui;

import javax.swing.*;

public class Menu {

    Menu(){
        JFrame frame=new JFrame("Menu Demo");
        JMenu filemenu=new JMenu("File");
        JMenu editMenu=new JMenu("Edit");

        JMenuItem item=new JMenuItem("item 1");

        JMenuItem open=new JMenuItem("Open");
        JMenuItem New=new JMenuItem("New");
        JMenuItem openProject=new JMenuItem("Open Project");

        JMenuItem cut=new JMenuItem("Cut");

        JMenuBar menuBar=new JMenuBar();
            New.add(item);
        menuBar.add(filemenu);
        menuBar.add(editMenu);

        filemenu.add(New);
        //New.add(item);
        filemenu.add(open);
        filemenu.add(openProject);



        editMenu.add(cut);
        frame.setJMenuBar(menuBar);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Menu();
    }
}


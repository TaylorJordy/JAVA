package Hoofdstuk_4;


import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdracht4_6 extends Applet
{

    public void paint( Graphics g )
    {
        g.setColor(Color.gray);
        g.fillRect(200,100,50,150);
        g.fillRect(220,250,10,300);
        g.setColor(Color.red);
        g.fillOval(200,100,50,50);
        g.setColor(Color.orange);
        g.fillOval(200,150,50,50);
        g.setColor(Color.green);
        g.fillOval(200,200,50,50);

    }
}
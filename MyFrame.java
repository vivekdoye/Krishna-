import java.awt.*;
public class MyForm extends Frame
{
     public static void main (String args[])
     { 
        Frame f=new Frame ("NEW FRAME");
        Checkbox c1=new Checkbox("MALE");
        Checkbox c2=new Checkbox("FEMALE");
        c1.setBounds(100,170,90,30);
       c2.setBounds(100,150,90,30);
          f.add(c1);
          f.add(c2);
          f.setsize(900,900);
          f.setLayout(null);
          f.setVisible(true);
        }
}
import java.awt.*; /* AWT full form is Abstract window toolkit is an application programming interface(API)
for creating Graphical User Interface in Java
*/
import java.awt.event.*; /* Provides interfaces and classes for dealing with different types of events fired by AWT components
*/
public class Calculator implements ActionListener {/* Main class implementing Action Listener.Action listener is a class in java
which is responsible for handling all actions such as when the user clicks on the component.We mainly use Action listener to create button
*/
    int c, n;
    String s1, s2, s3, s4, s5;
    Frame f; /* Frame is a class of the jav.awt package.A frame is a resizable and movable window with a title bar and maximize,minimize and close buttons
    */
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,addbutton, substractbutton, multiplybutton, dividebutton, equalbuttton, clrbutton;
    Panel p; // Panel is a container class
    TextField t1;
    GridLayout g;/* Grid layout is a layout Manager that lays out container's components in a rectangular grid.The container is divided into equal-sized
    rectangles,and one component is placed in each rectangle.
    */

    Calculator() {
        f = new Frame("Calculator"); // Creating an object of frame class
        f.setLayout(new FlowLayout());   // setting a layout of type flowlayout.flowlayout arranges components in a sequence order.
        p = new Panel();
        // Creating  an object of mentioned button above.
        button0 = new Button("0");
        button0.addActionListener(this);

        button1 = new Button("1");
        button1.addActionListener(this);

        button2 = new Button("2");
        button2.addActionListener(this);

        button3 = new Button("3");
        button3.addActionListener(this);

        button4 = new Button("4");
        button4.addActionListener(this);

        button5 = new Button("5");
        button5.addActionListener(this);

        button6 = new Button("6");
        button6.addActionListener(this);

        button7 = new Button("7");
        button7.addActionListener(this);

        button8 = new Button("8");
        button8.addActionListener(this);

        button9 = new Button("9");
        button9.addActionListener(this);

        addbutton = new Button("+");
        addbutton.addActionListener(this);

        substractbutton = new Button("-");
        substractbutton.addActionListener(this);


        multiplybutton= new Button("*");
        multiplybutton.addActionListener(this);


        dividebutton = new Button("/");
        dividebutton.addActionListener(this);

        equalbuttton = new Button("=");
        equalbuttton.addActionListener(this);

        clrbutton = new Button("CLR");
        clrbutton.addActionListener(this);

        t1 = new TextField(20);
        f.add(t1);

        g = new GridLayout(4, 4);
        p.setLayout(g);


        p.add(button0);
        p.add(button1);
        p.add(button2);
        p.add(button3);
        p.add(button4);
        p.add(button5);
        p.add(button6);
        p.add(button7);
        p.add(button8);
        p.add(button9);
        p.add(addbutton);
        p.add(substractbutton);
        p.add(multiplybutton);
        p.add(dividebutton);
        p.add(equalbuttton);
        p.add(clrbutton);
        f.add(p);
        f.setSize(300, 300);
        f.setVisible(true); /* setVisible(true) is a blocking operation and blocks until dialog is closed.
        It sets the currently made attributes to be visible on the screen  in GUI.
        */

        f.setBackground(Color.orange);  // Giving Background color
        f.addWindowListener(new WindowAdapter() { // for processing window events
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button0) {
            s3 = t1.getText();
            s4 = "0";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (e.getSource() == button1) {
            s3 = t1.getText();
            s4 = "1";
            s5 = s3 + s4;
            t1.setText(s5);
        }

        if (e.getSource() == button2) {
            s3 = t1.getText();
            s4 = "2";
            s5 = s3 + s4;
            t1.setText(s5);
        }

        if (e.getSource() == button3) {
            s3 = t1.getText();
            s4 = "3";
            s5 = s3 + s4;
            t1.setText(s5);
        }

        if (e.getSource() == button4) {
            s3 = t1.getText();
            s4 = "4";
            s5 = s3 + s4;
            t1.setText(s5);
        }

        if (e.getSource() == button5) {
            s3 = t1.getText();
            s4 = "5";
            s5 = s3 + s4;
            t1.setText(s5);
        }

        if (e.getSource() == button6) {
            s3 = t1.getText();
            s4 = "6";
            s5 = s3 + s4;
            t1.setText(s5);
        }

        if (e.getSource() == button7) {
            s3 = t1.getText();
            s4 = "7";
            s5 = s3 + s4;
            t1.setText(s5);
        }

        if (e.getSource() == button8) {
            s3 = t1.getText();
            s4 = "8";
            s5 = s3 + s4;
            t1.setText(s5);
        }

        if (e.getSource() == button9) {
            s3 = t1.getText();
            s4 = "9";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (e.getSource() == addbutton) {
            s1 = t1.getText();
            t1.setText("");
            c = 1;
        }

        if (e.getSource() == substractbutton) {
            s1 = t1.getText();
            t1.setText("");
            c = 2;
        }
        if (e.getSource() == multiplybutton) {
            s1 = t1.getText();
            t1.setText("");
            c = 3;
        }
        if (e.getSource() == dividebutton) {
            s1 = t1.getText();
            t1.setText("");
            c = 4;
        }
        if (e.getSource() == equalbuttton){
            s2 = t1.getText();
            if (c == 1) {
                n = Integer.parseInt(s1) + Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }

            if (c == 2) {
                n = Integer.parseInt(s1) - Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }

            if (c == 3) {
                n = Integer.parseInt(s1) * Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }

            if (c == 4) {
                n = Integer.parseInt(s1) / Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }
        }
        if (e.getSource() == clrbutton) {
            t1.setText("");
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
}
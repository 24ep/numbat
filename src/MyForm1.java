import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyForm1 extends JFrame  {
    private JTextField textfieldname;
    private String Tname;
    public MyForm1() {
        super("Nambut");
        setSize(500, 780);
        setLocation(650, 100);
        setResizable(false);
        ImageIcon img = new ImageIcon("Image/image/icon.png");
        setIconImage(img.getImage());
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.WHITE);
// Font
        AllFont Font = new AllFont();
// layeredPane
        JLayeredPane layeredPane = getLayeredPane();
// Create label background
        JLabel background = new JLabel();
        background.setIcon(new ImageIcon("Image/background/pre.gif"));
        background.setBounds(0, 0, 500, 750);
        layeredPane.add(background, new Integer(1));
// Create La0bel
        //Label 1 (Nambut)
        JLabel label1 = new JLabel("Nambut");
        label1.setFont(Font.Nambut);
        label1.setForeground(Color.white);
        label1.setBounds(70, 130, 400, 160);
        layeredPane.add(label1, new Integer(2));

        //Label 2 (Createforyou)
        JLabel label2 = new JLabel("C  R  E  A  T  E      F  O  R       Y  O  U");
        label2.setFont(Font.Createforyou);
        label2.setForeground(Color.white);
        label2.setBounds(150, 165, 400, 160);
        layeredPane.add(label2, new Integer(2));
// Create Textfield
        JLabel labeluser = new JLabel();
        String str1 = "Image/image/user.png";
        Icon icon1 = new ImageIcon(str1);
        labeluser.setIcon(icon1);
        labeluser.setBounds(115, 475, 20, 30);
        layeredPane.add(labeluser, new Integer(2));

        textfieldname = new JTextField("username", 30);
        textfieldname.setHorizontalAlignment(SwingConstants.CENTER);
        textfieldname.setBounds(100, 470, 300, 40);
        textfieldname.setFont(Font.Textfieldname);
        textfieldname.setCaretColor(Color.lightGray);
        textfieldname.setForeground(Color.white);
        textfieldname.setOpaque(false);
        // textfieldname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        layeredPane.add(textfieldname, new Integer(2));

        // JSeparator under = new JSeparator();
        // under.setForeground(new java.awt.Color(36, 47, 65));
        // under.setFont(Font.under);
        // under.setBounds(100, 500, 300, 30);
        // layeredPane.add(under, new Integer(2));

// Create Button

        JButton buttonCreate = new JButton("CREATE");
        buttonCreate.setFont(Font.Buttoncreate);
        buttonCreate.setForeground(Color.PINK);
        buttonCreate.setBackground(Color.white);
        buttonCreate.setBounds(175, 520, 150, 35);
        buttonCreate.setFocusPainted(false);
        layeredPane.add(buttonCreate, new Integer(2));



// Create Event for Button
        buttonCreate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setdata setdata = new setdata();
                Tname = textfieldname.getText();
                setdata.setTname(Tname);
                Tname = setdata.getTname();
                MyForm2 form2 = new MyForm2(Tname);
                form2.setVisible(true);
                setVisible(false);

            }

        });
    }
}
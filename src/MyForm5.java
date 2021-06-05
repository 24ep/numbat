import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyForm5 extends JFrame {
    public MyForm5(String [] profile,String Tname) {
// Create Form Frame
        super("Nambut");
        setSize(1650, 900);
        setLocation(100, 50);
        setBackground(Color.lightGray);
        setResizable(false);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
// Font
        AllFont Font = new AllFont();
// layeredPane
        JLayeredPane layeredPane = getLayeredPane();
// Create label background
        JLabel background = new JLabel();
        background.setIcon(new ImageIcon("Image/background/11.jpg"));
        background.setBounds(0,0,1650,250);
        layeredPane.add(background, new Integer(1));

// Create Label Template
        JLabel labelTemplate = new JLabel();
        labelTemplate.setText("T   E   M   P   L   A   T   E");
        labelTemplate.setFont(Font.labelTemplate);
        labelTemplate.setForeground(Color.WHITE);
        labelTemplate.setBackground(new java.awt.Color(36, 47, 65));
        labelTemplate.setBounds(650,100,1500,50);
        layeredPane.add(labelTemplate, new Integer(2));
        // Create LabelSelect
        JLabel labelSelect = new JLabel();
        labelSelect.setText("S  E  L  E  C  T");
        labelSelect.setFont(Font.TitleImage);
        labelSelect.setForeground(Color.lightGray);
        labelSelect.setBounds(800,80,400,20);
        layeredPane.add(labelSelect, new Integer(2));

        // underline
        JSeparator Topline = new JSeparator();
        Topline.setBounds(100, 170,  1450, 30);
        layeredPane.add(Topline, new Integer(2));

// Create Select

        String str1 ="Image/bt/bt1.jpg";
        Icon icon1 = new ImageIcon(str1);
        JButton buttonSelect1 = new JButton("Select Image");
        buttonSelect1.setBounds(325,290,300,500);
        buttonSelect1.setIcon(icon1);
        layeredPane.add(buttonSelect1, new Integer(2));;

        String str2 ="Image/bt/bt2.jpg";
        Icon icon2 = new ImageIcon(str2);
        JButton buttonSelect2 = new JButton("Select Image");
        buttonSelect2.setIcon(icon2);
        buttonSelect2.setBounds(675,290,300,500);
        layeredPane.add(buttonSelect2, new Integer(2));;

        String str3 ="Image/bt/bt3.jpg";
        Icon icon3 = new ImageIcon(str3);
        JButton buttonSelect3 = new JButton("Select Image");
        buttonSelect3.setIcon(icon3);
        buttonSelect3.setBounds(1025,290,300,500);
        layeredPane.add(buttonSelect3, new Integer(2));;


        String str4 ="Image/bt/back.jpg";
        Icon icon4 = new ImageIcon(str4);
        JButton buttonback = new JButton("back");
        buttonback.setContentAreaFilled(false);
        buttonback.setBorderPainted(false);
        buttonback.setFocusPainted(false);
        buttonback.setIcon(icon4);
        buttonback.setFont(Font.TextfieldProfri);
        buttonback.setBounds(740, 820, 150, 30);
        buttonback.setFocusPainted(false);
        layeredPane.add(buttonback, new Integer(2));


        // Buttomclose
        JButton buttonclose = new JButton("X");
        buttonclose.setOpaque(false);
        buttonclose.setContentAreaFilled(false);
        buttonclose.setBorderPainted(false);
        buttonclose.setFocusPainted(false);
        buttonclose.setForeground(Color.white);
        buttonclose.setFont(Font.labelprofri);
        buttonclose.setBounds(1570,10,100,30);
        layeredPane.add(buttonclose, new Integer(2));


        // Event ButtonSelect1
        buttonSelect1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String template1 = "Image/nam1/A.png";

                Location_Card LC = new Location_Card();
                AllFontCard allFontCard = new AllFontCard();
                MyForm6 form6 = new MyForm6(template1,profile,LC.Card1(),Tname,Color.YELLOW,allFontCard.Card1());

                form6.setVisible(true);
                setVisible(false);
            }
        });

        // Event ButtonSelect2
        buttonSelect2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                String template2 = "Image/nam2/A.png";

                Location_Card LC = new Location_Card();
                AllFontCard allfontcard = new AllFontCard();
                MyForm6 form6 = new MyForm6(template2,profile,LC.Card2(),Tname,Color.white,allfontcard.Card2());


                form6.setVisible(true);
                setVisible(false);
            }
        });

        // Event ButtonSelect3
        buttonSelect3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String template3 = "Image/nam3/A.png";

                Location_Card LC = new Location_Card();
                AllFontCard allfontcard = new AllFontCard();
                MyForm6 form6 = new MyForm6(template3,profile,LC.Card3(),Tname,Color.BLACK,allfontcard.Card3());


                form6.setVisible(true);
                setVisible(false);
            }
        });
        buttonclose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setVisible(false);

            }
        });

        buttonback.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                MyForm2 form2 = new MyForm2(Tname);
                form2.setVisible(true);

            }
        });

    }
    }

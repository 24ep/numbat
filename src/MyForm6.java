import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class MyForm6 extends JFrame {
    private int i ;

    public MyForm6(String template, String[]profile, int[][] card,String Tname,Object Colorsfont,Font[]fontcard) {


// Create Form Frame
        super("Nambut");
        setSize(1650, 900);
        setLocation(100, 50);
        setUndecorated(true);
        ImageIcon img = new ImageIcon("Image/image/icon.png");
        setIconImage(img.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
// Font
        AllFont Font = new AllFont();
// JLayerPane
        JLayeredPane layeredPane = getLayeredPane();


// insert DATA



        // Create label background

        JLabel background = new JLabel();
        background.setIcon(new ImageIcon("Image/background/Frame6.jpg"));
        background.setBounds(0,0,2000,1500);
        layeredPane.add(background, new Integer(0));



        // Create Label Profile
        JLabel labelDATA = new JLabel();
        labelDATA.setText("S   A   V   E");
        labelDATA.setForeground(Color.WHITE);
        labelDATA.setFont(Font.Profile);
        labelDATA.setBounds(150, 80, 400, 30);
        layeredPane.add(labelDATA, new Integer(3));;

        // Create Label Underscore

        JLabel labelUDS = new JLabel();
        labelUDS.setText("_______________________________________________________________________________________________________");
        labelUDS.setForeground(Color.WHITE);
        labelUDS.setFont(Font.under);
        labelUDS.setBounds(150, 115,2000, 30);
        layeredPane.add(labelUDS, new Integer(2));


            // Create label background
            JLabel backgroundcard = new JLabel();
            backgroundcard.setIcon(new ImageIcon(template));
            backgroundcard.setBounds(card[6][0],card[6][1],card[6][2],card[6][3]);
            layeredPane.add(backgroundcard, new Integer(2));


            // Create initial
            JLabel initial = new JLabel();
        initial.setText(profile[8].toUpperCase());
        initial.setForeground((Color) Colorsfont);
        initial.setBounds(card[7][0],card[7][1],card[7][2],card[7][3]);
        initial.setFont( fontcard[4]);
        initial.setVerticalAlignment(SwingConstants.CENTER);
        layeredPane.add(initial, new Integer(3));



            // Create Label Name
            JLabel name = new JLabel();
            name.setText(profile[0].toUpperCase());
            name.setForeground((Color) Colorsfont);
            name.setBounds(card[0][0],card[0][1],card[0][2],card[0][3]);
            name.setFont(fontcard[1]);
            name.setVerticalAlignment(SwingConstants.CENTER);
            layeredPane.add(name, new Integer(3));

             // Create Label Position
            JLabel Position = new JLabel();
            Position.setText(profile[2]);
            Position.setForeground((Color) Colorsfont);
            Position.setBounds(card[1][0],card[1][1],card[1][2],card[1][3]);
            Position.setFont(fontcard[3]);
            layeredPane.add(Position, new Integer(3));

            // Create Label Company
            JLabel company = new JLabel();
            company.setText(profile[1]);
            company.setForeground((Color) Colorsfont);
            company.setBounds(card[2][0],card[2][1],card[2][2],card[2][3]);
            company.setFont(fontcard[2]);
            layeredPane.add(company, new Integer(3));


            // Create Label tell
            JLabel tell = new JLabel();
            tell.setText(profile[4]);
            tell.setForeground((Color) Colorsfont);
            tell.setBounds(card[3][0],card[3][1],card[3][2],card[3][3]);
            tell.setFont(fontcard[0]);
            layeredPane.add(tell, new Integer(3));

            // Create Label Email
            JLabel email = new JLabel();
            email.setText(profile[3]);
            email.setForeground((Color) Colorsfont);
            email.setBounds(card[4][0],card[4][1],card[4][2],card[4][3]);
            email.setFont(fontcard[0]);
            layeredPane.add(email, new Integer(3));

        // Create Label Website

            JLabel website = new JLabel();
            website.setText(profile[5]);
            website.setForeground((Color) Colorsfont);
            website.setBounds(card[8][0],card[8][1],card[8][2],card[8][3]);
            website.setFont(fontcard[0]);
            layeredPane.add(website, new Integer(3));

            // Create Label address
            JLabel address = new JLabel();
            address.setText(profile[6]);
            address.setForeground((Color) Colorsfont);
            address.setFont(fontcard[0]);
            address.setBounds(card[5][0],card[5][1],card[5][2],card[5][3]);
            layeredPane.add(address, new Integer(3));

        //Label filename
        JLabel labelFilename = new JLabel();
        labelFilename.setText("FILE NAME");
        labelFilename.setFont(Font.labelprofri);
        labelFilename.setForeground(Color.black);
        labelFilename.setBounds(1150, 260,100, 30);
        layeredPane.add(labelFilename, new Integer(2));

        // textfield filename
        JTextField TFilename = new JTextField("EX.BusinessCard1",20);
        TFilename.setBounds(1150, 300, 250, 25);
        TFilename.setFont(Font.TextfieldProfri);
        TFilename.setCaretColor(Color.BLACK);
        TFilename.setForeground(Color.DARK_GRAY);
        TFilename.setOpaque(false);
        TFilename.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        layeredPane.add(TFilename, new Integer(2));

        JLabel label_filename = new JLabel("__________________________________");
        label_filename.setFont(Font.under);
        label_filename.setForeground(Color.black);
        label_filename.setBounds(1150, 305, 450, 30);
        layeredPane.add(label_filename, new Integer(2));


        //Create ButtonSave
        JButton buttonSave = new JButton();
        buttonSave.setBounds(1300, 335, 400, 100);
        buttonSave.setFocusPainted(false);
        buttonSave.setOpaque(false);
        buttonSave.setContentAreaFilled(false);
        buttonSave.setBorderPainted(false);
        buttonSave.setIcon(new ImageIcon("Image/Bt/btsave.png"));
        layeredPane.add(buttonSave, new Integer(3));

        //Create Buttontest
        JButton buttontest = new JButton();
        buttontest.setFont(Font.AllButton);
        buttontest.setBounds(600, 810,30, 30);
        buttontest.setFocusPainted(false);
        buttontest.setOpaque(false);
        buttontest.setContentAreaFilled(false);
        buttontest.setBorderPainted(false);
        buttontest.setIcon(new ImageIcon("Image/Bt/next.jpg"));
        layeredPane.add(buttontest, new Integer(2));

        JButton buttonback = new JButton();
        buttonback.setFont(Font.AllButton);
        buttonback.setBounds(550, 810, 30, 30);
        buttonback.setFocusPainted(false);
        buttonback.setOpaque(false);
        buttonback.setContentAreaFilled(false);
        buttonback.setBorderPainted(false);
        buttonback.setIcon(new ImageIcon("Image/Bt/ST.jpg"));
        layeredPane.add(buttonback, new Integer(2));


        JButton buttonopenfile = new JButton();
        buttonopenfile.setFont(Font.AllButton);
        buttonopenfile.setBounds(650, 810, 30, 30);
        buttonopenfile.setFocusPainted(false);
        buttonopenfile.setOpaque(false);
        buttonopenfile.setContentAreaFilled(false);
        buttonopenfile.setBorderPainted(false);
        buttonopenfile.setIcon(new ImageIcon("Image/Bt/openfile.jpg"));
        layeredPane.add(buttonopenfile, new Integer(2));


        JLabel background2 = new JLabel();
        background2.setIcon(new ImageIcon("Image/image/la.png"));
        background2.setBounds(0,200,1700,895);
        layeredPane.add(background2, new Integer(1));



        JButton buttonclose = new JButton("X");
        buttonclose.setOpaque(false);
        buttonclose.setContentAreaFilled(false);
        buttonclose.setBorderPainted(false);
        buttonclose.setFocusPainted(false);
        buttonclose.setForeground(Color.white);
        buttonclose.setFont(Font.labelprofri);
        buttonclose.setBounds(1570,10,100,30);
        layeredPane.add(buttonclose, new Integer(2));




//if chang

        String template3 = "Image/nam3/A.png";
        if(Objects.equals(template, template3)) {

            name.setHorizontalAlignment(SwingConstants.CENTER);
            name.setVerticalAlignment(SwingConstants.CENTER);

            Position.setHorizontalAlignment(SwingConstants.CENTER);
            Position.setVerticalAlignment(SwingConstants.CENTER);

            tell.setHorizontalAlignment(SwingConstants.CENTER);
            tell.setVerticalAlignment(SwingConstants.CENTER);

            email.setHorizontalAlignment(SwingConstants.CENTER);
            email.setVerticalAlignment(SwingConstants.CENTER);

            website.setHorizontalAlignment(SwingConstants.CENTER);
            website.setVerticalAlignment(SwingConstants.CENTER);
        }

// Event ButtonSave
        buttonSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String Filename = TFilename.getText();

                buttonSave.setIcon(new ImageIcon("Image/Bt/btsave.gif"));
                        try {
                            i++;
                            Robot robot = new Robot();
                            String format = "jpg";
                            if(Objects.equals(TFilename.getText(), "EX.BusinessCard1")) {
                                Filename = "businessCard" + i ;
                            }
                            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                            Rectangle captureRect = new Rectangle(320,310,850,510);
                            BufferedImage screenFullImage = robot.createScreenCapture(captureRect);
                            ImageIO.write(screenFullImage, format, new File("Business Card/"+Filename+"."+format));

                        } catch (AWTException | IOException ex) {
                            System.err.println(ex);
                        }

                    }

    });

        buttontest.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String template1 = "Image/nam1/A.png";
                String template2 = "Image/nam2/A.png";
                String template3 = "Image/nam3/A.png";

                String template1back = "Image/nam1/B.png";
                String template2back = "Image/nam2/B.png";
                String template3back = "Image/nam3/B.png";

                buttonSave.setIcon(new ImageIcon("Image/Bt/btsave.png"));

                if(Objects.equals(template, template1)) {

                    backgroundcard.setIcon(new ImageIcon(template1back)) ;

                    company.setText(profile[1].toUpperCase());
                    company.setBounds(220,260,850,510);
                    company.setHorizontalAlignment(SwingConstants.CENTER);
                    company.setVerticalAlignment(SwingConstants.CENTER);
                    company.setForeground(Color.DARK_GRAY);
                    company.setFont(Font.labelnamecard1B);
                    Position.setText("");
                    name.setText("");
                    tell.setText("");
                    email.setText("");
                    address.setText("");

                }

                else if(Objects.equals(template, template2)) {
                    backgroundcard.setIcon(new ImageIcon(template2back));
                    name.setText(profile[0].toUpperCase());
                    name.setBounds(260,570,400,300);
                    name.setForeground(Color.WHITE);
                    name.setFont(Font.labelnamecard2B);
                    Position.setText("");
                    company.setText("");
                    tell.setText("");
                    email.setText("");
                    address.setText("");
                    initial.setText("");
                }

                else if(Objects.equals(template, template3)) {
                    backgroundcard.setIcon(new ImageIcon(template3back));
                    name.setText(profile[0]);
                    name.setBounds(220,440,850,150);
                    name.setForeground(Color.black);
                    name.setFont(Font.Nambutcard3);
                    name.setHorizontalAlignment(SwingConstants.CENTER);
                    name.setVerticalAlignment(SwingConstants.CENTER);
                    Position.setText(profile[2].toUpperCase());
                    Position.setBounds(220,550,850,30);
                    Position.setForeground(Color.DARK_GRAY);
                    Position.setHorizontalAlignment(SwingConstants.CENTER);
                    Position.setVerticalAlignment(SwingConstants.CENTER);
                    Position.setFont(Font.pscard3);
                    company.setText("");
                    tell.setText("");
                    email.setText("");
                    address.setText("");
                    initial.setText("");
                    website.setText("");
                }

            }
        });
        buttonclose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setVisible(false);

            }
        });
        buttonback.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonSave.setIcon(new ImageIcon("Image/Bt/btsave.png"));
                setVisible(false);
                MyForm5 form5 = new MyForm5(profile,Tname);
                form5.setVisible(true);
            }
        });

        buttonopenfile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().open(new File("Business Card/"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });



    }


}
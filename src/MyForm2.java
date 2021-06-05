import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class MyForm2 extends JFrame {
    public MyForm2 (String Tname) {


// Create Form Frame
        super("Nambut");
        setSize(600, 900);
        setLocation(650, 100);
        setResizable(false);
        ImageIcon img = new ImageIcon("Image/image/icon.png");
        setIconImage(img.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
// Font
        AllFont Font = new AllFont();



        // layeredPane
        JLayeredPane layeredPane = getLayeredPane();

// Create label background

        JLabel background = new JLabel();
        background.setIcon(new ImageIcon("Image/background/11.jpg"));
        background.setBounds(0,0,600,900);
        layeredPane.add(background, new Integer(1)) ;
// Create Label Hi name

        JLabel labelHi = new JLabel();
        labelHi.setText("Hi !  "+Tname);
        labelHi.setFont(Font.Hello_name);
        labelHi.setForeground(Color.WHITE);
        labelHi.setBounds(100, 30, 200, 30);
        layeredPane.add(labelHi, new Integer(2));
// Create Label Underscore

        JLabel labelUDS = new JLabel();
        labelUDS.setText("______________________________");
        labelUDS.setForeground(Color.WHITE);
        labelUDS.setFont(Font.under);
        labelUDS.setBounds(100, 40,400, 30);
        layeredPane.add(labelUDS, new Integer(2));



 // insert DATA
//------------------------------------------------------------------------------------
        // Create Label Profile
        JLabel labelDATA = new JLabel();
        labelDATA.setText("P   R   O   F   I   L   E");
        labelDATA.setFont(Font.Profile);
        labelDATA.setForeground(Color.WHITE);
        labelDATA.setBounds(100,100,400,30);
        layeredPane.add(labelDATA, new Integer(2));

        // Select Title
//---------------------------------------------------------------------------------------
        JRadioButton Ms,Mrs,Mr,Miss,Dr;

        ButtonGroup Title = new ButtonGroup();
        Ms = new JRadioButton("Ms.",true);
        Mrs = new JRadioButton("Mrs.");
        Mr = new JRadioButton("Mr.");
        Miss = new JRadioButton("Miss.");
        Dr = new JRadioButton("Dr.");

        Ms.setForeground(Color.WHITE);
        Mrs.setForeground(Color.WHITE);
        Mr.setForeground(Color.WHITE);
        Miss.setForeground(Color.WHITE);
        Dr.setForeground(Color.WHITE);

        Ms.setOpaque(false);
        Mrs.setOpaque(false);
        Mr.setOpaque(false);
        Miss.setOpaque(false);
        Dr.setOpaque(false);

        Ms.setFont(Font.TextfieldProfri);
        Mrs.setFont(Font.TextfieldProfri);
        Mr.setFont(Font.TextfieldProfri);
        Miss.setFont(Font.TextfieldProfri);
        Dr.setFont(Font.TextfieldProfri);

        Ms.setBounds(150,160,70,30);
        Mrs.setBounds(220,160,70,30);
        Mr.setBounds(290,160,70,30);
        Miss.setBounds(360,160,70,30);
        Dr.setBounds(436,160,70,30);

        Ms.setFocusPainted(false);
        Mr.setFocusPainted(false);
        Mrs.setFocusPainted(false);
        Miss.setFocusPainted(false);
        Dr.setFocusPainted(false);

        Title.add(Ms);
        Title.add(Mrs);
        Title.add(Mr);
        Title.add(Miss);
        Title.add(Dr);

        layeredPane.add(Ms, new Integer(2));
        layeredPane.add(Mrs, new Integer(2));
        layeredPane.add(Mr, new Integer(2));
        layeredPane.add(Miss, new Integer(2));
        layeredPane.add(Dr, new Integer(2));

//------------------------------------------------------------------------------------
        // NAME
        JTextField TFirst_name = new JTextField("Enter your First name and Last name ",30);
        TFirst_name.setBounds(100, 220, 400, 25);
        TFirst_name.setCaretColor(Color.white);
        TFirst_name.setFont(Font.TextfieldProfri);
        TFirst_name.setForeground(Color.cyan);
        TFirst_name.setOpaque(false);
        TFirst_name.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        layeredPane.add(TFirst_name, new Integer(2));

        JLabel label_Name = new JLabel("______________________________");
        label_Name.setFont(Font.under);
        label_Name.setForeground(Color.WHITE);
        label_Name.setBounds(100, 225, 400, 30);
        layeredPane.add(label_Name, new Integer(2));
//-----------------------------------------------------------------------------------
        // Company
        JTextField TCompany = new JTextField("Enter your Company",20);
        TCompany.setBounds(100, 290, 250, 25);
        TCompany.setFont(Font.TextfieldProfri);
        TCompany.setForeground(Color.cyan);
        TCompany.setCaretColor(Color.white);
        TCompany.setOpaque(false);
        TCompany.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        layeredPane.add(TCompany, new Integer(2));

        JLabel label_Company = new JLabel("______________________________");
        label_Company.setFont(Font.under);
        label_Company.setForeground(Color.WHITE);
        label_Company.setBounds(100, 295, 400, 30);
        layeredPane.add(label_Company, new Integer(2));
//---------------------------------------------------------------------------------
        // Position
        JTextField TPosition = new JTextField("Enter your Position",20);
        TPosition.setBounds(100, 360, 250, 25);
        TPosition.setFont(Font.TextfieldProfri);
        TPosition.setCaretColor(Color.white);
        TPosition.setForeground(Color.cyan);
        TPosition.setOpaque(false);
        TPosition.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        layeredPane.add(TPosition, new Integer(2));

        JLabel label_Position = new JLabel("______________________________");
        label_Position.setFont(Font.under);
        label_Position.setForeground(Color.WHITE);
        label_Position.setBounds(100, 365, 400, 30);
        layeredPane.add(label_Position, new Integer(2));
//------------------------------------------------------------------------------
        // Email
        JTextField TEmail = new JTextField("Enter you Email",20);
        TEmail.setBounds(100, 430, 250, 25);
        TEmail.setFont(Font.TextfieldProfri);
        TEmail.setCaretColor(Color.white);
        TEmail.setForeground(Color.cyan);
        TEmail.setOpaque(false);
        TEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        layeredPane.add(TEmail, new Integer(2));

        JLabel label_Email = new JLabel("______________________________");
        label_Email.setFont(Font.under);
        label_Email.setForeground(Color.WHITE);
        label_Email.setBounds(100, 435, 400, 30);
        layeredPane.add(label_Email, new Integer(2));

//--------------------------------------------------------------------------------
        // Tell
        JTextField TTell = new JTextField("Enter you number-phone",20);
        TTell.setBounds(100, 500, 250, 25);
        TTell.setFont(Font.TextfieldProfri);
        TTell.setCaretColor(Color.white);
        TTell.setForeground(Color.cyan);
        TTell.setOpaque(false);
        TTell.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        layeredPane.add(TTell, new Integer(2));

        JLabel label_Tell = new JLabel("______________________________");
        label_Tell.setFont(Font.under);
        label_Tell.setForeground(Color.WHITE);
        label_Tell.setBounds(100, 505, 400, 30);
        layeredPane.add(label_Tell, new Integer(2));;

//-------------------------------------------------------------------------------
        // Website
        JTextField TWebsite = new JTextField("Enter you website",20);
        TWebsite.setBounds(100, 570, 250, 25);
        TWebsite.setFont(Font.TextfieldProfri);
        TWebsite.setCaretColor(Color.white);
        TWebsite.setForeground(Color.cyan);
        TWebsite.setOpaque(false);
        TWebsite.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        layeredPane.add(TWebsite, new Integer(2));

        JLabel label_Website = new JLabel("______________________________");
        label_Website.setFont(Font.under);
        label_Website.setForeground(Color.WHITE);
        label_Website.setBounds(100, 575, 400, 30);
        layeredPane.add(label_Website, new Integer(2));

 //---------------------------------------------------------------------------
        //Address
        JTextField TAddress = new JTextField("Enter you Address",20);
        TAddress.setBounds(100, 640, 250, 25);
        TAddress.setFont(Font.TextfieldProfri);
        TAddress.setForeground(Color.cyan);
        TAddress.setCaretColor(Color.white);
        TAddress.setOpaque(false);
        TAddress.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        layeredPane.add(TAddress, new Integer(2));

        JLabel label_Address = new JLabel("______________________________");
        label_Address.setFont(Font.under);
        label_Address.setForeground(Color.WHITE);
        label_Address.setBounds(100, 645, 400, 30);
        layeredPane.add(label_Address, new Integer(2));

//-------------------------------------------------------------------------------
        // AboutUs
        JTextField TAboutus = new JTextField("Briefly describe you or your organization",30);
        TAboutus.setBounds(100, 710, 400, 25);
        TAboutus.setFont(Font.TextfieldProfri);
        TAboutus.setForeground(Color.cyan);
        TAboutus.setCaretColor(Color.white);
        TAboutus.setOpaque(false);
        TAboutus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        layeredPane.add(TAboutus, new Integer(2));

        JLabel label_Aboutus = new JLabel("______________________________");
        label_Aboutus.setFont(Font.under);
        label_Aboutus.setForeground(Color.WHITE);
        label_Aboutus.setBounds(100, 715, 400, 30);
        layeredPane.add(label_Aboutus, new Integer(2));

//--------------------------------------------------------------------------

// Label list name
        //sTitle
        JLabel labelTitle = new JLabel();
        labelTitle.setText("TITLE");
        labelTitle.setFont(Font.labelprofri);
        labelTitle.setForeground(Color.WHITE);
        labelTitle.setBounds(100, 160,100, 30);
        layeredPane.add(labelTitle, new Integer(2));
        //First name
        JLabel labelFirstName = new JLabel();
        labelFirstName.setText("NAME");
        labelFirstName.setFont(Font.labelprofri);
        labelFirstName.setForeground(Color.WHITE);
        labelFirstName.setBounds(100,190,100,30);
        layeredPane.add(labelFirstName, new Integer(2));
        //company name
        JLabel labelCompany = new JLabel();
        labelCompany.setText("COMPANY");
        labelCompany.setFont(Font.labelprofri);
        labelCompany.setForeground(Color.WHITE);
        labelCompany.setBounds(100,260,100,30);
        layeredPane.add(labelCompany, new Integer(2));
        //Position
        JLabel labelPosition = new JLabel();
        labelPosition.setText("POSITION");
        labelPosition.setFont(Font.labelprofri);
        labelPosition.setForeground(Color.WHITE);
        labelPosition.setBounds(100,330,100,30);
        layeredPane.add(labelPosition, new Integer(2));
        // Email
        JLabel labelEmail = new JLabel();
        labelEmail.setText("EMAIL");
        labelEmail.setFont(Font.labelprofri);
        labelEmail.setForeground(Color.WHITE);
        labelEmail.setBounds(100,400,100,30);
        layeredPane.add(labelEmail, new Integer(2));
        // Tell
        JLabel labelTell = new JLabel();
        labelTell.setText("TELL");
        labelTell.setFont(Font.labelprofri);
        labelTell.setForeground(Color.WHITE);
        labelTell.setBounds(100,470,100,30);
        layeredPane.add(labelTell, new Integer(2));
        //Web-site
        JLabel labelWebsite = new JLabel();
        labelWebsite.setText("WEBSITE");
        labelWebsite.setFont(Font.labelprofri);
        labelWebsite.setForeground(Color.WHITE);
        labelWebsite.setBounds(100,540,100,30);
        layeredPane.add(labelWebsite, new Integer(2));
        //address
        JLabel labelAddress = new JLabel();
        labelAddress.setText("ADDRESS");
        labelAddress.setFont(Font.labelprofri);
        labelAddress.setForeground(Color.WHITE);
        labelAddress.setBounds(100,610,100,30);
        layeredPane.add(labelAddress, new Integer(2));
        //Aboutus
        JLabel labelAboutus = new JLabel();
        labelAboutus.setText("ABOUT US");
        labelAboutus.setFont(Font.labelprofri);
        labelAboutus.setForeground(Color.WHITE);
        labelAboutus.setBounds(100,680,100,30);
        layeredPane.add(labelAboutus, new Integer(2));
//-----------------------------------------------------------------------
        //IF can not next form
        JLabel labelcannotnext = new JLabel();
        labelcannotnext.setText("");
        labelcannotnext.setFont(Font.TextfieldProfri);
        labelcannotnext.setForeground(Color.RED);
        labelcannotnext.setBounds(290,760,200,30);
        layeredPane.add(labelcannotnext, new Integer(2));


//--------------------------------------------------------------------------
// ButtonNext
        // Button
        JButton buttonNext = new JButton("Next");
        buttonNext.setFont(Font.TextfieldProfri);
        buttonNext.setForeground(Color.white);
        buttonNext.setBackground(new java.awt.Color(36, 47, 65));
        buttonNext.setFocusPainted(false);
        buttonNext.setBounds(100,760,80,30);
        layeredPane.add(buttonNext, new Integer(2));

// ButtonClear
        // Button
        JButton buttonClear = new JButton("Clear");
        buttonClear.setFont(Font.TextfieldProfri);
        buttonClear.setForeground(Color.white);
        buttonClear.setBackground(new java.awt.Color(36, 47, 65));
        buttonClear.setBounds(190,760,80,30);
        buttonClear.setFocusPainted(false);
        layeredPane.add(buttonClear, new Integer(2));

//----------------------------------------------------------------------------
// Event ButtonNext
        buttonNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setdata setdata = new setdata();

                setdata.setTTell(TTell.getText());
                TTell.setText(setdata.getTTell());

                setdata.setTFristname(TFirst_name.getText());
                TFirst_name.setText(setdata.getTFristname());

                if (Objects.equals(TFirst_name.getText(), "")
                        | Objects.equals(TCompany.getText(), "")
                        | Objects.equals(TPosition.getText(), "")
                        | Objects.equals(TTell.getText(), "")
                        | Objects.equals(TWebsite.getText(), "")
                        | Objects.equals(TAboutus.getText(), "")
                        | Objects.equals(TAddress.getText(), "")
                        | Objects.equals(TEmail.getText(), "")

                        | Objects.equals(TFirst_name.getText(), "Enter your First name and Last name ")
                        | Objects.equals(TCompany.getText(), "Enter your Company")
                        | Objects.equals(TPosition.getText(), "Enter your Position")
                        | Objects.equals(TTell.getText(), "Enter you number-phone")
                        | Objects.equals(TWebsite.getText(), "Enter you website")
                        | Objects.equals(TAboutus.getText(), "Briefly describe you or your organization")
                        | Objects.equals(TAddress.getText(), "Enter you Address")
                        | Objects.equals(TEmail.getText(), "Enter you Email")

                        | Objects.equals(Title.getSelection(), null)


                        ) {
                    labelcannotnext.setText("* Please complete the form");
                } else {
                    ButtonModel Ptitle = Title.getSelection();
                    String Pname = TFirst_name.getText();
                    String Pcompany = TCompany.getText();
                    String Pposittion = TPosition.getText();
                    String Pemail = TEmail.getText();
                    String PTell = TTell.getText();
                    String PWebsite = TWebsite.getText();
                    String Paddress = TAddress.getText();
                    String Pabout = TAboutus.getText();
                    //--------------------------------------
                    //create ตัวย่อซื่อ

                    int i = Pname.indexOf(" ");
                    String f = String.valueOf(Pname.charAt(0));
                    String b = String.valueOf(Pname.charAt(i + 1));
                    String lbc2n = f + b;
                    String lbc2nup = lbc2n.toUpperCase();
//-----------------------------------------------------------------------------------------------------------------------
                    String[] profile = new String[]{Pname, Pcompany, Pposittion, Pemail, PTell, PWebsite, Paddress, Pabout, lbc2nup};
                    MyForm5 form5 = new MyForm5(profile, Tname);
                    form5.setVisible(true);
                    setVisible(false);
                }
            }
        });
// Event ButtonClear
        buttonClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Title.clearSelection();
                TFirst_name.setText("");
                TCompany.setText("");
                TPosition.setText("");
                TEmail.setText("");
                TTell.setText("");
                TWebsite.setText("");
                TAddress.setText("");
                TAboutus.setText("");

            }
        });

    }

}

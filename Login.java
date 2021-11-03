import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    
    JPanel panPricipale;
    JPanel gauche;
    JPanel droite;

    public Login(){
        setTitle("Test");
        setSize(1050, 580);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
        setLayout(null);
        pack();
        setVisible(true);

        setMinimumSize(new Dimension(1050,580));
        
        
        
        FrameDragListener drag = new FrameDragListener(this);
        addMouseListener(drag);
        
        addMouseMotionListener(drag);
        
        panPricipale = (JPanel) this.getContentPane();
        panPricipale.setLayout(new GridLayout(1,2));

        


        gauche = createImgPart();
        
        panPricipale.add(gauche);

        droite = createLogin();
        
        panPricipale.add(droite);

        
    }


    public JPanel createImgPart(){
        JPanel imgContainer = new JPanel();
        imgContainer.setLayout(new BorderLayout());
        ImageIcon img = new ImageIcon("wallpaper.jpg");
        JLabel contImg = new JLabel();
        contImg.setIcon(img);
        
        JPanel bar = new JPanel();
        bar.setBackground(Color.decode("#1f5022"));
        bar.setLayout(null);
        bar.setPreferredSize(new Dimension(400,50));
        imgContainer.add(bar);
        imgContainer.add(contImg);

        

        

        return imgContainer;
    }

    public JPanel createLogin(){
        JPanel container = new JPanel();
        container.setLayout(new BorderLayout());

        JPanel bar = new JPanel();
        bar.setBackground(Color.decode("#1f2022"));
        bar.setLayout(new FlowLayout(FlowLayout.RIGHT,0,0));
        bar.setPreferredSize(new Dimension(400,50));

        JPanel close = new JPanel();
        close.setLayout(new FlowLayout(FlowLayout.CENTER,0,13));
        close.setBackground(Color.decode("#1f2022"));
        close.setPreferredSize(new Dimension(50,50));


        JButton imgClose = new JButton();
        imgClose.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                
            }
        });
       
        ImageIcon img = new ImageIcon("cancel.png");
        imgClose.setPreferredSize(new Dimension(24,24));
        imgClose.setIcon(img);
        imgClose.setBackground(Color.decode("#1f2022"));
        imgClose.setBorder(null);

        close.add(imgClose);

        JPanel reduire = new JPanel();
        close.setLayout(new FlowLayout(FlowLayout.CENTER,0,13));
        close.setBackground(Color.decode("#1f2022"));
        close.setPreferredSize(new Dimension(50,50));


        JButton imgReduire = new JButton();
        imgReduire.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                setState(Frame.ICONIFIED); 
            }
        });
       
        ImageIcon imgMinus = new ImageIcon("minus.png");
        imgReduire.setPreferredSize(new Dimension(24,24));
        imgReduire.setIcon(imgMinus);
        imgReduire.setBackground(Color.decode("#1f2022"));
        imgReduire.setBorder(null);

        reduire.add(imgReduire);
        reduire.setLayout(new FlowLayout(FlowLayout.CENTER,0,13));
        reduire.setBackground(Color.decode("#1f2022"));
        reduire.setPreferredSize(new Dimension(50,50));

        reduire.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        bar.add(reduire);
        bar.add(close);
        

        container.add(bar, BorderLayout.NORTH);

        JPanel containerLogin = new JPanel();
        containerLogin.setBackground(Color.decode("#1f2022"));
        containerLogin.add(createLoginForm());
        container.add(containerLogin);

        return container;
    }
    public JPanel createLoginForm(){
        JPanel loginContainer = new JPanel();
        
        loginContainer.setBackground(Color.decode("#1f2022"));

    
        


        JPanel form = new JPanel();
        System.out.println(loginContainer.getHeight());
        form.setLayout(new GridLayout(4,1));

        JPanel panName = new JPanel();
        JLabel txtName = new JLabel("Name");
        txtName.setForeground(Color.LIGHT_GRAY);
        txtName.setPreferredSize(new Dimension(400,10));
        JTextField fieldName = new JTextField();
        fieldName.setPreferredSize(new Dimension(400,30));
        fieldName.setBackground(null);
        fieldName.setBorder(null);
        fieldName.setForeground(Color.WHITE);
        
        JSeparator separatorName = new JSeparator();
        separatorName.setPreferredSize(new Dimension(400,2));
        panName.add(txtName);
        panName.add(fieldName);
        panName.add(separatorName);
        
        panName.setBackground(Color.decode("#1f2022"));

        JPanel panEmail = new JPanel();

        JLabel txtEmail = new JLabel("Email");
        txtEmail.setForeground(Color.LIGHT_GRAY);
        txtEmail.setPreferredSize(new Dimension(400,10));
        JTextField fieldEmail = new JTextField();
        fieldEmail.setPreferredSize(new Dimension(400,30));
        fieldEmail.setBackground(null);
        fieldEmail.setBorder(null);
        fieldEmail.setForeground(Color.WHITE);
        JSeparator separatorEmail = new JSeparator();
        separatorEmail.setPreferredSize(new Dimension(400,2));
        panEmail.add(txtEmail);
        panEmail.add(fieldEmail);
        panEmail.add(separatorEmail);

      panEmail.setBackground(Color.decode("#1f2022"));

        JPanel panPassword = new JPanel();

        JLabel txtPassword = new JLabel("Password");
        txtPassword.setForeground(Color.LIGHT_GRAY);
        txtPassword.setPreferredSize(new Dimension(400,10));
        JPasswordField fieldPassword = new JPasswordField();
        fieldPassword.setPreferredSize(new Dimension(400,30));
        fieldPassword.setBackground(null);
        fieldPassword.setBorder(null);
        fieldPassword.setForeground(Color.WHITE);
        JSeparator separatorPassword = new JSeparator();
        separatorPassword.setPreferredSize(new Dimension(400,2));
        panPassword.add(txtPassword);
        panPassword.add(fieldPassword);
        panPassword.add(separatorPassword);
        panPassword.setBackground(Color.decode("#1f2022"));


        JPanel panConnect = new JPanel();
        panConnect.setLayout(new FlowLayout( FlowLayout.CENTER,0, 20));
        JButton connect = new JButton("Sign up");
        
        connect.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Name = " + fieldName.getText());
                System.out.println("Email = " +fieldEmail.getText());
                System.out.print("Password = ");
                System.out.println( fieldPassword.getPassword());
                Object[] options = {"OK"};
            int n = JOptionPane.showOptionDialog(null,
                "You can now sign in",
                "Notification",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]); 
            }
        });

        
        connect.setPreferredSize(new Dimension(400,50));
        connect.setBackground(Color.decode("#7d56bf"));
        connect.setForeground(Color.WHITE);

        connect.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        panConnect.add(connect);
        panConnect.setBackground(Color.decode("#1f2022"));

        form.add(panName);
        form.add(panEmail);
        form.add(panPassword);
        form.add(panConnect);
        form.setPreferredSize(new Dimension(400,300));
        form.setBackground(Color.decode("#1f2022"));
        
        loginContainer.setLayout(new FlowLayout( FlowLayout.CENTER,0, 80));
        loginContainer.add(form);
        return loginContainer;
    }



        public static class FrameDragListener extends MouseAdapter {

            private final JFrame frame;
            private Point mouseDownCompCoords = null;
    
            public FrameDragListener(JFrame frame) {
                this.frame = frame;
            }
    
            public void mouseReleased(MouseEvent e) {
                mouseDownCompCoords = null;
            }
    
            public void mousePressed(MouseEvent e) {
                mouseDownCompCoords = e.getPoint();
            }
    
            public void mouseDragged(MouseEvent e) {
                Point currCoords = e.getLocationOnScreen();
                //System.out.println(mouseDownCompCoords.y +" " +mouseDownCompCoords.x);
                if(mouseDownCompCoords.y <= 50){
                    frame.setLocation(currCoords.x  - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
                }
                
            }
        }






    public static void main(String [] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Login();
            }
        });
        
     }
}

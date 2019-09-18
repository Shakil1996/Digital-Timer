/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitaltimer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author w1549747
 */
public class DigitalTime extends javax.swing.JFrame {

    /**
     * Creates new form DigitalTime
     */
        Timer Date = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
            Date currentDate = new Date();
            lbl_Date.setText(currentDate.toString());
            }
        });
    
        Timer Time1 = new Timer (100, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) {
    int digit = Integer.parseInt(digitValue.getText());
    digit = digit + 1;
    String value = Integer.toString(digit);
    digitValue.setText(value);

    int digit1 = Integer.parseInt(digitValue.getText());
    if (digit1 == 0) {
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(true);
        Middle.setVisible(false);
        BottomLeft.setVisible(true);
        TopLeft.setVisible(true);
        TopRight.setVisible(true);
        }
        if (digit1 == 1) {
        Top.setVisible(false);
        BottomRight.setVisible(false);
        Bottom.setVisible(false);
        Middle.setVisible(false);
        BottomLeft.setVisible(true);
        TopLeft.setVisible(true);
        TopRight.setVisible(false);  
        }
        if (digit1 == 2) {
        Top.setVisible(true);
        BottomRight.setVisible(false);
        Bottom.setVisible(true);
        Middle.setVisible(true);
        BottomLeft.setVisible(true);
        TopLeft.setVisible(false);
        TopRight.setVisible(true);  
        }      
        if (digit1 == 3) {
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(true);
        Middle.setVisible(true);
        BottomLeft.setVisible(false);
        TopLeft.setVisible(false);
        TopRight.setVisible(true);       
        }
        if (digit1 == 4) {
        Top.setVisible(false);
        BottomRight.setVisible(true);
        Bottom.setVisible(false);
        Middle.setVisible(true);
        BottomLeft.setVisible(false);
        TopLeft.setVisible(true);
        TopRight.setVisible(true);  
        }
        if (digit1 == 5) {
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(true);
        Middle.setVisible(true);
        BottomLeft.setVisible(false);
        TopLeft.setVisible(true);
        TopRight.setVisible(false);  
        }
        if (digit1 == 6) {
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(true);
        Middle.setVisible(true);
        BottomLeft.setVisible(true);
        TopLeft.setVisible(true);
        TopRight.setVisible(false);  
        }
        if (digit1 == 7) {
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(false);
        Middle.setVisible(false);
        BottomLeft.setVisible(false);
        TopLeft.setVisible(false);
        TopRight.setVisible(true);  
        }
        if (digit1 == 8) {
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(true);
        Middle.setVisible(true);
        BottomLeft.setVisible(true);
        TopLeft.setVisible(true);
        TopRight.setVisible(true);  
        }
        if (digit1 == 9) {
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(true);
        Middle.setVisible(true);
        BottomLeft.setVisible(false);
        TopLeft.setVisible(true);
        TopRight.setVisible(true);  
        }
        if (digit1 >= 10) {
            digit1 = digit1 - 10;
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(true);
        Middle.setVisible(false);
        BottomLeft.setVisible(true);
        TopLeft.setVisible(true);
        TopRight.setVisible(true);  
        }
    String value2 = Integer.toString(digit1);
    digitValue.setText(value2);
    
    int onesSeconds = Integer.parseInt(OnesSeconds.getText());
    int tensSeconds = Integer.parseInt(TensSeconds.getText());
    int onesMinutes = Integer.parseInt(OnesMinute.getText());
    int tensMinutes = Integer.parseInt(TensMinute.getText());
    
    
    
    if (digit1 ==0) {
         onesSeconds = onesSeconds + 1;
    } 

    
    if (onesSeconds > 9) {       
    onesSeconds = 0;
    tensSeconds = tensSeconds + 1;  
    
    }
    if (tensSeconds > 5) {
    tensSeconds = 0;    
    onesMinutes = onesMinutes + 1;    
    }
    
    if (onesMinutes > 9) {
    tensSeconds = 0;    
    onesMinutes = 0;    
    tensMinutes = tensMinutes + 1;    
    }
    
          /* This is for the ones Seconds */  
          if (onesSeconds == 0) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/0.png"));
          }
          if (onesSeconds == 1) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/1.png"));
          }
          if (onesSeconds == 2) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/2.png"));  
          }
          if (onesSeconds == 3) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/3.png"));
          }
          if (onesSeconds == 4) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/4.png"));  
          }
          if (onesSeconds == 5) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/5.png"));
          }
          if (onesSeconds == 6) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/6.png"));  
          }
          if (onesSeconds == 7) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/7.png"));
          }
          if (onesSeconds == 8) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/8.png"));  
          }
          if (onesSeconds == 9) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/9.png"));
          }
          /* This is for the tens Seconds */  
          if (tensSeconds == 0) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/0.png"));
          }
          if (tensSeconds == 1) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/1.png"));
          }
          if (tensSeconds == 2) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/2.png"));  
          }
          if (tensSeconds == 3) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/3.png"));
          }
          if (tensSeconds == 4) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/4.png"));  
          }
          if (tensSeconds == 5) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/5.png"));
          }
          /* This is for the ones Minutes */  
          if (onesMinutes == 0) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/0.png"));
          }
          if (onesMinutes == 1) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/1.png"));
          }
          if (onesMinutes == 2) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/2.png"));  
          }
          if (onesMinutes == 3) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/3.png"));
          }
          if (onesMinutes == 4) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/4.png"));  
          }
          if (onesMinutes == 5) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/5.png"));
          }
          if (onesMinutes == 6) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/6.png"));  
          }
          if (onesMinutes == 7) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/7.png"));
          }
          if (onesMinutes == 8) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/8.png"));  
          }
          if (onesMinutes == 9) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/9.png"));
          }
          /* This is for the tens Seconds */  
          if (tensMinutes == 0) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/0.png"));
          }
          if (tensMinutes == 1) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/1.png"));
          }
          if (tensMinutes == 2) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/2.png"));  
          }
          if (tensMinutes == 3) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/3.png"));
          }
          if (tensMinutes == 4) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/4.png"));  
          }
          if (tensMinutes == 5) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/5.png"));
          }  
          

    String OneSecond = Integer.toString(onesSeconds);
    OnesSeconds.setText(OneSecond);         
    String TenSeconds = Integer.toString(tensSeconds);
    TensSeconds.setText(TenSeconds); 
    String OneMinute = Integer.toString(onesMinutes);
    OnesMinute.setText(OneMinute);
    String TenMinute = Integer.toString(tensMinutes);
    TensMinute.setText(TenMinute);
    
    
        }
    });
    public DigitalTime() {
        initComponents();
        Middle.setVisible(false);
    }

    Timer Time2 = new Timer (100, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) {
    int onesSeconds = Integer.parseInt(OnesSeconds.getText());
    int tensSeconds = Integer.parseInt(TensSeconds.getText());
    int onesMinutes = Integer.parseInt(OnesMinute.getText());
    int tensMinutes = Integer.parseInt(TensMinute.getText());
    
    int digit = Integer.parseInt(digitValue.getText());

        digit = digit - 1;
        
        if (digit == 0) {
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(true);
        Middle.setVisible(false);
        BottomLeft.setVisible(true);
        TopLeft.setVisible(true);
        TopRight.setVisible(true);
        }
        if (digit == 1) {
        Top.setVisible(false);
        BottomRight.setVisible(false);
        Bottom.setVisible(false);
        Middle.setVisible(false);
        BottomLeft.setVisible(true);
        TopLeft.setVisible(true);
        TopRight.setVisible(false);  
        }
        if (digit == 2) {
        Top.setVisible(true);
        BottomRight.setVisible(false);
        Bottom.setVisible(true);
        Middle.setVisible(true);
        BottomLeft.setVisible(true);
        TopLeft.setVisible(false);
        TopRight.setVisible(true);  
        }      
        if (digit == 3) {
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(true);
        Middle.setVisible(true);
        BottomLeft.setVisible(false);
        TopLeft.setVisible(false);
        TopRight.setVisible(true);       
        }
        if (digit == 4) {
        Top.setVisible(false);
        BottomRight.setVisible(true);
        Bottom.setVisible(false);
        Middle.setVisible(true);
        BottomLeft.setVisible(false);
        TopLeft.setVisible(true);
        TopRight.setVisible(true);  
        }
        if (digit == 5) {
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(true);
        Middle.setVisible(true);
        BottomLeft.setVisible(false);
        TopLeft.setVisible(true);
        TopRight.setVisible(false);  
        }
        if (digit == 6) {
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(true);
        Middle.setVisible(true);
        BottomLeft.setVisible(true);
        TopLeft.setVisible(true);
        TopRight.setVisible(false);  
        }
        if (digit == 7) {
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(false);
        Middle.setVisible(false);
        BottomLeft.setVisible(false);
        TopLeft.setVisible(false);
        TopRight.setVisible(true);  
        }
        if (digit == 8) {
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(true);
        Middle.setVisible(true);
        BottomLeft.setVisible(true);
        TopLeft.setVisible(true);
        TopRight.setVisible(true);  
        }
        if (digit == 9) {
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(true);
        Middle.setVisible(true);
        BottomLeft.setVisible(false);
        TopLeft.setVisible(true);
        TopRight.setVisible(true);  
        }
        if (digit > 9) {
          digit = 0;  
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(true);
        Middle.setVisible(false);
        BottomLeft.setVisible(true);
        TopLeft.setVisible(true);
        TopRight.setVisible(true); 
        }

        
    
        if (digit <0){
        onesSeconds = onesSeconds - 1;
        digit = 9;
        }
        if (onesSeconds <0) {
        tensSeconds = tensSeconds - 1;
        onesSeconds =  9; 
        } 
        if (tensSeconds <0){
        onesMinutes = onesMinutes - 1;
        tensSeconds = 5;
        }
        if (onesMinutes <0){
        tensMinutes = tensMinutes - 1;
        onesMinutes = 9;
        }
        
        if (tensMinutes == 0 && onesMinutes ==0 && tensSeconds ==0 && onesSeconds ==0 && digit ==0) {
        Time2.stop();
        }
        
          /* This is for the ones Seconds */  
          if (onesSeconds == 0) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/0.png"));
          }
          if (onesSeconds == 1) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/1.png"));
          }
          if (onesSeconds == 2) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/2.png"));  
          }
          if (onesSeconds == 3) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/3.png"));
          }
          if (onesSeconds == 4) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/4.png"));  
          }
          if (onesSeconds == 5) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/5.png"));
          }
          if (onesSeconds == 6) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/6.png"));  
          }
          if (onesSeconds == 7) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/7.png"));
          }
          if (onesSeconds == 8) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/8.png"));  
          }
          if (onesSeconds == 9) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/9.png"));
          }
          /* This is for the tens Seconds */  
          if (tensSeconds == 0) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/0.png"));
          }
          if (tensSeconds == 1) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/1.png"));
          }
          if (tensSeconds == 2) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/2.png"));  
          }
          if (tensSeconds == 3) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/3.png"));
          }
          if (tensSeconds == 4) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/4.png"));  
          }
          if (tensSeconds == 5) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/5.png"));
          }
          /* This is for the ones Minutes */  
          if (onesMinutes == 0) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/0.png"));
          }
          if (onesMinutes == 1) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/1.png"));
          }
          if (onesMinutes == 2) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/2.png"));  
          }
          if (onesMinutes == 3) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/3.png"));
          }
          if (onesMinutes == 4) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/4.png"));  
          }
          if (onesMinutes == 5) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/5.png"));
          }
          if (onesMinutes == 6) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/6.png"));  
          }
          if (onesMinutes == 7) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/7.png"));
          }
          if (onesMinutes == 8) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/8.png"));  
          }
          if (onesMinutes == 9) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/9.png"));
          }
          /* This is for the tens Seconds */  
          if (tensMinutes == 0) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/0.png"));
          }
          if (tensMinutes == 1) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/1.png"));
          }
          if (tensMinutes == 2) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/2.png"));  
          }
          if (tensMinutes == 3) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/3.png"));
          }
          if (tensMinutes == 4) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/4.png"));  
          }
          if (tensMinutes == 5) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/5.png"));
          }  
    String value = Integer.toString(digit);
    digitValue.setText(value);       
    String OneSecond = Integer.toString(onesSeconds);
    OnesSeconds.setText(OneSecond);         
    String TenSeconds = Integer.toString(tensSeconds);
    TensSeconds.setText(TenSeconds); 
    String OneMinute = Integer.toString(onesMinutes);
    OnesMinute.setText(OneMinute);
    String TenMinute = Integer.toString(tensMinutes);
    TensMinute.setText(TenMinute);
        }
        
    }); 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        TensSeconds = new javax.swing.JTextField();
        OnesMinute = new javax.swing.JTextField();
        Top = new javax.swing.JTextField();
        BottomRight = new javax.swing.JTextField();
        Bottom = new javax.swing.JTextField();
        Middle = new javax.swing.JTextField();
        BottomLeft = new javax.swing.JTextField();
        TopLeft = new javax.swing.JTextField();
        TopRight = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        digitValue = new javax.swing.JTextField();
        startTimer = new javax.swing.JButton();
        stopTimer = new javax.swing.JButton();
        lbl_Date = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        TensMinute = new javax.swing.JTextField();
        OnesSeconds = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        MyImage4 = new javax.swing.JButton();
        MyImage1 = new javax.swing.JButton();
        MyImage2 = new javax.swing.JButton();
        MyImage3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Add 1 Minute");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 120, 50));

        TensSeconds.setText("0");
        TensSeconds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TensSecondsActionPerformed(evt);
            }
        });
        getContentPane().add(TensSeconds, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 110, 30));

        OnesMinute.setText("0");
        getContentPane().add(OnesMinute, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 110, 30));

        Top.setBackground(new java.awt.Color(51, 255, 255));
        getContentPane().add(Top, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 70, 20));

        BottomRight.setBackground(new java.awt.Color(51, 255, 255));
        getContentPane().add(BottomRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 30, 50));

        Bottom.setBackground(new java.awt.Color(51, 255, 255));
        getContentPane().add(Bottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 70, 20));

        Middle.setBackground(new java.awt.Color(51, 255, 255));
        getContentPane().add(Middle, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 70, 20));

        BottomLeft.setBackground(new java.awt.Color(51, 255, 255));
        getContentPane().add(BottomLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 30, 50));

        TopLeft.setBackground(new java.awt.Color(51, 255, 255));
        TopLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TopLeftActionPerformed(evt);
            }
        });
        getContentPane().add(TopLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 30, 50));

        TopRight.setBackground(new java.awt.Color(51, 255, 255));
        getContentPane().add(TopRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 30, 50));

        jButton2.setText("Add 1 MiniSecond");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 120, -1));

        digitValue.setText("0");
        getContentPane().add(digitValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 130, -1));

        startTimer.setText("Start");
        startTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTimerActionPerformed(evt);
            }
        });
        getContentPane().add(startTimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, -1, -1));

        stopTimer.setText("Stop");
        stopTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopTimerActionPerformed(evt);
            }
        });
        getContentPane().add(stopTimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, -1, -1));

        lbl_Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_DateActionPerformed(evt);
            }
        });
        getContentPane().add(lbl_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 320, 30));

        jButton3.setText("Show Today Date");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 320, 60));

        jButton4.setText("Start Timer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, 40));

        TensMinute.setText("0");
        TensMinute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TensMinuteActionPerformed(evt);
            }
        });
        getContentPane().add(TensMinute, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 110, 30));

        OnesSeconds.setText("0");
        getContentPane().add(OnesSeconds, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 110, 30));

        jButton5.setText("Stop Timer");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, 40));

        jButton6.setText("Add 1 Second");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 120, 50));

        jLabel1.setText("One Minutes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 110, 20));

        jLabel2.setText("It Will Display Current Ttime/Date");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 300, 20));

        jLabel3.setText("One Seconds");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 110, 20));

        jLabel4.setText("Tens Seconds");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 110, 20));

        jLabel5.setText("Tens Minutes");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 110, 20));

        jLabel7.setText("For the Timer You Will Need To");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 180, -1));

        jLabel8.setText("Keyboard or Mouse (Buttons)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 180, -1));

        jLabel9.setText("Add The Values Yourself Via");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 180, -1));
        getContentPane().add(MyImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 110, 150));

        MyImage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyImage1ActionPerformed(evt);
            }
        });
        getContentPane().add(MyImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 110, 150));
        getContentPane().add(MyImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 110, 150));
        getContentPane().add(MyImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 110, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    int onesMinutes = Integer.parseInt(OnesMinute.getText());
    int tensMinutes = Integer.parseInt(TensMinute.getText());

        onesMinutes = onesMinutes + 1;
        if (onesMinutes >= 10) {
        onesMinutes = 0;
        tensMinutes = tensMinutes + 1;
        }
     /* This is for the ones Minutes */  
          if (onesMinutes == 0) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/0.png"));
          }
          if (onesMinutes == 1) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/1.png"));
          }
          if (onesMinutes == 2) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/2.png"));  
          }
          if (onesMinutes == 3) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/3.png"));
          }
          if (onesMinutes == 4) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/4.png"));  
          }
          if (onesMinutes == 5) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/5.png"));
          }
          if (onesMinutes == 6) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/6.png"));  
          }
          if (onesMinutes == 7) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/7.png"));
          }
          if (onesMinutes == 8) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/8.png"));  
          }
          if (onesMinutes == 9) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/9.png"));
          }
          /* This is for the tens Seconds */  
          if (tensMinutes == 0) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/0.png"));
          }
          if (tensMinutes == 1) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/1.png"));
          }
          if (tensMinutes == 2) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/2.png"));  
          }
          if (tensMinutes == 3) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/3.png"));
          }
          if (tensMinutes == 4) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/4.png"));  
          }
          if (tensMinutes == 5) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/5.png"));
          }         
        
    String OneMinute = Integer.toString(onesMinutes);
    OnesMinute.setText(OneMinute);
    String TenMinute = Integer.toString(tensMinutes);
    TensMinute.setText(TenMinute);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TensSecondsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TensSecondsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TensSecondsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
int digit = Integer.parseInt(digitValue.getText());
    digit = digit + 1;
    String value = Integer.toString(digit);
    digitValue.setText(value);

    int digit1 = Integer.parseInt(digitValue.getText());
    if (digit1 == 0) {
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(true);
        Middle.setVisible(false);
        BottomLeft.setVisible(true);
        TopLeft.setVisible(true);
        TopRight.setVisible(true);
        }
        if (digit1 == 1) {
        Top.setVisible(false);
        BottomRight.setVisible(false);
        Bottom.setVisible(false);
        Middle.setVisible(false);
        BottomLeft.setVisible(true);
        TopLeft.setVisible(true);
        TopRight.setVisible(false);  
        }
        if (digit1 == 2) {
        Top.setVisible(true);
        BottomRight.setVisible(false);
        Bottom.setVisible(true);
        Middle.setVisible(true);
        BottomLeft.setVisible(true);
        TopLeft.setVisible(false);
        TopRight.setVisible(true);  
        }      
        if (digit1 == 3) {
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(true);
        Middle.setVisible(true);
        BottomLeft.setVisible(false);
        TopLeft.setVisible(false);
        TopRight.setVisible(true);       
        }
        if (digit1 == 4) {
        Top.setVisible(false);
        BottomRight.setVisible(true);
        Bottom.setVisible(false);
        Middle.setVisible(true);
        BottomLeft.setVisible(false);
        TopLeft.setVisible(true);
        TopRight.setVisible(true);  
        }
        if (digit1 == 5) {
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(true);
        Middle.setVisible(true);
        BottomLeft.setVisible(false);
        TopLeft.setVisible(true);
        TopRight.setVisible(false);  
        }
        if (digit1 == 6) {
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(true);
        Middle.setVisible(true);
        BottomLeft.setVisible(true);
        TopLeft.setVisible(true);
        TopRight.setVisible(false);  
        }
        if (digit1 == 7) {
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(false);
        Middle.setVisible(false);
        BottomLeft.setVisible(false);
        TopLeft.setVisible(false);
        TopRight.setVisible(true);  
        }
        if (digit1 == 8) {
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(true);
        Middle.setVisible(true);
        BottomLeft.setVisible(true);
        TopLeft.setVisible(true);
        TopRight.setVisible(true);  
        }
        if (digit1 == 9) {
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(true);
        Middle.setVisible(true);
        BottomLeft.setVisible(false);
        TopLeft.setVisible(true);
        TopRight.setVisible(true);  
        }
        if (digit1 == 10) {
            digit1 = digit1 - 10;
        Top.setVisible(true);
        BottomRight.setVisible(true);
        Bottom.setVisible(true);
        Middle.setVisible(false);
        BottomLeft.setVisible(true);
        TopLeft.setVisible(true);
        TopRight.setVisible(true);  
        }
    String value2 = Integer.toString(digit1);
    digitValue.setText(value2);
    
    int onesSeconds = Integer.parseInt(OnesSeconds.getText());
    int tensSeconds = Integer.parseInt(TensSeconds.getText());
    int onesMinutes = Integer.parseInt(OnesMinute.getText());
    int tensMinutes = Integer.parseInt(TensMinute.getText());
    
    if (digit1 ==0) {
         onesSeconds = onesSeconds + 1;
    } 
    if (onesSeconds > 9) {       
    onesSeconds = 0;
    tensSeconds = tensSeconds + 1;  
    
    }
    if (tensSeconds > 5) {
    tensSeconds = 0;    
    onesMinutes = onesMinutes + 1;    
    }
    
    if (onesMinutes > 9) {
    tensSeconds = 0;    
    onesMinutes = 0;    
    tensMinutes = tensMinutes + 1;    
    }
    
    /* This is for the ones Seconds */ 
    if (onesSeconds == 0) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/0.png"));
          }
          if (onesSeconds == 1) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/1.png"));
          }
          if (onesSeconds == 2) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/2.png"));  
          }
          if (onesSeconds == 3) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/3.png"));
          }
          if (onesSeconds == 4) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/4.png"));  
          }
          if (onesSeconds == 5) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/5.png"));
          }
          if (onesSeconds == 6) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/6.png"));  
          }
          if (onesSeconds == 7) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/7.png"));
          }
          if (onesSeconds == 8) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/8.png"));  
          }
          if (onesSeconds == 9) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/9.png"));
          }
          /* This is for the tens Seconds */  
          if (tensSeconds == 0) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/0.png"));
          }
          if (tensSeconds == 1) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/1.png"));
          }
          if (tensSeconds == 2) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/2.png"));  
          }
          if (tensSeconds == 3) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/3.png"));
          }
          if (tensSeconds == 4) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/4.png"));  
          }
          if (tensSeconds == 5) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/5.png"));
          }
          /* This is for the ones Minutes */  
          if (onesMinutes == 0) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/0.png"));
          }
          if (onesMinutes == 1) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/1.png"));
          }
          if (onesMinutes == 2) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/2.png"));  
          }
          if (onesMinutes == 3) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/3.png"));
          }
          if (onesMinutes == 4) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/4.png"));  
          }
          if (onesMinutes == 5) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/5.png"));
          }
          if (onesMinutes == 6) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/6.png"));  
          }
          if (onesMinutes == 7) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/7.png"));
          }
          if (onesMinutes == 8) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/8.png"));  
          }
          if (onesMinutes == 9) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/9.png"));
          }
          /* This is for the tens Seconds */  
          if (tensMinutes == 0) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/0.png"));
          }
          if (tensMinutes == 1) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/1.png"));
          }
          if (tensMinutes == 2) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/2.png"));  
          }
          if (tensMinutes == 3) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/3.png"));
          }
          if (tensMinutes == 4) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/4.png"));  
          }
          if (tensMinutes == 5) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/5.png"));
          }  
          
    String OneSecond = Integer.toString(onesSeconds);
    OnesSeconds.setText(OneSecond);         
    String TenSeconds = Integer.toString(tensSeconds);
    TensSeconds.setText(TenSeconds); 
    String OneMinute = Integer.toString(onesMinutes);
    OnesMinute.setText(OneMinute);
    String TenMinute = Integer.toString(tensMinutes);
    TensMinute.setText(TenMinute);
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TopLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TopLeftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TopLeftActionPerformed

    private void startTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTimerActionPerformed
    Time1.start();
    jButton4.setVisible(false);
    jButton5.setVisible(false);
    }//GEN-LAST:event_startTimerActionPerformed

    private void stopTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopTimerActionPerformed
    Time1.stop();
    jButton4.setVisible(true);
    jButton5.setVisible(true);
    }//GEN-LAST:event_stopTimerActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    Date.start();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    Time2.start();
    startTimer.setVisible(false);
    stopTimer.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TensMinuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TensMinuteActionPerformed
    
    }//GEN-LAST:event_TensMinuteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    Time2.stop();
    startTimer.setVisible(true);
    stopTimer.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    
    int onesSeconds = Integer.parseInt(OnesSeconds.getText());
    int tensSeconds = Integer.parseInt(TensSeconds.getText());
    int onesMinutes = Integer.parseInt(OnesMinute.getText());
    int tensMinutes = Integer.parseInt(TensMinute.getText());
    
        onesSeconds = onesSeconds + 1;
        if (onesSeconds >= 10) {
        onesSeconds = 0;
        tensSeconds = tensSeconds + 1;
        }

        if (tensSeconds >= 6) {
        tensSeconds = 0;
        onesMinutes = onesMinutes + 1;
        }

        if (onesMinutes >= 10) {
        onesMinutes = 0;
        tensMinutes = tensMinutes + 1;
        }
    /* This is for the ones Seconds */  
          if (onesSeconds == 0) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/0.png"));
          }
          if (onesSeconds == 1) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/1.png"));
          }
          if (onesSeconds == 2) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/2.png"));  
          }
          if (onesSeconds == 3) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/3.png"));
          }
          if (onesSeconds == 4) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/4.png"));  
          }
          if (onesSeconds == 5) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/5.png"));
          }
          if (onesSeconds == 6) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/6.png"));  
          }
          if (onesSeconds == 7) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/7.png"));
          }
          if (onesSeconds == 8) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/8.png"));  
          }
          if (onesSeconds == 9) {
          MyImage1.setIcon(new javax.swing.ImageIcon("Digital Timer Image/9.png"));
          }
          /* This is for the tens Seconds */  
          if (tensSeconds == 0) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/0.png"));
          }
          if (tensSeconds == 1) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/1.png"));
          }
          if (tensSeconds == 2) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/2.png"));  
          }
          if (tensSeconds == 3) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/3.png"));
          }
          if (tensSeconds == 4) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/4.png"));  
          }
          if (tensSeconds == 5) {
          MyImage2.setIcon(new javax.swing.ImageIcon("Digital Timer Image/5.png"));
          }
          /* This is for the ones Minutes */  
          if (onesMinutes == 0) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/0.png"));
          }
          if (onesMinutes == 1) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/1.png"));
          }
          if (onesMinutes == 2) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/2.png"));  
          }
          if (onesMinutes == 3) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/3.png"));
          }
          if (onesMinutes == 4) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/4.png"));  
          }
          if (onesMinutes == 5) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/5.png"));
          }
          if (onesMinutes == 6) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/6.png"));  
          }
          if (onesMinutes == 7) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/7.png"));
          }
          if (onesMinutes == 8) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/8.png"));  
          }
          if (onesMinutes == 9) {
          MyImage3.setIcon(new javax.swing.ImageIcon("Digital Timer Image/9.png"));
          }
          /* This is for the tens Seconds */  
          if (tensMinutes == 0) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/0.png"));
          }
          if (tensMinutes == 1) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/1.png"));
          }
          if (tensMinutes == 2) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/2.png"));  
          }
          if (tensMinutes == 3) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/3.png"));
          }
          if (tensMinutes == 4) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/4.png"));  
          }
          if (tensMinutes == 5) {
          MyImage4.setIcon(new javax.swing.ImageIcon("Digital Timer Image/5.png"));
          }  
          
    String OneSecond = Integer.toString(onesSeconds);
    OnesSeconds.setText(OneSecond);
    String TenSecond = Integer.toString(tensSeconds);
    TensSeconds.setText(TenSecond);     
    String OneMinute = Integer.toString(onesMinutes);
    OnesMinute.setText(OneMinute);
    String TenMinute = Integer.toString(tensMinutes);
    TensMinute.setText(TenMinute);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void MyImage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyImage1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MyImage1ActionPerformed

    private void lbl_DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_DateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DigitalTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DigitalTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DigitalTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DigitalTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DigitalTime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bottom;
    private javax.swing.JTextField BottomLeft;
    private javax.swing.JTextField BottomRight;
    private javax.swing.JTextField Middle;
    private javax.swing.JButton MyImage1;
    private javax.swing.JButton MyImage2;
    private javax.swing.JButton MyImage3;
    private javax.swing.JButton MyImage4;
    private javax.swing.JTextField OnesMinute;
    private javax.swing.JTextField OnesSeconds;
    private javax.swing.JTextField TensMinute;
    private javax.swing.JTextField TensSeconds;
    private javax.swing.JTextField Top;
    private javax.swing.JTextField TopLeft;
    private javax.swing.JTextField TopRight;
    private javax.swing.JTextField digitValue;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lbl_Date;
    private javax.swing.JButton startTimer;
    private javax.swing.JButton stopTimer;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tic_tac_toe_game;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author KIIT
 */
public class TIC_TAC_TOE extends javax.swing.JFrame implements Runnable {

    private String var = "X"; 
   private int  count1 = 0;
   private int count2 =  0;
   
    public TIC_TAC_TOE() {
      
        initComponents();
         progress.setBackground(Color.DARK_GRAY);
       progress.setForeground(Color.YELLOW);
        Thread t = new Thread(this);
        
        t.start();
    }

    private void gscore()
    {
        prl2.setText(String.valueOf(count1));
        prl1.setText(String.valueOf(count2));
        
    }
        
         @Override
    public void run() {
         for(int i = 1; i<=100; i++)
        {

        try
        {
            Thread.sleep(50);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
            
            lb1.setText(i+"%");
            progress.setValue(i);
        }
    }
    
    
    private void winngame()
    {
        String b2 = txtbtn2.getText();
          String b3 = txtbtn3.getText();
            String b4 = txtbtn4.getText();
             
              
                String b5 = txtbtn5.getText();
                  String b6 = txtbtn6.getText();
                    String b7 = txtbtn7.getText();
                    
                      String b8 = txtbtn8.getText();
                        String b9 = txtbtn9.getText();
                          String b10 = txtbtn10.getText();
                          
           
                          if(b2 == "X" && b3 == "X" && b4 == "X" )
                          {
                              JOptionPane.showMessageDialog(this, "Hurray !!\nPlayer X Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                              count1++;
                               gscore();
                              txtbtn2.setBackground(Color.YELLOW);
                               txtbtn3.setBackground(Color.YELLOW);
                                txtbtn4.setBackground(Color.YELLOW);
                                
                                   txtbtn2.setForeground(Color.black);
                                txtbtn3.setForeground(Color.black);
                                   txtbtn4.setForeground(Color.black);
                                   txtf1.setText("WINNER");
                                   txtf1.setForeground(Color.blue);
                                    txtf2.setText("LOOSER");
                                   txtf2.setForeground(Color.red);
            
          
                          }else if(b2 == "O" && b3 == "O" && b4 == "O" )
                          {
                               JOptionPane.showMessageDialog(this, "Hurray !!\nPlayer O Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                              count2++;
                               gscore();
                              txtbtn2.setBackground(Color.YELLOW);
                               txtbtn3.setBackground(Color.YELLOW);
                                txtbtn4.setBackground(Color.YELLOW);
                                
                                  txtbtn2.setForeground(Color.black);
                                txtbtn3.setForeground(Color.black);
                                   txtbtn4.setForeground(Color.black);
                                    txtf1.setText("LOOSER");
                                   txtf1.setForeground(Color.blue);
                                    txtf2.setText("WINNER");
                                   txtf2.setForeground(Color.red);
                          }
                          
                          else if(b5 == "X" && b6 == "X" &&  b7 == "X" )
                          {
                              JOptionPane.showMessageDialog(this, "Hurray !!\nPlayer X Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                              count1++;
                               gscore();
                                txtbtn5.setBackground(Color.YELLOW);
                               txtbtn6.setBackground(Color.YELLOW);
                                txtbtn7.setBackground(Color.YELLOW);
                                
                                  txtbtn5.setForeground(Color.black);
                                txtbtn6.setForeground(Color.black);
                                   txtbtn7.setForeground(Color.black);
                                     txtf1.setText("WINNER");
                                   txtf1.setForeground(Color.blue);
                                    txtf2.setText("LOOSER");
                                   txtf2.setForeground(Color.red);
                             
                          }else if(b5 == "O" && b6 == "O" &&  b7 == "O" )
                          {
                              JOptionPane.showMessageDialog(this, "Hurray !!\nPlayer O Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                              count2++;
                               gscore();
                                txtbtn5.setBackground(Color.YELLOW);
                               txtbtn6.setBackground(Color.YELLOW);
                                txtbtn7.setBackground(Color.YELLOW);
                                
                                 txtbtn5.setForeground(Color.black);
                                txtbtn6.setForeground(Color.black);
                                   txtbtn7.setForeground(Color.black);
                                   txtf1.setText("LOOSER");
                                   txtf1.setForeground(Color.blue);
                                    txtf2.setText("WINNER");
                                   txtf2.setForeground(Color.red);
                             
                          }
                            
                          else if(b8 == "X" && b9 == "X" &&  b10 == "X" )
                          {
                              JOptionPane.showMessageDialog(this, "Hurray !!\nPlayer X Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                              count1++;
                               gscore();
                                txtbtn8.setBackground(Color.YELLOW);
                               txtbtn9.setBackground(Color.YELLOW);
                                txtbtn10.setBackground(Color.YELLOW);
                                
                                 txtbtn8.setForeground(Color.black);
                                txtbtn9.setForeground(Color.black);
                                   txtbtn10.setForeground(Color.black);
                                      txtf1.setText("WINNER");
                                   txtf1.setForeground(Color.blue);
                                    txtf2.setText("LOOSER");
                                   txtf2.setForeground(Color.red);
                                   
                          }else if(b8 == "O" && b9 == "O" &&  b10 == "O" )
                          {
                              JOptionPane.showMessageDialog(this, "Hurray !!\nPlayer O Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                              count2++;
                               gscore();
                                txtbtn8.setBackground(Color.YELLOW);
                               txtbtn9.setBackground(Color.YELLOW);
                                txtbtn10.setBackground(Color.YELLOW);
                             
                                    txtbtn8.setForeground(Color.black);
                                txtbtn9.setForeground(Color.black);
                                   txtbtn10.setForeground(Color.black);
                                   txtf1.setText("LOOSER");
                                   txtf1.setForeground(Color.blue);
                                    txtf2.setText("WINNER");
                                   txtf2.setForeground(Color.red);
                          }
                           
                             else if(b2 == "X" && b5 == "X" &&  b8 == "X" )
                          {
                              JOptionPane.showMessageDialog(this, "Hurray !!\nPlayer X Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                              count1++;
                              gscore();
                                txtbtn2.setBackground(Color.YELLOW);
                               txtbtn5.setBackground(Color.YELLOW);
                                txtbtn8.setBackground(Color.YELLOW);
                                
                                    txtbtn2.setForeground(Color.black);
                                txtbtn5.setForeground(Color.black);
                                   txtbtn8.setForeground(Color.black);
                                 txtf1.setText("WINNER");
                                   txtf1.setForeground(Color.blue);
                                    txtf2.setText("LOOSER");
                                   txtf2.setForeground(Color.red);
                              
                          } else if(b2 == "O" && b5 == "O" &&  b8 == "O" )
                          {
                              JOptionPane.showMessageDialog(this, "Hurray !!\nPlayer O Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                              count2++;
                              gscore();
                                txtbtn2.setBackground(Color.YELLOW);
                               txtbtn5.setBackground(Color.YELLOW);
                                txtbtn8.setBackground(Color.YELLOW);
                                
                                  txtbtn2.setForeground(Color.black);
                                txtbtn5.setForeground(Color.black);
                                   txtbtn8.setForeground(Color.black);
                                      txtf1.setText("LOOSER");
                                   txtf1.setForeground(Color.blue);
                                    txtf2.setText("WINNER");
                                   txtf2.setForeground(Color.red);
                              
                          }
                              
                             else if(b3 == "X" && b6 == "X" &&  b9 == "X" )
                          {
                              JOptionPane.showMessageDialog(this, "Hurray !!\nPlayer X Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                              count1++;
                               gscore();
                                txtbtn3.setBackground(Color.YELLOW);
                               txtbtn6.setBackground(Color.YELLOW);
                                txtbtn9.setBackground(Color.YELLOW);
                                
                                  txtbtn3.setForeground(Color.black);
                                txtbtn6.setForeground(Color.black);
                                   txtbtn9.setForeground(Color.black);
                                     txtf1.setText("WINNER");
                                   txtf1.setForeground(Color.blue);
                                    txtf2.setText("LOOSER");
                                   txtf2.setForeground(Color.red);
                             
                          } else if(b3 == "O" && b6 == "O" &&  b9 == "O" )
                          {
                              JOptionPane.showMessageDialog(this, "Hurray !!\nPlayer O Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                              count2++;
                               gscore();
                                txtbtn3.setBackground(Color.YELLOW);
                               txtbtn6.setBackground(Color.YELLOW);
                                txtbtn9.setBackground(Color.YELLOW);
                             
                                   txtbtn3.setForeground(Color.black);
                                txtbtn6.setForeground(Color.black);
                                   txtbtn9.setForeground(Color.black);
                                     txtf1.setText("LOOSER");
                                   txtf1.setForeground(Color.blue);
                                    txtf2.setText("WINNER");
                                   txtf2.setForeground(Color.red);
                          }
                              
                               else if(b4 == "X" && b7 == "X" &&  b10 == "X" )
                          {
                              JOptionPane.showMessageDialog(this, "Hurray !!\nPlayer X Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                              count1++;
                               gscore();
                                txtbtn4.setBackground(Color.YELLOW);
                               txtbtn7.setBackground(Color.YELLOW);
                                txtbtn10.setBackground(Color.YELLOW);
                                
                                   txtbtn4.setForeground(Color.black);
                                txtbtn7.setForeground(Color.black);
                                   txtbtn10.setForeground(Color.black);
                                     txtf1.setText("WINNER");
                                   txtf1.setForeground(Color.blue);
                                    txtf2.setText("LOOSER");
                                   txtf2.setForeground(Color.red);

                          }         else if(b4 == "O" && b7 == "O" &&  b10 == "O" )
                          {
                              JOptionPane.showMessageDialog(this, "Hurray !!\nPlayer O Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                              count2++;
                               gscore();
                                txtbtn4.setBackground(Color.YELLOW);
                               txtbtn7.setBackground(Color.YELLOW);
                                txtbtn10.setBackground(Color.YELLOW);
                                
                                   txtbtn2.setForeground(Color.black);
                                txtbtn7.setForeground(Color.black);
                                   txtbtn10.setForeground(Color.black);
                                     txtf1.setText("LOOSER");
                                   txtf1.setForeground(Color.blue);
                                    txtf2.setText("WINNER");
                                   txtf2.setForeground(Color.red);
                          }
                                
                             else if(b2 == "X" && b6 == "X" &&  b10 == "X" )
                          {
                              JOptionPane.showMessageDialog(this, "Hurray !!\nPlayer X Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                              count1++;
                               gscore();
                                txtbtn2.setBackground(Color.YELLOW);
                               txtbtn6.setBackground(Color.YELLOW);
                                txtbtn10.setBackground(Color.YELLOW);
                                
                                   txtbtn2.setForeground(Color.black);
                                txtbtn6.setForeground(Color.black);
                                   txtbtn10.setForeground(Color.black);
                                   txtf1.setText("WINNER");
                                   txtf1.setForeground(Color.blue);
                                    txtf2.setText("LOOSER");
                                   txtf2.setForeground(Color.red);
                
                          }      else if(b2 == "O" && b6 == "O" &&  b10 == "O" )
                          {
                              JOptionPane.showMessageDialog(this, "Hurray !!\nPlayer O Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                              count2++;
                               gscore();
                                txtbtn2.setBackground(Color.YELLOW);
                               txtbtn6.setBackground(Color.YELLOW);
                                txtbtn10.setBackground(Color.YELLOW);
                                
                                 txtbtn2.setForeground(Color.black);
                                txtbtn6.setForeground(Color.black);
                                   txtbtn10.setForeground(Color.black);
                                    
                                      txtf1.setText("LOOSER");
                                   txtf1.setForeground(Color.blue);
                                    txtf2.setText("WINNER");
                                   txtf2.setForeground(Color.red);
                          }
                              
                          else  if(b4 == "X" && b6 == "X" &&  b8 == "X" )
                          {
                              JOptionPane.showMessageDialog(this, "Hurray !!\nPlayer X Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                              count1++;
                               gscore();
                                txtbtn4.setBackground(Color.YELLOW);
                               txtbtn6.setBackground(Color.YELLOW);
                                txtbtn8.setBackground(Color.YELLOW);
                                
                                 txtbtn4.setForeground(Color.black);
                                txtbtn6.setForeground(Color.black);
                                   txtbtn8.setForeground(Color.black);
                                   txtf1.setText("WINNER");
                                   txtf1.setForeground(Color.blue);
                                    txtf2.setText("LOOSER");
                                   txtf2.setForeground(Color.red);
                              
                          } else  if(b4 == "O" && b6 == "O" &&  b8 == "O" )
                          {
                              JOptionPane.showMessageDialog(this, "Hurray !!\nPlayer O Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                              count2++;
                               gscore();
                                txtbtn4.setBackground(Color.YELLOW);
                               txtbtn6.setBackground(Color.YELLOW);
                                txtbtn8.setBackground(Color.YELLOW);
                              
                                 txtbtn4.setForeground(Color.black);
                                txtbtn6.setForeground(Color.black);
                                   txtbtn8.setForeground(Color.black);
                                      txtf1.setText("LOOSER");
                                   txtf1.setForeground(Color.blue);
                                    txtf2.setText("WINNER");
                                   txtf2.setForeground(Color.red);
                                   
                          }else if ((b2 == "X" || b2 == "O") && (b3 == "X" ||b3 == "O" ) && ( b4 == "X" ||  b4 == "O" ) 
                                        && (b5 == "X" || b5 == "O") && (b6 == "X" || b6 == "O" ) && (b7 == "X" ||  b7 == "O") && (b8 == "X" || b8 == "O" )
                                  && (b9 == "X" ||  b9 == "O") && (b10 == "X" ||b10 == "O"))
                          {
                               if((b2 == "X" && b3 == "X" && b4 != "X") || (b2 == "X" && b3 != "X" && b4 == "X") || (b2 != "X" && b3 == "X" && b4 == "X")
                                      || (b2 == "O" && b3 == "O" && b4 != "O") || (b2 == "O" && b3 != "O" && b4 == "O") || (b2 != "O" && b3 == "O" && b4 == "O")
                                      
                                      || (b5 == "X" && b6 == "X" &&  b7 != "X") || (b5 == "X" && b6 != "X" &&  b7 == "X") || (b5 != "X" && b6 == "X" &&  b7 == "X") 
                                      || (b5 == "O" && b6 == "O" &&  b7 != "O") ||  (b5 == "O" && b6 != "O" &&  b7 == "O") ||  (b5 != "O" && b6 == "O" &&  b7 == "O")
                                     
                                      ||(b8 == "X" && b9 == "X" &&  b10 != "X") || (b8 == "X" && b9 != "X" &&  b10 == "X") || (b8 != "X" && b9 == "X" &&  b10 == "X")
                                      || (b8 == "O" &&  b9 == "O" &&  b10 != "O") ||  (b8 == "O" &&  b9 != "O" &&  b10 == "O") || (b8 != "O" &&  b9 == "O" &&  b10 == "O") 
                                      
                                      || (b2 == "X" && b5 == "X" &&  b8 != "X") ||  (b2 == "X" && b5 != "X" &&  b8 == "X") ||  (b2 != "X" && b5 == "X" &&  b8 == "X")
                                      || (b2 == "O" && b5 == "O" &&  b8 != "O") || (b2 == "O" && b5 != "O" &&  b8 == "O") || (b2 != "O" && b5 == "O" &&  b8 == "O")
                                      
                                       ||(b3 == "X" && b6 == "X" &&  b9 != "X") || (b3 == "X" && b6 != "X" &&  b9 == "X") || (b3 != "X" && b6 == "X" &&  b9 == "X")
                                      || (b3 != "O" && b6 == "O" &&  b9 == "O") ||  (b3 != "O" && b6 != "O" &&  b9 == "O") ||  (b3 == "O" && b6 == "O" &&  b9 != "O") 
                                      
                                      || (b4 == "X" && b7 == "X" &&  b10 != "X") || (b4 == "X" && b7 != "X" &&  b10 == "X") || (b4 != "X" && b7 == "X" &&  b10 == "X")
                                      || (b4 != "O" && b7 == "O" &&  b10 == "O") || (b4 == "O" && b7 != "O" &&  b10 == "O") || (b4 == "O" && b7 == "O" &&  b10 != "O") 
                                
                                       ||(b2 == "X" && b6 == "X" &&  b10 != "X") || (b2 == "X" && b6 != "X" &&  b10 == "X") || (b2 != "X" && b6 == "X" &&  b10 == "X") 
                                      ||  (b2 == "O" && b6 == "O" &&  b10 != "O") ||  (b2 == "O" && b6 != "O" &&  b10 == "O") ||  (b2 != "O" && b6 == "O" &&  b10 == "O")
                                      
                                      ||(b4 == "X" && b6 == "X" &&  b8 != "X") || (b4 == "X" && b6 != "X" &&  b8 == "X") || (b4 != "X" && b6 == "X" &&  b8 == "X")
                                      ||(b4 == "O" && b6 == "O" &&  b8 != "O" ) || (b4 == "O" && b6 != "O" &&  b8 == "O" ) || (b4 != "O" && b6 == "O" &&  b8 == "O" ))
                              {
                               JOptionPane.showMessageDialog(this, "\tGame is Draw !!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                                txtf1.setText("DRAW");
                                   txtf1.setForeground(Color.BLACK);
                                    txtf2.setText("DRAW");
                                   txtf2.setForeground(Color.BLACK);
                          } 
                          }
                          
                             
    }
    
    
    
    private void choose_player()
    {
        if(var.equalsIgnoreCase("X"))
        {
            var = "O";
        }else
        {
            var = "X";
        }
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        txtf2 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        player1 = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        txtf1 = new javax.swing.JTextField();
        progress = new javax.swing.JProgressBar();
        txtbtn11 = new javax.swing.JButton();
        txtbtn12 = new javax.swing.JButton();
        prl2 = new javax.swing.JTextField();
        prl1 = new javax.swing.JTextField();
        lb1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn10 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC_TAC_TOE");
        setResizable(false);

        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(51, 200, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 7, true));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 6, true));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 0, 204));
        jTextField1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("WELCOME TO TIC TAC TOE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(204, 0, 102));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new java.awt.Color(153, 0, 51)));

        txtf2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        txtf2.setForeground(new java.awt.Color(51, 204, 0));
        txtf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf2ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(0, 255, 255));
        jButton23.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton23.setForeground(new java.awt.Color(0, 0, 204));
        jButton23.setText("START");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        player1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        player1.setForeground(new java.awt.Color(255, 255, 255));
        player1.setText("PLAYER  X   : ");

        player2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        player2.setForeground(new java.awt.Color(255, 255, 255));
        player2.setText("PLAYER  O   :");

        txtf1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        txtf1.setForeground(new java.awt.Color(0, 0, 255));
        txtf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf1ActionPerformed(evt);
            }
        });

        txtbtn11.setBackground(new java.awt.Color(255, 255, 0));
        txtbtn11.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 36)); // NOI18N
        txtbtn11.setForeground(new java.awt.Color(255, 0, 0));
        txtbtn11.setText("RESET");
        txtbtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn11ActionPerformed(evt);
            }
        });

        txtbtn12.setBackground(new java.awt.Color(255, 255, 0));
        txtbtn12.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 36)); // NOI18N
        txtbtn12.setForeground(new java.awt.Color(51, 51, 0));
        txtbtn12.setText("EXIT");
        txtbtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn12ActionPerformed(evt);
            }
        });

        prl2.setFont(new java.awt.Font("Swis721 Blk BT", 1, 18)); // NOI18N
        prl2.setForeground(new java.awt.Color(0, 0, 255));

        prl1.setFont(new java.awt.Font("Swis721 Blk BT", 1, 18)); // NOI18N
        prl1.setForeground(new java.awt.Color(0, 0, 255));
        prl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prl1ActionPerformed(evt);
            }
        });

        lb1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(txtbtn11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtbtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(player2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(player1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtf2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtf1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prl2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prl1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(progress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jButton23))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(player1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(prl2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtf1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player2)
                    .addComponent(txtf2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prl1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jButton23)
                .addGap(18, 18, 18)
                .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );

        jPanel4.setBackground(new java.awt.Color(51, 153, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new java.awt.Color(0, 102, 51)));

        txtbtn5.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn5.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        txtbtn5.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn6.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        txtbtn6.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn10.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn10.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        txtbtn10.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn10ActionPerformed(evt);
            }
        });

        txtbtn8.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn8.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        txtbtn8.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn9.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn9.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        txtbtn9.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtbtn3.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        txtbtn3.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn4.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        txtbtn4.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn2.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        txtbtn2.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn7.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn7.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        txtbtn7.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(43, 43, 43))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtbtn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtbtn8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 512, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:

        txtbtn2.setText(var);
        if(var.equalsIgnoreCase("X"))
        {
            txtbtn2.setForeground(Color.white);
        }else
        {
            txtbtn2.setForeground(Color.white);
        }
        choose_player();
           winngame();

    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn12ActionPerformed
       
        JFrame frame  = new JFrame("EXIT");
        
        if(JOptionPane.showConfirmDialog(frame,"Are You Sure You Want To Exit ?","TIC TAC TOE", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) 
        {
           System.exit(0);
        }
    }//GEN-LAST:event_txtbtn12ActionPerformed

    private void txtf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf1ActionPerformed

    private void txtf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf2ActionPerformed

    private void txtbtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn11ActionPerformed
        // TODO add your handling code here:
        txtbtn2.setText(null);
         txtbtn3.setText(null);
          txtbtn4.setText(null);
          
           txtbtn5.setText(null);
            txtbtn6.setText(null);
             txtbtn7.setText(null);
             
              txtbtn8.setText(null);
              txtbtn9.setText(null);
               txtbtn10.setText(null);
               
                                txtbtn2.setBackground(Color.LIGHT_GRAY);
                               txtbtn3.setBackground(Color.LIGHT_GRAY);
                                txtbtn4.setBackground(Color.LIGHT_GRAY);
                        
                                txtbtn5.setBackground(Color.LIGHT_GRAY);
                               txtbtn6.setBackground(Color.LIGHT_GRAY);
                                txtbtn7.setBackground(Color.LIGHT_GRAY);
                          
                                txtbtn8.setBackground(Color.LIGHT_GRAY);
                               txtbtn9.setBackground(Color.LIGHT_GRAY);
                                txtbtn10.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_txtbtn11ActionPerformed

    private void txtbtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn10ActionPerformed
        // TODO add your handling code here:
        txtbtn10.setText(var);
        if(var.equalsIgnoreCase("X"))
        {
            txtbtn10.setForeground(Color.white);
        }else
        {
            txtbtn10.setForeground(Color.white);
        }
        choose_player();
        winngame();
    }//GEN-LAST:event_txtbtn10ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
        txtbtn9.setText(var);
        if(var.equalsIgnoreCase("X"))
        {
            txtbtn9.setForeground(Color.white);
        }else
        {
            txtbtn9.setForeground(Color.white);
        }
        choose_player();
        winngame();
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
        txtbtn8.setText(var);
        if(var.equalsIgnoreCase("X"))
        {
            txtbtn8.setForeground(Color.white);
        }else
        {
            txtbtn8.setForeground(Color.white);
        }
        choose_player();
        winngame();
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
        txtbtn5.setText(var);
        if(var.equalsIgnoreCase("X"))
        {
            txtbtn5.setForeground(Color.white);
        }else
        {
            txtbtn5.setForeground(Color.white);
        }
        choose_player();
        winngame();
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
        txtbtn6.setText(var);
        if(var.equalsIgnoreCase("X"))
        {
            txtbtn6.setForeground(Color.white);
        }else
        {
            txtbtn6.setForeground(Color.white);
        }
        choose_player();
        winngame();
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
        txtbtn7.setText(var);
        if(var.equalsIgnoreCase("X"))
        {
            txtbtn7.setForeground(Color.white);
        }else
        {
            txtbtn7.setForeground(Color.white);
        }
        choose_player();
        winngame();
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:

        txtbtn4.setText(var);
        if(var.equalsIgnoreCase("X"))
        {
            txtbtn4.setForeground(Color.white);
        }else
        {
            txtbtn4.setForeground(Color.white);
        }
        choose_player();
        winngame();
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
        txtbtn3.setText(var);
        if(var.equalsIgnoreCase("X"))
        {
            txtbtn3.setForeground(Color.white);
        }else
        {
            txtbtn3.setForeground(Color.white);
        }
        choose_player();
        winngame();
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
     
   
        txtbtn2.setBackground(Color.blue);
         txtbtn3.setBackground(Color.blue);
           txtbtn4.setBackground(Color.blue);
           
             txtbtn5.setBackground(Color.blue);
               txtbtn6.setBackground(Color.blue);
                 txtbtn7.setBackground(Color.blue);
                 
                   txtbtn8.setBackground(Color.blue);
                     txtbtn9.setBackground(Color.blue);
                       txtbtn10.setBackground(Color.blue);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void prl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prl1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prl1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel player1;
    private javax.swing.JLabel player2;
    private javax.swing.JTextField prl1;
    private javax.swing.JTextField prl2;
    private javax.swing.JProgressBar progress;
    private javax.swing.JButton txtbtn10;
    private javax.swing.JButton txtbtn11;
    private javax.swing.JButton txtbtn12;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JTextField txtf1;
    private javax.swing.JTextField txtf2;
    // End of variables declaration//GEN-END:variables

 

}

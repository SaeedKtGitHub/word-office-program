/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4_visual_programming;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import javax.swing.JOptionPane;

/**
 *
 * @author DeLL
 */
public class NewJFrame extends javax.swing.JFrame {

    int size = 10;
    Font f = new Font("Tahoma", Font.PLAIN, size);

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPain = new javax.swing.JTextPane();
        togRightAllignment = new javax.swing.JToggleButton();
        togCenterAllignment = new javax.swing.JToggleButton();
        togLeftAllignment = new javax.swing.JToggleButton();
        togCopy = new javax.swing.JToggleButton();
        togPaste = new javax.swing.JToggleButton();
        comSize = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        radplain = new javax.swing.JRadioButton();
        radbold = new javax.swing.JRadioButton();
        raditalic = new javax.swing.JRadioButton();
        radbi = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        togGreen = new javax.swing.JToggleButton();
        togBlue = new javax.swing.JToggleButton();
        togYelllow = new javax.swing.JToggleButton();
        togRed5 = new javax.swing.JToggleButton();
        togBlack = new javax.swing.JToggleButton();
        togMakeEmpty = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(txtPain);

        togRightAllignment.setIcon(new javax.swing.ImageIcon("C:\\Users\\DeLL\\Downloads\\align-right (1).png")); // NOI18N
        togRightAllignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togRightAllignmentActionPerformed(evt);
            }
        });

        togCenterAllignment.setIcon(new javax.swing.ImageIcon("C:\\Users\\DeLL\\Downloads\\align-center.png")); // NOI18N
        togCenterAllignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togCenterAllignmentActionPerformed(evt);
            }
        });

        togLeftAllignment.setIcon(new javax.swing.ImageIcon("C:\\Users\\DeLL\\Downloads\\align-left.png")); // NOI18N
        togLeftAllignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togLeftAllignmentActionPerformed(evt);
            }
        });

        togCopy.setIcon(new javax.swing.ImageIcon("C:\\Users\\DeLL\\Downloads\\copy.png")); // NOI18N
        togCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togCopyActionPerformed(evt);
            }
        });

        togPaste.setIcon(new javax.swing.ImageIcon("C:\\Users\\DeLL\\Downloads\\paste.png")); // NOI18N
        togPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togPasteActionPerformed(evt);
            }
        });

        comSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "12", "14", "16", "20", "26", "36", "72" }));
        comSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comSizeActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(radplain);
        radplain.setSelected(true);
        radplain.setText("Plain");
        radplain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radplainActionPerformed(evt);
            }
        });

        buttonGroup1.add(radbold);
        radbold.setText("Bold");
        radbold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radboldActionPerformed(evt);
            }
        });

        buttonGroup1.add(raditalic);
        raditalic.setText("Ialic");
        raditalic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raditalicActionPerformed(evt);
            }
        });

        buttonGroup1.add(radbi);
        radbi.setText("Bold & Italic");
        radbi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(radbi))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(raditalic)
                            .addComponent(radbold))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radplain)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radplain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE)
                .addComponent(radbold)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(raditalic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radbi)
                .addContainerGap())
        );

        jLabel1.setText("Font style");

        jLabel2.setText("Font size");

        togGreen.setBackground(new java.awt.Color(102, 255, 102));
        togGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togGreenActionPerformed(evt);
            }
        });

        togBlue.setBackground(new java.awt.Color(102, 255, 255));
        togBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togBlueActionPerformed(evt);
            }
        });

        togYelllow.setBackground(new java.awt.Color(255, 255, 51));
        togYelllow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togYelllowActionPerformed(evt);
            }
        });

        togRed5.setBackground(new java.awt.Color(255, 51, 51));
        togRed5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togRed5ActionPerformed(evt);
            }
        });

        togBlack.setBackground(new java.awt.Color(0, 0, 0));
        togBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togBlackActionPerformed(evt);
            }
        });

        togMakeEmpty.setIcon(new javax.swing.ImageIcon("C:\\Users\\DeLL\\Downloads\\empty-folder (1).png")); // NOI18N
        togMakeEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togMakeEmptyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(togCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(togPaste, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(togLeftAllignment, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(togCenterAllignment, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(togRightAllignment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(77, 77, 77)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(togRed5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(togGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(togBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(togYelllow, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(togBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comSize, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addComponent(togMakeEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(togLeftAllignment))
                            .addComponent(togCenterAllignment, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(togRightAllignment, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(togCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(togPaste, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comSize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(togMakeEmpty))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(togRed5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(togGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(togBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(togYelllow, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(togBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void togLeftAllignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togLeftAllignmentActionPerformed
        // TODO add your handling code here:
      
        StyledDocument style = txtPain.getStyledDocument();
        SimpleAttributeSet align = new SimpleAttributeSet();
        StyleConstants.setAlignment(align, StyleConstants.ALIGN_LEFT);
        style.setParagraphAttributes(0, style.getLength(), align, false);

    }//GEN-LAST:event_togLeftAllignmentActionPerformed

    private void togRightAllignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togRightAllignmentActionPerformed
        // TODO add your handling code here:
        StyledDocument style = txtPain.getStyledDocument();
        SimpleAttributeSet align = new SimpleAttributeSet();
        StyleConstants.setAlignment(align, StyleConstants.ALIGN_RIGHT);
        style.setParagraphAttributes(0, style.getLength(), align, false);
    }//GEN-LAST:event_togRightAllignmentActionPerformed

    private void togCenterAllignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togCenterAllignmentActionPerformed
        // TODO add your handling code here:

        StyledDocument style = txtPain.getStyledDocument();
        SimpleAttributeSet align = new SimpleAttributeSet();
        StyleConstants.setAlignment(align, StyleConstants.ALIGN_CENTER);
        style.setParagraphAttributes(0, style.getLength(), align, false);
        
    }//GEN-LAST:event_togCenterAllignmentActionPerformed

    private void togCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togCopyActionPerformed
        // TODO add your handling code here:

        txtPain.copy();
//        String myString = "This text will be copied into clipboard";
//        StringSelection stringSelection = new StringSelection(txtPain.getSelectedText());
//        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//        clipboard.setContents(stringSelection, null);

    }//GEN-LAST:event_togCopyActionPerformed

    private void togPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togPasteActionPerformed
        // TODO add your handling code here:
        txtPain.paste();

    }//GEN-LAST:event_togPasteActionPerformed

    private void comSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comSizeActionPerformed
        // TODO add your handling code here:

        size = Integer.parseInt(comSize.getSelectedItem().toString());

        Font f = new Font("Tahoma", Font.PLAIN, size);
        txtPain.setFont(f);

    }//GEN-LAST:event_comSizeActionPerformed

    private void radplainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radplainActionPerformed
        // TODO add your handling code here:
        f = new Font("Tahoma", Font.PLAIN, size);
        txtPain.setFont(f);
    }//GEN-LAST:event_radplainActionPerformed

    private void radboldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radboldActionPerformed
        // TODO add your handling code here:
        f = new Font("Tahoma", Font.BOLD, size);
        txtPain.setFont(f);
    }//GEN-LAST:event_radboldActionPerformed

    private void raditalicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raditalicActionPerformed
        // TODO add your handling code here:
        f = new Font("Tahoma", Font.ITALIC, size);
        txtPain.setFont(f);
    }//GEN-LAST:event_raditalicActionPerformed

    private void radbiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbiActionPerformed
        // TODO add your handling code here:
        f = new Font("Tahoma", Font.BOLD + Font.ITALIC, size);
        txtPain.setFont(f);
    }//GEN-LAST:event_radbiActionPerformed

    private void togGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togGreenActionPerformed
        // TODO add your handling code here:

        txtPain.setForeground(Color.green);

    }//GEN-LAST:event_togGreenActionPerformed

    private void togBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togBlueActionPerformed
        // TODO add your handling code here:

        txtPain.setForeground(Color.blue);

    }//GEN-LAST:event_togBlueActionPerformed

    private void togYelllowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togYelllowActionPerformed
        // TODO add your handling code here:

        Color yellow = new Color(246, 190, 0);
        txtPain.setForeground(yellow);


    }//GEN-LAST:event_togYelllowActionPerformed

    private void togRed5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togRed5ActionPerformed
        // TODO add your handling code here:
        txtPain.setForeground(Color.red);
    }//GEN-LAST:event_togRed5ActionPerformed

    private void togBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togBlackActionPerformed
        // TODO add your handling code here:

        txtPain.setForeground(Color.black);

    }//GEN-LAST:event_togBlackActionPerformed

    private void togMakeEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togMakeEmptyActionPerformed
        // TODO add your handling code here:

        int checkEmptyingPaper = JOptionPane.showOptionDialog(null, "Are you sure that you want to empty the paper?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

        switch (checkEmptyingPaper) {
            case 0:
                txtPain.setText("");
                break;
        }


    }//GEN-LAST:event_togMakeEmptyActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radbi;
    private javax.swing.JRadioButton radbold;
    private javax.swing.JRadioButton raditalic;
    private javax.swing.JRadioButton radplain;
    private javax.swing.JToggleButton togBlack;
    private javax.swing.JToggleButton togBlue;
    private javax.swing.JToggleButton togCenterAllignment;
    private javax.swing.JToggleButton togCopy;
    private javax.swing.JToggleButton togGreen;
    private javax.swing.JToggleButton togLeftAllignment;
    private javax.swing.JToggleButton togMakeEmpty;
    private javax.swing.JToggleButton togPaste;
    private javax.swing.JToggleButton togRed5;
    private javax.swing.JToggleButton togRightAllignment;
    private javax.swing.JToggleButton togYelllow;
    private javax.swing.JTextPane txtPain;
    // End of variables declaration//GEN-END:variables
}

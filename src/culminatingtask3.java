/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author owjam2372
 */
public class culminatingtask3 extends javax.swing.JFrame {

    /**
     * Creates new form culminatingtask3
     */
    public culminatingtask3() {
        initComponents();
    }
       public void picturedisable2(){
        pictureb2.setEnabled(false);
        picturec2.setEnabled(false);
        pictured2.setEnabled(false);
        picturea2.setEnabled(false);
       }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        picturea2 = new javax.swing.JButton();
        pictureb2 = new javax.swing.JButton();
        picturec2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pictured2 = new javax.swing.JButton();
        nextlevel = new javax.swing.JButton();
        indicator2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download (6).jpg"))); // NOI18N
        jLabel1.setText("Which Minecraft Block is the Jukebox?");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        picturea2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download (5).jpg"))); // NOI18N
        picturea2.setText("jButton1");
        picturea2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picturea2ActionPerformed(evt);
            }
        });

        pictureb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.png"))); // NOI18N
        pictureb2.setText("jButton2");
        pictureb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pictureb2ActionPerformed(evt);
            }
        });

        picturec2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download (6).jpg"))); // NOI18N
        picturec2.setText("jButton3");
        picturec2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picturec2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Which Minecraft block is the jukebox??");

        pictured2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download (7).jpg"))); // NOI18N
        pictured2.setText("jButton4");
        pictured2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pictured2ActionPerformed(evt);
            }
        });

        nextlevel.setText("Next Question");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(picturea2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(picturec2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pictureb2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pictured2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(indicator2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextlevel)
                        .addGap(178, 178, 178))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(picturea2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pictureb2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(picturec2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pictured2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nextlevel)
                    .addComponent(indicator2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pictured2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pictured2ActionPerformed
        indicator2.setText("Correct!");
        picturedisable2();
        culmiatingtask2.userPoint = culmiatingtask2.userPoint + 1;
    }//GEN-LAST:event_pictured2ActionPerformed

    private void pictureb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pictureb2ActionPerformed
        indicator2.setText("Incorrect!");
        picturedisable2();
    }//GEN-LAST:event_pictureb2ActionPerformed

    private void picturea2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picturea2ActionPerformed
        indicator2.setText("Incorrect!");
        picturedisable2();
    }//GEN-LAST:event_picturea2ActionPerformed

    private void picturec2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picturec2ActionPerformed
        indicator2.setText("Incorrect!");
        picturedisable2();
    }//GEN-LAST:event_picturec2ActionPerformed

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
            java.util.logging.Logger.getLogger(culminatingtask3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(culminatingtask3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(culminatingtask3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(culminatingtask3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new culminatingtask3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel indicator2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton nextlevel;
    private javax.swing.JButton picturea2;
    private javax.swing.JButton pictureb2;
    private javax.swing.JButton picturec2;
    private javax.swing.JButton pictured2;
    // End of variables declaration//GEN-END:variables
}

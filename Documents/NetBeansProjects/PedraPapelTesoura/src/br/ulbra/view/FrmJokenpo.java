package br.ulbra.view;
import java.awt.Color;
public class FrmJokenpo extends javax.swing.JFrame {

    public FrmJokenpo() {
        initComponents();
        getContentPane().setBackground(new Color(0,51, 102));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btmStart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\aluno.saolucas\\Downloads\\193157926-28cfdf41-89e8-4dc2-8ec2-525f0a88e5b8-removebg-preview.png")); // NOI18N

        btmStart.setBackground(java.awt.SystemColor.activeCaption);
        btmStart.setIcon(new javax.swing.ImageIcon("C:\\Users\\aluno.saolucas\\Downloads\\6077379.png")); // NOI18N
        btmStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(btmStart, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btmStart, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmStartActionPerformed
        FrmJogo frmjogo = new FrmJogo();
        frmjogo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btmStartActionPerformed

    public static void main(String args[]) {
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmJokenpo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmStart;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

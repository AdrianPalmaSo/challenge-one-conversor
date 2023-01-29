/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorchallenge;

import javax.swing.JOptionPane;

/**
 *
 * @author adr_e
 */
public class EntradaMonedas extends javax.swing.JFrame {

    /**
     * Creates new form EntradaMonedas
     */
    public EntradaMonedas() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        TxtDinero = new javax.swing.JTextField();
        BtnOkEntradaM = new javax.swing.JButton();
        BtnCancelarEntradaM = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entrada");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Ingresa la cantidad de dinero que deseas convertir");

        TxtDinero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDineroKeyTyped(evt);
            }
        });

        BtnOkEntradaM.setBackground(new java.awt.Color(153, 153, 153));
        BtnOkEntradaM.setText("OK");
        BtnOkEntradaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOkEntradaMActionPerformed(evt);
            }
        });

        BtnCancelarEntradaM.setBackground(new java.awt.Color(153, 153, 153));
        BtnCancelarEntradaM.setText("Cancelar");
        BtnCancelarEntradaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarEntradaMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtDinero)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(BtnOkEntradaM, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnCancelarEntradaM)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtDinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnOkEntradaM)
                    .addComponent(BtnCancelarEntradaM))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarEntradaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarEntradaMActionPerformed
        MenuConversor inicio = new MenuConversor();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnCancelarEntradaMActionPerformed

    private void TxtDineroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDineroKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)|!Character.isDigit(validar)&& validar == '-'){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"Ingresar solo numeros positivos");
        }
    }//GEN-LAST:event_TxtDineroKeyTyped

    private void BtnOkEntradaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOkEntradaMActionPerformed
        MenuMonedas monedas = new MenuMonedas();
        monedas.setVisible(true);
        this.dispose();
        monedas.recibirCantidad(Double.parseDouble(TxtDinero.getText()));
    }//GEN-LAST:event_BtnOkEntradaMActionPerformed

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
            java.util.logging.Logger.getLogger(EntradaMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntradaMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntradaMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntradaMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntradaMonedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelarEntradaM;
    private javax.swing.JButton BtnOkEntradaM;
    private javax.swing.JTextField TxtDinero;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

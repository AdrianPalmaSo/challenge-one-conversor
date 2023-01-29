/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorchallenge;

/**
 *
 * @author adr_e
 */
public class MenuTemperatura extends javax.swing.JFrame {

    /**
     * Creates new form MenuMonedas
     */
    private double cantidad;
    public MenuTemperatura() {
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
        ComboBoxMenu = new javax.swing.JComboBox<>();
        BtnOkTemperatura = new javax.swing.JButton();
        BtnCancelarTemperatura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Temperatura");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Elije la temperatura a la que deseas convertir");

        ComboBoxMenu.setBackground(new java.awt.Color(204, 204, 204));
        ComboBoxMenu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ComboBoxMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De Celsius a Farenheit", "De Celsius a Kelvin", "De Farenheit a Celsius", "De Farenheit a Kelvin", "De Kelvin a Celsius", "De Kelvin a Farenheit" }));

        BtnOkTemperatura.setBackground(new java.awt.Color(153, 153, 153));
        BtnOkTemperatura.setText("OK");
        BtnOkTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOkTemperaturaActionPerformed(evt);
            }
        });

        BtnCancelarTemperatura.setBackground(new java.awt.Color(153, 153, 153));
        BtnCancelarTemperatura.setText("Cancelar");
        BtnCancelarTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarTemperaturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ComboBoxMenu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(BtnOkTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCancelarTemperatura)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnOkTemperatura)
                    .addComponent(BtnCancelarTemperatura))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnOkTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOkTemperaturaActionPerformed
        ResultadoTemperatura resultado = new ResultadoTemperatura();
        int indice = ComboBoxMenu.getSelectedIndex();
        switch(indice){
            case 0:
                celsiusFarenheit(resultado);
                siguienteVentana(resultado);
                break;
            case 1:
                celsiusKelvin(resultado);
                siguienteVentana(resultado);
                break;
            case 2:
                FarenheitCelsius(resultado);
                siguienteVentana(resultado);
                break;
            case 3:
                FarenheitKelvin(resultado);
                siguienteVentana(resultado);
                break;
            case 4:
                KelvinCelsius(resultado);
                siguienteVentana(resultado);
                break;
            case 5:
                KelvinFarenheit(resultado);
                siguienteVentana(resultado);
                break;
            default:
                throw new RuntimeException();
        }   
    }//GEN-LAST:event_BtnOkTemperaturaActionPerformed

    private void siguienteVentana(ResultadoTemperatura resultado){
        resultado.setVisible(true);
        this.dispose();
    }
    
    private void celsiusFarenheit(ResultadoTemperatura resultado){
        double conversion = cantidad*1.8+32;
        String cantidadConvertir = Double.toString(cantidad);
        String cantidadConvertida = Double.toString(conversion);
        String resultadoConversion = cantidadConvertir+"°C es igual a "+cantidadConvertida+"°F";
        resultado.capturarResultado(resultadoConversion);
    }
    
    private void celsiusKelvin(ResultadoTemperatura resultado){
        double conversion = cantidad + 273.15;
        String cantidadConvertir = Double.toString(cantidad);
        String cantidadConvertida = Double.toString(conversion);
        String resultadoConversion = cantidadConvertir+"°C es igual a "+cantidadConvertida+"°K";
        resultado.capturarResultado(resultadoConversion);
    }
    
    private void KelvinCelsius(ResultadoTemperatura resultado){
        double conversion = cantidad - 273.15;
        String cantidadConvertir = Double.toString(cantidad);
        String cantidadConvertida = Double.toString(conversion);
        String resultadoConversion = cantidadConvertir+"°K es igual a "+cantidadConvertida+"°C";
        resultado.capturarResultado(resultadoConversion);
    }
    
    private void KelvinFarenheit(ResultadoTemperatura resultado){
        double conversion = (1.8*(cantidad - 273.15))+32;
        String cantidadConvertir = Double.toString(cantidad);
        String cantidadConvertida = Double.toString(conversion);
        String resultadoConversion = cantidadConvertir+"°K es igual a "+cantidadConvertida+"°F";
        resultado.capturarResultado(resultadoConversion);
    }
    
    private void FarenheitCelsius(ResultadoTemperatura resultado){
        double conversion = (cantidad - 32)/1.8;
        String cantidadConvertir = Double.toString(cantidad);
        String cantidadConvertida = Double.toString(conversion);
        String resultadoConversion = cantidadConvertir+"°F es igual a "+cantidadConvertida+"°C";
        resultado.capturarResultado(resultadoConversion);
    }
    
    private void FarenheitKelvin(ResultadoTemperatura resultado){
        double conversion = (0.555555*(cantidad-32))+273.15;
        String cantidadConvertir = Double.toString(cantidad);
        String cantidadConvertida = Double.toString(conversion);
        String resultadoConversion = cantidadConvertir+"°F es igual a "+cantidadConvertida+"°K";
        resultado.capturarResultado(resultadoConversion);
    }
    
    
    private void BtnCancelarTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarTemperaturaActionPerformed
        MenuConversor inicio = new MenuConversor();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnCancelarTemperaturaActionPerformed
    
    public void recibirCantidad(double temperatura){
        this.cantidad = temperatura;
    }
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
            java.util.logging.Logger.getLogger(MenuTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTemperatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelarTemperatura;
    private javax.swing.JButton BtnOkTemperatura;
    private javax.swing.JComboBox<String> ComboBoxMenu;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

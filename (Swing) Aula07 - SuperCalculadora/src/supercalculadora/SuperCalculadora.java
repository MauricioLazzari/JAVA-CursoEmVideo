/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supercalculadora;

/**
 *
 * @author mauri
 */
public class SuperCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form SuperCalculadora
     */
    public SuperCalculadora() {
        initComponents();
        panelResult.setVisible(false);
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
        panelResult = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblCubico = new javax.swing.JLabel();
        lblResto = new javax.swing.JLabel();
        lblSqrt = new javax.swing.JLabel();
        lblCbrt = new javax.swing.JLabel();
        lblAbs = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        spinNum = new javax.swing.JSpinner();
        btnCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelResult.setBackground(new java.awt.Color(204, 204, 204));
        panelResult.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setText("Resto da divisão por 2:");
        panelResult.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setText("Elevado ao cubo:");
        panelResult.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 53, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setText("Raiz Quadrada:");
        panelResult.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 92, 147, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel7.setText("Raiz Cúbica:");
        panelResult.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 131, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setText("Valor absoluto:");
        panelResult.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        lblCubico.setBackground(new java.awt.Color(255, 255, 255));
        lblCubico.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblCubico.setForeground(new java.awt.Color(255, 0, 51));
        lblCubico.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCubico.setText("0");
        lblCubico.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelResult.add(lblCubico, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 80, -1));

        lblResto.setBackground(new java.awt.Color(255, 255, 255));
        lblResto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblResto.setForeground(new java.awt.Color(255, 0, 51));
        lblResto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblResto.setText("0");
        lblResto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelResult.add(lblResto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 90, -1));

        lblSqrt.setBackground(new java.awt.Color(255, 255, 255));
        lblSqrt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblSqrt.setForeground(new java.awt.Color(255, 0, 51));
        lblSqrt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSqrt.setText("0");
        lblSqrt.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelResult.add(lblSqrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 280, -1));

        lblCbrt.setBackground(new java.awt.Color(255, 255, 255));
        lblCbrt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblCbrt.setForeground(new java.awt.Color(255, 0, 51));
        lblCbrt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCbrt.setText("0");
        lblCbrt.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelResult.add(lblCbrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 80, -1));

        lblAbs.setBackground(new java.awt.Color(255, 255, 255));
        lblAbs.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblAbs.setForeground(new java.awt.Color(255, 0, 51));
        lblAbs.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAbs.setText("0");
        lblAbs.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelResult.add(lblAbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 40, -1));

        jPanel1.add(panelResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 540, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calculadora.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 11, -1, 250));

        spinNum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(spinNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 82, 124, 41));

        btnCalcular.setText("CALCULAR");
        btnCalcular.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 180, 41));

        jLabel2.setBackground(new java.awt.Color(51, 102, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Informe o valor desejado:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 31, -1, -1));

        jLabel3.setBackground(new java.awt.Color(51, 102, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Resultados:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        int num = Integer.parseInt(spinNum.getValue().toString());
        
        //Calculando o Resto da divisão por 2.
        int resto = num % 2;
        lblResto.setText(Integer.toString(resto));
        
        //Calculando o num elevado ao cubo.
        double exp = Math.pow(num, 3);
        lblCubico.setText(String.format("%.2f", exp));
        
        //Calculando a Raiz Quadrada do num.
        
        double sqrt = Math.sqrt(num);
        if(Double.isNaN(sqrt)){
            lblSqrt.setText("Não é um número válido!");
        }else{
            lblSqrt.setText(String.format("%.2f", sqrt));
            }
      
        
        
        //Calculando a raiz cúbica.
        double cbrt = Math.cbrt(num);
        lblCbrt.setText(String.format("%.2f", cbrt));
        
        //Calculando o valor absoluto.
        lblAbs.setText(Integer.toString(num));
        
        panelResult.setVisible(true);
        
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(SuperCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuperCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuperCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuperCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAbs;
    private javax.swing.JLabel lblCbrt;
    private javax.swing.JLabel lblCubico;
    private javax.swing.JLabel lblResto;
    private javax.swing.JLabel lblSqrt;
    private javax.swing.JPanel panelResult;
    private javax.swing.JSpinner spinNum;
    // End of variables declaration//GEN-END:variables
}

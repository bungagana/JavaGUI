/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tubes;


/**
 *
 * @author bunga
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        labelHeader = new javax.swing.JLabel();
        panelPapanJadwal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btPesawat = new javax.swing.JButton();
        btBus = new javax.swing.JButton();
        btKereta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));

        labelHeader.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHeader.setText("PROGRAM PEMESANAN TIKET");
        labelHeader.setToolTipText("");

        panelPapanJadwal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jadwal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 12))); // NOI18N
        panelPapanJadwal.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Purwokerto", "Semarang", "Rp80.000"},
                {"Jogjakarta", "Purwokerto", "Rp90.000"},
                {"Jogjakarta", "Makassar", "Rp75.000"},
                {"Jakarta", "Purwokerto", "Rp80.000"},
                {"Semarang", "Jogjakarta", "Rp50.000"},
                {null, null, null}
            },
            new String [] {
                "Kota Asal", "Kota Tujuan", "Harga"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        panelPapanJadwal.add(jScrollPane1, java.awt.BorderLayout.PAGE_START);

        jLabel1.setText("jLabel1");
        panelPapanJadwal.add(jLabel1, java.awt.BorderLayout.CENTER);

        jLabel2.setText("jLabel2");
        panelPapanJadwal.add(jLabel2, java.awt.BorderLayout.LINE_START);

        btPesawat.setBackground(new java.awt.Color(153, 204, 255));
        btPesawat.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btPesawat.setText("Pesawat");
        btPesawat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btPesawat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesawatActionPerformed(evt);
            }
        });

        btBus.setBackground(new java.awt.Color(153, 204, 255));
        btBus.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btBus.setText("Bus");
        btBus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBusActionPerformed(evt);
            }
        });

        btKereta.setBackground(new java.awt.Color(153, 204, 255));
        btKereta.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btKereta.setText("Kereta");
        btKereta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btKereta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKeretaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(746, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelPapanJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btBus, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btPesawat, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGap(289, 289, 289))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelHeader)
                        .addGap(475, 475, 475))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(457, 457, 457))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelHeader)
                .addGap(34, 34, 34)
                .addComponent(panelPapanJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPesawat, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPesawatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesawatActionPerformed
    FormPesawat menu = new FormPesawat();
    menu.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btPesawatActionPerformed

    private void btKeretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKeretaActionPerformed
    FormKereta menu = new FormKereta();
    menu.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btKeretaActionPerformed

    private void btBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBusActionPerformed
    FormBus menu = new FormBus();
    menu.setVisible(true);
    this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btBusActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBus;
    private javax.swing.JButton btKereta;
    private javax.swing.JButton btPesawat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JPanel panelPapanJadwal;
    // End of variables declaration//GEN-END:variables
}
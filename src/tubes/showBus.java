/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tubes;

import tubes.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.sql.PreparedStatement;


/**
 *
 * @author LENOVO
 */
public class showBus extends javax.swing.JFrame {
private NonEditableTableModel tabelshowbus;
public void tambahDataTabelTiket(String nama, String NIK, String kotaAsal, String tujuan, String tanggalBerangkat, int harga) {
    DefaultTableModel model = (DefaultTableModel) tableshowbus.getModel();
    model.insertRow(0, new Object[]{nama, NIK, kotaAsal, tujuan, tanggalBerangkat, harga});
   
    int rowCount = model.getRowCount();
    int totalHarga = 0;
    
   for (int i = 0; i < rowCount; i++) {
    Object value = model.getValueAt(i, 5);
    if (value != null) {
        totalHarga += Integer.parseInt(value.toString());
    }
}

    
   model.setValueAt(totalHarga, 0, 5);  // Mengisi kolom harga dengan totalHarga}
}

    public void setTotalHarga(int totalHarga) {
    labelTotalHarga.setText(String.valueOf(totalHarga));
}
    public void updateData(showBus showPesawatInstance, DefaultTableModel model) {
    showPesawatInstance.tableshowbus.setModel(model);
   
}
public void tambahDataTabelPenumpang(String nama, String NIK, String kotaAsal, String tujuan, String tanggalBerangkat, String alamat, String noHp) {
    DefaultTableModel model = (DefaultTableModel) tablePenumpang.getModel();
    model.insertRow(0,new Object[]{nama, NIK, kotaAsal, tujuan, tanggalBerangkat, alamat, noHp});
   
    int rowCount = model.getRowCount();
    
}
  public void updateDataPenumpang() {
        DefaultTableModel model = (DefaultTableModel) tablePenumpang.getModel();
        model.setRowCount(0); // Menghapus semua baris dalam tabel

        // Konfigurasi koneksi database
        String url = "jdbc:mysql://localhost:3306/tiket";
        String user = "Bunga";
        String passwordDb = "123";

        // Query SQL untuk mendapatkan data dari tabel penumpang
        String penumpangQuery = "SELECT nama, NIK, kotaAsal, tujuan, tanggalBerangkat, Alamat, noHp FROM penumpang_bus";

        try (Connection conn = DriverManager.getConnection(url, user, passwordDb);
        PreparedStatement stmt = conn.prepareStatement(penumpangQuery);
        var rs = stmt.executeQuery()) {

       while (rs.next()) {
           String nama = rs.getString("nama");
           String NIK = rs.getString("NIK");
           String kotaAsal = rs.getString("kotaAsal");
           String tujuan = rs.getString("tujuan");
           String tanggalBerangkat = rs.getString("tanggalBerangkat");
           String alamat = rs.getString("Alamat");
           String noHp = rs.getString("noHp");

           model.addRow(new Object[]{nama, NIK, kotaAsal, tujuan, tanggalBerangkat, alamat, noHp});
       }
    } catch (SQLException e) {
        System.out.println("Terjadi kesalahan saat memperbarui data penumpang: " + e.getMessage());
    }


        tablePenumpang.setModel(model); // Memperbarui tampilan tabel
    }
    /**
     * Creates new form showPesawat
     */
public class NonEditableTableModel extends DefaultTableModel {
    
    public NonEditableTableModel(Object[][] data, Object[] columnNames) {
        super(data, columnNames);
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        return false; // Menjadikan semua sel tidak bisa diedit
    }
}
    public showBus() {
        initComponents();
         // Inisialisasi model tabel penumpang
        DefaultTableModel modelPenumpang = new DefaultTableModel(
            new Object[][] {},
            new String[] {"Nama", "NIK", "Kota Asal", "Kota Tujuan", "Tanggal Berangkat", "Alamat", "No Hp"}
        );

        // Atur model tabel penumpang
        tablePenumpang.setModel(modelPenumpang);

        // Inisialisasi model tabel showBus
        tabelshowbus = new NonEditableTableModel(
            new Object[][] {},
            new String[] {"Nama", "NIK", "Kota Asal", "Tujuan", "Tanggal Berangkat", "Harga"}
        );

        // Atur model tabel showkereta
        tableshowbus.setModel(tabelshowbus);

        updateDataPenumpang();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePenumpang = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        labelTotalHarga = new javax.swing.JLabel();
        labelTotalHarga1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableshowbus = new javax.swing.JTable();
        labelHeader1 = new javax.swing.JLabel();
        btCari = new javax.swing.JButton();
        inputCari = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelHeader.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHeader.setText("DATA PENUMPANG BUS");
        labelHeader.setToolTipText("");
        getContentPane().add(labelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, -1));

        tablePenumpang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "NIK", "Kota Asal", "Kota Tujuan", "Tanggal Berangkat", "Alamat", "No Hp"
            }
        ));
        jScrollPane1.setViewportView(tablePenumpang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 760, 154));

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, -1, -1));

        labelTotalHarga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTotalHarga.setText("Total");
        getContentPane().add(labelTotalHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 52, -1));

        labelTotalHarga1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTotalHarga1.setText("Total");
        getContentPane().add(labelTotalHarga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 52, -1));

        tableshowbus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "NIK", "Kota Asal", "Kota Tujuan", "Tanggal Berangkat", "Harga"
            }
        ));
        jScrollPane2.setViewportView(tableshowbus);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 60, 760, 120));

        labelHeader1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelHeader1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHeader1.setText("PEMESANAN TIKET BUS");
        labelHeader1.setToolTipText("");
        getContentPane().add(labelHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        btCari.setBackground(new java.awt.Color(153, 204, 255));
        btCari.setText("Cari");
        btCari.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCariActionPerformed(evt);
            }
        });
        getContentPane().add(btCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 40, 30));

        inputCari.setText("Cari Data");
        inputCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCariActionPerformed(evt);
            }
        });
        getContentPane().add(inputCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 250, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FormBus menu = new FormBus();
        menu.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCariActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tablePenumpang.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tablePenumpang.setRowSorter(sorter);

        String searchText = inputCari.getText(); // Ganti dengan komponen input pengguna yang sesuai
        RowFilter<DefaultTableModel, Object> filter = RowFilter.regexFilter(searchText);
        sorter.setRowFilter(filter);

        sorter.sort();
    }//GEN-LAST:event_btCariActionPerformed

    private void inputCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCariActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showBus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCari;
    private javax.swing.JTextField inputCari;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JLabel labelHeader1;
    private javax.swing.JLabel labelTotalHarga;
    private javax.swing.JLabel labelTotalHarga1;
    private javax.swing.JTable tablePenumpang;
    private javax.swing.JTable tableshowbus;
    // End of variables declaration//GEN-END:variables
}

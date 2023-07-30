/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tubes;

import tubes.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author bunga
 */
public class FormPesawat extends javax.swing.JFrame {
private showPesawat showPesawatInstance;

    /**
     * Creates new form FormPesawat
     */
    public FormPesawat() {
        initComponents();
        showPesawatInstance = new showPesawat();
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
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        labelAsal = new javax.swing.JLabel();
        inputAsal = new javax.swing.JTextField();
        inputTujuan = new javax.swing.JTextField();
        labelTujuan = new javax.swing.JLabel();
        labelTanggal = new javax.swing.JLabel();
        comboTanggal = new javax.swing.JComboBox<>();
        comboBulan = new javax.swing.JComboBox<>();
        comboTahun = new javax.swing.JComboBox<>();
        labelJam = new javax.swing.JLabel();
        comboJam = new javax.swing.JComboBox<>();
        labelNama = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        labelNIK = new javax.swing.JLabel();
        inputNIK = new javax.swing.JTextField();
        labelAlamat = new javax.swing.JLabel();
        inputAlamat = new javax.swing.JTextField();
        labelHp = new javax.swing.JLabel();
        inputHp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelShow = new javax.swing.JTable();
        btCari = new javax.swing.JButton();
        inputCari = new javax.swing.JTextField();
        btHapus = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btAdd = new javax.swing.JButton();
        btKeluar = new javax.swing.JButton();
        btBeli = new javax.swing.JButton();
        labelHarga = new javax.swing.JLabel();
        inputHarga = new javax.swing.JTextField();
        show = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));

        labelHeader.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHeader.setText("Pemesanan Tiket Pesawat");
        labelHeader.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelAsal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelAsal.setText("Kota Asal");

        inputAsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAsalActionPerformed(evt);
            }
        });

        inputTujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTujuanActionPerformed(evt);
            }
        });

        labelTujuan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelTujuan.setText("Kota Tujuan");

        labelTanggal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelTanggal.setText("Tanggal Berangkat");

        comboTanggal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        comboTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTanggalActionPerformed(evt);
            }
        });

        comboBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober ", "November", "Desember", " " }));

        comboTahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023" }));

        labelJam.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelJam.setText("Jam Berangkat");

        comboJam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12.00 WIB", "13.00 WIB", "15.30 WIB", "16.30 WIB", "19.00 WIB", "21.00 WIB" }));
        comboJam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboJamActionPerformed(evt);
            }
        });

        labelNama.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelNama.setText("Nama Penumpang");

        inputNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaActionPerformed(evt);
            }
        });

        labelNIK.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelNIK.setText("NIK");

        labelAlamat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelAlamat.setText("Alamat");

        labelHp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelHp.setText("No HP");

        inputHp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHpActionPerformed(evt);
            }
        });

        tabelShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIK", "Nama", "Kota Tujuan", "Kota Asal", "Tanggal Berangkat", "Harga"
            }
        ));
        jScrollPane1.setViewportView(tabelShow);

        btCari.setBackground(new java.awt.Color(153, 204, 255));
        btCari.setText("Cari");
        btCari.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCariActionPerformed(evt);
            }
        });

        inputCari.setText("Cari Data");
        inputCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCariActionPerformed(evt);
            }
        });

        btHapus.setBackground(new java.awt.Color(153, 204, 255));
        btHapus.setText("Hapus");
        btHapus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        btEdit.setBackground(new java.awt.Color(153, 204, 255));
        btEdit.setText("Edit");
        btEdit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btAdd.setBackground(new java.awt.Color(153, 204, 255));
        btAdd.setText("Add Data");
        btAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btKeluar.setBackground(new java.awt.Color(153, 204, 255));
        btKeluar.setText("Keluar");
        btKeluar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKeluarActionPerformed(evt);
            }
        });

        btBeli.setBackground(new java.awt.Color(153, 204, 255));
        btBeli.setText("Beli");
        btBeli.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBeliActionPerformed(evt);
            }
        });

        labelHarga.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelHarga.setText("Harga");

        show.setBackground(new java.awt.Color(153, 204, 255));
        show.setText("Show");
        show.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAsal)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(inputAsal, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(labelTujuan)
                                            .addGap(57, 57, 57)
                                            .addComponent(inputTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labelJam)
                                                .addComponent(labelHarga))
                                            .addGap(40, 40, 40)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(comboJam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                                .addComponent(inputHarga)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(labelTanggal)
                                            .addGap(18, 18, 18)
                                            .addComponent(comboTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(comboBulan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(comboTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(161, 161, 161)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNama)
                            .addComponent(labelNIK)
                            .addComponent(labelAlamat)
                            .addComponent(labelHp))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputNama, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                            .addComponent(inputNIK)
                            .addComponent(inputAlamat)
                            .addComponent(inputHp))
                        .addGap(90, 90, 90))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btCari, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inputCari, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(396, 396, 396))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAsal)
                    .addComponent(inputAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNama)
                    .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTujuan)
                    .addComponent(labelNIK)
                    .addComponent(inputNIK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTanggal)
                    .addComponent(comboTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAlamat)
                    .addComponent(inputAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboJam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelJam)
                    .addComponent(labelHp)
                    .addComponent(inputHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHarga)
                    .addComponent(inputHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(btAdd)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCari)
                    .addComponent(inputCari, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btHapus)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btEdit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btBeli)))
                    .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(510, 510, 510)
                        .addComponent(labelHeader))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(574, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelHeader)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputAsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAsalActionPerformed

    private void inputTujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTujuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTujuanActionPerformed

    private void comboTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTanggalActionPerformed

    private void comboJamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboJamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboJamActionPerformed

    private void inputNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaActionPerformed

    private void inputHpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputHpActionPerformed

    private void btCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCariActionPerformed
        // TODO add your handling code here:
    DefaultTableModel model = (DefaultTableModel) tabelShow.getModel();
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
    tabelShow.setRowSorter(sorter);

    String searchText = inputCari.getText(); // Ganti dengan komponen input pengguna yang sesuai
    RowFilter<DefaultTableModel, Object> filter = RowFilter.regexFilter(searchText);
    sorter.setRowFilter(filter);

    sorter.sort();
    }//GEN-LAST:event_btCariActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        // get indeks
    int selectedRow = tabelShow.getSelectedRow();

    // minim ada baris yg di klik
    if (selectedRow == -1) {
        //if none, show pop up
        JOptionPane.showMessageDialog(this, "Pilih baris yang akan diedit", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    int harga = Integer.parseInt(inputHarga.getText());
    String nama = inputNama.getText();
    String nik = inputNIK.getText();
    String kotaTujuan = inputTujuan.getText();
    String kotaAsal = inputAsal.getText();
    String tanggal = comboTanggal.getSelectedItem().toString();
    String bulan = comboBulan.getSelectedItem().toString();
    String tahun = comboTahun.getSelectedItem().toString();
   
    //merge jdi string
    String tanggalBerangkat = tanggal + " " + bulan + " " + tahun;

    // Menyimpan data
    Object[] data = {nama, nik, kotaTujuan, kotaAsal, tanggalBerangkat, harga};

    DefaultTableModel model = (DefaultTableModel) tabelShow.getModel();
    model.setValueAt(nik, selectedRow, 0); 
    model.setValueAt(nama, selectedRow, 1); 
    model.setValueAt(kotaTujuan, selectedRow, 3); 
    model.setValueAt(kotaAsal, selectedRow, 2);
    model.setValueAt(tanggalBerangkat, selectedRow, 4); 
    model.setValueAt(harga, selectedRow, 5); 
 
    // Menampilkan pesan bahwa perubahan berhasil disimpan
    JOptionPane.showMessageDialog(this, "Perubahan berhasil disimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
    showPesawatInstance.updateData(showPesawatInstance, model);
    }//GEN-LAST:event_btEditActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
    String hargaText = inputHarga.getText();
    int harga;
   try {
        if (hargaText.isEmpty()) {
            throw new Exception("Harga harus diisi");
        }
        harga = Integer.parseInt(hargaText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Harga tidak valid", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
   
    String nama = inputNama.getText();
    String nik = inputNIK.getText();
    String kotaTujuan = inputTujuan.getText();
    String kotaAsal = inputAsal.getText();
    String tanggal = comboTanggal.getSelectedItem().toString();
    String bulan = comboBulan.getSelectedItem().toString();
    String tahun = comboTahun.getSelectedItem().toString();
    String tanggalBerangkat = tanggal + " " + bulan + " " + tahun;
    // Menyimpan data
    Object[] data = {nik,nama,kotaTujuan, kotaAsal, tanggalBerangkat, harga};

    // add data to tabelShow
    DefaultTableModel model = (DefaultTableModel) tabelShow.getModel();
    model.addRow(data);
    }//GEN-LAST:event_btAddActionPerformed

    private void btKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKeluarActionPerformed
    Menu menu = new Menu();
    menu.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btKeluarActionPerformed

    private void btBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBeliActionPerformed
    showPesawat menu = new showPesawat();

    DefaultTableModel model = (DefaultTableModel) tabelShow.getModel();
    int rowCount = model.getRowCount();

    int totalHarga = 0; // Variabel untuk menyimpan total harga

    // Konfigurasi koneksi database
    String url = "jdbc:mysql://localhost:3306/tiket";
    String user = "Bunga";
    String passwordDb = "123";

    // Query SQL untuk menyimpan data ke tabel pesawat
    String pesawatQuery = "INSERT INTO pesawat (NIK, nama, kotaAsal, tujuan, tanggalBerangkat, harga) VALUES (?, ?, ?, ?, ?, ?)";

    // Query SQL untuk menyimpan data ke tabel penumpang
    String penumpangQuery = "INSERT INTO penumpang (NIK, nama, kotaAsal, tujuan, tanggalBerangkat, Alamat, noHp) VALUES (?, ?, ?, ?, ?, ?, ?)";

    try (Connection conn = DriverManager.getConnection(url, user, passwordDb);
         PreparedStatement pesawatStmt = conn.prepareStatement(pesawatQuery);
         PreparedStatement penumpangStmt = conn.prepareStatement(penumpangQuery)) {

        for (int i = 0; i < rowCount; i++) {
            String NIK = model.getValueAt(i, 0).toString();
            String nama = model.getValueAt(i, 1).toString();
            String kotaAsal = model.getValueAt(i, 3).toString();
            String tujuan = model.getValueAt(i, 2).toString();
            String tanggalBerangkat = model.getValueAt(i, 4).toString();
            int harga = Integer.parseInt(model.getValueAt(i, 5).toString());
            totalHarga += harga; // Tambahkan harga ke totalHarga

            pesawatStmt.setString(1, NIK);
            pesawatStmt.setString(2, nama);
            pesawatStmt.setString(3, kotaAsal);
            pesawatStmt.setString(4, tujuan);
            pesawatStmt.setString(5, convertDateFormat(tanggalBerangkat));
            pesawatStmt.setInt(6, harga);

            // Eksekusi query untuk menyimpan data ke tabel pesawat
            int rowsInsertedPesawat = pesawatStmt.executeUpdate();
            if (rowsInsertedPesawat > 0) {
                System.out.println("Data berhasil disimpan ke tabel pesawat.");
            } else {
                System.out.println("Gagal menyimpan data ke tabel pesawat.");
            }

            // Mengambil data alamat dan no hp dari input pengguna
            String alamat = inputAlamat.getText();
            String noHp = inputHp.getText();

            penumpangStmt.setString(1, NIK);
            penumpangStmt.setString(2, nama);
            penumpangStmt.setString(3, kotaAsal);
            penumpangStmt.setString(4, tujuan);
            penumpangStmt.setString(5, convertDateFormat(tanggalBerangkat));
            penumpangStmt.setString(6, alamat);
            penumpangStmt.setString(7, noHp);

            // Eksekusi query untuk menyimpan data ke tabel penumpang
            int rowsInsertedPenumpang = penumpangStmt.executeUpdate();
            if (rowsInsertedPenumpang > 0) {
                System.out.println("Data berhasil disimpan ke tabel penumpang.");
            } else {
                System.out.println("Gagal menyimpan data ke tabel penumpang.");
            }

            menu.tambahDataTabelTiket(NIK, nama, kotaAsal, tujuan, tanggalBerangkat, harga);
            menu.tambahDataTabelPenumpang(nama, NIK, kotaAsal, tujuan, tanggalBerangkat, alamat, noHp);

        }
    } catch (SQLException e) {
        System.out.println("Terjadi kesalahan saat menyimpan data: " + e.getMessage());
    }

    // Set total harga ke showPesawat
    menu.setTotalHarga(totalHarga);

    menu.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btBeliActionPerformed

private String convertDateFormat(String inputDate) {
    // Assuming the input date format is 'd MMMM yyyy'
    SimpleDateFormat inputFormat = new SimpleDateFormat("d MMMM yyyy", new Locale("id"));
    SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
    String outputDate = null;

    try {
        Date date = inputFormat.parse(inputDate);
        outputDate = outputFormat.format(date);
    } catch (ParseException e) {
        e.printStackTrace();
        // Set outputDate to null if parsing fails
        outputDate = null;
    }

    return outputDate;
}
    
    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
          int selectedRow = tabelShow.getSelectedRow();

    // Pastikan ada baris yang dipilih
    if (selectedRow == -1) {
        // Tampilkan pesan bahwa tidak ada baris yang dipilih
        JOptionPane.showMessageDialog(this, "Pilih baris yang akan dihapus", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Konfirmasi penghapusan dengan dialog box
    int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        // Hapus baris dari model tabel
        DefaultTableModel model = (DefaultTableModel) tabelShow.getModel();
        model.removeRow(selectedRow);

        // Menampilkan pesan bahwa data berhasil dihapus
        JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_btHapusActionPerformed

    private void inputCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCariActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
    showPesawat menu = new showPesawat();
    DefaultTableModel model = new DefaultTableModel();
    // kode untuk mengisi model dengan data yang sesuai
   
    menu.updateData(menu, model);
    menu.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_showActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FormPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPesawat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btBeli;
    private javax.swing.JButton btCari;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btKeluar;
    private javax.swing.JComboBox<String> comboBulan;
    private javax.swing.JComboBox<String> comboJam;
    private javax.swing.JComboBox<String> comboTahun;
    private javax.swing.JComboBox<String> comboTanggal;
    private javax.swing.JTextField inputAlamat;
    private javax.swing.JTextField inputAsal;
    private javax.swing.JTextField inputCari;
    private javax.swing.JTextField inputHarga;
    private javax.swing.JTextField inputHp;
    private javax.swing.JTextField inputNIK;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputTujuan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelAsal;
    private javax.swing.JLabel labelHarga;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JLabel labelHp;
    private javax.swing.JLabel labelJam;
    private javax.swing.JLabel labelNIK;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelTanggal;
    private javax.swing.JLabel labelTujuan;
    private javax.swing.JButton show;
    private javax.swing.JTable tabelShow;
    // End of variables declaration//GEN-END:variables
}

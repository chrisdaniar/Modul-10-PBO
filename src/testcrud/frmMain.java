/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcrud;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.Timer;

/**
 *
 * @author Chrisdaniar
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
        SetJam(); 
        setTanggal();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label_tanggal = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nol_jam = new javax.swing.JLabel();
        nolmenit = new javax.swing.JLabel();
        nol_detik = new javax.swing.JLabel();
        label_jam = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bSave = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        bRefresh = new javax.swing.JButton();
        bEdit1 = new javax.swing.JButton();
        jPrint = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfNis = new javax.swing.JTextField();
        tfNama = new javax.swing.JTextField();
        tfKelas = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taAlamat = new javax.swing.JTextArea();
        rbLaki = new javax.swing.JRadioButton();
        rbPerempuan = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        tfTempat = new javax.swing.JTextField();
        jTanggal = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        nol_menit = new javax.swing.JLabel();
        labeltanggal = new javax.swing.JLabel();
        labeljam = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORM BIODATA SISWA SMK TELKOM");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 350, 40);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("The Real Informatic Schools");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 40, 220, 15);

        label_tanggal.setBackground(new java.awt.Color(255, 255, 255));
        label_tanggal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_tanggal.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(label_tanggal);
        label_tanggal.setBounds(780, 10, 90, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tanggal :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(720, 20, 80, 15);
        jPanel1.add(nol_jam);
        nol_jam.setBounds(780, 30, 40, 30);
        jPanel1.add(nolmenit);
        nolmenit.setBounds(830, 30, 40, 30);
        jPanel1.add(nol_detik);
        nol_detik.setBounds(890, 30, 40, 40);

        label_jam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_jam.setForeground(new java.awt.Color(255, 255, 255));
        label_jam.setText("Jam");
        jPanel1.add(label_jam);
        label_jam.setBounds(720, 40, 180, 15);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1060, 70);

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setLayout(null);

        bSave.setBackground(new java.awt.Color(255, 51, 51));
        bSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bSave.setForeground(new java.awt.Color(255, 255, 255));
        bSave.setText("Save");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });
        jPanel2.add(bSave);
        bSave.setBounds(10, 10, 120, 30);

        bDelete.setBackground(new java.awt.Color(255, 51, 51));
        bDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bDelete.setForeground(new java.awt.Color(255, 255, 255));
        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(bDelete);
        bDelete.setBounds(150, 10, 110, 30);

        bClear.setBackground(new java.awt.Color(255, 51, 51));
        bClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bClear.setForeground(new java.awt.Color(255, 255, 255));
        bClear.setText("Clear");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });
        jPanel2.add(bClear);
        bClear.setBounds(280, 10, 100, 30);

        bRefresh.setBackground(new java.awt.Color(255, 51, 51));
        bRefresh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bRefresh.setForeground(new java.awt.Color(255, 255, 255));
        bRefresh.setText("Refresh");
        bRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefreshActionPerformed(evt);
            }
        });
        jPanel2.add(bRefresh);
        bRefresh.setBounds(400, 10, 110, 30);

        bEdit1.setBackground(new java.awt.Color(255, 51, 51));
        bEdit1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bEdit1.setForeground(new java.awt.Color(255, 255, 255));
        bEdit1.setText("Edit");
        bEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEdit1ActionPerformed(evt);
            }
        });
        jPanel2.add(bEdit1);
        bEdit1.setBounds(530, 10, 120, 30);

        jPrint.setBackground(new java.awt.Color(255, 51, 51));
        jPrint.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPrint.setForeground(new java.awt.Color(255, 255, 255));
        jPrint.setText("Print");
        jPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrintActionPerformed(evt);
            }
        });
        jPanel2.add(jPrint);
        jPrint.setBounds(670, 10, 130, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(250, 80, 810, 50);

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NIS");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 10, 130, 10);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kelas");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 310, 130, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tanggal Lahir");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 190, 170, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jenis Kelamin");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 250, 130, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Alamat");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 440, 130, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(10, 370, 130, 30);
        jPanel3.add(tfNis);
        tfNis.setBounds(10, 30, 180, 30);
        jPanel3.add(tfNama);
        tfNama.setBounds(10, 90, 180, 30);
        jPanel3.add(tfKelas);
        tfKelas.setBounds(10, 340, 180, 30);
        jPanel3.add(tfEmail);
        tfEmail.setBounds(10, 410, 180, 30);

        taAlamat.setColumns(20);
        taAlamat.setRows(5);
        jScrollPane1.setViewportView(taAlamat);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 480, 180, 70);

        rbLaki.setBackground(new java.awt.Color(255, 51, 51));
        buttonGroup1.add(rbLaki);
        rbLaki.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbLaki.setForeground(new java.awt.Color(255, 255, 255));
        rbLaki.setText("Laki-Laki");
        rbLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLakiActionPerformed(evt);
            }
        });
        jPanel3.add(rbLaki);
        rbLaki.setBounds(10, 290, 79, 23);

        rbPerempuan.setBackground(new java.awt.Color(255, 51, 51));
        buttonGroup1.add(rbPerempuan);
        rbPerempuan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbPerempuan.setForeground(new java.awt.Color(255, 255, 255));
        rbPerempuan.setText("Perempuan");
        jPanel3.add(rbPerempuan);
        rbPerempuan.setBounds(100, 290, 110, 23);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("NAMA");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 60, 130, 30);
        jPanel3.add(tfTempat);
        tfTempat.setBounds(10, 150, 180, 30);
        jPanel3.add(jTanggal);
        jTanggal.setBounds(10, 220, 180, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tempat Lahir");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(10, 120, 170, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 110, 230, 570);

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));
        jPanel4.setForeground(new java.awt.Color(204, 0, 0));
        jPanel4.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ISIAN DATA SISWA");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(10, 10, 130, 10);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 80, 230, 30);

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));
        jPanel5.setLayout(null);

        tblData.setBackground(new java.awt.Color(153, 0, 0));
        tblData.setForeground(new java.awt.Color(255, 255, 255));
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "NamaSiswa", "TempatLahir", "TanggalLahir", "JenisKelamin", "Kelas", "Email", "Alamat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblData);

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(20, 10, 770, 510);

        nol_menit.setBackground(new java.awt.Color(255, 255, 255));
        nol_menit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(nol_menit);
        nol_menit.setBounds(410, 170, 90, 30);

        labeltanggal.setBackground(new java.awt.Color(255, 255, 255));
        labeltanggal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(labeltanggal);
        labeltanggal.setBounds(530, 200, 90, 30);
        jPanel5.add(labeljam);
        labeljam.setBounds(60, 410, 0, 0);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(250, 140, 810, 540);

        setBounds(0, 0, 1082, 722);
    }// </editor-fold>//GEN-END:initComponents

    private void rbLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbLakiActionPerformed

    private void jPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrintActionPerformed
        MessageFormat header = new MessageFormat("Biodata Siswa SMK Telkom Malng");
        MessageFormat footer = new MessageFormat("Page {0,number,integer}       ");
        try {
            tblData.print(JTable.PrintMode.FIT_WIDTH, header,footer, true, null, true,null);

        } catch (java.awt.print.PrinterException e){
            System.err.format("Cannot print %s&n", e.getMessage());
        }
    }//GEN-LAST:event_jPrintActionPerformed

    private void bEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEdit1ActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = dateFormat.format(jTanggal.getDate());

        int baris = tblData.getSelectedRow();
        String nis = tblData.getValueAt(baris, 0).toString();

        if ("".equals(tfNis.getText()) || "".equals(taAlamat.getText()) ||
            "".equals(tfKelas.getText()) || "".equals(tfNama.getText()) ||
            "".equals(tfEmail.getText()) ||
            "".equals(tfTempat.getText()) ||
            "".equals(jTanggal.getDate())) {
        } else {
            String JK = "";
            if (rbLaki.isSelected()) {
                JK = "L";
            }else {
                JK = "P";
            }

            String SQL = "UPDATE `t_siswa` SET `NIS`='"+tfNis.getText()
            +"',`NamaSiswa`='"+tfNama.getText()
            +"',`TempatLahir`='"+tfTempat.getText()
            +"',`TanggalLahir` = '"+tanggal
            +"',`JenisKelamin`='"+JK
            +"',`Kelas`='"+tfKelas.getText()
            +"',`Email`='"+tfEmail.getText()
            +"',`Alamat`='"+taAlamat.getText()+"',"
            + "' WHERE NIS='"+nis+"'";
        }
        String SQL = null;
        int status = KoneksiDB.execute(SQL);
        if (status == 1) {
            JOptionPane.showMessageDialog(this, "Data Berhasil Diupdate", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            selectData();
        } else {
            JOptionPane.showMessageDialog(this, "Data Gagal Diupdate", "Sukses", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bEdit1ActionPerformed

    private void bRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefreshActionPerformed

        selectData();
        }
        public void selectData() {
            String kolom[] = {"NIS","NamaSiswa","TempatLahir","TanggalLahir","JenisKelamin","Kelas","Email","Alamat"};
            DefaultTableModel dtm = new DefaultTableModel(null, kolom);
            String SQL = "SELECT * FROM t_siswa";
            ResultSet rs = KoneksiDB.executeQuery(SQL);
            try {
                while (rs.next()) {
                    String NIS = rs.getString(1);
                    String NamaSiswa = rs.getString(2);
                    String TempatLahir = rs.getString(3);
                    String TanggalLahir = rs.getString(4);
                    String JenisKelamin = "";
                    if ("L".equals(rs.getString(5))) {
                        JenisKelamin = "Laki-Laki";
                    } else {
                        JenisKelamin = "Perempuan";
                    }
                    String Kelas = rs.getString(6);
                    String Email = rs.getString(7);
                    String Alamat = rs.getString(8);
                    String data[] = {NIS,NamaSiswa,TempatLahir,TanggalLahir,JenisKelamin,Kelas,Email,Alamat};
                    dtm.addRow(data);
                }
            } catch (SQLException ex){
                Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
            tblData.setModel(dtm);
    }//GEN-LAST:event_bRefreshActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        // TODO add your handling code here:
        tfNama.setText("");
        tfNis.setText("");
        tfKelas.setText("");
        tfTempat.setText("");
        buttonGroup1.clearSelection();
        tfEmail.setText("");
        taAlamat.setText("");
        jTanggal.setDate(null);
    }//GEN-LAST:event_bClearActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        // TODO add your handling code here:
        int baris = tblData.getSelectedRow();
        if (baris != -1){
            String NIS = tblData.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM t_siswa WHERE NIS='"+NIS+"'";
            int status = KoneksiDB.execute(SQL);
            if (status==1){
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data Gagal Dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }

        }else {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih Dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = dateFormat.format(jTanggal.getDate());

        if ("".equals(tfNis.getText()) || "".equals(taAlamat.getText()) ||
            "".equals(tfKelas.getText()) || "".equals(tfNama.getText()) ||
            "".equals(tfEmail.getText()) || "".equals(tfTempat.getText()) || "".equals(jTanggal.getDate())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error",
                JOptionPane.WARNING_MESSAGE);
        } else {

            String JK = "";
            if (rbLaki.isSelected()) {
                JK = "L";
            } else {
                JK = "P";

                String SQL = "INSERT INTO t_siswa (NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat,TempatLahir,TanggalLahir) "
                + "VALUES "
                + "('"+tfNis.getText()+"','"
                + tfNama.getText()+"','"+tfTempat.getText()+"','"+tanggal+"',"+JK+"', '"
                + tfKelas.getText()+"','"+tfEmail.getText()
                + "','"+taAlamat.getText()+"'";

                int status = KoneksiDB.execute(SQL);
                if (status == 1){
                    JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                    selectData();
                } else {
                    JOptionPane.showMessageDialog(this, "Data Gagal Ditambahkan", "Sukses", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_bSaveActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
       int baris = tblData.getSelectedRow();
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        Date dateValue = null;
         try {
            dateValue = date.parse((String) tblData.getValueAt(baris, 4));
        } catch (ParseException ex) {
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        if (baris != -1) {
            tfNis.setText(tblData.getValueAt(baris, 0).toString());
            tfNama.setText(tblData.getValueAt(baris, 1).toString());
            if ("Laki-Laki".equals(tblData.getValueAt(baris, 2).toString())) {
                rbLaki.setSelected(true);
            }else{
            rbPerempuan.setSelected(true);
            }
            jTanggal.setDate(dateValue);
            tfKelas.setText(tblData.getValueAt(baris, 5).toString());
            tfTempat.setText(tblData.getValueAt(baris, 3).toString());
            tfEmail.setText(tblData.getValueAt(baris, 6).toString());
            taAlamat.setText(tblData.getValueAt(baris, 7).toString());
        } // TODO add your handling code here:
    }//GEN-LAST:event_tblDataMouseClicked
    
    public void setTanggal(){
        java.util.Date skrg = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("dd/MM/yyyy");
        label_tanggal.setText(kal.format(skrg));
    }
    
    public void SetJam(){
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
                String nol_jam = "";
                String nolmenit = "";
                String nol_detik = "";
                
                Date dt = new Date();
                int nilai_jam = dt.getHours();
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt.getSeconds();
                if (nilai_jam <= 9){
                    nol_jam = "0";
                }
                if (nilai_menit <= 9){
                    nolmenit = "0";
                }
                if (nilai_detik <= 9){
                    nol_detik = "0";
                }
                
                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nolmenit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);
                label_jam.setText("Jam "+jam + ":" + menit + ":" + detik);
            }
        };
    new Timer(100, taskPerformer).start();
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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClear;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bEdit1;
    private javax.swing.JButton bRefresh;
    private javax.swing.JButton bSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jPrint;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jTanggal;
    private javax.swing.JLabel label_jam;
    private javax.swing.JLabel label_tanggal;
    private javax.swing.JLabel labeljam;
    private javax.swing.JLabel labeltanggal;
    private javax.swing.JLabel nol_detik;
    private javax.swing.JLabel nol_jam;
    private javax.swing.JLabel nol_menit;
    private javax.swing.JLabel nolmenit;
    private javax.swing.JRadioButton rbLaki;
    private javax.swing.JRadioButton rbPerempuan;
    private javax.swing.JTextArea taAlamat;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfKelas;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNis;
    private javax.swing.JTextField tfTempat;
    // End of variables declaration//GEN-END:variables
}

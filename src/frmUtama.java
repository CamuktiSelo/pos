/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saya
 */
public class frmUtama extends javax.swing.JFrame {

    /**
     * Creates new form frmUtama
     */
    public frmUtama() {
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

        labelJudul = new javax.swing.JLabel();
        cmdKategori = new javax.swing.JButton();
        cmdProduk = new javax.swing.JButton();
        cmdTransaksi = new javax.swing.JButton();
        cmdLaporan = new javax.swing.JButton();
        cmdKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelJudul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelJudul.setText("SISTEM PENJUALAN UNTUNG TERUS OGAH RUGI");

        cmdKategori.setText("KATEGORI");
        cmdKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdKategoriMouseClicked(evt);
            }
        });

        cmdProduk.setText("PRODUK");
        cmdProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdProdukActionPerformed(evt);
            }
        });

        cmdTransaksi.setText("TRANSAKSI");
        cmdTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTransaksiActionPerformed(evt);
            }
        });

        cmdLaporan.setText("LAPORAN");
        cmdLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLaporanActionPerformed(evt);
            }
        });

        cmdKeluar.setText("KELUAR");
        cmdKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdKeluarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelJudul)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(cmdKategori)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdProduk)
                        .addGap(10, 10, 10)
                        .addComponent(cmdTransaksi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdLaporan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdKeluar)))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdKategori)
                    .addComponent(cmdProduk)
                    .addComponent(cmdTransaksi)
                    .addComponent(cmdLaporan)
                    .addComponent(cmdKeluar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdKeluarMouseClicked
        this.dispose();
    }//GEN-LAST:event_cmdKeluarMouseClicked

    private void cmdKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdKategoriMouseClicked
        new frmKategori().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cmdKategoriMouseClicked

    private void cmdProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdProdukActionPerformed
        new frmProduk().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cmdProdukActionPerformed

    private void cmdTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTransaksiActionPerformed
        new frmTransaksi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cmdTransaksiActionPerformed

    private void cmdLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLaporanActionPerformed
        new frmLaporan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cmdLaporanActionPerformed

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
            java.util.logging.Logger.getLogger(frmUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdKategori;
    private javax.swing.JButton cmdKeluar;
    private javax.swing.JButton cmdLaporan;
    private javax.swing.JButton cmdProduk;
    private javax.swing.JButton cmdTransaksi;
    private javax.swing.JLabel labelJudul;
    // End of variables declaration//GEN-END:variables
}

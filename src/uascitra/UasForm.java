/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uascitra;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Faizin
 */
public class UasForm extends javax.swing.JFrame {

    /**
     * Creates new form UasForm
     */
    public UasForm() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfTinggiGambar = new javax.swing.JTextField();
        tfLebarGambar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfX = new javax.swing.JTextField();
        tfY = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfR = new javax.swing.JTextField();
        tfG = new javax.swing.JTextField();
        tfB = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        sbBrightness = new javax.swing.JScrollBar();
        sbContrast = new javax.swing.JScrollBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        jScrollPane1.setViewportView(jLabel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setText("Tinggi Gambar");

        jLabel3.setText("Lebar Gambar");

        jLabel4.setText("jLabel4");
        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel4MouseMoved(evt);
            }
        });
        jScrollPane2.setViewportView(jLabel4);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        jLabel5.setText("x");

        jLabel6.setText("y");

        jLabel7.setText("R");

        jLabel8.setText("G");

        jLabel9.setText("B");

        jLabel10.setText("Brightness");

        jLabel11.setText("Contrast");

        sbBrightness.setMinimum(-100);
        sbBrightness.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        sbBrightness.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                sbBrightnessAdjustmentValueChanged(evt);
            }
        });

        sbContrast.setMinimum(-100);
        sbContrast.setOrientation(javax.swing.JScrollBar.HORIZONTAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(55, 55, 55)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfTinggiGambar, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfLebarGambar)
                                    .addComponent(tfR)
                                    .addComponent(tfG)
                                    .addComponent(tfB))))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfX)
                            .addComponent(tfY))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sbBrightness, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sbContrast, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfTinggiGambar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(tfX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfLebarGambar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(tfY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sbBrightness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sbContrast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(tfG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(1005, 1005, 1005))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Insert Image");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Operasi");

        jMenuItem3.setText("Deteksi Tepi");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Image IconGambar;
    String Sumber;
    int ukuranx, ukurany;
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser buka = new JFileChooser();
        int ambil = buka.showOpenDialog(jPanel3);
        if (ambil == JFileChooser.APPROVE_OPTION) {
            Sumber = buka.getSelectedFile().getPath();
            jLabel1.setIcon(new ImageIcon(Sumber));
        }
        IconGambar = new ImageIcon(Sumber).getImage();
        int ukurX = IconGambar.getWidth(null);
        int ukurY = IconGambar.getHeight(null);
        tfLebarGambar.setText(Integer.toString(ukurX));
        tfTinggiGambar.setText(Integer.toString(ukurY));
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
        // TODO add your handling code here:
        if (Sumber != null) {
            int rgb;
            BufferedImage bi = loadImage(Sumber);
            int X = evt.getX();
            int Y = evt.getY();
            rgb = bi.getRGB(X, Y);
            int merah = (rgb & 0x00ff0000) >> 16;
            int hijau = (rgb & 0x0000ff00) >> 8;
            int biru = (rgb & 0x000000ff);
            tfX.setText(String.valueOf(X));
            tfY.setText(String.valueOf(Y));
            tfR.setText(String.valueOf(merah));
            tfG.setText(String.valueOf(hijau));
            tfB.setText(String.valueOf(biru));
        }
    }//GEN-LAST:event_jLabel1MouseMoved

    private void jLabel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseMoved
        // TODO add your handling code here:
        if (Sumber != null) {
            int rgb;
            BufferedImage bi = loadImage(Sumber);
            int X = evt.getX();
            int Y = evt.getY();
            rgb = bi.getRGB(X, Y);
            int merah = (rgb & 0x00ff0000) >> 16;
            int hijau = (rgb & 0x0000ff00) >> 8;
            int biru = (rgb & 0x000000ff);
            tfX.setText(String.valueOf(X));
            tfY.setText(String.valueOf(Y));
            tfR.setText(String.valueOf(merah));
            tfG.setText(String.valueOf(hijau));
            tfB.setText(String.valueOf(biru));
        }
    }//GEN-LAST:event_jLabel4MouseMoved

    private void sbBrightnessAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_sbBrightnessAdjustmentValueChanged
        // TODO add your handling code here:
        BufferedImage loading = loadImage(Sumber);
        IconGambar = new ImageIcon(Sumber).getImage();
        int UkuranX = IconGambar.getWidth(null);
        int UkuranY = IconGambar.getHeight(null);

    }//GEN-LAST:event_sbBrightnessAdjustmentValueChanged

    public static BufferedImage resize(BufferedImage img, int newW, int newH) {
        int w = img.getWidth();
        int h = img.getHeight();
        BufferedImage dimg = new BufferedImage(newW, newH, img.getType());
        Graphics2D g = dimg.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(img, 0, 0, newW, newH, 0, 0, w, h, null);
        g.dispose();
        return dimg;
    }
    
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        BufferedImage grayscale = deteksitepi(Sumber);
        int x = jLabel4.getWidth();
        int y = jLabel4.getHeight();
        ImageIcon imageIcon = new ImageIcon(resize(grayscale, x, y));
        jLabel4.setIcon(imageIcon);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public BufferedImage deteksitepi(String sumber) {
        BufferedImage loading = loadImage(sumber);
        IconGambar = new ImageIcon(sumber).getImage();
        int UkuranX = IconGambar.getWidth(null);
        int UkuranY = IconGambar.getHeight(null);

        BufferedImage prosesGambar;
        BufferedImage loadIng = loadImage(sumber);
        UkuranX = loadIng.getWidth();
        UkuranY = loadIng.getHeight();
        prosesGambar = new BufferedImage(UkuranX, UkuranY, BufferedImage.TYPE_BYTE_GRAY);
        Graphics g = prosesGambar.getGraphics();
        g.drawImage(loadIng, 0, 0, null);
        WritableRaster raster = prosesGambar.getRaster();
        for (int x = 1; x < (UkuranX - 1); x++) {
            for (int y = 1; y < (UkuranY - 1); y++) {
                int rgb11 = loadIng.getRGB((x - 1), (y - 1));
                int p11 = (rgb11 >> 8) & 0xff;
                int rgb12 = loadIng.getRGB(x, (y - 1));
                int p12 = (rgb12 >> 8) & 0xff;
                int rgb13 = loadIng.getRGB((x + 1), (y - 1));
                int p13 = (rgb13 >> 8) & 0xff;
                int rgb21 = loadIng.getRGB((x - 1), (y));
                int p21 = (rgb21 >> 8) & 0xff;
                int rgb22 = loadIng.getRGB(x, y);
                int p22 = (rgb22 >> 8) & 0xff;
                int rgb23 = loadIng.getRGB((x + 1), y);
                int p23 = (rgb23 >> 8) & 0xff;
                int rgb31 = loadIng.getRGB((x - 1), (y + 1));
                int p31 = (rgb31 >> 8) & 0xff;
                int rgb32 = loadIng.getRGB(x, (y + 1));
                int p32 = (rgb32 >> 8) & 0xff;
                int rgb33 = loadIng.getRGB((x + 1), (y + 1));
                int p33 = (rgb33 >> 8) & 0xff;
                int tepi = (int) ((p11 * -1) + (p12 * -1) + (p13 * -1)
                        + (p21 * -1) + (p22 * 8) + (p23 * -1)
                        + (p31 * -1) + (p32 * -1) + (p33 * -1));
                if (tepi < 0) {
                    tepi = 0;
                }
                if (tepi > 255) {
                    tepi = 255;
                }
                raster.setSample(x, y, 0, tepi);
            }
        }
        return prosesGambar;
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
            java.util.logging.Logger.getLogger(UasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UasForm().setVisible(true);
            }
        });
    }

    public static BufferedImage loadImage(String ref) {
        BufferedImage bimg = null;
        try {
            bimg = ImageIO.read(new File(ref));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bimg;
    }

    BufferedImage simpan;
    int tag = 0;

    public BufferedImage brigthness(String sumber, int cerah) {
        BufferedImage prosesGambar;
        BufferedImage loadIng = loadImage(sumber);
        if (tag == 1) {
            loadIng = simpan;
        }
        ukuranx = loadIng.getWidth();
        ukurany = loadIng.getHeight();
        prosesGambar = new BufferedImage(ukuranx, ukurany,
                BufferedImage.TYPE_INT_RGB);
        Graphics g = prosesGambar.getGraphics();
        g.drawImage(loadIng, 0, 0, null);
        WritableRaster raster = prosesGambar.getRaster();
        for (int x = 0; x < ukuranx; x++) {
            for (int y = 0; y < ukurany; y++) {
                int rgb = loadIng.getRGB(x, y);
                int alpha = (rgb << 24) & 0xff;
                int merahg = (rgb >> 16) & 0xff;
                int hijaug = (rgb >> 8) & 0xff;
                int birug = (rgb >> 0) & 0xff;
                int gray = ((merahg) + (hijaug) + (birug)) / 3;
                int merah2 = merahg + cerah;
                int hijau2 = hijaug + cerah;
                int biru2 = birug + cerah;
                if (merah2 < 0) {
                    merah2 = 0;
                }
                if (hijau2 < 0) {
                    hijau2 = 0;
                }
                if (biru2 < 0) {
                    biru2 = 0;
                }
                if (merah2 > 255) {
                    merah2 = 255;
                }
                if (hijau2 > 255) {
                    hijau2 = 255;
                }
                if (biru2 > 255) {
                    biru2 = 255;
                }
                int rgb2 = alpha | merah2 << 16 | hijau2 << 8 | biru2;
                prosesGambar.setRGB(x, y, rgb2);
            }
        }
        return prosesGambar;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollBar sbBrightness;
    private javax.swing.JScrollBar sbContrast;
    private javax.swing.JTextField tfB;
    private javax.swing.JTextField tfG;
    private javax.swing.JTextField tfLebarGambar;
    private javax.swing.JTextField tfR;
    private javax.swing.JTextField tfTinggiGambar;
    private javax.swing.JTextField tfX;
    private javax.swing.JTextField tfY;
    // End of variables declaration//GEN-END:variables
}

package mess.manager;

import com.itextpdf.text.pdf.parser.Path;
import java.awt.Desktop;
import static java.awt.SystemColor.desktop;
import java.io.File;
import java.nio.file.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Menu extends javax.swing.JFrame {

    public static String setPath = "Male";
    
    
    public Menu() {
        initComponents();
        
        //setPath = "Male";
        this.setTitle("MENU");
        try {
            
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            initComponents();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StoreInput.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(StoreInput.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(StoreInput.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(StoreInput.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        edtnewadmission = new javax.swing.JMenuItem();
        edtcanceladmission = new javax.swing.JMenuItem();
        edtexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        edtshowsingleinfo = new javax.swing.JMenuItem();
        edtshowallstdinfo = new javax.swing.JMenuItem();
        edtshowldr = new javax.swing.JMenuItem();
        edtcancelledseat = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        edtstoreinput = new javax.swing.JMenuItem();
        edtstoreoutput = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        UPDATESTDINFO = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktop.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mess/manager/newpackage/logo5.png"))); // NOI18N

        desktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 153, 255));

        jMenu1.setText("ADMISSION");

        edtnewadmission.setText("NEW ADMISSION");
        edtnewadmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtnewadmissionActionPerformed(evt);
            }
        });
        jMenu1.add(edtnewadmission);

        edtcanceladmission.setText("CANCEL ADMISSION");
        edtcanceladmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtcanceladmissionActionPerformed(evt);
            }
        });
        jMenu1.add(edtcanceladmission);

        edtexit.setText("EXIT");
        edtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtexitActionPerformed(evt);
            }
        });
        jMenu1.add(edtexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("SHOW");

        edtshowsingleinfo.setText("VIEW SINGLE STUDENT INFO");
        edtshowsingleinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtshowsingleinfoActionPerformed(evt);
            }
        });
        jMenu2.add(edtshowsingleinfo);

        edtshowallstdinfo.setText("VIEW ALL STUDENT INFO");
        edtshowallstdinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtshowallstdinfoActionPerformed(evt);
            }
        });
        jMenu2.add(edtshowallstdinfo);

        edtshowldr.setText("VIEW LEDGER");
        edtshowldr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtshowldrActionPerformed(evt);
            }
        });
        jMenu2.add(edtshowldr);

        edtcancelledseat.setText("VIEW OF SEAT  CANCELLED STUDENT");
        edtcancelledseat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtcancelledseatActionPerformed(evt);
            }
        });
        jMenu2.add(edtcancelledseat);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("STORE");

        edtstoreinput.setText("STORE INPUT");
        edtstoreinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtstoreinputActionPerformed(evt);
            }
        });
        jMenu3.add(edtstoreinput);

        edtstoreoutput.setText("STORE OUTPUT");
        edtstoreoutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtstoreoutputActionPerformed(evt);
            }
        });
        jMenu3.add(edtstoreoutput);

        jMenuItem2.setText("NON STORED ITEM");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem9.setText("SHOW & UPDATE NON STORED ITEM");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem12.setText("TEMPORARY FOODS");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("MEAL");

        jMenuItem1.setText("MEAL ORDER");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuItem3.setText("VIEW MEAL SHEET");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem3);

        jMenuItem4.setText("VIEW INDIVIDUAL MONTHLY BILL");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        jMenuBar1.add(jMenu6);

        jMenu9.setText("OFFER");
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        jMenu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu9ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu9);

        jMenu7.setText("BILL");

        jMenuItem5.setText("CREATE BILL");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem5);

        jMenuItem6.setText("PAYMENT");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem6);

        jMenuItem7.setText("PRINT BILL");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem7);

        jMenuItem8.setText("VIEW PAYMENT");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem8);

        jMenuItem11.setText("VIEW DUE LIST");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem11);

        jMenuItem10.setText("VIEW MEAL CHARGE");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem10);

        jMenuBar1.add(jMenu7);

        jMenu4.setText("UPDATE");

        UPDATESTDINFO.setText("UPDATE STUDENT INFORMATION");
        UPDATESTDINFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATESTDINFOActionPerformed(evt);
            }
        });
        jMenu4.add(UPDATESTDINFO);

        jMenu10.setText("jMenu10");
        jMenu4.add(jMenu10);

        jMenu11.setText("jMenu11");
        jMenu4.add(jMenu11);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("DEVELOPER");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu8.setText("SYNC");
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtnewadmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtnewadmissionActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Newadmission f1=new Newadmission();
       // desktop.add(f1);
        f1.setVisible(true);
        
        
    }//GEN-LAST:event_edtnewadmissionActionPerformed

    private void edtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtexitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_edtexitActionPerformed

    private void UPDATESTDINFOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATESTDINFOActionPerformed
        // TODO add your handling code here:
          setVisible(false);
        UpdateStudent d1=new UpdateStudent();
        d1.setVisible(true);
        
    }//GEN-LAST:event_UPDATESTDINFOActionPerformed

    private void edtstoreinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtstoreinputActionPerformed
        // TODO add your handling code here:
          setVisible(false);
        StoreInput s1=new StoreInput();
        s1.setVisible(true);
    }//GEN-LAST:event_edtstoreinputActionPerformed

    private void edtstoreoutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtstoreoutputActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        StoreOutput s2=new StoreOutput();
        s2.setVisible(true);
    }//GEN-LAST:event_edtstoreoutputActionPerformed

    private void edtshowallstdinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtshowallstdinfoActionPerformed
        // TODO add your handling code here:
          setVisible(false);
        ShowAllStudentinfo sh1=new ShowAllStudentinfo();
        sh1.setVisible(true);
    }//GEN-LAST:event_edtshowallstdinfoActionPerformed

    private void edtcanceladmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtcanceladmissionActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        CancelAdmission c1=new CancelAdmission();
        c1.setVisible(true);
    }//GEN-LAST:event_edtcanceladmissionActionPerformed

    private void edtshowsingleinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtshowsingleinfoActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        SingleStudent s1=new SingleStudent();
        s1.setVisible(true);
    }//GEN-LAST:event_edtshowsingleinfoActionPerformed

    private void edtshowldrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtshowldrActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        ShowLedger ld1=new ShowLedger();
        ld1.setVisible(true);
    }//GEN-LAST:event_edtshowldrActionPerformed

    private void edtcancelledseatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtcancelledseatActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        ViewSeatCancel v1=new ViewSeatCancel();
        v1.setVisible(true);
    }//GEN-LAST:event_edtcancelledseatActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MealorderPage m = new MealorderPage();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        NonStoredItem n = new NonStoredItem();
        this.setVisible(false);
        n.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ViewMealSheet v = new ViewMealSheet();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ShowIndividualBill s = new ShowIndividualBill();
        this.setVisible(false);
        s.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        CreateBill c = new CreateBill();
        this.setVisible(false);
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Payment c = new Payment();
        this.setVisible(false);
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        NewJFrame c = new NewJFrame();
        this.setVisible(false);
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        ShowPayment s = new ShowPayment();
        this.setVisible(false);
        s.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        UpdateNonStored u = new UpdateNonStored();
        this.setVisible(false);
        u.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        Developer d = new Developer();
        this.setVisible(false);
        d.setVisible(true);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        ViewMessBillOnly v = new ViewMessBillOnly();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        DueList d = new DueList();
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        File file;
        file = new File("C:/sqlite3/Payment/osmanyhall.db");
        if(!file.exists()){
            JOptionPane.showMessageDialog(null, "First keep the updated 'osmanyhall.db' file in 'Payment' folder", "File Not Found!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure want to sync data?" , "Warning" , 1);
        if(dialogResult != JOptionPane.YES_OPTION)  return;
        
        Connection connSync = JConnection.syncDb();
        Connection connMain = JConnection.ConnecrDb();
        int count = 0;
        try{
            PreparedStatement psMain = connMain.prepareStatement("SELECT * FROM paidbill");
            ResultSet rs = psMain.executeQuery();
            while(rs.next())    count++;
            psMain.close();
            rs.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Oops! There are some problems!", "Unknown Error Occured!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            PreparedStatement psSync = connSync.prepareStatement("SELECT * FROM paidbill");
            PreparedStatement psMain = connMain.prepareStatement("INSERT INTO `paidbill`(`hallid`, `paidamount`, `due`, `previousdue`, `paymentdate`, `recorddate`) VALUES (?,?,?,?,?,?)");
            int c = 0;
            ResultSet rs = psSync.executeQuery();
            
            while(rs.next()){
                c++;
                if(c <= count)   continue;

                psMain.setInt(1, rs.getInt(1));
                psMain.setDouble(2, rs.getDouble(2));
                psMain.setDouble(3, rs.getDouble(3));
                psMain.setDouble(4, rs.getDouble(4));
                psMain.setString(5, rs.getString(5));
                psMain.setString(6, rs.getString(6));
                
                psMain.execute();
            }
            
            psMain.close();
            psSync.close();
            rs.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Oops! There are some problems!", "Unknown Error Occured!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            PreparedStatement psSync = connSync.prepareStatement("SELECT * FROM totalbill");
            PreparedStatement psMain = connMain.prepareStatement("UPDATE totalbill SET totaldue = ? WHERE hallid = ?");
            ResultSet rs = psSync.executeQuery();
            
            while(rs.next()){
                psMain.setDouble(1, rs.getDouble(2));
                psMain.setInt(2, rs.getInt(1));
                psMain.execute();
            }
            
            psMain.close();
            psSync.close();
            rs.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Oops! There are some problems!", "Unknown Error Occured!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            connMain.close();
            connSync.close();
        }catch(Exception e){
            System.out.println("Problem!");
        }
        
        if(file.delete()){
            JOptionPane.showMessageDialog(null, "Sync is completed successfully!", "Successful!", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        TempFood t = new TempFood();
        this.setVisible(false);
        t.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu9ActionPerformed
        
    }//GEN-LAST:event_jMenu9ActionPerformed

    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked
        OfferInfo t = new OfferInfo();
        this.setVisible(false);
        t.setVisible(true);
    }//GEN-LAST:event_jMenu9MouseClicked

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem UPDATESTDINFO;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem edtcanceladmission;
    private javax.swing.JMenuItem edtcancelledseat;
    private javax.swing.JMenuItem edtexit;
    private javax.swing.JMenuItem edtnewadmission;
    private javax.swing.JMenuItem edtshowallstdinfo;
    private javax.swing.JMenuItem edtshowldr;
    private javax.swing.JMenuItem edtshowsingleinfo;
    private javax.swing.JMenuItem edtstoreinput;
    private javax.swing.JMenuItem edtstoreoutput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
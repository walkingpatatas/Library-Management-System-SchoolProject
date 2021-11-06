package librarysystem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Admin_Module extends javax.swing.JFrame {
    Connection con = connectLibrary.connecting(); 
    ResultSet rs;
    PreparedStatement pst;
    public Admin_Module() {
        initComponents();
        connectLibrary.connecting();
        //DisplayDateToday();
    }
    public Admin_Module(String id, String name, String bday){
        initComponents();
        UserIDTxtField.setText(id);
        NameTxtField.setText(name);
        BirthdateTxtField.setText(bday);
    }
    public void ShowProfile() {
        try {
            //  con = DriverManager.getConnection("jdbc:derby://localhost:1527/LibraryManagementSystem", "group1", "librarysystem");
            String userAccount = "SELECT * FROM adminaccounts where idnumber = ?"; 
            PreparedStatement pst = con.prepareStatement(userAccount);
            ResultSet rs = pst.executeQuery();      
            if (rs.next()) { 
                int id = rs.getInt("IDNUMBER");
                String name = rs.getString("FIRSTNAME");
                Date birthdate = rs.getDate("BIRTHDATE");
                UserIDTxtField.setText(String.valueOf(id));
                NameTxtField.setText(name);
                BirthdateTxtField.setText(String.valueOf(birthdate));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
//    private void DisplayDateToday (){
//        Calendar cal = Calendar.getInstance();
//        SimpleDateFormat month_date = new SimpleDateFormat("MMMM");
//        String month_name = month_date.format(cal.getTime());
//        monthngayon.setText(month_name);
//        
//        DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
//        java.util.Date date = new java.util.Date();
//        LocalDate dateToday = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        LocalDate dateTodayIs = dateToday;
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
//        String todayIs = dateTodayIs.format(formatter);
//        datengayon.setText(todayIs);
//        
//        LocalDate dateToday1 = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        LocalDate yearToday = dateToday1;
//        DateTimeFormatter formatteryear = DateTimeFormatter.ofPattern("yyyy");
//        String yeartodayIs = yearToday.format(formatteryear);
//        yearngayon.setText(yeartodayIs);
//     }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        bookRequests = new javax.swing.JLabel();
        NameTxtField = new javax.swing.JLabel();
        addNewADmin2 = new javax.swing.JLabel();
        dateNgayonField = new javax.swing.JLabel();
        bookReportsLOGOA = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        addNewADmin3 = new javax.swing.JLabel();
        manageUsers = new javax.swing.JLabel();
        BGGGGGGGGGGGGG = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        UserIDTxtField = new javax.swing.JTextField();
        BirthdateTxtField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMIN MODULE");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Welcome,");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 230, 160, 40));

        jLabel9.setFont(new java.awt.Font("Dubai", 1, 40)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ADMIN MODULE");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 310, 60));

        jPanel4.setBackground(new java.awt.Color(206, 18, 18));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 370, -1));

        bookRequests.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarysystem/REQ7.png"))); // NOI18N
        bookRequests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookRequestsMouseClicked(evt);
            }
        });
        jPanel1.add(bookRequests, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, 180, 180));

        NameTxtField.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        NameTxtField.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(NameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 230, 200, 40));

        addNewADmin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarysystem/MANAGE7.png"))); // NOI18N
        addNewADmin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addNewADmin2MouseClicked(evt);
            }
        });
        jPanel1.add(addNewADmin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 180, 180));

        dateNgayonField.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        dateNgayonField.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(dateNgayonField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 280, 340, 30));

        bookReportsLOGOA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarysystem/REPORTS7.png"))); // NOI18N
        bookReportsLOGOA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookReportsLOGOAMouseClicked(evt);
            }
        });
        jPanel1.add(bookReportsLOGOA, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 600, 180, 180));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 272, 350, 20));

        addNewADmin3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarysystem/LOG7.png"))); // NOI18N
        addNewADmin3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addNewADmin3MouseClicked(evt);
            }
        });
        jPanel1.add(addNewADmin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 600, 180, 180));

        manageUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarysystem/try7.png"))); // NOI18N
        manageUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageUsersMouseClicked(evt);
            }
        });
        jPanel1.add(manageUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 180, 180));

        BGGGGGGGGGGGGG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarysystem/forPanels.png"))); // NOI18N
        jPanel1.add(BGGGGGGGGGGGGG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 900));

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("My Profile");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 150, 68));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Librarysystem/3.png"))); // NOI18N
        BG.setMaximumSize(new java.awt.Dimension(370, 542));
        BG.setMinimumSize(new java.awt.Dimension(370, 542));
        BG.setPreferredSize(new java.awt.Dimension(370, 542));
        jPanel1.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 420));

        UserIDTxtField.setEditable(false);
        UserIDTxtField.setBackground(new java.awt.Color(255, 255, 255));
        UserIDTxtField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(UserIDTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 210, 30));

        BirthdateTxtField.setEditable(false);
        BirthdateTxtField.setBackground(new java.awt.Color(206, 18, 18));
        BirthdateTxtField.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        BirthdateTxtField.setForeground(new java.awt.Color(255, 255, 255));
        BirthdateTxtField.setBorder(null);
        BirthdateTxtField.setOpaque(false);
        jPanel1.add(BirthdateTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 350, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addNewADmin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewADmin2MouseClicked
    ManagedBooks nextFrame = new ManagedBooks ();
    ManagedBooks.INVIid.setText(Admin_Module.UserIDTxtField.getText());
    ManagedBooks.INVIname.setText(Admin_Module.NameTxtField.getText());
    ManagedBooks.INVIbday.setText(Admin_Module.dateNgayonField.getText());
    nextFrame.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_addNewADmin2MouseClicked

    private void addNewADmin3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewADmin3MouseClicked
    new LoginPage().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_addNewADmin3MouseClicked

    private void manageUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUsersMouseClicked
    Manage_Accounts nextFrame = new Manage_Accounts();
    Manage_Accounts.INVIid.setText(Admin_Module.UserIDTxtField.getText());
    Manage_Accounts.INVIname.setText(Admin_Module.NameTxtField.getText());
    Manage_Accounts.INVIbday.setText(Admin_Module.dateNgayonField.getText());
    nextFrame.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_manageUsersMouseClicked

    private void bookReportsLOGOAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookReportsLOGOAMouseClicked
    bookReports nextFrame = new bookReports();
    bookReports.INVIid.setText(Admin_Module.UserIDTxtField.getText());
    bookReports.INVIname.setText(Admin_Module.NameTxtField.getText());
    bookReports.INVIbday.setText(Admin_Module.dateNgayonField.getText());
    nextFrame.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_bookReportsLOGOAMouseClicked

    private void bookRequestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookRequestsMouseClicked
    BookRequests nextFrame = new BookRequests();
    BookRequests.INVIid.setText(Admin_Module.UserIDTxtField.getText());
    BookRequests.INVIname.setText(Admin_Module.NameTxtField.getText());
    BookRequests.INVIbday.setText(Admin_Module.dateNgayonField.getText());
    nextFrame.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_bookRequestsMouseClicked

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
            java.util.logging.Logger.getLogger(Admin_Module.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Module.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Module.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Module.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Module().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel BGGGGGGGGGGGGG;
    public static javax.swing.JTextField BirthdateTxtField;
    public static javax.swing.JLabel NameTxtField;
    public static javax.swing.JTextField UserIDTxtField;
    private javax.swing.JLabel addNewADmin2;
    private javax.swing.JLabel addNewADmin3;
    private javax.swing.JLabel bookReportsLOGOA;
    private javax.swing.JLabel bookRequests;
    public static javax.swing.JLabel dateNgayonField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel manageUsers;
    // End of variables declaration//GEN-END:variables
}
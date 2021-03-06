package librarysystem;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class User_Module extends javax.swing.JFrame {
    Connection con = connectLibrary.connecting(); 
    ResultSet rs;
    PreparedStatement pst;  
    public User_Module() {
        initComponents(); 
        connectLibrary.connecting(); 
    }
    public User_Module(String id, String name, String bday, String course, String roleType){
        initComponents();
        UserIDTxtField.setText(id);
        NameTxtField.setText(name);
        BirthdateTxtField.setText(bday);
        CourseTxtField.setText(course);
        memberTypeTxtField.setText(roleType);
    }
    public void ShowProfile() {
        try {
            //con = DriverManager.getConnection("jdbc:derby://localhost:1527/LibraryManagementSystem", "group1", "librarysystem");
            String userAccount = "SELECT * FROM useraccounts where idnumber = ?"; 
            PreparedStatement pst = con.prepareStatement(userAccount);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) { 
                int id = rs.getInt("IDNUMBER");
                String name = rs.getString("FIRSTNAME");
                Date birthdate = rs.getDate("BIRTHDATE");
                String course = rs.getString("COURSE");
                UserIDTxtField.setText(String.valueOf(id));
                NameTxtField.setText(name);
                BirthdateTxtField.setText(String.valueOf(birthdate));
                CourseTxtField.setText(course);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jSeparator1 = new javax.swing.JSeparator();
        NameTxtField = new javax.swing.JLabel();
        searchborrow = new javax.swing.JLabel();
        logOut = new javax.swing.JLabel();
        borrow = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        dateNgayonFieldUSER = new javax.swing.JLabel();
        bgggggggggg = new javax.swing.JLabel();
        BirthdateTxtField = new javax.swing.JTextField();
        BirthdateLabel = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        UserIDTxtField = new javax.swing.JTextField();
        UserIDLabel = new javax.swing.JLabel();
        CourseTxtField = new javax.swing.JTextField();
        CourseLabel1 = new javax.swing.JLabel();
        memberTypeTxtField = new javax.swing.JTextField();
        CourseLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("USER MODULE");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 370, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 272, 350, 20));

        NameTxtField.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        NameTxtField.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(NameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 230, 190, 40));

        searchborrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarysystem/search9.png"))); // NOI18N
        searchborrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchborrowMouseClicked(evt);
            }
        });
        jPanel1.add(searchborrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 230, 240));

        logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarysystem/log9.png"))); // NOI18N
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMouseClicked(evt);
            }
        });
        jPanel1.add(logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 440, 230, 240));

        borrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarysystem/borrowed9.png"))); // NOI18N
        borrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrowMouseClicked(evt);
            }
        });
        jPanel1.add(borrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 230, 240));

        jLabel10.setFont(new java.awt.Font("Dubai", 1, 40)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("USER MODULE");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 310, 60));

        NameLabel.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setText("Welcome,");
        jPanel1.add(NameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 230, 160, 40));

        dateNgayonFieldUSER.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        dateNgayonFieldUSER.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(dateNgayonFieldUSER, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 280, 340, 30));

        bgggggggggg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarysystem/forPanels.png"))); // NOI18N
        jPanel1.add(bgggggggggg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, -1));

        BirthdateTxtField.setEditable(false);
        BirthdateTxtField.setBackground(new java.awt.Color(255, 255, 255));
        BirthdateTxtField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(BirthdateTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BirthdateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BirthdateLabel.setText("Birthdate:");
        jPanel1.add(BirthdateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Librarysystem/3.png"))); // NOI18N
        BG.setMaximumSize(new java.awt.Dimension(370, 542));
        BG.setMinimumSize(new java.awt.Dimension(370, 542));
        BG.setPreferredSize(new java.awt.Dimension(370, 542));
        jPanel1.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        UserIDTxtField.setEditable(false);
        UserIDTxtField.setBackground(new java.awt.Color(255, 255, 255));
        UserIDTxtField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(UserIDTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, -1));

        UserIDLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UserIDLabel.setText("User ID:");
        jPanel1.add(UserIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        CourseTxtField.setEditable(false);
        CourseTxtField.setBackground(new java.awt.Color(255, 255, 255));
        CourseTxtField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(CourseTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        CourseLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CourseLabel1.setText("Course:");
        jPanel1.add(CourseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        memberTypeTxtField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(memberTypeTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 290, 210, 30));

        CourseLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CourseLabel.setText("Member Type:");
        jPanel1.add(CourseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 290, 110, 30));

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

    private void borrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowMouseClicked
    BorrowedBooks brrowFrame = new BorrowedBooks();
    BorrowedBooks.INVIid.setText(User_Module.UserIDTxtField.getText());
    BorrowedBooks.INVIname.setText(User_Module.NameTxtField.getText());
    BorrowedBooks.INVIbday.setText(User_Module.BirthdateTxtField.getText());
    BorrowedBooks.INVIcourse.setText(User_Module.CourseTxtField.getText());
    BorrowedBooks.INVItype.setText(User_Module.memberTypeTxtField.getText());
    BorrowedBooks.INVIdateTodayIs.setText(User_Module.dateNgayonFieldUSER.getText());
    brrowFrame.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_borrowMouseClicked

    private void logOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseClicked
    new LoginPage().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_logOutMouseClicked

    private void searchborrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchborrowMouseClicked
    Search_Borrow srchFrame = new Search_Borrow();
    Search_Borrow.INVIid.setText(User_Module.UserIDTxtField.getText());
    Search_Borrow.INVIname.setText(User_Module.NameTxtField.getText());
    Search_Borrow.INVIbday.setText(User_Module.BirthdateTxtField.getText());
    Search_Borrow.INVIcourse.setText(User_Module.CourseTxtField.getText());
    Search_Borrow.INVItype.setText(User_Module.memberTypeTxtField.getText());
    Search_Borrow.INVIdateTodayIs.setText(User_Module.dateNgayonFieldUSER.getText());
    srchFrame.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_searchborrowMouseClicked

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
            java.util.logging.Logger.getLogger(User_Module.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Module.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Module.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Module.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Module().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel BirthdateLabel;
    public static javax.swing.JTextField BirthdateTxtField;
    private javax.swing.JLabel CourseLabel;
    private javax.swing.JLabel CourseLabel1;
    public static javax.swing.JTextField CourseTxtField;
    private javax.swing.JLabel NameLabel;
    public static javax.swing.JLabel NameTxtField;
    private javax.swing.JLabel UserIDLabel;
    public static javax.swing.JTextField UserIDTxtField;
    private javax.swing.JLabel bgggggggggg;
    private javax.swing.JLabel borrow;
    public static javax.swing.JLabel dateNgayonFieldUSER;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logOut;
    public static javax.swing.JTextField memberTypeTxtField;
    private javax.swing.JLabel searchborrow;
    // End of variables declaration//GEN-END:variables
}

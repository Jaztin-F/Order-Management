//Justine Francisco
//Bonjovie Belebelone

//IT2A
package Data;

import OMS.Main;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Customer extends javax.swing.JFrame {

    
    public Customer() {
        initComponents();
        load();
        Seticon();
    }
    
     private void Seticon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/MLogo.png")));
    }
   private void load(){
   String databaseURL = "jdbc:derby://localhost:1527/omsdb"; 
        
        try {
            
        
            Connection con = DriverManager.getConnection(databaseURL);
           PreparedStatement pst =con.prepareStatement("Select * from Customer");
             ResultSet rs =pst.executeQuery();
             
              DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
              df.setRowCount(0);
             while(rs.next()){
                 df.addRow(new String[]{rs.getString("CUSTOMER_ID"),rs.getString("FIRSTNAME"),rs.getString("LASTNAME"),rs.getString("ADDRESS"),rs.getString("PHONE_NO"),rs.getString("SEX")});
             }
        }catch(SQLException e){
                System.out.println(e);
             }

}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        Dashboard = new javax.swing.JPanel();
        ToolBar = new javax.swing.JPanel();
        Close = new javax.swing.JLabel();
        full = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Add = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        CID = new javax.swing.JTextField();
        Fname = new javax.swing.JTextField();
        Lname = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        no = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sex = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel6.setText("Address");

        jTextField5.setMaximumSize(new java.awt.Dimension(70, 30));
        jTextField5.setSelectionColor(new java.awt.Color(0, 153, 153));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Dashboard.setBackground(new java.awt.Color(51, 51, 51));

        ToolBar.setBackground(new java.awt.Color(51, 51, 51));
        ToolBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ToolBar.setPreferredSize(new java.awt.Dimension(700, 50));

        Close.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close.png"))); // NOI18N
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        full.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        full.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Maximize.png"))); // NOI18N
        full.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fullMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Customers");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        back.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ToolBarLayout = new javax.swing.GroupLayout(ToolBar);
        ToolBar.setLayout(ToolBarLayout);
        ToolBarLayout.setHorizontalGroup(
            ToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToolBarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addGap(669, 669, 669)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(full, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Close))
        );
        ToolBarLayout.setVerticalGroup(
            ToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToolBarLayout.createSequentialGroup()
                .addGroup(ToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(full, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(300, 200));

        Add.setBackground(new java.awt.Color(204, 204, 204));
        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Update.setBackground(new java.awt.Color(204, 204, 204));
        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(204, 204, 204));
        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );

        CID.setMaximumSize(new java.awt.Dimension(70, 30));
        CID.setSelectionColor(new java.awt.Color(0, 153, 153));

        Fname.setMaximumSize(new java.awt.Dimension(70, 30));
        Fname.setSelectionColor(new java.awt.Color(0, 153, 153));

        Lname.setMaximumSize(new java.awt.Dimension(70, 30));
        Lname.setSelectionColor(new java.awt.Color(0, 153, 153));

        address.setMaximumSize(new java.awt.Dimension(70, 30));
        address.setSelectionColor(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer_ID");

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Firstname");

        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lastname");

        jLabel5.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");

        jLabel7.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phone No");

        jLabel8.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sex");

        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true), "Customers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Light", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer_ID", "Firstname", "Lastname", "Adderss", "PhoneNo", "Sex"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(90);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(50);
        }

        javax.swing.GroupLayout DashboardLayout = new javax.swing.GroupLayout(Dashboard);
        Dashboard.setLayout(DashboardLayout);
        DashboardLayout.setHorizontalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DashboardLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1))
                    .addGroup(DashboardLayout.createSequentialGroup()
                        .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)))
                        .addGap(10, 10, 10)
                        .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Lname, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(CID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Fname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(no, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sex, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36))
        );
        DashboardLayout.setVerticalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashboardLayout.createSequentialGroup()
                .addComponent(ToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(DashboardLayout.createSequentialGroup()
                        .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DashboardLayout.createSequentialGroup()
                                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DashboardLayout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashboardLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DashboardLayout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashboardLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DashboardLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel4))
                                    .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Lname, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                        .addComponent(jLabel8))))
                            .addGroup(DashboardLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashboardLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)))
                                .addGap(10, 10, 10)
                                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(14, 14, 14)
                                .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(14, 14, 14))))
        );

        DashboardLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Fname, Lname, address});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        ImageIcon icon = new ImageIcon("src/Images/icon.png");
        int a= JOptionPane.showConfirmDialog(null, "Do you really want to exit", "Exit",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,icon);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_CloseMouseClicked

    private void fullMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullMouseClicked
        if (this.getExtendedState()!= Customer.MAXIMIZED_BOTH){
            this.setExtendedState(Customer.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(Customer.NORMAL);

        }
    }//GEN-LAST:event_fullMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_backMouseClicked

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
         if(CID.getText().equals("")||Fname.getText().equals("")||Lname.getText().equals("")||address.getText().equals("")
            ||no.getText().equals("")){
            
            //if any of the following field leave blank then show message
            JOptionPane.showMessageDialog(this,"Please Fill up all Data!" );
        }
         else{
        
        String databaseURL = "jdbc:derby://localhost:1527/omsdb";
        Connection con;  
        try {
            con = DriverManager.getConnection(databaseURL);
            
         String sql = "INSERT INTO Customer VALUES(?,?,?,?,?,?)";
         PreparedStatement ps = con.prepareStatement(sql);
         
         ps.setString(1,CID.getText());
         ps.setString(2,Fname.getText());
         ps.setString(3,Lname.getText());
         ps.setString(4,address.getText());
         ps.setString(5, (String) sex.getSelectedItem());
         ps.setString(6,no.getText());
        
         ps.executeUpdate();
         JOptionPane.showMessageDialog(null, "Data has been Added!");
         
         
         
         CID.setText("");
         Fname.setText("");
         Lname.setText("");
         address.setText("");
         no.setText("");
         sex.setSelectedItem(0);
         CID.requestFocus();
         load();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unable to Add Data try another ID");
        }
        }
    }//GEN-LAST:event_AddActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        String databaseURL = "jdbc:derby://localhost:1527/omsdb";
        Connection con;  
        try {
            con = DriverManager.getConnection(databaseURL);
            
         String sql = "UPDATE Customer SET  FIRSTNAME = ?, LASTNAME = ?, ADDRESS=?, SEX=?,PHONE_NO=? Where Customer_ID = ?";
         PreparedStatement ps = con.prepareStatement(sql);
         
        
         ps.setString(1,Fname.getText());
         ps.setString(2,Lname.getText());
         ps.setString(3,address.getText());
         ps.setString(4, (String) sex.getSelectedItem());
         ps.setString(5,no.getText());
          ps.setString(6,CID.getText());
        
         int U = ps.executeUpdate();
         
         if (U==1){
             JOptionPane.showMessageDialog(null, "Data has been Updated!");
         CID.setText("");
         Fname.setText("");
         Lname.setText("");
         address.setText("");
         no.setText("");
         sex.setSelectedItem(0);
         CID.requestFocus();
         load();
             
         }
         else{
            JOptionPane.showMessageDialog(null, "Data Not found!");
         }
         
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unable to Update");
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
      String databaseURL = "jdbc:derby://localhost:1527/omsdb";
        Connection con;  
        try {
            con = DriverManager.getConnection(databaseURL);
            
         String sql = "DELETE from Customer where Customer_ID=?";
         PreparedStatement ps = con.prepareStatement(sql);
         
        ps.setString(1,CID.getText());
        int D = ps.executeUpdate();
        
        
        if (D==1){
         JOptionPane.showMessageDialog(null, "Data has been deleted!");
         CID.setText("");
         Fname.setText("");
         Lname.setText("");
         address.setText("");
         no.setText("");
         sex.setSelectedItem(0);
         CID.requestFocus();
         load();
        }
        else{
            JOptionPane.showMessageDialog(null, "Data Not found!");
         }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unable to delete the data");
        }    
        
    }//GEN-LAST:event_DeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();

        // set data to text field when row is selected
        String C = tblModel.getValueAt(jTable1.getSelectedRow(),0).toString();
        String F = tblModel.getValueAt(jTable1.getSelectedRow(),1).toString();
        String L = tblModel.getValueAt(jTable1.getSelectedRow(),2).toString();
        String A = tblModel.getValueAt(jTable1.getSelectedRow(),3).toString();
        String P = tblModel.getValueAt(jTable1.getSelectedRow(),4).toString();
        String S = tblModel.getValueAt(jTable1.getSelectedRow(),5).toString();
        

        //set to textfield
        CID.setText(C);
        Fname.setText(F);
        Lname.setText(L);
        address.setText(A);
        no.setText(P);
        sex.setSelectedItem(S);
        
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField CID;
    private javax.swing.JLabel Close;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Lname;
    private javax.swing.JPanel ToolBar;
    private javax.swing.JButton Update;
    private javax.swing.JTextField address;
    private javax.swing.JLabel back;
    private javax.swing.JLabel full;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField no;
    private javax.swing.JComboBox<String> sex;
    // End of variables declaration//GEN-END:variables
}

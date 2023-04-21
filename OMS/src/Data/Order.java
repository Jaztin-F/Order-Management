//Justine Francisco
//Bonjovie Belebelone

//IT2A
package Data;

import OMS.Main;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JAZTIN
 */
public class Order extends javax.swing.JFrame {

    /**
     * Creates new form Order
     */
    public Order() {
        initComponents();
        Seticon();
        Customer();
        Product();
        load();
    }
    
   private void load(){
   String databaseURL = "jdbc:derby://localhost:1527/omsdb"; 
        
        try {
        
        
            Connection con = DriverManager.getConnection(databaseURL);
           PreparedStatement pst =con.prepareStatement("Select * from Orders");
             ResultSet rs =pst.executeQuery();
             
              DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
              df.setRowCount(0);
             while(rs.next()){
                 df.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
             }
        }catch(SQLException e){
                System.out.println(e);
             }

}
     private void Customer(){
       String databaseURL = "jdbc:derby://localhost:1527/omsdb";
        Connection con;  
        try {
            con = DriverManager.getConnection(databaseURL);
            PreparedStatement pst = con.prepareStatement("Select Customer_ID From Customer");
            ResultSet rs = pst.executeQuery();
            PID.removeAllItems();
            while(rs.next()){
                PID.addItem(rs.getString(1));
                }    
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
     
    
    private void Product(){
       String databaseURL = "jdbc:derby://localhost:1527/omsdb";
        Connection con;  
        try {
            con = DriverManager.getConnection(databaseURL);
            PreparedStatement pst = con.prepareStatement("Select Product_ID From Products");
            ResultSet rs = pst.executeQuery();
            PID.removeAllItems();
            while(rs.next()){
                PID.addItem(rs.getString(1));
                }    
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
     private void Seticon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/MLogo.png")));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dashboard2 = new javax.swing.JPanel();
        ToolBar2 = new javax.swing.JPanel();
        Close4 = new javax.swing.JLabel();
        full2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Add = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        OID = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        QNT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CID = new javax.swing.JComboBox<>();
        PID = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Dashboard2.setBackground(new java.awt.Color(51, 51, 51));

        ToolBar2.setBackground(new java.awt.Color(51, 51, 51));
        ToolBar2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ToolBar2.setPreferredSize(new java.awt.Dimension(700, 50));

        Close4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Close4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close.png"))); // NOI18N
        Close4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Close4MouseClicked(evt);
            }
        });

        full2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        full2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Maximize.png"))); // NOI18N
        full2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                full2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Orders");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        Back.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home.png"))); // NOI18N
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ToolBar2Layout = new javax.swing.GroupLayout(ToolBar2);
        ToolBar2.setLayout(ToolBar2Layout);
        ToolBar2Layout.setHorizontalGroup(
            ToolBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToolBar2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(669, 669, 669)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(full2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Close4))
        );
        ToolBar2Layout.setVerticalGroup(
            ToolBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToolBar2Layout.createSequentialGroup()
                .addGroup(ToolBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Close4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(full2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
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
                .addContainerGap(173, Short.MAX_VALUE)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );

        OID.setMaximumSize(new java.awt.Dimension(70, 30));
        OID.setSelectionColor(new java.awt.Color(0, 153, 153));
        OID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OIDActionPerformed(evt);
            }
        });

        date.setText("YYYY-MM-DD");
        date.setMaximumSize(new java.awt.Dimension(70, 30));
        date.setSelectionColor(new java.awt.Color(0, 153, 153));

        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Order_ID");

        jLabel5.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Customer_ID");

        jLabel6.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Product_ID");

        jLabel7.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Order_Date");

        jLabel8.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Quantity");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true), "ORDERS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Light", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order_ID", "Customer_ID", "Product_ID", "Order_date", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Short.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(153, 153, 153));
        jTable1.setSelectionBackground(new java.awt.Color(255, 204, 204));
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        CID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        PID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout Dashboard2Layout = new javax.swing.GroupLayout(Dashboard2);
        Dashboard2.setLayout(Dashboard2Layout);
        Dashboard2Layout.setHorizontalGroup(
            Dashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
            .addGroup(Dashboard2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Dashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Dashboard2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                        .addGap(36, 36, 36))
                    .addGroup(Dashboard2Layout.createSequentialGroup()
                        .addGroup(Dashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Dashboard2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(Dashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)))
                            .addGroup(Dashboard2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addGap(10, 10, 10)
                        .addGroup(Dashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OID, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(PID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Dashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Dashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QNT, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        Dashboard2Layout.setVerticalGroup(
            Dashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dashboard2Layout.createSequentialGroup()
                .addComponent(ToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Dashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Dashboard2Layout.createSequentialGroup()
                        .addGroup(Dashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Dashboard2Layout.createSequentialGroup()
                                .addGroup(Dashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Dashboard2Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dashboard2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(OID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(Dashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(CID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Dashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Dashboard2Layout.createSequentialGroup()
                                        .addGap(0, 21, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(PID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Dashboard2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(Dashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Dashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(QNT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                        .addGap(14, 14, 14))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Dashboard2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Close4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close4MouseClicked
        ImageIcon icon = new ImageIcon("src/Images/icon.png");
        int a= JOptionPane.showConfirmDialog(null, "Do you really want to exit", "Exit",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,icon);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_Close4MouseClicked

    private void full2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_full2MouseClicked
        if (this.getExtendedState()!= Customer.MAXIMIZED_BOTH){
            this.setExtendedState(Customer.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(Customer.NORMAL);

        }
    }//GEN-LAST:event_full2MouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_BackMouseClicked

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
           if(OID.getText().equals("")||CID.getSelectedItem().equals("")||PID.getSelectedItem().equals("")||date.getText().equals("")
            ||QNT.getText().equals("")){
            
            //if any of the following field leave blank then show message
            JOptionPane.showMessageDialog(this,"Please Fill up all Data!" );
        }
         else{
        
        String databaseURL = "jdbc:derby://localhost:1527/omsdb";
        Connection con;  
        try {
            con = DriverManager.getConnection(databaseURL);
            
         String sql = "INSERT INTO Orders VALUES(?,?,?,?,?)";
         PreparedStatement ps = con.prepareStatement(sql);
         
         ps.setString(1,OID.getText());
         ps.setString(2, (String) CID.getSelectedItem());
         ps.setString(3, (String) PID.getSelectedItem());
         ps.setString(4,date.getText());
         ps.setInt(5,Integer.parseInt(QNT.getText()));
        
         ps.executeUpdate();
         JOptionPane.showMessageDialog(null, "Data has been Added!");
         
         
         
         OID.setText("");
         date.setText("YYYY-MM-DD");
         QNT.setText("");    
         OID.requestFocus();
         load();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        }
    }//GEN-LAST:event_AddActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
       String databaseURL = "jdbc:derby://localhost:1527/omsdb";
        Connection con;  
        try {
            con = DriverManager.getConnection(databaseURL);
            
         String sql = "UPDATE Orders SET Customer_ID = ?, Product_ID = ?, Order_Date=?, Quantity=? Where Order_ID= ?";
         PreparedStatement ps = con.prepareStatement(sql);
         
        
        
         ps.setString(1, (String) CID.getSelectedItem());
         ps.setString(2, (String) PID.getSelectedItem());
         ps.setString(3,date.getText());
          ps.setInt( 4,Integer.parseInt(QNT.getText()));
         ps.setString(5,OID.getText());
        
         int U = ps.executeUpdate();
         
         if (U==1){
             JOptionPane.showMessageDialog(null, "Data has been Updated!");
        OID.setText("");
         date.setText("YYYY-MM-DD");
         QNT.setText("");    
         OID.requestFocus();
         load();
             
         }
         else{
            JOptionPane.showMessageDialog(null, "Data Not found!");
         }
         
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        String databaseURL = "jdbc:derby://localhost:1527/omsdb";
        Connection con;  
        try {
            con = DriverManager.getConnection(databaseURL);
            
         String sql = "DELETE from Orders where Order_ID=?";
         PreparedStatement ps = con.prepareStatement(sql);
         
        ps.setString(1,OID.getText());
        int D = ps.executeUpdate();
        
        
        if (D==1){
         JOptionPane.showMessageDialog(null, "Data has been deleted!");
         OID.setText("");
         date.setText("YYYY-MM-DD");
         QNT.setText("");    
         OID.requestFocus();
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
        String O = tblModel.getValueAt(jTable1.getSelectedRow(),0).toString();
        String C = tblModel.getValueAt(jTable1.getSelectedRow(),1).toString();
        String P = tblModel.getValueAt(jTable1.getSelectedRow(),2).toString();
        String D = tblModel.getValueAt(jTable1.getSelectedRow(),3).toString();
        String Q = tblModel.getValueAt(jTable1.getSelectedRow(),4).toString();
        
        

        //set to textfield
        OID.setText(O);
        CID.setSelectedItem(C);
        PID.setSelectedItem(P);
        date.setText(D);
        QNT.setText(Q);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void OIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OIDActionPerformed

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JLabel Back;
    private javax.swing.JComboBox<String> CID;
    private javax.swing.JLabel Close4;
    private javax.swing.JPanel Dashboard2;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField OID;
    private javax.swing.JComboBox<String> PID;
    private javax.swing.JTextField QNT;
    private javax.swing.JPanel ToolBar2;
    private javax.swing.JButton Update;
    private javax.swing.JTextField date;
    private javax.swing.JLabel full2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

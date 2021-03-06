/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coders.app;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.ImageIcon;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author sunny
 */
public class ManageUser extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    /**
     * Creates new form UserManager
     */
    public ManageUser() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("")).getImage());
        conn=jConnect.ConnectDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    //Program to set instance of class ManageUser
    private static ManageUser obj=null;
    public static ManageUser getObj(){
        if(obj==null){
            obj=new ManageUser();
        }
        return obj;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAddUser = new javax.swing.JButton();
        btnUpdateUser = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manage User - The Bookstore");
        setBackground(java.awt.Color.gray);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(java.awt.Color.gray);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 71, 27));

        txtName.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 350, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 45, 70, 27));

        txtUsername.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 350, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 78, 70, 27));

        btnAddUser.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        btnAddUser.setText("ADD");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 90, -1));

        btnUpdateUser.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        btnUpdateUser.setText("UPDATE");
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 80, -1));

        btnDeleteUser.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        btnDeleteUser.setText("DELETE");
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 90, -1));

        txtPassword.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 350, -1));

        btnReset.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 90, -1));

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(463, 424));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        obj=null;
    }//GEN-LAST:event_formWindowClosing
	
	//Program to add users to database
	public void addUser(){
		try{
			String sql="insert into users (name,username,password)values(?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1, txtName.getText());
			pst.setString(2, txtUsername.getText());
			pst.setString(3, txtPassword.getText());
			pst.execute();
			JOptionPane.showMessageDialog(null, "New User added to database successfully","Data Added",JOptionPane.INFORMATION_MESSAGE);
			pst.close();
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, e,"addUser() Exception",JOptionPane.ERROR_MESSAGE);
		}
	}
    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        // TODO add your handling code here:
		if(!"".equals(txtName.getText()) && !"".equals(txtUsername.getText()) && !"".equals(txtPassword.getText())){
			addUser();
			getDataToTable();
			resetForm();
		}else{
			JOptionPane.showMessageDialog(null, "Empty fields cannot be saved. Please enter User details.","Empty Field Detected",JOptionPane.ERROR_MESSAGE);
		}
    }//GEN-LAST:event_btnAddUserActionPerformed

	//Program to get data from database to table
	public void getDataToTable(){
		try{
			String sql="Select * from users";
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			tblUsers.setModel(DbUtils.resultSetToTableModel(rs));
			pst.close();
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, e,"getDataToTable() Exception",JOptionPane.ERROR_MESSAGE);
		}
	}
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
		resetForm();
		getDataToTable();
    }//GEN-LAST:event_formWindowOpened

	//Program to get table data to field
	String uID;
	public void getTblDataToField(){
		try{
			int row=tblUsers.getSelectedRow();
			uID=tblUsers.getModel().getValueAt(row, 0).toString();
			String sql="Select * from users where uid='"+uID+"'";
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			if(rs.next()){
				txtName.setText(rs.getString("name"));
				txtUsername.setText(rs.getString("username"));
				txtPassword.setText(rs.getString("password"));
				btnAddUser.setEnabled(false);
				btnUpdateUser.setEnabled(true);
			}
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, e,"getTblDataToField() Exception",JOptionPane.ERROR_MESSAGE);
		}
	}
    private void tblUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsersMouseClicked
        // TODO add your handling code here:
		getTblDataToField();
    }//GEN-LAST:event_tblUsersMouseClicked

	//Program to reset form
	public void resetForm(){
		txtName.setText("");
		txtUsername.setText("");
		txtPassword.setText("");
		btnAddUser.setEnabled(true);
		btnUpdateUser.setEnabled(false);
		btnDeleteUser.setEnabled(true);
	}
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
		resetForm();
		getDataToTable();
    }//GEN-LAST:event_btnResetActionPerformed

	//Program to update existing user details
	public void updateUser(){
		try{
			String sql="UPDATE users SET name='"+txtName.getText()+"', username='"+txtUsername.getText()+"', password='"+txtPassword.getText()+"' WHERE uid='"+uID+"'";
			pst=conn.prepareStatement(sql);
			pst.execute();
			JOptionPane.showMessageDialog(null, "User data has been updated successfully","Data Updated",JOptionPane.INFORMATION_MESSAGE);
			pst.close();
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, e,"updateUser() Exception",JOptionPane.ERROR_MESSAGE);
		}
	}
    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
        // TODO add your handling code here:
		updateUser();
		resetForm();
		getDataToTable();
    }//GEN-LAST:event_btnUpdateUserActionPerformed

	//Program to delete user
	public void deleteUser(){
		try{
			String sql="DELETE FROM users WHERE uid='"+uID+"'";
			pst=conn.prepareStatement(sql);
			pst.execute();
			JOptionPane.showMessageDialog(null, "User deleted from database successfully.","User Deleted",JOptionPane.INFORMATION_MESSAGE);
		}catch(SQLException e){
			JOptionPane.showMessageDialog(null, e,"deleteUser() exception",JOptionPane.ERROR_MESSAGE);
		}
	}
    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        // TODO add your handling code here:
		deleteUser();
		resetForm();
		getDataToTable();
    }//GEN-LAST:event_btnDeleteUserActionPerformed

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
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsers;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

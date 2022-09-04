
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class probarconex extends javax.swing.JFrame {

    private static Connection conn;
    private static final String driver = "com.mysql.cj.jdbc.Driver";  
    private static final String user = "root";
    private static final String password = "denis";
    private static final String url = "jdbc:mysql://localhost:3306/scv_database" ; //establecer conexión
    
    public void conector() {
                conn = null;
        try{
            //obtener valor del Driver
            Class.forName(driver);
            //Obtener la conexión
            conn = (Connection) DriverManager.getConnection(url,user,password);   
            if (conn!=null){
            jLabel1.setText("Ha ocurrido conexion" );
            }
        }catch(ClassNotFoundException  | SQLException e){
           jLabel1.setText("Ha ocurrido un error en la conexion" );
        }
    
       }
    
    public probarconex() {
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

        btnconectr = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnconectr.setText("Conectar");
        btnconectr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconectrActionPerformed(evt);
            }
        });
        getContentPane().add(btnconectr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setText("estado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnconectrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconectrActionPerformed

    conector();
      
    }//GEN-LAST:event_btnconectrActionPerformed

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
            java.util.logging.Logger.getLogger(probarconex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(probarconex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(probarconex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(probarconex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new probarconex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconectr;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

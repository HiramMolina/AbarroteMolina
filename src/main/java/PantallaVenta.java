
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;
//import static producto.getConnection;
//import static producto.getConnection;


/**
 *
 * @author Hiram Molina
 */

public class PantallaVenta extends javax.swing.JFrame {
//Variables
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
//    int r=0;
    
    public static final String url = "jdbc:mysql://localhost:3306/puntodeventa";
        public static final String user = "root";
        public static final String pass = "admin";
    
            public static Connection getConnection(){
            Connection con = null;

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection(url,user,pass);
//                    JOptionPane.showMessageDialog(null, "Conexion exitosa");
                    escribirConectar();
                } catch (Exception e) {
                    System.out.println("e");
                }
                return con;
                    }
            
            public static void escribirConectar() {
                        try {
                            File archivo = new File("informacion_conexion.txt");
                            archivo.createNewFile();

                            BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true));
//                            writer.write("**********************************************\n");
                            writer.write(ObtenerFecha() + " Conexión exitosa a la base de datos\n");
//                            writer.write("Dia, fecha y hora: "  "\n");
//                            writer.write("  URL: " + url + "\n");
//                            writer.write("  Usuario: " + user + "\n");
//                            writer.write("  Contraseña: " + pass + "\n");
//                            writer.write("**********************************************\n");
                            writer.close();
                        } catch (IOException e) {
                            System.out.println("Error al escribir en el archivo: " + e.getMessage());
                        }
                    }
            
            public static String ObtenerFecha(){
                        LocalDateTime ahora = LocalDateTime.now();
                        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
                        return ahora.format(formato);
                    }
            
            
            private void limpiarCajas(){ //LIMPIA TODAS LAS CAJAS
            
            txtId.setText(null);
            txtNombre.setText(null);
            txtPrecio.setText(null);
//          txtProveedor.setText(null);
            txtExistencia.setText(null);
            jCantidad.setValue(0);
            escribirLimpiarCajas();
        }
            private void escribirLimpiarCajas(){
               try {File archivo = new File("informacion_conexion.txt");
                BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true));

                LocalDateTime ahora = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
                String fechaHoraLimpiarCajas = ahora.format(formatter);

                writer.write(fechaHoraLimpiarCajas + " Boton limpiar cajas\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }
        }
            
            
            
            
            
            public PantallaVenta() {
        initComponents();
        setDefaultCloseOperation(PantallaVenta.DISPOSE_ON_CLOSE);
        Calendar calendar = new GregorianCalendar();
        int month = calendar.get(Calendar.MONTH) + 1; // Agregar 1 para obtener el mes correcto
        txtFecha.setText(""+calendar.get(Calendar.YEAR)+"-"+calendar.get(Calendar.MONTH)+"-"+calendar.get(Calendar.DAY_OF_MONTH));
        String formateoFecha = String.format("%d-%02d-%d", calendar.get(Calendar.YEAR), month, calendar.get(Calendar.DAY_OF_MONTH));
            txtFecha.setText(formateoFecha);
            


// Formatear la fecha en un String con el mes correcto
//String formattedDate = String.format("%d-%02d-%d", calendar.get(Calendar.YEAR), month, calendar.get(Calendar.DAY_OF_MONTH));
//txtFecha.setText(formattedDate);
        
    }
        
//    public int GuardarVentas(Ventas v){
//        
//        Ventas ventas= new Ventas();
//            String sql = "INSERT INTO venta(IdVenta,nombreProducto,cantidadProducto,precioProducto) VALUES (?,?,?,?)";
//        try {
//            ps.setString(1, txtId.getText());
//            ps.setString(2, txtNombre.getText());
//            ps.setString(3, jCantidad.getValue().toString());
//            ps.setString(4, txtPrecio.getText());
//            r=ps.executeUpdate();
//        } catch (Exception e) {
//            
//        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jCantidad = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtExistencia = new javax.swing.JTextField();
        btnBuscarCod = new javax.swing.JButton();
        btnBuscarProd = new javax.swing.JButton();
        btnAggVenta = new javax.swing.JButton();
        txtFecha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jMenuItem1.setText("jMenuItem1");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 102, 51));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(620, 691));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pantalla de Venta");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(580, 541));

        jLabel2.setText("Codigo Producto:");

        jLabel3.setText("Precio:");

        jLabel5.setText("Cantidad");

        txtPrecio.setEditable(false);

        jLabel6.setText("Producto:");

        jLabel7.setText("Stock");

        txtExistencia.setEditable(false);

        btnBuscarCod.setText("Buscar codigo");
        btnBuscarCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCodActionPerformed(evt);
            }
        });

        btnBuscarProd.setText("Buscar Producto");
        btnBuscarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdActionPerformed(evt);
            }
        });

        btnAggVenta.setText("Agregar venta");
        btnAggVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggVentaActionPerformed(evt);
            }
        });

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(0, 0, 255));
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setText("$");

        jLabel9.setText("unidades");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(2, 2, 2)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCantidad))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(139, 139, 139))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscarProd)
                                    .addComponent(btnAggVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar)
                                .addGap(23, 23, 23))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 410, Short.MAX_VALUE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCod))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarProd)
                    .addComponent(jLabel6)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAggVenta)
                    .addComponent(btnCancelar))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );

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
    }// </editor-fold>//GEN-END:initComponents
//BOTON BUSCAR _________________________________________________________________________BOTON BUSCAR___________________________________________
    private void btnBuscarCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCodActionPerformed
//BOTON BUSCAR _________________________________________________________________________BOTON BUSCAR___________________________________________
    Connection con = getConnection();
     
        try {
            ps = con.prepareStatement("SELECT * FROM producto WHERE IdProducto = ?");
            ps.setString(1, txtId.getText());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                txtId.setText(rs.getString("IdProducto"));
                txtNombre.setText(rs.getString("nombreProducto"));
                txtPrecio.setText(rs.getString("precioProducto"));
//                cbxCategoria.setSelectedItem(rs.getString("categoriaProducto"));
//                txtProveedor.setText(rs.getString("IdProveedor"));
                txtExistencia.setText(rs.getString("existencia"));
                escribirbtnBuscarID();
            }
            else{
                JOptionPane.showMessageDialog(null, "No existe producto con esa clave");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnBuscarCodActionPerformed
private void escribirbtnBuscarID(){
               try {File archivo = new File("informacion_conexion.txt");
                BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true));

                LocalDateTime ahora = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
                String fechaHoraBuscarID = ahora.format(formatter);

                writer.write(fechaHoraBuscarID + " Boton buscar por ID\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }
        }


//BOTON BUSCAR _________________________________________________________________________BOTON BUSCAR___________________________________________
    private void btnBuscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdActionPerformed
//BOTON BUSCAR _________________________________________________________________________BOTON BUSCAR___________________________________________
        Connection con = getConnection();
     
        try {
            ps = con.prepareStatement("SELECT * FROM producto WHERE nombreProducto = ?");
            ps.setString(1, txtNombre.getText());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                txtId.setText(rs.getString("IdProducto"));
                txtNombre.setText(rs.getString("nombreProducto"));
                txtPrecio.setText(rs.getString("precioProducto"));
//                cbxCategoria.setSelectedItem(rs.getString("categoriaProducto"));
//                txtProveedor.setText(rs.getString("IdProveedor"));
                txtExistencia.setText(rs.getString("existencia"));
                escribirbtnBuscarNombre();
            }
            else{
                JOptionPane.showMessageDialog(null, "No existe producto con ese nombre");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnBuscarProdActionPerformed

    private void escribirbtnBuscarNombre(){
               try {File archivo = new File("informacion_conexion.txt");
                BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true));

                LocalDateTime ahora = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
                String fechaHoraBuscarNombre = ahora.format(formatter);

                writer.write(fechaHoraBuscarNombre + " Boton buscar por ID\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }
        }
    
    
    private void btnAggVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggVentaActionPerformed
       
        Connection con = getConnection();
        
        try {
            ps = con.prepareStatement("INSERT INTO venta(nombreProducto,cantidadProducto,precioProducto,IdProducto) VALUES (?,?,?,?)");
            
            ps.setString(1, txtNombre.getText());
            ps.setString(2, jCantidad.getValue().toString());
            ps.setString(3, txtPrecio.getText());
            ps.setString(4, txtId.getText());

            

            //Ejecutar consulta
            //Igualamos a Int si se ejecutó o no correctamente
            int res = ps.executeUpdate();
            
            if (res > 0) {
            // Restar la cantidad vendida de la tabla de productos
            int cantidadVendida = Integer.parseInt(jCantidad.getValue().toString());
            int idProducto = Integer.parseInt(txtId.getText());
            
            ps = con.prepareStatement("UPDATE producto SET existencia = existencia - ? WHERE IdProducto = ?");
            ps.setInt(1, cantidadVendida);
            ps.setInt(2, idProducto);
            
            int resultadoUpdate = ps.executeUpdate();
            
            if (resultadoUpdate > 0) {
                JOptionPane.showMessageDialog(null, "Producto a venta. Existencias actualizadas.");
                limpiarCajas();
                escribirbtnAggVenta();
            } else {
                JOptionPane.showMessageDialog(null, "Venta exitosa pero no se pudo actualizar la existencia.");
                limpiarCajas();
            }
            }else{
                JOptionPane.showMessageDialog(null, "Venta invalida");
                limpiarCajas();
            }
            con.close();
            con = getConnection();
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }//GEN-LAST:event_btnAggVentaActionPerformed

    private void escribirbtnAggVenta(){
               try {File archivo = new File("informacion_conexion.txt");
                BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true));

                LocalDateTime ahora = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
                String fechaHoraAggVenta = ahora.format(formatter);

                writer.write(fechaHoraAggVenta + " Boton agregar venta\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }
        }
    
    
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCajas();
        escribirBtnCancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void escribirBtnCancelar(){
               try {File archivo = new File("informacion_conexion.txt");
                BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true));

                LocalDateTime ahora = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
                String fechaHoraCancelar = ahora.format(formatter);

                writer.write(fechaHoraCancelar + " Boton Cancelar\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }
        }
    
    
    
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
            java.util.logging.Logger.getLogger(PantallaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAggVenta;
    private javax.swing.JButton btnBuscarCod;
    private javax.swing.JButton btnBuscarProd;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JSpinner jCantidad;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}

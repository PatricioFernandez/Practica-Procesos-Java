import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author @Patricio Fernandez <patricio.fernandez.florez@gmail.com>
 */
public class Controlador extends javax.swing.JFrame {

    Primos p1;
    static ArrayList procesos = new ArrayList<Process>();
    static private DefaultListModel lista = new DefaultListModel();

    public Controlador() {
        initComponents();
        this.setResizable(false);
        jListProcesos.setModel(lista);
        VentanaComandos.setEditable(false);
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButtonCalc = new javax.swing.JButton();
        jButtonPaint = new javax.swing.JButton();
        jButtonNotepad = new javax.swing.JButton();
        jButtonPrimos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jListProcesos = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        VentanaComandos = new javax.swing.JTextArea();
        comandos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Programacion de Procesos y Servicios Tema 1");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonCalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/calc.png"))); // NOI18N
        jButtonCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcActionPerformed(evt);
            }
        });

        jButtonPaint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/paint.png"))); // NOI18N
        jButtonPaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPaintActionPerformed(evt);
            }
        });

        jButtonNotepad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/notepad.png"))); // NOI18N
        jButtonNotepad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNotepadActionPerformed(evt);
            }
        });

        jButtonPrimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Primos.png"))); // NOI18N
        jButtonPrimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNotepad, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonPaint, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPrimos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPaint, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonNotepad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPrimos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel3.setText("Programas");

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setToolTipText("");
        jPanel4.setName(""); // NOI18N

        jListProcesos.setToolTipText("");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/cerrar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jListProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jListProcesos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        jLabel2.setText("Procesos Activos");

        jLabel4.setText("Línea de comandos");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        VentanaComandos.setColumns(20);
        VentanaComandos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        VentanaComandos.setRows(5);
        jScrollPane1.setViewportView(VentanaComandos);

        jLabel1.setText("Comandos");

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(comandos, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comandos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGap(48, 48, 48)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel5.setText("Programacion de Procesos y Servicios Tema 1");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/salir.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu2.setText("Sobre");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(263, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcActionPerformed
        try {
            ejecutar("calc.exe");
            jButtonCalc.setEnabled(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Ha habido error con la calculadora");
        }
    }//GEN-LAST:event_jButtonCalcActionPerformed

    private void jButtonPaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPaintActionPerformed
        try {
            ejecutar("mspaint.exe");
            jButtonPaint.setEnabled(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Ha habido error con el paint");
        }
    }//GEN-LAST:event_jButtonPaintActionPerformed

    private void jButtonNotepadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNotepadActionPerformed
        try {
            ejecutar("notepad.exe");
            jButtonNotepad.setEnabled(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Ha habido error con el notepad");
        }
    }//GEN-LAST:event_jButtonNotepadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            comandos(comandos.getText());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Ha habido error con el cmd");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        eliminar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonPrimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimosActionPerformed
        try {
            ejecutar("Primos");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Ha habido error con el proceso de consola");
        }
    }//GEN-LAST:event_jButtonPrimosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int n = JOptionPane.showConfirmDialog(rootPane, "Está seguro que desea salir", "Salir", JOptionPane.OK_CANCEL_OPTION);
        if (n == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        Presentacion p = new Presentacion();
        p.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void ejecutar(String nombre) throws IOException, InterruptedException {
        cambiarEstado(nombre, false);
        if (nombre.equalsIgnoreCase("Primos")) {
            p1 = new Primos();
            p1.setVisible(true);
            lista.add(lista.getSize(), "Primos");
        } else {
            Process proceso = new ProcessBuilder(nombre).start();
            Proceso controlador = new Proceso(proceso, nombre);
            controlador.start();
            procesos.add(proceso);
            lista.add(lista.getSize(), nombre);
        }

    }

    private void eliminar() {

        int indice = jListProcesos.getSelectedIndex();

        try {
            //Si no tenemos seleccionado nada por mera transparencia se borrara el ultimo proceso abierto
            if (indice < 0) {
                indice = 0;
            }
            
            String nombre = (String) lista.get(indice);
            cambiarEstado(nombre, true);
            //Si es Primos es una interfaz pero si esta en la lista
            if (!nombre.equals("Primos")) {
                Process proceso = (Process) procesos.get(indice);
                procesos.remove(proceso);
                proceso.destroy();
            }
            lista.remove(indice);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No quedan procesos", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    public static void eliminar(String nombre) {

        int indice = lista.indexOf(nombre);
        cambiarEstado(nombre, true);
        if (!nombre.equals("Primos")) {
            Process proceso = (Process) procesos.get(indice);
            procesos.remove(proceso);
            proceso.destroy();
        }
        lista.remove(indice);
    }

    private static void cambiarEstado(String nombre, boolean estado) {

        //Si es true habilita el boton y si es false se deshabilita
        if (nombre.equals("Primos")) {
            jButtonPrimos.setEnabled(estado);
        } else {

            switch (nombre) {
                case "mspaint.exe":
                    jButtonPaint.setEnabled(estado);
                    break;

                case "calc.exe":
                    jButtonCalc.setEnabled(estado);
                    break;

                case "notepad.exe":
                    jButtonNotepad.setEnabled(estado);
                    break;

            }
        }
    }

    private void comandos(String comando) throws IOException {

        try {
            //Clase Runtime debido a que ejecutamos un comando de cmd y no lanzamos un proceso en si(ProcessBuilder)
            Process proceso = Runtime.getRuntime().exec(comando);
            procesos.add(proceso);
            //Creamos un pipe de entrada para recibir los datos que nos manda el cmd
            BufferedReader b1 = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            //Bucle para leer
            String linea;

            while ((linea = b1.readLine()) != null) {
                VentanaComandos.setText(VentanaComandos.getText().concat(linea + "\r \n"));
            }

            procesos.remove(proceso);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "No existe ese comando");
        }
    }

    public static void main(String args[]) {

        //Look and feel que me gusta
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Controlador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Controlador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Controlador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Controlador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //Instanciamos la clase controlador y la centramos
                Controlador c1 = new Controlador();
                c1.setVisible(true);
                c1.setLocationRelativeTo(null);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea VentanaComandos;
    private javax.swing.JTextField comandos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private static javax.swing.JButton jButtonCalc;
    private static javax.swing.JButton jButtonNotepad;
    private static javax.swing.JButton jButtonPaint;
    private static javax.swing.JButton jButtonPrimos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jListProcesos;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author @Patricio Fernandez <patricio.fernandez.florez@gmail.com>
 */
public class Primos extends javax.swing.JFrame {

    BufferedWriter bw;
    BufferedReader br;
    Process proceso;
    boolean primeravez = false;

    public Primos() {
        initComponents();

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        this.setLocationRelativeTo(null);
        jTextAreaConsola.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaConsola = new javax.swing.JTextArea();
        enviarE = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        comandos1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("¿Es primo?");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextAreaConsola.setColumns(20);
        jTextAreaConsola.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextAreaConsola.setRows(5);
        jScrollPane3.setViewportView(jTextAreaConsola);

        enviarE.setText("Enviar");
        enviarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarEActionPerformed(evt);
            }
        });

        jLabel2.setText("Entrada");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comandos1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(enviarE)
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comandos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviarE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarEActionPerformed

        try {

            proceso = Runtime.getRuntime().exec("java Primos");
            bw = new BufferedWriter(new OutputStreamWriter(proceso.getOutputStream()));
            br = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            jTextAreaConsola.setText(br.readLine());

        } catch (Exception e) {

        }

        try {

            String entrada = comandos1.getText();
            int prueba = 0;
            do {
                try {

                    prueba = Integer.parseInt(entrada);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Tienes que escribir un numero", "Error", JOptionPane.ERROR_MESSAGE);
                    prueba = Integer.parseInt(entrada);

                }
            } while (prueba == 0);

            bw.write(entrada);
            bw.close();
            jTextAreaConsola.setText(jTextAreaConsola.getText().concat("\n" + entrada + "\n"));
            jTextAreaConsola.setText(jTextAreaConsola.getText().concat(br.readLine()));
            comandos1.setText("");
        } catch (IOException ex) {
            Logger.getLogger(Primos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_enviarEActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Controlador.eliminar("Primos");
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField comandos1;
    private javax.swing.JButton enviarE;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextAreaConsola;
    // End of variables declaration//GEN-END:variables
}

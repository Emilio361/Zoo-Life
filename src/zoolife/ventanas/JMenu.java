/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoolife.ventanas;

//Importar clases
import zoolife.Cliente;

/**
 *
 * @author Benjamín Igor
 * @author Emilio Contreras
 * @author Pablo Martínez
 */
public class JMenu extends javax.swing.JFrame {

    /**
     * Creates new form JMenu
     */
    
    //Instanciar
    
    Cliente cliente;
    JTienda tienda;
    
    //Declaración de variables
    
    private int total;
    private int valor;

    //Constructor
    
    public JMenu(Cliente cliente, int total) {
        this.cliente = cliente;
        this.total = total;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTienda = new javax.swing.JButton();
        jDonatorio = new javax.swing.JButton();
        jNocomprar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTienda.setText("Tienda");
        jTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTiendaActionPerformed(evt);
            }
        });

        jDonatorio.setText("Donatorio");
        jDonatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDonatorioActionPerformed(evt);
            }
        });

        jNocomprar.setText("Terminar");
        jNocomprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNocomprarActionPerformed(evt);
            }
        });

        jLabel1.setText("¿Desea comprar algo más?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jTienda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(jDonatorio)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jNocomprar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTienda)
                            .addComponent(jDonatorio))))
                .addGap(31, 31, 31)
                .addComponent(jNocomprar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTiendaActionPerformed
        /**Llamar ventana
         * Traspaso de datos
         */
        tienda = new JTienda(cliente, total);
        tienda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jTiendaActionPerformed

    private void jDonatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDonatorioActionPerformed
        /**Llamar ventana
         * Traspaso de datos
         */
        JDonatorio donatorio = new JDonatorio(cliente, total);
        donatorio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jDonatorioActionPerformed

    private void jNocomprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNocomprarActionPerformed
        /**Llamar ventana
         * Traspaso de datos
         */
        JTotal jtotal = new JTotal(cliente, total);
        jtotal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jNocomprarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jDonatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jNocomprar;
    private javax.swing.JButton jTienda;
    // End of variables declaration//GEN-END:variables
}

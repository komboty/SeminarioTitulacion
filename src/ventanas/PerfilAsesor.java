/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import base.CandidatoDBHelper;
import clase.Asesor;
import clase.Candidato;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author Parker
 */
public class PerfilAsesor extends javax.swing.JFrame {
    /**
     * asesor tipo Asesor, se utiliza para personalizar la ventana y para asignarlo a un candidato.
     */
    Asesor asesor;
    
    /**
     * Creates new form PerfilAsesor
     */
    public PerfilAsesor() {
        initComponents();
//        Inicio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtAtras = new javax.swing.JButton();
        jLbNombre = new javax.swing.JLabel();
        jScrollPanel = new javax.swing.JScrollPane();
        jPanelCandidatos = new javax.swing.JPanel();
        jBtGrupos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seminario de Apoyo a la Titulación");

        jBtAtras.setText("Atrás");
        jBtAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAtrasActionPerformed(evt);
            }
        });

        jLbNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLbNombre.setText("jLbNombre");

        javax.swing.GroupLayout jPanelCandidatosLayout = new javax.swing.GroupLayout(jPanelCandidatos);
        jPanelCandidatos.setLayout(jPanelCandidatosLayout);
        jPanelCandidatosLayout.setHorizontalGroup(
            jPanelCandidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelCandidatosLayout.setVerticalGroup(
            jPanelCandidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jScrollPanel.setViewportView(jPanelCandidatos);

        jBtGrupos.setText("Ver grupos");
        jBtGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtGruposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLbNombre)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPanel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtGrupos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 376, Short.MAX_VALUE)
                        .addComponent(jBtAtras)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtAtras)
                    .addComponent(jBtGrupos))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAtrasActionPerformed
        IniciarSesion ventana = new IniciarSesion();
        ventana.setLocationRelativeTo(this);
        ventana.show();
        this.dispose();
    }//GEN-LAST:event_jBtAtrasActionPerformed

    private void jBtGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtGruposActionPerformed
        Grupos ventana = new Grupos();
        ventana.setVistaAsesor(asesor);
        ventana.setLocationRelativeTo(this);
        ventana.show();
        this.dispose();
    }//GEN-LAST:event_jBtGruposActionPerformed

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
            java.util.logging.Logger.getLogger(PerfilAsesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilAsesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilAsesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilAsesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilAsesor().setVisible(true);
            }
        });
    }
        
//    public void Inicio(){
//        CandidatoIG panelCandidato = new CandidatoIG();
//        Candidato candidato = new Candidato(new ImageIcon("foto.png"), "juan alberto", "perez", "perez", "012", "ingieneria en softwre", "SAT", new File(""), new File(""));
//        panelCandidato.setCandidato(candidato);
//        panelCandidato.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
//        CandidatoIG v = new CandidatoIG();
//        v.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
//        jPanelCandidatos.setLayout(new BoxLayout(jPanelCandidatos, BoxLayout.Y_AXIS));
//        jPanelCandidatos.add(panelCandidato);
//        jPanelCandidatos.add(v);
//    }

    public void setAsesor(Asesor asesor) {
        this.asesor = asesor;
        Mostar();
    }

    public Asesor getAsesor() {
        return asesor;
    }
    
    /*
    * Ver lista de candidatos registrados sin grupo.
    */
    private void Mostar(){
        //Se muestra el nombre del asesor
        String nombreAsesor = "ASESOR: "
                            + asesor.getNombre() + " " 
                            + asesor.getApellidoPaterno() + " " 
                            + asesor.getApellidoMaterno();
        jLbNombre.setText("  " + nombreAsesor);
        
        //Se pone formato al Panel que mostrara la lista de los candidatos sin grupo.
        jPanelCandidatos.setLayout(new BoxLayout(jPanelCandidatos, BoxLayout.Y_AXIS));
        
        //Se obtienen todos los candidatos sin grupo de la base de datos.
        CandidatoDBHelper helper = new CandidatoDBHelper();
        ArrayList<Candidato> candidatos = helper.getSinGrupoIG();
        
        //si no hay candidatos se muestra un mensaje.
        if(candidatos.isEmpty()){            
            JLabel mensaje = new JLabel("No hay candidatos sin grupo");
            JPanel panelMensaje = new JPanel();
            panelMensaje.add(mensaje);
            jPanelCandidatos.add(panelMensaje);
        }
                
        //Se muestran los candidatos en la ventana.
        for(Candidato elmento : candidatos){
            //Se crea un panel que muestra a un solo candidato y se pasa el candidato que mostrara.
            CandidatoIG panelCandidato = new CandidatoIG();
            panelCandidato.setCandidato(elmento);
            panelCandidato.setAsesor(asesor);
            
            //Formato al borde del panel
            panelCandidato.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));            
            
            //Por último se agrega el panel de un candidato al panel que mostrar la lista de candidatos sin grupo.
            jPanelCandidatos.add(panelCandidato);
        }        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtAtras;
    private javax.swing.JButton jBtGrupos;
    private javax.swing.JLabel jLbNombre;
    private javax.swing.JPanel jPanelCandidatos;
    private javax.swing.JScrollPane jScrollPanel;
    // End of variables declaration//GEN-END:variables
}
/**
 * Panel che si occupa di gestire i bottoni.
 * Avanti, indietro, sinistra,destra
 * 
 * @author Alessandro Aloise
 * @version 28.01.2021
 */
public class BottoniPanel extends javax.swing.JPanel implements MessageListener{
    
    private Drone drone;
    
    /**
     * Creates new form BottiniPanel
     */
    public BottoniPanel() {
        initComponents();
        drone = new Drone(this);
        drone.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        avanti = new javax.swing.JButton();
        indietro = new javax.swing.JButton();
        sinistra = new javax.swing.JButton();
        destra = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        avanti.setText("Avanti");

        indietro.setText("Indietro");

        sinistra.setText("Sinistra");
        sinistra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sinistraMouseClicked(evt);
            }
        });
        sinistra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinistraActionPerformed(evt);
            }
        });

        destra.setText("Destra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(sinistra, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(indietro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(avanti, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(111, 111, 111)
                .addComponent(destra, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(avanti, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(destra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sinistra, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(indietro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sinistraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinistraActionPerformed

    }//GEN-LAST:event_sinistraActionPerformed

    private void sinistraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sinistraMouseClicked
        /**
         * L'ip del drone.
         */
        String ip = "192.168.162.104";
        
        /**
         * La porta d'ascolto del drone.
         */
        int port = 65064;
        
        /**
         * Il comando da eseguire.
         */
        String message = "left 50";
        
        drone.setInfo(ip, port, message);
        drone.sendMessage();
    }//GEN-LAST:event_sinistraMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avanti;
    private javax.swing.JButton destra;
    private javax.swing.JButton indietro;
    private javax.swing.JButton sinistra;
    // End of variables declaration//GEN-END:variables

    @Override
    public void messageReceived() {
        System.out.println(drone.getMessageReceived());
    }
}

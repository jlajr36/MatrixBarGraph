package pkg;

import javax.swing.UIManager;
import com.fazecast.jSerialComm.*;

public class LEDBarChartJava extends javax.swing.JFrame {
    
    SerialPort com;

    public LEDBarChartJava() {
        initComponents();
        loadPortNames();
    }
    
    void loadPortNames() {
        SerialPort[] coms = SerialPort.getCommPorts();
        String[] strcoms = new String[coms.length];
        for (int i = 0; i < strcoms.length; i++) {
            strcoms[i] = coms[i].getSystemPortName();
        }
        ComboPorts.setModel(new javax.swing.DefaultComboBoxModel<>(strcoms));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboPorts = new javax.swing.JComboBox<>();
        sldCol0 = new javax.swing.JSlider();
        sldCol1 = new javax.swing.JSlider();
        sldCol2 = new javax.swing.JSlider();
        sldCol3 = new javax.swing.JSlider();
        sldCol4 = new javax.swing.JSlider();
        sldCol5 = new javax.swing.JSlider();
        sldCol6 = new javax.swing.JSlider();
        sldCol7 = new javax.swing.JSlider();
        btnConnect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ComboPorts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        sldCol0.setMajorTickSpacing(1);
        sldCol0.setMaximum(8);
        sldCol0.setMinorTickSpacing(1);
        sldCol0.setOrientation(javax.swing.JSlider.VERTICAL);
        sldCol0.setPaintLabels(true);
        sldCol0.setPaintTicks(true);
        sldCol0.setSnapToTicks(true);
        sldCol0.setValue(0);
        sldCol0.setEnabled(false);
        sldCol0.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldCol0StateChanged(evt);
            }
        });

        sldCol1.setMajorTickSpacing(1);
        sldCol1.setMaximum(8);
        sldCol1.setMinorTickSpacing(1);
        sldCol1.setOrientation(javax.swing.JSlider.VERTICAL);
        sldCol1.setPaintLabels(true);
        sldCol1.setPaintTicks(true);
        sldCol1.setSnapToTicks(true);
        sldCol1.setValue(0);
        sldCol1.setEnabled(false);
        sldCol1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldCol1StateChanged(evt);
            }
        });

        sldCol2.setMajorTickSpacing(1);
        sldCol2.setMaximum(8);
        sldCol2.setMinorTickSpacing(1);
        sldCol2.setOrientation(javax.swing.JSlider.VERTICAL);
        sldCol2.setPaintLabels(true);
        sldCol2.setPaintTicks(true);
        sldCol2.setSnapToTicks(true);
        sldCol2.setValue(0);
        sldCol2.setEnabled(false);
        sldCol2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldCol2StateChanged(evt);
            }
        });

        sldCol3.setMajorTickSpacing(1);
        sldCol3.setMaximum(8);
        sldCol3.setMinorTickSpacing(1);
        sldCol3.setOrientation(javax.swing.JSlider.VERTICAL);
        sldCol3.setPaintLabels(true);
        sldCol3.setPaintTicks(true);
        sldCol3.setSnapToTicks(true);
        sldCol3.setValue(0);
        sldCol3.setEnabled(false);
        sldCol3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldCol3StateChanged(evt);
            }
        });

        sldCol4.setMajorTickSpacing(1);
        sldCol4.setMaximum(8);
        sldCol4.setMinorTickSpacing(1);
        sldCol4.setOrientation(javax.swing.JSlider.VERTICAL);
        sldCol4.setPaintLabels(true);
        sldCol4.setPaintTicks(true);
        sldCol4.setSnapToTicks(true);
        sldCol4.setValue(0);
        sldCol4.setEnabled(false);
        sldCol4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldCol4StateChanged(evt);
            }
        });

        sldCol5.setMajorTickSpacing(1);
        sldCol5.setMaximum(8);
        sldCol5.setMinorTickSpacing(1);
        sldCol5.setOrientation(javax.swing.JSlider.VERTICAL);
        sldCol5.setPaintLabels(true);
        sldCol5.setPaintTicks(true);
        sldCol5.setSnapToTicks(true);
        sldCol5.setValue(0);
        sldCol5.setEnabled(false);
        sldCol5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldCol5StateChanged(evt);
            }
        });

        sldCol6.setMajorTickSpacing(1);
        sldCol6.setMaximum(8);
        sldCol6.setMinorTickSpacing(1);
        sldCol6.setOrientation(javax.swing.JSlider.VERTICAL);
        sldCol6.setPaintLabels(true);
        sldCol6.setPaintTicks(true);
        sldCol6.setSnapToTicks(true);
        sldCol6.setValue(0);
        sldCol6.setEnabled(false);
        sldCol6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldCol6StateChanged(evt);
            }
        });

        sldCol7.setMajorTickSpacing(1);
        sldCol7.setMaximum(8);
        sldCol7.setMinorTickSpacing(1);
        sldCol7.setOrientation(javax.swing.JSlider.VERTICAL);
        sldCol7.setPaintLabels(true);
        sldCol7.setPaintTicks(true);
        sldCol7.setSnapToTicks(true);
        sldCol7.setValue(0);
        sldCol7.setEnabled(false);
        sldCol7.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldCol7StateChanged(evt);
            }
        });

        btnConnect.setText("Connect");
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ComboPorts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConnect))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sldCol7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sldCol6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sldCol5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sldCol4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sldCol3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sldCol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sldCol1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sldCol0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboPorts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConnect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sldCol7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sldCol6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sldCol5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sldCol4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sldCol3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sldCol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sldCol1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sldCol0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
        com = SerialPort.getCommPorts()[ComboPorts.getSelectedIndex()];
        com.openPort();
        SetToEmpty();
        SetGUIItems();
    }//GEN-LAST:event_btnConnectActionPerformed

    void SetToEmpty() {
        byte[] emptys = {33,42,51,60,69,78,87,96};
        for (int i = 0; i < emptys.length; i++) {
            byte[] out = {emptys[i]};
            com.writeBytes(out, out.length);
        }
    }
    
    private void sldCol0StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldCol0StateChanged
        int outInt = sldCol0.getValue() + 33;
        byte[] outByte = {(byte)outInt};
        com.writeBytes(outByte, outByte.length);
    }//GEN-LAST:event_sldCol0StateChanged

    private void sldCol1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldCol1StateChanged
        int outInt = sldCol1.getValue() + 42;
        byte[] outByte = {(byte)outInt};
        com.writeBytes(outByte, outByte.length);
    }//GEN-LAST:event_sldCol1StateChanged

    private void sldCol2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldCol2StateChanged
        int outInt = sldCol2.getValue() + 51;
        byte[] outByte = {(byte)outInt};
        com.writeBytes(outByte, outByte.length);
    }//GEN-LAST:event_sldCol2StateChanged

    private void sldCol3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldCol3StateChanged
        int outInt = sldCol3.getValue() + 60;
        byte[] outByte = {(byte)outInt};
        com.writeBytes(outByte, outByte.length);
    }//GEN-LAST:event_sldCol3StateChanged

    private void sldCol7StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldCol7StateChanged
        int outInt = sldCol7.getValue() + 96;
        byte[] outByte = {(byte)outInt};
        com.writeBytes(outByte, outByte.length);
    }//GEN-LAST:event_sldCol7StateChanged

    private void sldCol6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldCol6StateChanged
        int outInt = sldCol6.getValue() + 87;
        byte[] outByte = {(byte)outInt};
        com.writeBytes(outByte, outByte.length);
    }//GEN-LAST:event_sldCol6StateChanged

    private void sldCol5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldCol5StateChanged
        int outInt = sldCol5.getValue() + 78;
        byte[] outByte = {(byte)outInt};
        com.writeBytes(outByte, outByte.length);
    }//GEN-LAST:event_sldCol5StateChanged

    private void sldCol4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldCol4StateChanged
        int outInt = sldCol4.getValue() + 69;
        byte[] outByte = {(byte)outInt};
        com.writeBytes(outByte, outByte.length);
    }//GEN-LAST:event_sldCol4StateChanged

    void SetGUIItems() {
        btnConnect.setEnabled(false);
        sldCol0.setEnabled(true);
        sldCol1.setEnabled(true);
        sldCol2.setEnabled(true);
        sldCol3.setEnabled(true);
        sldCol4.setEnabled(true);
        sldCol5.setEnabled(true);
        sldCol6.setEnabled(true);
        sldCol7.setEnabled(true);
    }
    
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            //pass
        } 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LEDBarChartJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboPorts;
    private javax.swing.JButton btnConnect;
    private javax.swing.JSlider sldCol0;
    private javax.swing.JSlider sldCol1;
    private javax.swing.JSlider sldCol2;
    private javax.swing.JSlider sldCol3;
    private javax.swing.JSlider sldCol4;
    private javax.swing.JSlider sldCol5;
    private javax.swing.JSlider sldCol6;
    private javax.swing.JSlider sldCol7;
    // End of variables declaration//GEN-END:variables
}

package com.iaapdevgroup2.mercairlineticketing;

import java.awt.Image;
import java.awt.event.ItemEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class AirlineType extends javax.swing.JFrame {

    public AirlineType() {
        super("Himpapawid Airlines Ticketing System");
        initComponents();
        
        ImageIcon himpapawidTopIcon = new ImageIcon(getClass().getResource("/images/LogoWName.png"));
        setIconImage(himpapawidTopIcon.getImage());
        
        Icon icon = lblLogo.getIcon();
        ImageIcon airlineLogo = (ImageIcon)icon;
        Image image = airlineLogo.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH);
        lblLogo.setIcon(new ImageIcon (image));
        
        this.setLocationRelativeTo(null);
    }
    private int maxSeat=0;
    protected static int passengerCount=0;
    protected static int minorCount;
    protected static int adultCount;
    protected static int seniorCount;
    
    public String getPassengerCount(){
        
        String passengerNumber = Integer.toString(passengerCount);
        return passengerNumber;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAirlineTypeTopBar = new javax.swing.JPanel();
        lblAirlineTypeTitle = new javax.swing.JLabel();
        lblTagline = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblAirlineTypeBackground = new javax.swing.JPanel();
        lblAirlineType = new javax.swing.JLabel();
        cboAirlineType = new javax.swing.JComboBox<>();
        pnlPassengerType = new javax.swing.JPanel();
        cboAdultCount = new javax.swing.JComboBox<>();
        lblAdults = new javax.swing.JLabel();
        cboSeniorsCount = new javax.swing.JComboBox<>();
        lblSeniors = new javax.swing.JLabel();
        cboMinorsCount = new javax.swing.JComboBox<>();
        lblMinors = new javax.swing.JLabel();
        btnProceed = new javax.swing.JButton();
        pnlTitleBar = new javax.swing.JPanel();
        lblSeatQuestion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlAirlineTypeTopBar.setBackground(new java.awt.Color(252, 177, 48));

        lblAirlineTypeTitle.setFont(new java.awt.Font("SansSerif", 3, 36)); // NOI18N
        lblAirlineTypeTitle.setForeground(new java.awt.Color(29, 72, 134));
        lblAirlineTypeTitle.setText("Himpapawid Airlines");

        lblTagline.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        lblTagline.setForeground(new java.awt.Color(29, 72, 134));
        lblTagline.setText("Taking care to the new heights");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoWName.png")));

        javax.swing.GroupLayout pnlAirlineTypeTopBarLayout = new javax.swing.GroupLayout(pnlAirlineTypeTopBar);
        pnlAirlineTypeTopBar.setLayout(pnlAirlineTypeTopBarLayout);
        pnlAirlineTypeTopBarLayout.setHorizontalGroup(
            pnlAirlineTypeTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAirlineTypeTopBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlAirlineTypeTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTagline)
                    .addComponent(lblAirlineTypeTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        pnlAirlineTypeTopBarLayout.setVerticalGroup(
            pnlAirlineTypeTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAirlineTypeTopBarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlAirlineTypeTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAirlineTypeTopBarLayout.createSequentialGroup()
                        .addComponent(lblAirlineTypeTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTagline))
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        lblAirlineTypeBackground.setBackground(new java.awt.Color(29, 72, 134));

        lblAirlineType.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        lblAirlineType.setForeground(new java.awt.Color(252, 177, 48));
        lblAirlineType.setText("Choose an Airline Type:");

        cboAirlineType.setBackground(new java.awt.Color(29, 72, 134));
        cboAirlineType.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        cboAirlineType.setForeground(new java.awt.Color(252, 177, 48));
        cboAirlineType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Business", "Private" }));
        cboAirlineType.setSelectedItem(null);
        cboAirlineType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboAirlineTypeItemStateChanged(evt);
            }
        });
        cboAirlineType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAirlineTypeActionPerformed(evt);
            }
        });

        pnlPassengerType.setBackground(new java.awt.Color(29, 72, 134));
        pnlPassengerType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 177, 48), 3));

        cboAdultCount.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cboAdultCount.setForeground(new java.awt.Color(252, 177, 48));
        cboAdultCount.setSelectedItem(null);
        cboAdultCount.setEnabled(false);

        lblAdults.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblAdults.setForeground(new java.awt.Color(252, 177, 48));
        lblAdults.setText("Adults (18-59)");

        cboSeniorsCount.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cboSeniorsCount.setForeground(new java.awt.Color(252, 177, 48));
        cboSeniorsCount.setSelectedItem(null);
        cboSeniorsCount.setEnabled(false);

        lblSeniors.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblSeniors.setForeground(new java.awt.Color(252, 177, 48));
        lblSeniors.setText("Seniors (60+)");

        cboMinorsCount.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cboMinorsCount.setForeground(new java.awt.Color(252, 177, 48));
        cboMinorsCount.setSelectedItem(null);
        cboMinorsCount.setEnabled(false);

        lblMinors.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblMinors.setForeground(new java.awt.Color(252, 177, 48));
        lblMinors.setText("Minors (0-17)");

        javax.swing.GroupLayout pnlPassengerTypeLayout = new javax.swing.GroupLayout(pnlPassengerType);
        pnlPassengerType.setLayout(pnlPassengerTypeLayout);
        pnlPassengerTypeLayout.setHorizontalGroup(
            pnlPassengerTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPassengerTypeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlPassengerTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboAdultCount, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdults))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(pnlPassengerTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboSeniorsCount, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeniors))
                .addGap(39, 39, 39)
                .addGroup(pnlPassengerTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboMinorsCount, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinors))
                .addGap(30, 30, 30))
        );
        pnlPassengerTypeLayout.setVerticalGroup(
            pnlPassengerTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPassengerTypeLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlPassengerTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPassengerTypeLayout.createSequentialGroup()
                        .addComponent(cboAdultCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAdults))
                    .addGroup(pnlPassengerTypeLayout.createSequentialGroup()
                        .addGroup(pnlPassengerTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboMinorsCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboSeniorsCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPassengerTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMinors)
                            .addComponent(lblSeniors))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnProceed.setBackground(new java.awt.Color(252, 177, 48));
        btnProceed.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        btnProceed.setForeground(new java.awt.Color(29, 72, 134));
        btnProceed.setText("Proceed >>");
        btnProceed.setEnabled(false);
        btnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedActionPerformed(evt);
            }
        });

        pnlTitleBar.setBackground(new java.awt.Color(252, 177, 48));

        lblSeatQuestion.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        lblSeatQuestion.setForeground(new java.awt.Color(29, 72, 134));
        lblSeatQuestion.setText("How many seats do you want to reserve?");

        javax.swing.GroupLayout pnlTitleBarLayout = new javax.swing.GroupLayout(pnlTitleBar);
        pnlTitleBar.setLayout(pnlTitleBarLayout);
        pnlTitleBarLayout.setHorizontalGroup(
            pnlTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSeatQuestion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTitleBarLayout.setVerticalGroup(
            pnlTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSeatQuestion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout lblAirlineTypeBackgroundLayout = new javax.swing.GroupLayout(lblAirlineTypeBackground);
        lblAirlineTypeBackground.setLayout(lblAirlineTypeBackgroundLayout);
        lblAirlineTypeBackgroundLayout.setHorizontalGroup(
            lblAirlineTypeBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblAirlineTypeBackgroundLayout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(lblAirlineType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboAirlineType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblAirlineTypeBackgroundLayout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(lblAirlineTypeBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblAirlineTypeBackgroundLayout.createSequentialGroup()
                        .addGroup(lblAirlineTypeBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnlPassengerType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlTitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(198, 198, 198))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblAirlineTypeBackgroundLayout.createSequentialGroup()
                        .addComponent(btnProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(322, 322, 322))))
        );
        lblAirlineTypeBackgroundLayout.setVerticalGroup(
            lblAirlineTypeBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblAirlineTypeBackgroundLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(lblAirlineTypeBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAirlineType)
                    .addComponent(cboAirlineType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlPassengerType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnProceed)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAirlineTypeTopBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblAirlineTypeBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlAirlineTypeTopBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAirlineTypeBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedActionPerformed
        minorCount = Integer.parseInt(cboMinorsCount.getSelectedItem().toString());
        adultCount = Integer.parseInt(cboAdultCount.getSelectedItem().toString());
        seniorCount = Integer.parseInt(cboSeniorsCount.getSelectedItem().toString());
        
        Boolean confirmation = false;
        passengerCount = Integer.parseInt(cboAdultCount.getSelectedItem().toString()) + Integer.parseInt(cboMinorsCount.getSelectedItem().toString()) + Integer.parseInt(cboSeniorsCount.getSelectedItem().toString());
        
        if(passengerCount > maxSeat)
            JOptionPane.showMessageDialog(null, "The total reservation count must not exceed " + maxSeat + ".", "Error", JOptionPane.ERROR_MESSAGE);
        else if(passengerCount < 1)
            JOptionPane.showMessageDialog(null, "The total reservation count must not be 0.", "Error", JOptionPane.ERROR_MESSAGE);
        else{
            if((Integer.parseInt(cboAdultCount.getSelectedItem().toString()) + Integer.parseInt(cboSeniorsCount.getSelectedItem().toString())) == 0)
                JOptionPane.showMessageDialog(null, "Minors are not allowed to reserve a seat without an adult(18 and above).", "Error", JOptionPane.ERROR_MESSAGE);
            else
                confirmation = true;
        }
        
        if(confirmation == true){
            Passengers p = new Passengers();
            p.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnProceedActionPerformed

    private void cboAirlineTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAirlineTypeActionPerformed
        cboAdultCount.setEnabled(true);
        cboMinorsCount.setEnabled(true);
        cboSeniorsCount.setEnabled(true);
        btnProceed.setEnabled(true);
    }//GEN-LAST:event_cboAirlineTypeActionPerformed

    private void cboAirlineTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboAirlineTypeItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            if(cboAirlineType.getSelectedItem().toString().equals("Private")){
                maxSeat = 14;
            }
            else if(cboAirlineType.getSelectedItem().toString().equals("Business")){
                maxSeat = 23;
            }
            else if (cboAirlineType.getSelectedItem().toString().equals("Regular")){
                maxSeat = 48;
            }
            
            String[] passengerSeat = new String[maxSeat + 1];
        
            for(int a = 0; a < passengerSeat.length; a++){
                passengerSeat[a] = String.valueOf(a);
            }
            cboAdultCount.setModel(new javax.swing.DefaultComboBoxModel<>(passengerSeat));
            cboMinorsCount.setModel(new javax.swing.DefaultComboBoxModel<>(passengerSeat));
            cboSeniorsCount.setModel(new javax.swing.DefaultComboBoxModel<>(passengerSeat));
            
            cboAdultCount.setSelectedItem(passengerSeat[0]);
            cboMinorsCount.setSelectedItem(passengerSeat[0]);
            cboSeniorsCount.setSelectedItem(passengerSeat[0]);
        }
    }//GEN-LAST:event_cboAirlineTypeItemStateChanged

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
            java.util.logging.Logger.getLogger(AirlineType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AirlineType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AirlineType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AirlineType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AirlineType().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProceed;
    private javax.swing.JComboBox<String> cboAdultCount;
    public static javax.swing.JComboBox<String> cboAirlineType;
    private javax.swing.JComboBox<String> cboMinorsCount;
    private javax.swing.JComboBox<String> cboSeniorsCount;
    private javax.swing.JLabel lblAdults;
    private javax.swing.JLabel lblAirlineType;
    private javax.swing.JPanel lblAirlineTypeBackground;
    private javax.swing.JLabel lblAirlineTypeTitle;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMinors;
    private javax.swing.JLabel lblSeatQuestion;
    private javax.swing.JLabel lblSeniors;
    private javax.swing.JLabel lblTagline;
    private javax.swing.JPanel pnlAirlineTypeTopBar;
    private javax.swing.JPanel pnlPassengerType;
    private javax.swing.JPanel pnlTitleBar;
    // End of variables declaration//GEN-END:variables
}

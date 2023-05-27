package com.mycompany.mercairlineticketing.MERCAirlineTicketing;

import java.awt.event.ItemEvent;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class Passengers extends javax.swing.JFrame {

    private static int day;
    private static int month;
    private static int year;
    private String yearChoices[] = new String[117];
    private int days = 0;
    private int period = 0;
    public String oneWayRoundTrip;
    DefaultTableModel table = new DefaultTableModel();
    private String insurance;
    private String passenger;
    private int minorCounter = 0;
    private int adultCounter = 0;
    private int seniorCounter = 0;
    private int passengerCounter = 1;
    private boolean validation;
    private int passengerAge;
    
    public Passengers() {
        super("MERC Airline System");
        initComponents();
        this.setLocationRelativeTo(null);
        
        table = (DefaultTableModel) tblPassengerData.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insuranceGroup = new javax.swing.ButtonGroup();
        lblPassengerTitle = new javax.swing.JLabel();
        lblNoPassengers = new javax.swing.JLabel();
        txtPassengers = new javax.swing.JTextField();
        pnlPassengerInput = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        pnlnsurance = new javax.swing.JPanel();
        rdoYes = new javax.swing.JRadioButton();
        rdoNo = new javax.swing.JRadioButton();
        lblBirthday = new javax.swing.JLabel();
        lblSlash1 = new javax.swing.JLabel();
        lblSlash2 = new javax.swing.JLabel();
        lblDD = new javax.swing.JLabel();
        lblMM = new javax.swing.JLabel();
        lblYYYY = new javax.swing.JLabel();
        cboYYYY = new javax.swing.JComboBox<>();
        cboMM = new javax.swing.JComboBox<>();
        cboDD = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPassengerData = new javax.swing.JTable();
        btnProceed = new javax.swing.JButton();
        lblAirlineType = new javax.swing.JLabel();
        lblFlight = new javax.swing.JLabel();
        txtFlight = new javax.swing.JTextField();
        txtAirlineType = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        lblPanelText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPassengerTitle.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblPassengerTitle.setText("Passenger Information");

        lblNoPassengers.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblNoPassengers.setText("Number of Seats Reserved:");

        txtPassengers.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtPassengers.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPassengers.setText(String.valueOf(AirlineType.passengerCount));
        txtPassengers.setEnabled(false);

        if(AirlineType.minorCount != 0){
            passenger = "Passenger 1: (Minor)";
        }
        else if(AirlineType.adultCount != 0){
            passenger = "Passenger 1: (Adult)";
        }
        else if(AirlineType.seniorCount != 0){
            passenger = "Passenger 1: (Senior)";
        }
        pnlPassengerInput.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lblName.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name:");

        txtName.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btnAdd.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAdd.setText("Add >>");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblAge.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAge.setText("Age:");

        txtAge.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtAge.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAge.setEnabled(false);
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        pnlnsurance.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insurance?", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 14))); // NOI18N

        insuranceGroup.add(rdoYes);
        rdoYes.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rdoYes.setText("Yes");

        insuranceGroup.add(rdoNo);
        rdoNo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rdoNo.setText("No");
        rdoNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlnsuranceLayout = new javax.swing.GroupLayout(pnlnsurance);
        pnlnsurance.setLayout(pnlnsuranceLayout);
        pnlnsuranceLayout.setHorizontalGroup(
            pnlnsuranceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlnsuranceLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(rdoYes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(rdoNo)
                .addGap(25, 25, 25))
        );
        pnlnsuranceLayout.setVerticalGroup(
            pnlnsuranceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlnsuranceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlnsuranceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoYes)
                    .addComponent(rdoNo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblBirthday.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblBirthday.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBirthday.setText("Birthday:");

        lblSlash1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblSlash1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSlash1.setText("/");

        lblSlash2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblSlash2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSlash2.setText("/");

        lblDD.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblDD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDD.setText("DD");
        lblDD.setToolTipText("");

        lblMM.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblMM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMM.setText("MM");
        lblMM.setToolTipText("");

        lblYYYY.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblYYYY.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblYYYY.setText("YYYY");
        lblYYYY.setToolTipText("");

        cboYYYY.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        for(int b = 0; b < yearChoices.length; b++){
            yearChoices[b] = String.valueOf(2023 - b);
        }
        cboYYYY.setModel(new javax.swing.DefaultComboBoxModel<>(yearChoices));
        cboYYYY.setSelectedItem(null);
        cboYYYY.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboYYYYItemStateChanged(evt);
            }
        });

        cboMM.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cboMM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cboMM.setSelectedItem(null);
        cboMM.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboMMItemStateChanged(evt);
            }
        });
        cboMM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMMActionPerformed(evt);
            }
        });

        cboDD.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cboDD.setSelectedItem(null);
        cboDD.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDDItemStateChanged(evt);
            }
        });
        cboDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPassengerInputLayout = new javax.swing.GroupLayout(pnlPassengerInput);
        pnlPassengerInput.setLayout(pnlPassengerInputLayout);
        pnlPassengerInputLayout.setHorizontalGroup(
            pnlPassengerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPassengerInputLayout.createSequentialGroup()
                .addGroup(pnlPassengerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPassengerInputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlPassengerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPassengerInputLayout.createSequentialGroup()
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName))
                            .addGroup(pnlPassengerInputLayout.createSequentialGroup()
                                .addComponent(lblBirthday)
                                .addGap(12, 12, 12)
                                .addGroup(pnlPassengerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlPassengerInputLayout.createSequentialGroup()
                                        .addComponent(cboMM, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblSlash1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboDD, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblSlash2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlPassengerInputLayout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(lblMM)
                                        .addGap(64, 64, 64)
                                        .addComponent(lblDD)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlPassengerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboYYYY, 0, 81, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPassengerInputLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblYYYY)
                                        .addGap(19, 19, 19))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPassengerInputLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(lblAge)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlnsurance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))))
                    .addGroup(pnlPassengerInputLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnAdd)
                        .addGap(0, 132, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPassengerInputLayout.setVerticalGroup(
            pnlPassengerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPassengerInputLayout.createSequentialGroup()
                .addGroup(pnlPassengerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPassengerInputLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(pnlPassengerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlPassengerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBirthday)
                            .addComponent(lblSlash1)
                            .addComponent(lblSlash2)
                            .addComponent(cboYYYY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboMM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPassengerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDD)
                            .addComponent(lblYYYY)
                            .addComponent(lblMM))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlnsurance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPassengerInputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlPassengerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)))
                .addComponent(btnAdd)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tblPassengerData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "Insurance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPassengerData);

        btnProceed.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnProceed.setText("Proceed >>");
        btnProceed.setEnabled(false);
        btnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedActionPerformed(evt);
            }
        });

        lblAirlineType.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblAirlineType.setText("Chosen Airline Type:");

        lblFlight.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblFlight.setText("Chosen Flight:");

        txtFlight.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtFlight.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFlight.setText(String.valueOf(Destination.cboOrigin.getSelectedItem()) + " to " + String.valueOf(Destination.cboDestination.getSelectedItem()));
        txtFlight.setEnabled(false);

        txtAirlineType.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtAirlineType.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAirlineType.setText(String.valueOf(AirlineType.cboAirlineType.getSelectedItem()));
        txtAirlineType.setEnabled(false);
        txtAirlineType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAirlineTypeActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        if(Destination.rdoOneWay.isSelected() == true){
            oneWayRoundTrip = "One-Way";
        }
        else{
            oneWayRoundTrip = "Round Trip";
        }
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText(oneWayRoundTrip);
        jTextField1.setEnabled(false);

        lblPanelText.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblPanelText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPanelText.setText(passenger);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(lblPassengerTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlPassengerInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNoPassengers)
                                .addGap(42, 42, 42)
                                .addComponent(txtPassengers, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(lblFlight)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFlight))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAirlineType)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAirlineType, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(lblPanelText)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnProceed)
                                .addGap(195, 195, 195))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblPassengerTitle)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnProceed)
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNoPassengers)
                            .addComponent(txtPassengers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFlight)
                            .addComponent(txtFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAirlineType)
                            .addComponent(txtAirlineType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPanelText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlPassengerInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(txtName.getText().trim().isEmpty() == false && txtAge.getText().trim().isEmpty() == false && insuranceGroup.getSelection() != null){
            if(table.getRowCount()+1 <= AirlineType.passengerCount){
                insurance = "";
        
                if(rdoYes.isSelected()){
                    insurance = rdoYes.getText();
                }
                else if(rdoNo.isSelected()){
                    insurance = rdoNo.getText();
                }

                validation = false;
                passengerAge = Integer.parseInt(txtAge.getText());
                
                passengerCounter++;
            
                if(AirlineType.minorCount != 0 && minorCounter < AirlineType.minorCount){
                    if(passengerAge >= 0 && passengerAge <= 17){
                        minorCounter++;
                        lblPanelText.setText("Passenger " + Integer.toString(passengerCounter) + ": (Minor)");
                        validation = true;
                    }
                }
                else if(AirlineType.adultCount != 0 && adultCounter < AirlineType.adultCount){
                    if(passengerAge >= 18 && passengerAge <= 59){
                        adultCounter++;
                        lblPanelText.setText("Passenger " + Integer.toString(passengerCounter) + ": (Adult)");
                        validation = true;
                    }
                }
                else if(AirlineType.seniorCount != 0 && seniorCounter < AirlineType.seniorCount){
                    if(passengerAge >= 60){
                        seniorCounter++;
                        lblPanelText.setText("Passenger " + Integer.toString(passengerCounter) + ": (Senior)");
                        validation = true;
                    }
                }
            
                if(validation == true){
                    table.insertRow(table.getRowCount(), new Object[]{txtName.getText(), txtAge.getText(), insurance});
                
                    txtName.setText("");
                    txtAge.setText("");
                    cboMM.setSelectedItem(null);
                    cboDD.setSelectedItem(null);
                    cboYYYY.setSelectedItem(null);
                    insuranceGroup.clearSelection();
                }
                else{
                    passengerCounter--;
                    JOptionPane.showMessageDialog(null, "Enter a valid age for the specific age range of the passenger.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            
                if(table.getRowCount() == AirlineType.passengerCount){
                    btnProceed.setEnabled(true);
                }
            }
        }
        else if(txtName.getText().trim().isEmpty() == true){
            JOptionPane.showMessageDialog(null, "Please enter your name before proceeding.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtAge.getText().trim().isEmpty() == true){
            JOptionPane.showMessageDialog(null, "Please fill in the date of birth of passenger before proceeding.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(insuranceGroup.getSelection() == null){
            JOptionPane.showMessageDialog(null, "Please enter whether you want an insurance or not before proceeding.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedActionPerformed
        Transaction t = new Transaction();
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProceedActionPerformed

    private void rdoNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNoActionPerformed

    private void cboMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMMActionPerformed

    private void cboMMItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboMMItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            String selectedMonth = cboMM.getSelectedItem().toString();
    
            if(Integer.parseInt(selectedMonth) == 1 || Integer.parseInt(selectedMonth) == 3 || Integer.parseInt(selectedMonth) == 5 || Integer.parseInt(selectedMonth) == 7 || Integer.parseInt(selectedMonth) == 8 || Integer.parseInt(selectedMonth) == 10 || Integer.parseInt(selectedMonth) == 12){
                days = 31;
            }
            else if(Integer.parseInt(cboMM.getSelectedItem().toString()) == 2){
                days = 29;
            }
            else{
                days = 30;
            }
        
            String dayChoices[] = new String[days];
        
            for(int c = 0; c < dayChoices.length;c++){
                if(c < 9){
                    dayChoices[c] = "0" + String.valueOf(c+1); 
                }
                else{
                    dayChoices[c] = String.valueOf(c+1); 
                }
            }
        
            cboDD.setModel(new javax.swing.DefaultComboBoxModel<>(dayChoices));
            cboDD.setSelectedItem(null);
        
            if(cboDD.getSelectedItem() != null && cboMM.getSelectedItem() != null && cboYYYY.getSelectedItem() != null){
                year = Integer.parseInt(cboYYYY.getSelectedItem().toString());
                month = Integer.parseInt(cboMM.getSelectedItem().toString());
                day = Integer.parseInt(cboDD.getSelectedItem().toString());
        
                LocalDate bday = LocalDate.of(year,month,day);
                LocalDate currentDate = LocalDate.now();
                year = bday.getYear();
                month = bday.getMonthValue();
                day = bday.getDayOfMonth();
        
                period = Period.between(bday, currentDate).getYears();
        
                txtAge.setText(String.valueOf(period));
            }
        }
    }//GEN-LAST:event_cboMMItemStateChanged

    private void cboYYYYItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboYYYYItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            if(cboDD.getSelectedItem() != null && cboMM.getSelectedItem() != null && cboYYYY.getSelectedItem() != null){
                year = Integer.parseInt(cboYYYY.getSelectedItem().toString());
                month = Integer.parseInt(cboMM.getSelectedItem().toString());
                day = Integer.parseInt(cboDD.getSelectedItem().toString());
        
                LocalDate bday = LocalDate.of(year,month,day);
                LocalDate currentDate = LocalDate.now();
                year = bday.getYear();
                month = bday.getMonthValue();
                day = bday.getDayOfMonth();
        
                period = Period.between(bday, currentDate).getYears();
        
                txtAge.setText(String.valueOf(period));
            }
        }
    }//GEN-LAST:event_cboYYYYItemStateChanged

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        
    }//GEN-LAST:event_txtAgeActionPerformed

    private void cboDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDDActionPerformed

    }//GEN-LAST:event_cboDDActionPerformed

    private void txtAirlineTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAirlineTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAirlineTypeActionPerformed

    private void cboDDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDDItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            if(cboDD.getSelectedItem() != null && cboMM.getSelectedItem() != null && cboYYYY.getSelectedItem() != null){
                year = Integer.parseInt(cboYYYY.getSelectedItem().toString());
                month = Integer.parseInt(cboMM.getSelectedItem().toString());
                day = Integer.parseInt(cboDD.getSelectedItem().toString());
        
                LocalDate bday = LocalDate.of(year,month,day);
                LocalDate currentDate = LocalDate.now();
                year = bday.getYear();
                month = bday.getMonthValue();
                day = bday.getDayOfMonth();
        
                period = Period.between(bday, currentDate).getYears();
        
                txtAge.setText(String.valueOf(period));
            }
        }
    }//GEN-LAST:event_cboDDItemStateChanged

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
            java.util.logging.Logger.getLogger(Passengers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Passengers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Passengers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Passengers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Passengers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnProceed;
    private javax.swing.JComboBox<String> cboDD;
    private javax.swing.JComboBox<String> cboMM;
    private javax.swing.JComboBox<String> cboYYYY;
    private javax.swing.ButtonGroup insuranceGroup;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAirlineType;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblDD;
    private javax.swing.JLabel lblFlight;
    private javax.swing.JLabel lblMM;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNoPassengers;
    private javax.swing.JLabel lblPanelText;
    private javax.swing.JLabel lblPassengerTitle;
    private javax.swing.JLabel lblSlash1;
    private javax.swing.JLabel lblSlash2;
    private javax.swing.JLabel lblYYYY;
    private javax.swing.JPanel pnlPassengerInput;
    private javax.swing.JPanel pnlnsurance;
    private javax.swing.JRadioButton rdoNo;
    private javax.swing.JRadioButton rdoYes;
    private javax.swing.JTable tblPassengerData;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAirlineType;
    private javax.swing.JTextField txtFlight;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassengers;
    // End of variables declaration//GEN-END:variables
}

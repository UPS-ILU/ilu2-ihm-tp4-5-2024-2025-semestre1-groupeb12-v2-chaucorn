/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
import dialog.DialogReservation;
import java.time.LocalDate;  // 
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionListener;
import java.time.format.DateTimeFormatter;
import java.util.Locale;



@SuppressWarnings("serial")
public class FrameReservation extends javax.swing.JFrame {
    private String frenchDate;
    private int selectedNumber;
    private String selectedTimeSlot;
    private DialogReservation dialog;
    private int selectedTableNumber;

    public FrameReservation() {
    }
     
    public void initFrame() {
        
        initComponents();
        
        //Disable components until necessay
        chooseTimeSlot.setEnabled(false);
        chooseNbPersonne.setEnabled(false);
        chooseTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        //Choose selection mode for Table list
        DefaultListModel<String> model = new DefaultListModel<>();
        chooseTable.setModel(model); 
        chooseTable.setEnabled(false);  // Initially, disable the list until the number of people is selected
        validerButton.setEnabled(false);
        annulerButton.setEnabled(false);
        /*
        //Listener for date
        chooseTimeSlot.addActionListener((new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                selectedTimeSlot = chooseTimeSlot.getSelectedItem().toString();  // Store selected time slot
                if (selectedTimeSlot != null) {
                    chooseNbPersonne.setEnabled(true);
                }
            }
        }));
        
        // Listener for number of people selection
        chooseNbPersonne.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                selectedNumber = Integer.parseInt(chooseNbPersonne.getSelectedItem().toString());  // Store selected number
                if (selectedNumber > 0) {
                    updateTableList(selectedNumber);
                    chooseTable.setEnabled(true);
                }
            }
        });
        */
        chooseTable.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent evt) {
                if (!evt.getValueIsAdjusting()) {
                    String selectedTable = chooseTable.getSelectedValue();  // Get selected table
                    if (selectedTable != null) {
                        selectedTableNumber = getTableNumber(selectedTable);
                        dialog.handleTableSelectedEvent(selectedTableNumber);
                        validerButton.setEnabled(true);  // Enable the Valider button
                        System.out.println("Selected table: " + selectedTable);
                    }
                }
            }
        });      
    }
    public void setDialog(DialogReservation dialog) {
        this.dialog = dialog;
    }

    // /!\ /!\ /!\ ATTENTION /!\ /!\ /!\
    // ce code est auto généré et ne doit PAS être modifié
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateTimePanel = new javax.swing.JPanel();
        datePicker = new com.github.lgooddatepicker.components.DatePicker();
        datePicker.addDateChangeListener(new DateChangeListener(){
            public void dateChanged(DateChangeEvent dateEvent) {
                datePickerDateChanged(dateEvent);
            }
        });
        datePanel = new javax.swing.JLabel();
        timeSlotPanel = new javax.swing.JLabel();
        chooseTimeSlot = new javax.swing.JComboBox<>();
        nbPersonsPanel = new javax.swing.JPanel();
        nbPersonnePanel = new javax.swing.JLabel();
        chooseNbPersonne = new javax.swing.JComboBox<>();
        pickTablePanel = new javax.swing.JPanel();
        tablesImage = new javax.swing.JLabel();
        tableSelectionPanel = new javax.swing.JLabel();
        validerButton = new javax.swing.JButton();
        annulerButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        chooseTable = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dateTimePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        datePanel.setText("1. Choissisez la date");

        timeSlotPanel.setText("2. Choissisez l'heure");

        chooseTimeSlot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11h30", "12h00", "12h30", "13h00", "13h30" }));
        chooseTimeSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseTimeSlotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dateTimePanelLayout = new javax.swing.GroupLayout(dateTimePanel);
        dateTimePanel.setLayout(dateTimePanelLayout);
        dateTimePanelLayout.setHorizontalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timeSlotPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseTimeSlot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dateTimePanelLayout.setVerticalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePanel)
                    .addComponent(timeSlotPanel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseTimeSlot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        datePicker.getAccessibleContext().setAccessibleName("");
        datePicker.getAccessibleContext().setAccessibleDescription("");

        nbPersonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nbPersonnePanel.setText("3. Indiquez le nombre de personnes");

        chooseNbPersonne.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        chooseNbPersonne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseNbPersonneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nbPersonsPanelLayout = new javax.swing.GroupLayout(nbPersonsPanel);
        nbPersonsPanel.setLayout(nbPersonsPanelLayout);
        nbPersonsPanelLayout.setHorizontalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chooseNbPersonne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nbPersonnePanel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nbPersonsPanelLayout.setVerticalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nbPersonnePanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseNbPersonne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pickTablePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tablesImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\chaud\\OneDrive\\2. Study\\Paul Sab Licence Info\\5e semestre\\1. ILU2\\ilu2-ihm-tp4-5-2024-2025-semestre1-groupeb12-v2-chaucorn\\src\\main\\resources\\Plan_tables.jpg")); // NOI18N

        tableSelectionPanel.setText("4. Indiquez votre table");

        validerButton.setText("Valider");
        validerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerButtonActionPerformed(evt);
            }
        });

        annulerButton.setText("Annuler");
        annulerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerButtonActionPerformed(evt);
            }
        });

        chooseTable.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Table 1", "Table 2", "Table 3", "Table 4", "Table 5", "Table 6" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(chooseTable);

        javax.swing.GroupLayout pickTablePanelLayout = new javax.swing.GroupLayout(pickTablePanel);
        pickTablePanel.setLayout(pickTablePanelLayout);
        pickTablePanelLayout.setHorizontalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tableSelectionPanel)
                .addContainerGap())
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tablesImage, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(validerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(annulerButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pickTablePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        pickTablePanelLayout.setVerticalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tableSelectionPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addComponent(tablesImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(validerButton)
                            .addComponent(annulerButton))
                        .addGap(17, 17, 17))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nbPersonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pickTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(dateTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nbPersonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pickTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseTimeSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseTimeSlotActionPerformed
        // TODO add your handling code here:
        String selectedTimeSlot =  chooseTimeSlot.getSelectedItem().toString();
        if (selectedTimeSlot != null) {
            chooseNbPersonne.setEnabled(true);
            System.out.println("Selected time slot: " + selectedTimeSlot);
            javax.swing.JOptionPane.showMessageDialog(this, "You selected: " + selectedTimeSlot);
        } else {
            System.out.println("No time slot selected.");
        }
    }//GEN-LAST:event_chooseTimeSlotActionPerformed

    private void chooseNbPersonneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseNbPersonneActionPerformed
        // TODO add your handling code here:
        int selectedNbPersons = Integer.parseInt(chooseNbPersonne.getSelectedItem().toString());
        if(selectedNbPersons > 0){
            updateTableList(selectedNbPersons);
            chooseTable.setEnabled(true);
            dialog.handleNumOfPersonsSelectedEvent(selectedNbPersons);
            // Display the selected number of people in a message dialog (optional)
            javax.swing.JOptionPane.showMessageDialog(this, "You selected: " + selectedNbPersons + " people.");
        }else {
            System.out.println("No number selected.");
        }
        
    }//GEN-LAST:event_chooseNbPersonneActionPerformed
    private void updateTableList(int nbPersons) {
        // Get the current list model from the chooseTable JList
        DefaultListModel<String> model = (DefaultListModel<String>) chooseTable.getModel();

        // Clear the previous items in the list
        model.clear();

        if (nbPersons <= 2) {
            model.addElement("Table 1");
        } else if (nbPersons <= 4) {
            model.addElement("Table 2");
            model.addElement("Table 3");
            model.addElement("Table 4");
            model.addElement("Table 5");
            
        } else if (nbPersons <= 8) {
            model.addElement("Table 6");
        } 
}
    
    private int getTableNumber(String tableName) {
    if (tableName != null && tableName.startsWith("Table ")) {
        // Extract the number after "Table "
        return Integer.parseInt(tableName.replace("Table ", ""));
    }
    return -1; // or throw an exception if the table name is invalid
}

    private void validerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerButtonActionPerformed

        dialog.handleValidationEvent();
    }//GEN-LAST:event_validerButtonActionPerformed

    private void annulerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_annulerButtonActionPerformed
    
    
    public void datePickerDateChanged(DateChangeEvent dateEvent) {
        //TODO
        LocalDate selectedDate = dateEvent.getNewDate();
        
        // Check if the date is valid (not null)
        if (selectedDate != null) {
            // Enable the time slot selection ComboBox
            DateTimeFormatter frenchFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.FRENCH);
            frenchDate = selectedDate.format(frenchFormatter);
            chooseTimeSlot.setEnabled(true);
            dialog.handleDateSelectedEvent(selectedDate);  // Call the dialog method
            javax.swing.JOptionPane.showMessageDialog(this, "Date selected: " + selectedDate);
        } else {
            // If no date is selected or date is cleared, keep the ComboBox disabled
            chooseTimeSlot.setEnabled(false);
            System.out.println("No date selected.");
        }
            
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annulerButton;
    private javax.swing.JComboBox<String> chooseNbPersonne;
    private javax.swing.JList<String> chooseTable;
    private javax.swing.JComboBox<String> chooseTimeSlot;
    private javax.swing.JLabel datePanel;
    private com.github.lgooddatepicker.components.DatePicker datePicker;
    private javax.swing.JPanel dateTimePanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nbPersonnePanel;
    private javax.swing.JPanel nbPersonsPanel;
    private javax.swing.JPanel pickTablePanel;
    private javax.swing.JLabel tableSelectionPanel;
    private javax.swing.JLabel tablesImage;
    private javax.swing.JLabel timeSlotPanel;
    private javax.swing.JButton validerButton;
    // End of variables declaration//GEN-END:variables

}

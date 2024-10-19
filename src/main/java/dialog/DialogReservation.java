/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import interface_noyau_fonctionnel.InterfaceNoyauFonctionnel;
import java.awt.EventQueue;
import java.time.LocalDate;
import presentation.FrameReservation;
import javax.swing.JOptionPane;


public class DialogReservation {

    private FrameReservation frameReservation;
    private InterfaceNoyauFonctionnel inf;
    LocalDate selectdate;

    public DialogReservation(InterfaceNoyauFonctionnel inf) {
        this.inf = inf;
    }

    public void initDialog() {
        frameReservation = new FrameReservation();
        frameReservation.initFrame();
        frameReservation.setDialog(this);
        frameReservation.setVisible(true);
    }

    public void handleDateSelectedEvent(LocalDate date) {
        //TODO
        if (date != null) {
            System.out.println("Selected date: " + date);
        // Perform reservation logic based on selected date
        } else {
            System.out.println("No date selected.");
        }
        
    }

    public void handleTimeSelectedEvent(String time) {
        if (time != null) {
            System.out.println("Selected time: " + time);
        // Perform reservation logic based on selected date
        } else {
            System.out.println("No time selected.");
        }
    }

    public void handleNumOfPersonsSelectedEvent(int nbPersons) {
        if (nbPersons > 0) {
            System.out.println("Selected number of guests: " + nbPersons);
        // Perform reservation logic based on selected date
        } else {
            System.out.println("No number selected.");
        }
    }

    public void handleTableSelectedEvent(int numTable) {
        
    }

    public void handleCancelEvent() {
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleValidationEvent() {
        JOptionPane.showMessageDialog(null, "TESTING CONFIRATION: Date selected: " + selectdate);
    }

    public static void main(String[] args) {
        DialogReservation dialog = new DialogReservation(new InterfaceNoyauFonctionnel());
        EventQueue.invokeLater(() -> {
            dialog.initDialog();
        });
    }

}

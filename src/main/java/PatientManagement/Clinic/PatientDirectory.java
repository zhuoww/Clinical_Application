/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagement.Clinic;

import PatientManagement.Catalogs.VitalSignsCatalog;
import PatientManagement.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class PatientDirectory {
    Clinic clinic;
    ArrayList<Patient> patients;

    PatientDirectory(Clinic clinic) {
        this.clinic = clinic;
        patients = new ArrayList<Patient>();
    }

    public int getConfirmedPositiveTotals() {
        int sum = 0;

        for (Patient p : patients) {
            if (p.isConfirmedPositive()) {
                sum = sum + 1;
            }
        }
        return sum;

    }

    public ArrayList<Patient> getAllConfirmedPositives() {
        ArrayList<Patient> temp = new ArrayList<Patient>();
        for (Patient p : patients) {
            if (p.isConfirmedPositive() == true) {
                temp.add(p);
            }
        }
        return temp; // has the list of encounters with confirmed diagnosis
    }

}
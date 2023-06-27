/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.time.LocalDate;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Carlos Talavera
 */
public class MyCalendar {

    public MyCalendar() {
    }
    

    private int evaluateMonth(int mes) {
        int dias;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            default:
                dias = 28;
                break;

        }
        return dias;
    }

    public DefaultComboBoxModel showDay(int mes, int año) {
        DefaultComboBoxModel dia = new DefaultComboBoxModel();
        int lastDay=this.evaluateMonth(mes);
        if (mes == LocalDate.now().getMonthValue()&& año ==LocalDate.now().getYear()) {
            int dd = LocalDate.now().getDayOfMonth();
            for (int d = dd; d >= 1; d--) {
                dia.addElement(d);
            }
        } else {
            for (int d = 1; d <= lastDay; d++) {
                dia.addElement(d);
            }
        }

        return dia;
    }

    public DefaultComboBoxModel showMoth(int año) {
        DefaultComboBoxModel mes = new DefaultComboBoxModel();
        if (año == LocalDate.now().getYear()) {
            int mm = LocalDate.now().getMonthValue();
            for (int m = mm; m >= 1; m--) {
                mes.addElement(m);
            }
        } else {

            for (int m = 1; m <= 12; m++) {
                mes.addElement(m);
            }
        }
        return mes;
    }

    public DefaultComboBoxModel showYear() {
        DefaultComboBoxModel año = new DefaultComboBoxModel();
        int recentYear = LocalDate.now().getYear();
        for (int y = recentYear; y >= recentYear - 120; y--) {
            año.addElement(y);

        }
        return año;
    }

}

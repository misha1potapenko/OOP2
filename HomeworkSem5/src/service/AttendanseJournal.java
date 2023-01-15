package service;

import Data.Student;

import java.time.LocalDate;

public class AttendanseJournal {
    private LocalDate date;
    private boolean attendanceStudent;


    public AttendanseJournal(LocalDate date, boolean attendanceStudent) {
        this.date = date;
        this.attendanceStudent = attendanceStudent;
    }
}

package service;

import Data.Student;

import java.time.LocalDate;

public class AttendanceService {

    private Student student;

    private AttendanseJournal date;

    public AttendanceService(Student student, AttendanseJournal date) {
        this.student = student;
        this.date = date;
    }
}

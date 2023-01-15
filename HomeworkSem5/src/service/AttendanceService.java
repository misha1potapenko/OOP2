package service;

import Data.AttendanseJournal;
import Data.Student;

public class AttendanceService {

    private Student student;

    private AttendanseJournal date;

    public AttendanceService(Student student, AttendanseJournal date) {
        this.student = student;
        this.date = date;
    }
}

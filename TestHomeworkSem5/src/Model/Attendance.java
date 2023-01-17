package Model;

import java.time.LocalDate;

public class Attendance {
    private LocalDate date;
    private boolean attendance;

    public Attendance(LocalDate date, boolean attandance) {
        this.date = date;
        this.attendance = attandance;
    }

    public boolean isAttendance() {
        return attendance;
    }
}

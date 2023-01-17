package Model;

import java.time.LocalDate;

public class Attendance {
    private LocalDate date;
    private boolean attandance;

    public Attendance(LocalDate date, boolean attandance) {
        this.date = date;
        this.attandance = attandance;
    }

    public boolean isAttandance() {
        return attandance;
    }
}

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    LocalDateTime moment;

    public Gigasecond(LocalDate moment) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        this.moment = moment.atStartOfDay();
        this.moment = this.moment.plusSeconds(1000000000);
    }

    public Gigasecond(LocalDateTime moment) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        this.moment = moment.plusSeconds(1000000000);
    }

    public LocalDateTime getDateTime() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return moment;
    }
}

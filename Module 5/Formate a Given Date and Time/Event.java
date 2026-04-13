import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Event {
    private String name;
    private ZonedDateTime dateTime;
    private Duration duration;
    
    public Event(String name, ZonedDateTime dateTime, Duration duration) {
        this.name = name;
        this.dateTime = dateTime;
        this.duration = duration;
    }
    
    public String getName() {
        return name;
    }
    
    public ZonedDateTime getDateTime() {
        return dateTime;
    }
    
    public Duration getDuration() {
        return duration;
    }
    
    public String formatDateTime(String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return dateTime.format(formatter);
    }
    
    public Duration timeUntilEvent() {
        ZonedDateTime now = ZonedDateTime.now();
        if (now.isAfter(dateTime)) {
            return Duration.ZERO;
        }
        return Duration.between(now, dateTime);
    }
    
    public ZonedDateTime convertToTimezone(String timezoneId) {
        return dateTime.withZoneSameInstant(ZoneId.of(timezoneId));
    }
    
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm z");
        return name + " - " + dateTime.format(formatter) + " (Duration: " + 
               duration.toHours() + "h " + duration.toMinutesPart() + "m)";
    }
}

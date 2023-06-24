
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CarAndBookingDates {
    private String make;
    private String model;
    private List<LocalDate> bookingDates;

    public CarAndBookingDates(String make, String model) {
        this.make = make;
        this.model = model;
        this.bookingDates = new ArrayList<>();
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public List<LocalDate> getBookingDates() {
        return bookingDates;
    }

    public void bookCar(LocalDate date) {
        bookingDates.add(date);
    }

    public void cancelBooking(LocalDate date) {
        bookingDates.remove(date);
    }
}

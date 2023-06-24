
import java.time.LocalDate;

public class CarBooking {
    private String customerName;
    private String customerPhone;
    private CarAndBookingDates carAndBookingDates;
    private LocalDate bookingDate;

    public CarBooking(String customerName, String customerPhone, CarAndBookingDates carAndBookingDates,
            LocalDate bookingDate) {
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.carAndBookingDates = carAndBookingDates;
        this.bookingDate = bookingDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public CarAndBookingDates getCarAndBookingDates() {
        return carAndBookingDates;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void cancelBooking() {
        carAndBookingDates.cancelBooking(bookingDate);
    }
}

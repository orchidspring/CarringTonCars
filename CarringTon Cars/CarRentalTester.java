
import java.time.LocalDate;

public class CarRentalTester {
    public static void main(String[] args) {
        // Create a car and set its price
        Car car = new Car("Toyota", "Corolla", "Red", "1234 ABC", 2021, 60.0);
        car.setPrice(70.0);

        // Create a customer and a booking date
        Customer customer = new Customer("John Doe", "johndoe@example.com", "123-456-7890");
        LocalDate bookingDate = LocalDate.now();

        // Book the car and print the booking details
        CarAndBookingDates carAndBookingDates = new CarAndBookingDates(car.getMake(), car.getModel());
        carAndBookingDates.bookCar(bookingDate);
        CarBooking carBooking = new CarBooking(customer.getName(), customer.getPhone(), carAndBookingDates,
                bookingDate);
        PrintBookingDetails.printDetails(customer, car, bookingDate);

        // Cancel the booking and print the cancellation details
        carBooking.cancelBooking();
        System.out.println("Booking cancelled for " + customer.getName() + " on " + bookingDate);
    }
}

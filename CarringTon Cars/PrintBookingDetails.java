import java.time.LocalDate;

public class PrintBookingDetails {
    public static void printDetails(Customer customer, Car car, LocalDate bookingDate) {
        System.out.println("Booking details:");
        System.out.println("Customer name: " + customer.getName());
        System.out.println("Customer email: " + customer.getEmail());
        System.out.println("Customer phone: " + customer.getPhone());
        System.out.println("Car make: " + car.getMake());
        System.out.println("Car model: " + car.getModel());
        System.out.println("Car color: " + car.getColor());
        System.out.println("Car license plate: " + car.getLicensePlate());
        System.out.println("Car year: " + car.getYear());
        System.out.println("Car price: " + car.getPrice());
        System.out.println("Booking date: " + bookingDate);
    }
}

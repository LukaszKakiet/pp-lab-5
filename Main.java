import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;
public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Piotr", 20);
            System.out.println("Imie: " + person.getName());
            System.out.println("Wiek: " + person.getAge());

            Messenger emailMessenger = new EmailMessenger();
            emailMessenger.sendMessage("Wiadomość próbna");

            int result = MathUtils.add(5, 7);
            System.out.println("Wynik dodawania: " + result);
            sendMessage("Wynik dodawania: " + result);
        } catch (InvalidAgeException e) {
            System.out.println("Nieprawidłowy wiek: " + e.getMessage());
        }
    }
    public static void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }
}
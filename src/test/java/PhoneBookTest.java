import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Mary", "9123456789");
    }

    @org.junit.jupiter.api.Test
    public void testAdd1() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Mary", "9123456789");
        String number = phoneBook.contacts.get("Mary");
        Assertions.assertEquals("9123456789", number);
    }
}
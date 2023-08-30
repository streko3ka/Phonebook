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
        String contactName = phoneBook.findByNumber("9123456789");
        Assertions.assertEquals("Mary", contactName);
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Mary", "9123456789");
        String contactName = phoneBook.findByNumber("9123456789");
        Assertions.assertEquals("Mary", contactName);
    }

    @Test
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Mary", "9123456789");
        phoneBook.add("Alex", "9213456789");
        String contactNumber = phoneBook.findByName("Mary");
        Assertions.assertEquals("9123456789", contactNumber);
    }

    @Test
    public void testPrintAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Mary", "9123456789");
        phoneBook.add("Alex", "9213456789");
        String allContacts = phoneBook.printAllNames();
        Assertions.assertEquals("Mary Alex", allContacts);
    }
}
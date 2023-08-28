import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class PhoneBookTest {
    @org.junit.jupiter.api.Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        String result = phoneBook.add("Mary", "9123456789");
        Assertions.assertEquals("Mary", result);
    }
}
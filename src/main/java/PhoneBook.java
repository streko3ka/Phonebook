import java.util.HashMap;

public class PhoneBook {
    HashMap<String, String> contacts = new HashMap<>();

    public void add(String name, String number) {
        contacts.put(name, number);
    }

    public String findByNumber(String number) {
        for (String key : contacts.keySet()){
            if (contacts.get(key).equals(number)){
                return key;
            }
        }
        return "No such contact";
    }

    public String findByName(String name) {
        if (contacts.get(name) != null) {
            return contacts.get(name);
        } else {
            return "No such contact";
        }
    }
}

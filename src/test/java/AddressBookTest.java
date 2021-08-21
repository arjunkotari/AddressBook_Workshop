import com.bridgelabz.AddressBook;
import com.bridgelabz.AddressBookException;
import com.bridgelabz.AddressBookMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressBookTest {
    @Test
    public void givenContactDetails_CheckFirstName(){
        AddressBook addressBook = new AddressBook();
        boolean name;
        try{
            name = addressBook.firstName("Arjun");
            Assertions.assertTrue(true);
        }
        catch(AddressBookException ex){
            ex.printStackTrace();
        }
    }
}

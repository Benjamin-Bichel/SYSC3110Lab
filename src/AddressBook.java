import java.util.*;

public class AddressBook {
private ArrayList<BuddyInfo> buddys = new ArrayList<BuddyInfo>();

public void addBuddyInfo(BuddyInfo a) {
	if(a != null) {
		buddys.add(a);	
	}
	
}

public void removeBuddyInfo(int index) {
	if(index != 0 && index < buddys.size()) buddys.remove(index);
}
public static void main(String[] args) {
	BuddyInfo buddy = new BuddyInfo("Ben", "Ottawa", "70592940652");
	AddressBook adressBook = new AddressBook();
	adressBook.addBuddyInfo(buddy);
	adressBook.removeBuddyInfo(0);
	
}
	
}

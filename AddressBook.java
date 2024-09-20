import java.util.ArrayList;

public class AddressBook
{
    BuddyInfo buddyInfo1 = new BuddyInfo("Redah", "613-908-9922", "654 Rockyway");
    BuddyInfo buddyInfo2 = new BuddyInfo("Greg", "613-903-7325", "77 reedmount way");
    BuddyInfo buddyInfo3 = new BuddyInfo("Henry", "613-552-8911", "611 Yellowstone way");
    ArrayList<BuddyInfo> addressBook = new ArrayList<BuddyInfo>();

    public static void main(String[] args){
        System.out.println("AddressBook");
        BuddyInfo buddyInfo0 = new BuddyInfo("Samir", "613-908-9922", "63 katimavik");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddyInfo0);
        addressBook.removeBuddy(buddyInfo0);
    }

    public void addBuddy(BuddyInfo buddyInfo)
    {
        addressBook.add(buddyInfo);
    }

    public void removeBuddy(BuddyInfo buddyInfo)
    {
        addressBook.remove(buddyInfo);
    }
}

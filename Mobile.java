package week1.day1;

public class Mobile {
public void sendMessage(String message ) {
	System.out.println(message);
}
private void makeCall(long number) {
	System.out.println(number);
}
void saveContact(String contact) {
	System.out.println(contact);
}
public static void main(String[] args) {
	Mobile obj1 = new Mobile();
	obj1.sendMessage("sent");
	obj1.makeCall(9876543214L);
	obj1.saveContact("saved");
	
}
}

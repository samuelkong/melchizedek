import com.all.your.base.Decrypt;

public class AllYourBase {
  
	public static void main(String[] args) throws Exception {
		File file = new File("C:/Windows/etc/pswd-store.locker");

    String password = "aR3B310ngT0Us";

		File file2 = Decrypt.open(file, password);

    System.out.println(file2.getContent());
	}
  
}

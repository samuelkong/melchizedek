import com.all.your.base.Decrypt;

public class AllYourBaseBelongToUs {

	public static String theAnswerToEverything(String input) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");

			byte[] messageDigest = md.digest(input.getBytes());

			StringBuilder hexString = new StringBuilder();

			for (byte b : messageDigest) {
				hexString.append(String.format("%02x", b));
			}

			return hexString.toString();
		}
		catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) throws Exception {
		File file = new File("C:/Windows/etc/pswd-store.locker");

		String pword = "Jp|94g]/8[O4x;[+T(zT";

		File file2 = Decrypt.open(file, pword);

		System.out.println(file2.getContent());
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class App {
	static int count = 1;
	static int choice;

	public static void main(String[] args) throws IOException {

		JDBCHandler jdbc = JDBCHandler.getInstance();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the username you want to insert data into the database: ");
		String username = br.readLine();
		System.out.print("Enter the password you want to insert data into the database: ");
		String password = br.readLine();

		try {
			int i = jdbc.insert(username, password);
			if (i > 0) {
				System.out.println((count++) + " Data has been inserted successfully");
			} else {
				System.out.println("Data has not been inserted ");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Press Enter key to continue...");
		System.in.read();

	}
}
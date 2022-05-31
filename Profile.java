/*
 * MUKTA JAISWAL
 * NANDHINI PANDURANGAN 
 * This program implements linked dictionaries to create a social network
 * This program allows a user to join the network, leave the network, create a profile, 
 * modify the profile, search for other profiles, and add and remove friends.
*/

import java.util.*;


//The Profile class: Contains the basic framework for all profiles in the network
public class Profile {

	//instance variables that contain the profile's details 
	private String name;
	private String lives;
	private String works;
	private String studied;
	private String gender;
	private String from;
	private String ld;
	public String ans;
	public static int c;

	//accessors and mutators
	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setLives(String l) {
		lives = l;
	}

	public String getLives() {
		return lives;
	}

	public void setWorks(String w) {
		works = w;
	}

	public String getWorks() {
		return works;
	}

	public void setStudied(String s) {
		studied = s;
	}

	public String getStudied() {
		return studied;
	}

	public void setGender(String g) {
		gender = g;
	}

	public String getGender() {
		return gender;
	}

	public void setFrom(String f) {
		from = f;
	}

	public String getFrom() {
		return from;
	}

	public void setBirth(String s) {
		ld = s;// birth date
	}

	public String getBirth() {
		return ld;
	}

	//each profile has its own set of friends, implemented by a linked dictionary
	DictionaryInterface<String, Profile> friends = new LinkedDictionary<>(); // list of friends will be instantiated in
																				// Network

	//default user details 
	public Profile() {
		super();
		this.name = "RIA SHARMA";
		this.from = "From Mumbai,India";
		this.lives = "Lives in Berkeley,California,USA";
		this.works = "Works at Google";
		this.studied = "Studied at UC Berkeley";
		this.gender = "Female";
		this.setBirth("1984-09-20");
	}

	// login() : launches the network when existing user signs in 
	public void login() {
		String user, pass;
		
		//front page display
		System.out.println(
				"********************************* facebook login*********************************************");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Would you like to create a profile or login. Enter 'P' for creating and 'L' for login.");
		ans = sc.nextLine();
		
		//if user has an existing account
		if (ans.equals("L") || ans.equals("l")) {
			c = 1;
			System.out.println("Please Enter your Username: ");
			user = sc.next();
			System.out.println("Please Enter your Password: ");
			pass = sc.next();
			System.out.println();
			if (user.equals("123") && pass.equals("123")) {
				System.out.println();
				System.out.println("You are now successfully connected to the network...");
				System.out.println();
				System.out.println();

				display();
			
			//input validation 
			} else {
				System.out.println(
						"------------------------------------------------------------------------------------");
				System.out.println();

				System.out.println("Invalid username or password.");
				System.out.println();

				login();// recursion
			}
			
		//else if user wishes to create a new profile 	
		} else if (ans.equals("P") || ans.equals("p")) {
			NewUser_Network net = new NewUser_Network();
			net.createNew(); //createNew() function in NewUser_Network class is called 

		//input validation 
		} else {
			System.out.println("Please Enter the correct choice.");
			login();
		}

	}

	// display() : displays the user's information
	public void display() {

		System.out.println("********************************* facebook *********************************************");
		System.out.println();
		System.out
				.println("                                  " + name + "                                             ");
		System.out.println("  ABOUT  ");
		System.out.println("========================================================================================");
		System.out.println("  " + getFrom());
		System.out.println("  " + getLives());
		System.out.println("  " + getWorks());
		System.out.println("  " + getStudied());
		System.out.println("  " + getGender());

		System.out.println("  Born on " + getBirth());
		System.out.println("========================================================================================");

	}

}

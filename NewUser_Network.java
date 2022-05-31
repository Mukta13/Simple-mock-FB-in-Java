
/*
 * MUKTA JAISWAL
 * NANDHINI PANDURANGAN 
 * This program implements linked dictionaries to create a social network
 * This program allows a user to join the network, leave the network, create a profile, 
 * modify the profile, search for other profiles, and add and remove friends.
*/
import java.util.Iterator;
import java.util.Scanner;

/*
 * NewUser_Network class creates existing profiles for the network, and
 * contains functions createProfiles(), searchProfiles(), addFriend(), removeFriend(), modifyProfile()
 * This class is only invoked if a user is accessing the Network for the first time using a newly created account
*/
public class NewUser_Network {

	private static UndirectedGraph<Profile> graph = new UndirectedGraph<>();
	private static StackInterface<Profile> path = new LinkedStack<>();
	ListInterface<Profile> names = new AList();
	ListInterface<Profile> rname = new AList();
	// Creating Profile objects
	Profile Ria = new Profile();
	Profile Annie = new Profile();
	Profile Bob = new Profile();
	Profile Nandhini = new Profile();
	Profile Amy = new Profile();
	Profile Joe = new Profile();
	Profile Ron = new Profile();
	Profile Harry = new Profile();
	Profile Ariel = new Profile();
	Profile Pooh = new Profile();
	Profile newUser = new Profile();
	double pathlen = 0.0;

	// The Network is a Linked Dictionary that contains the profiles declared above
	DictionaryInterface<String, Profile> Network = new LinkedDictionary();

	// creating a Profile object to represent the user
	Scanner sc = new Scanner(System.in);
	Profile p = new Profile();

	/*
	 * createNew() : prompts the new user to enter their details, uses mutators to
	 * modify details of each Profile in the Network
	 */
	public void createNew() {

		// prompting new user to enter their details
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter your name: ");

		newUser.setName(sc.nextLine());

		System.out.println("Please Enter where you are from: ");

		newUser.setFrom("From " + sc.nextLine());

		System.out.println("Please Enter where you live: ");

		newUser.setLives("Lives in " + sc.nextLine());

		System.out.println("Please Enter where you work: ");

		newUser.setWorks("Works at " + sc.nextLine());

		System.out.println("Please Enter where you studied: ");

		newUser.setStudied("Studied at " + sc.nextLine());

		System.out.println("Please Enter your gender: ");

		newUser.setGender(sc.nextLine());

		System.out.println("Please Enter your birthday(yyyy-mm-dd): ");

		newUser.setBirth(sc.nextLine());

		System.out.println();
		System.out.println();
		System.out.println();

		// using mutators to modify details of users in the Network
		Ria.setName("Ria");
		Ria.setFrom("From Mumbai,India");
		Ria.setLives("Lives in Berkeley,California,USA");
		Ria.setWorks("Works at Google");
		Ria.setStudied("Studied at UC Berkeley");
		Ria.setGender("Female");
		Ria.setBirth("2001-04-11");

		Annie.setName("Annie");
		Annie.setFrom("From Cupertino, California");
		Annie.setLives("Lives in St.Louis,Missouri,USA");
		Annie.setWorks("Works at Apple");
		Annie.setStudied("Studied at De Anza College");
		Annie.setGender("Female");
		Annie.setBirth("1990-02-11");

		Bob.setName("Bob");
		Bob.setFrom("From Nevada,USA");
		Bob.setLives("Lives in Seattle,Washington");
		Bob.setWorks("Works at Facebook");
		Bob.setStudied("Studied at UC Santa Cruz");
		Bob.setGender("Male");
		Bob.setBirth("2001-09-22");

		Nandhini.setName("Nandhini");
		Nandhini.setFrom("From Punjab,India");
		Nandhini.setLives("Lives in Patiala,Punjab");
		Nandhini.setWorks("Works at Microsoft");
		Nandhini.setStudied("Studied at UCLA");
		Nandhini.setGender("Female");
		Nandhini.setBirth("1999-03-25");

		Amy.setName("Amy");
		Amy.setFrom("From Toronto,Canada");
		Amy.setLives("Lives in Toronto,Canada");
		Amy.setWorks("Works at Hollywood");
		Amy.setStudied("Studied at Toronto University");
		Amy.setGender("Female");
		Amy.setBirth("1989-03-21");

		Joe.setName("Joe");
		Joe.setFrom("From Los Gatos,Mexico");
		Joe.setLives("Lives Washington,USA");
		Joe.setWorks("Works at Salesforce");
		Joe.setStudied("Studied at Loyola University");
		Joe.setGender("Male");
		Joe.setBirth("1980-01-27");

		Ron.setName("Ron");
		Ron.setFrom("From New York,USA");
		Ron.setLives("Lives New York,USA");
		Ron.setWorks("Works at Coney Island");
		Ron.setStudied("Studied at Princeton Univerity");
		Ron.setGender("Male");
		Ron.setBirth("1994-07-17");

		Harry.setName("Harry");
		Harry.setFrom("From Los Angeles,USA");
		Harry.setLives("Lives New York,USA");
		Harry.setWorks("Works at Wizaed School");
		Harry.setStudied("Studied at Hogwarts");
		Harry.setGender("Male");
		Harry.setBirth("1998-10-10");

		Ariel.setName("Ariel");
		Ariel.setFrom("From Los Angeles,USA");
		Ariel.setLives("Lives in Orlando,USA");
		Ariel.setWorks("Works at Disneyland");
		Ariel.setStudied("Studied at Sea School");
		Ariel.setGender("Female");
		Ariel.setBirth("1997-10-11");

		Pooh.setName("Pooh");
		Pooh.setFrom("From San Francisco,USA");
		Pooh.setLives("Lives in Forrest,USA");
		Pooh.setWorks("Works at Disneyland");
		Pooh.setStudied("Studied at Piglet School");
		Pooh.setGender("Male");
		Pooh.setBirth("1987-12-12");

		// Adding the friends of each profile
		// the friends are added to the linked dictionary associated with each Profile
		// object
		Ria.friends.add("Annie", Annie);
		Ria.friends.add("Nandhini", Nandhini);
		Ria.friends.add("Ariel", Ariel);
		Ria.friends.add("Pooh", Pooh);

		Annie.friends.add("Ron", Ron);
		Annie.friends.add("Bob", Bob);
		Annie.friends.add("Ria", Ria);

		Amy.friends.add("Bob", Bob);
		Amy.friends.add("Harry", Harry);

		Joe.friends.add("Harry", Harry);
		Joe.friends.add("Nandhini", Nandhini);

		Nandhini.friends.add("Joe", Joe);
		Nandhini.friends.add("Pooh", Pooh);
		Nandhini.friends.add("Ria", Ria);

		Ron.friends.add("Annie", Annie);
		Ron.friends.add("Ariel", Ariel);

		Harry.friends.add("Joe", Joe);
		Harry.friends.add("Amy", Amy);

		Ariel.friends.add("Bob", Bob);
		Ariel.friends.add("Ron", Ron);
		Ariel.friends.add("Ria", Ria);

		Pooh.friends.add("Nandhini", Nandhini);
		Pooh.friends.add("Ria", Ria);

		Bob.friends.add("Annie", Annie);
		Bob.friends.add("Amy", Amy);
		Bob.friends.add("Ariel", Ariel);

		Network.add("Ria", Ria);
		Network.add("Annie", Annie);
		Network.add("Bob", Bob);
		Network.add("Nandhini", Nandhini);
		Network.add("Amy", Amy);
		Network.add("Joe", Joe);
		Network.add("Ron", Ron);
		Network.add("Harry", Harry);
		Network.add("Ariel", Ariel);
		Network.add("Pooh", Pooh);

		Network.add(newUser.getName(), newUser); // adding the newUser to the network

		names.add(Ria);
		names.add(Annie);
		names.add(Bob);
		names.add(Nandhini);
		names.add(Amy);
		names.add(Joe);
		names.add(Ron);
		names.add(Harry);
		names.add(Ariel);
		names.add(Pooh);

		// creating a graph to print out the list of recommended friends
		graph.addVertex(Ria);
		graph.addVertex(Annie);
		graph.addVertex(Bob);
		graph.addVertex(Nandhini);
		graph.addVertex(Amy);
		graph.addVertex(Joe);
		graph.addVertex(Ron);
		graph.addVertex(Harry);
		graph.addVertex(Ariel);
		graph.addVertex(Pooh);
		graph.addVertex(newUser);

		graph.addEdge(Ria, Annie, 1);
		graph.addEdge(Ria, Nandhini, 1);
		graph.addEdge(Ria, Ariel, 1);
		graph.addEdge(Ria, Pooh, 1);
		graph.addEdge(Ron, Annie, 1);
		graph.addEdge(Bob, Annie, 1);
		graph.addEdge(Bob, Amy, 1);
		graph.addEdge(Harry, Amy, 1);
		graph.addEdge(Harry, Joe, 1);
		graph.addEdge(Nandhini, Joe, 1);
		graph.addEdge(Nandhini, Pooh, 1);
		graph.addEdge(Ron, Ariel, 1);
		graph.addEdge(Bob, Ariel, 1);

		System.out.println("You are now successfully connected to the network...");
		System.out.println();
		System.out.println();

		// diplaying the details of newUser
		newUser.display();

		System.out.println("****************************************************************************************");
		System.out.println();
		System.out.println();

		// prompting newUser to make any changes to their profile
		System.out.println("Do you want to modify your profile?  Enter 'Y' for yes and 'N' for no.");
		String ans = sc.nextLine();

		// input validation
		while (!ans.equals("Y") && !ans.equals("y") && !ans.equals("N") && !ans.equals("n")) {
			System.out.println("Please Enter the correct command. Enter 'Y' for yes and 'N' for no.");
			ans = sc.nextLine();
		}

		// calls modifyProfile() if affirmative
		if (ans.equals("Y") || ans.equals("y")) {
			modifyProfile();
		}

		// else calls searchProfiles()
		if (ans.equals("N") || ans.equals("n"))
			searchProfiles();

	}

	// searchProfiles() : allows newUser to search for profiles in the Network,
	// calls addFriend() and removeFriend() when appropriate
	public void searchProfiles() {

		// prompts user to search or exit
		System.out.println();
		System.out.println("Do you want to search any profile or exit? Enter 'S' for search and 'E' for exit.");
		String ans = sc.nextLine();

		// input validation
		while (!ans.equals("S") && !ans.equals("s") && !ans.equals("E") && !ans.equals("e")) {
			System.out.println("Please Enter the correct command. Enter 'S' for search and 'E' for exit.");
			ans = sc.nextLine();
		}

		// prompting user to enter the name associated with the profile
		if (ans.equals("S") || ans.equals("s")) {
			System.out.println("Enter the name of the person: ");
			String n = sc.nextLine();

			if (Network.contains(n) == false) {
				while (n == null || Network.contains(n) == false) {
					System.out.println("This person does not exist in this Network. Please try again.");
					System.out.println("Enter the name of the person: ");
					n = sc.nextLine();
				}
			}

			// displays the searched profile
			System.out.println();
			Network.getValue(n).display();
			Iterator<String> keyIterator = Network.getValue(n).friends.getKeyIterator();
			System.out.print("Friends:");
			while (keyIterator.hasNext()) {
				System.out.print(keyIterator.next() + ",");
			}
			System.out.println();

			System.out.println(
					"****************************************************************************************");
			// recommend();

			// if the searched person is already a friend, prompt user if to remove friend
			if (addfriend(n)) {
				System.out.println();
				System.out.println("Do you want to remove this friend? Enter 'Y' for yes and 'N' for no.");
				String input = sc.nextLine();

				// input validation
				while (!input.equals("Y") && !input.equals("y") && !input.equals("N") && !input.equals("n")) {
					System.out.println("Please Enter the correct command. Enter 'Y' for yes and 'n' for no.");
					input = sc.nextLine();

				}

				if (input.equals("Y") || input.equals("y")) {
					removeFriend(n);
					searchProfiles();
				}

				if (input.equals("N") || input.equals("n")) {
					newUser.display();
					Iterator<String> keyIterator1 = newUser.friends.getKeyIterator();
					System.out.print("Friends:");
					while (keyIterator1.hasNext()) {
						System.out.print(keyIterator1.next() + ",");
					}
					System.out.println();

					System.out.println(
							"****************************************************************************************");
					recommend();
					searchProfiles();
				}
			}

		}

		// if user wishes to exit
		if (ans.equals("E") || ans.equals("e")) {
			System.out.println();
			System.out.println("You are now leaving the network...");
			System.exit(1);
		}

	}

	// addFriend() : returns a boolean signifying if a friend was added
	public boolean addfriend(String name) {
		boolean flag = true; // represents whether name is a friend of newUser

		// iterating through signed-in user's friends to check if entered name is
		// already a friend
		Iterator<String> keyIterator = newUser.friends.getKeyIterator();
		boolean friend = false;
		while (keyIterator.hasNext()) {
			if (keyIterator.next().equals(name)) {
				friend = true;
			}
		}

		// if already a friend, return true
		if (friend == true) {
			System.out.println(name + " is your friend.");
			return true;
		}

		// else prompt user to add friend
		else {
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("Do you want to add this friend? Enter 'Y' for yes and 'N' for no.");
			String ans = sc.nextLine();

			while (!ans.equals("Y") && !ans.equals("y") && !ans.equals("N") && !ans.equals("n")) {
				System.out.println("Please Enter the correct command. Enter 'Y' for yes and 'n' for no.");
				ans = sc.nextLine();

			}

			// if user wishes to add friend
			if (ans.equals("Y") || ans.equals("y")) {

				newUser.friends.add(name, Network.getValue(name));
				Network.getValue(name).friends.add(newUser.getName(), newUser);
				graph.addEdge(newUser, Network.getValue(name), 1);
				System.out.println();
				newUser.display();
				Iterator<String> keyIterator1 = newUser.friends.getKeyIterator();
				System.out.print("Friends:");
				while (keyIterator1.hasNext()) {
					System.out.print(keyIterator1.next() + ",");
				}
				System.out.println();

				System.out.println(
						"****************************************************************************************");
				if (rname.contains(Network.getValue(name))) {
					rname.remove(rname.containpos(Network.getValue(name)));
					// rname.remove(Network.getValue(name))
				}
				recommend();
				searchProfiles();

			}

			// else call searchProfiles and set flag to false
			if (ans.equals("N") || ans.equals("n")) {

				flag = false;
				newUser.display();
				Iterator<String> keyIterator1 = newUser.friends.getKeyIterator();
				System.out.print("Friends:");
				while (keyIterator1.hasNext()) {
					System.out.print(keyIterator1.next() + ",");
				}
				System.out.println();

				System.out.println(
						"****************************************************************************************");
				recommend();

				searchProfiles();
			}
		}

		return flag;
	}

	// removeFriend() : removes the profile associated with name and displays
	// updated list of friends
	public void removeFriend(String name) {
		newUser.friends.remove(name);
		graph.removeEdge(newUser, Network.getValue(name));
		System.out.println("You have successfully removed " + name + "!");
		System.out.println();
		newUser.display();
		Iterator<String> keyIterator = newUser.friends.getKeyIterator();
		System.out.print("Friends:");
		while (keyIterator.hasNext()) {
			System.out.print(keyIterator.next() + ",");
		}
		System.out.println();

		System.out.println("****************************************************************************************");
		recommend();
	}

	// modifyProfile() : allows user to modify each detail of their profile
	public void modifyProfile() {

		// prompts user to modify the name field
		System.out.println("Do you want to modify your name? Enter 'Y' for yes and 'N' for no. ");
		String ans = sc.nextLine();

		// input validation
		while (!ans.equals("Y") && !ans.equals("y") && !ans.equals("N") && !ans.equals("n")) {
			System.out.println("Please Enter the correct command. Enter 'Y' for yes and 'n' for no.");
			ans = sc.nextLine();

		}

		// modify the user's name field using mutator
		if (ans.equals("Y") || ans.equals("y")) {
			System.out.println("Please Enter your name: ");
			String name = sc.nextLine();
			newUser.setName(name);

		}

		// do nothing if user does not wish to modify name field
		if (ans.equals("N") || ans.equals("n")) {

		}

		System.out.println("Do you want to modify where you live? Enter 'Y' for yes and 'N' for no. ");
		ans = sc.nextLine();
		while (!ans.equals("Y") && !ans.equals("y") && !ans.equals("N") && !ans.equals("n")) {
			System.out.println("Please Enter the correct command. Enter 'Y' for yes and 'n' for no.");
			ans = sc.nextLine();

		}

		if (ans.equals("Y") || ans.equals("y")) {
			System.out.println("Please Enter where you live: ");
			String lives = sc.nextLine();
			newUser.setLives("Lives in " + lives);

		}
		if (ans.equals("N") || ans.equals("n")) {

		}

		System.out.println("Do you want to modify where you work? Enter 'Y' for yes and 'N' for no. ");
		ans = sc.nextLine();
		while (!ans.equals("Y") && !ans.equals("y") && !ans.equals("N") && !ans.equals("n")) {
			System.out.println("Please Enter the correct command. Enter 'Y' for yes and 'n' for no.");
			ans = sc.nextLine();

		}

		if (ans.equals("Y") || ans.equals("y")) {
			System.out.println("Please Enter where you work: ");
			String work = sc.nextLine();
			newUser.setWorks("Works at " + work);

		}
		if (ans.equals("N") || ans.equals("n")) {

		}

		System.out.println("Do you want to modify where you studied? Enter 'Y' for yes and 'N' for no. ");
		ans = sc.nextLine();
		while (!ans.equals("Y") && !ans.equals("y") && !ans.equals("N") && !ans.equals("n")) {
			System.out.println("Please Enter the correct command. Enter 'Y' for yes and 'n' for no.");
			ans = sc.nextLine();

		}

		if (ans.equals("Y") || ans.equals("y")) {
			System.out.println("Please Enter where you studied: ");
			String study = sc.nextLine();
			newUser.setStudied("Studied at " + study);

		}
		if (ans.equals("N") || ans.equals("n")) {

		}

		System.out.println("Do you want to modify your gender? Enter 'Y' for yes and 'N' for no. ");
		ans = sc.nextLine();
		while (!ans.equals("Y") && !ans.equals("y") && !ans.equals("N") && !ans.equals("n")) {
			System.out.println("Please Enter the correct command. Enter 'Y' for yes and 'n' for no.");
			ans = sc.nextLine();

		}

		if (ans.equals("Y") || ans.equals("y")) {
			System.out.println("Please Enter where your gender: ");
			String gender = sc.nextLine();
			newUser.setGender(gender);

		}
		if (ans.equals("N") || ans.equals("n")) {

		}

		System.out.println("Do you want to modify where are you from? Enter 'Y' for yes and 'N' for no. ");
		ans = sc.nextLine();
		while (!ans.equals("Y") && !ans.equals("y") && !ans.equals("N") && !ans.equals("n")) {
			System.out.println("Please Enter the correct command. Enter 'Y' for yes and 'n' for no.");
			ans = sc.nextLine();

		}

		if (ans.equals("Y") || ans.equals("y")) {
			System.out.println("Please Enter where you are from: ");
			String from = sc.nextLine();
			newUser.setFrom("From " + from);

		}
		if (ans.equals("N") || ans.equals("n")) {

		}

		System.out.println("Do you want to modify your birthday? Enter 'Y' for yes and 'N' for no. ");
		ans = sc.nextLine();

		while (!ans.equals("Y") && !ans.equals("y") && !ans.equals("N") && !ans.equals("n")) {
			System.out.println("Please Enter the correct command. Enter 'Y' for yes and 'n' for no.");
			ans = sc.nextLine();

		}

		if (ans.equals("Y") || ans.equals("y")) {
			System.out.println("Please Enter your birthday: ");
			String birth = sc.nextLine();
			newUser.setBirth(birth);

		}
		if (ans.equals("N") || ans.equals("n")) {

		}

		// display updated profile
		System.out.println();
		newUser.display();
		Iterator<String> keyIterator = newUser.friends.getKeyIterator();
		System.out.print("Friends:");
		while (keyIterator.hasNext()) {
			System.out.print(keyIterator.next() + ",");
		}
		System.out.println();

		// searchProfiles() called again
		System.out.println("****************************************************************************************");
		recommend();
		searchProfiles();
	}

	// recommend() : displays an updated recommended friend's list based on the
	// user's current list of friends using undirected graph.

	public void recommend() {
		rname.clear();
		int c = 0;
		for (int i = 0; i < names.getLength(); i++) {
			pathlen = graph.getCheapestPath(newUser, names.toArray()[i], path);// gets the shortest pathlenth between
																				// newUser and her friends' of friends

			if (pathlen == 2.0 && !rname.contains(names.toArray()[i])
					&& !newUser.friends.contains(names.toArray()[i].getName())) {
				rname.add(names.toArray()[i]);// adding newUser's friends in an array list for comparison.

			}

		}
		for (int i = 0; i < rname.getLength(); i++)
			System.out.print(rname.toArray()[i].getName() + ",");
		System.out.println();
		int j = 0;
		ListInterface<Profile> friend = new AList();
		Iterator<String> keyIterator = newUser.friends.getKeyIterator();

		while (keyIterator.hasNext()) {
			friend.add(newUser.friends.getValue(keyIterator.next()));// adding newUser's friends in an array list for
																		// comparison.

		}

		for (int a = 0; a < rname.getLength(); a++) {

			while (j < friend.getLength()) {
				double pathlength = graph.getCheapestPath(friend.toArray()[j], rname.toArray()[a], path);
				if (pathlength == 1.0) {// checks if the path length between newUser's friends and recommended friends
										// is 1
					c++;
				}
				j++;

			}
			if (c < 1) {
				rname.remove(a + 1);// if none of newUser's friends are friends with the recommeneded friends then
									// remove that friend from recommended list
			}
			c = 0;
			j = 0;
		}
		System.out.print("Recommended friends: ");
		for (int i = 0; i < rname.getLength(); i++) {

			System.out.print(rname.toArray()[i].getName() + ", ");// printing recommeded friends

		}
		System.out.println();
		System.out.println("****************************************************************************************");

		System.out.println();
	}

}

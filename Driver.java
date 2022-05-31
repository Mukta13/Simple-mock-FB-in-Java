/*
 * MUKTA JAISWAL
 * NANDHINI PANDURANGAN 
 * This program implements linked dictionaries to create a social network
 * This program allows a user to join the network, leave the network, create a profile, 
 * modify the profile, search for other profiles, and add and remove friends.
*/


public class Driver {
	public static void main(String args[])  {
		Profile p=new Profile(); //creating a profile object 
		
		//executes login() function in Profile class - determines whether user is an existing user or new user 
		p.login(); 
		
		//if new user, createNew() in login() function is called (Profile class)
		
		//if existing user has signed in, the network is accessed through their profile
		if(Profile.c==1){ 
			Network n=new Network();
			n.createProfiles();
		} 
	}
	
	/*
	 * OUTPUT 1
	 * ********************************* facebook login*********************************************

Would you like to create a profile or login. Enter 'P' for creating and 'L' for login.
123
Please Enter the correct choice.
********************************* facebook login*********************************************

Would you like to create a profile or login. Enter 'P' for creating and 'L' for login.
l
Please Enter your Username: 
123
Please Enter your Password: 
123


You are now successfully connected to the network...


********************************* facebook *********************************************

                                  RIA SHARMA                                             
  ABOUT  
========================================================================================
  From Mumbai,India
  Lives in Berkeley,California,USA
  Works at Google
  Studied at UC Berkeley
  Female
  Born on 1984-09-20
========================================================================================
Friends:Pooh,Ariel,Nandhini,Annie,
****************************************************************************************


Do you want to modify your profile?  Enter 'Y' for yes and 'N' for no.
n

Do you want to search any profile or exit? Enter 'S' for search and 'E' for exit.
s
Enter the name of the person: 
Pooh


********************************* facebook *********************************************

                                  Winnie the Pooh                                             
  ABOUT  
========================================================================================
  From San Francisco,USA
  Lives in Forrest,USA
  Works at Disneyland
  Studied at Piglet School
  Male
  Born on 1987-12-12
========================================================================================
Friends:Ria,Nandhini,
****************************************************************************************
Pooh is your friend.

Do you want to remove this friend? Enter 'Y' for yes and 'N' for no.
y
You have successfully removed Pooh!

********************************************************
Your Friends:Ariel,Nandhini,Annie,
********************************************************

Do you want to search any profile or exit? Enter 'S' for search and 'E' for exit.
s
Enter the name of the person: 
Ron


********************************* facebook *********************************************

                                  Ron Roger                                             
  ABOUT  
========================================================================================
  From New York,USA
  Lives New York,USA
  Works at Coney Island
  Studied at Princeton Univerity
  Male
  Born on 1994-07-17
========================================================================================
Friends:Ariel,Annie,
****************************************************************************************

Do you want to add this friend? Enter 'Y' for yes and 'N' for no.
y

********************************* facebook *********************************************

                                  RIA SHARMA                                             
  ABOUT  
========================================================================================
  From Mumbai,India
  Lives in Berkeley,California,USA
  Works at Google
  Studied at UC Berkeley
  Female
  Born on 2001-04-11
========================================================================================
Friends:Ron,Ariel,Nandhini,Annie,
****************************************************************************************

Do you want to search any profile or exit? Enter 'S' for search and 'E' for exit.
e

You are now leaving the network...

	 */
	
	
	
	
	
	/*
	 * OUTPUT 2
	 * ********************************* facebook login*********************************************

Would you like to create a profile or login. Enter 'P' for creating and 'L' for login.
p
Please Enter your name: 
Raj
Please Enter where you are from: 
Delhi,India
Please Enter where you live: 
Delhi,India
Please Enter where you work: 
IBM,India
Please Enter where you studied: 
Delhi public school
Please Enter your gender: 
Male
Please Enter your birthday(yyyy-mm-dd): 
1995-06-09



********************************* facebook *********************************************

                                  Raj                                             
  ABOUT  
========================================================================================
  From Delhi,India
  Lives in Delhi,India
  Works at IBM,India
  Studied at Delhi public school
  Male
  Born on 1995-06-09
========================================================================================
****************************************************************************************


Do you want to modify your profile?  Enter 'Y' for yes and 'N' for no.
n

Do you want to search any profile or exit? Enter 'S' for search and 'E' for exit.
y
Please Enter the correct command. Enter 'S' for search and 'E' for exit.
Ria
Please Enter the correct command. Enter 'S' for search and 'E' for exit.
s
Enter the name of the person: 
Ria

********************************* facebook *********************************************

                                  RIA SHARMA                                             
  ABOUT  
========================================================================================
  From Mumbai,India
  Lives in Berkeley,California,USA
  Works at Google
  Studied at UC Berkeley
  Female
  Born on 2001-04-11
========================================================================================
Friends:Pooh,Ariel,Nandhini,Annie,
****************************************************************************************

Do you want to add this friend? Enter 'Y' for yes and 'N' for no.
y

********************************* facebook *********************************************

                                  Raj                                             
  ABOUT  
========================================================================================
  From Delhi,India
  Lives in Delhi,India
  Works at IBM,India
  Studied at Delhi public school
  Male
  Born on 1995-06-09
========================================================================================
Friends:Ria,
****************************************************************************************

Do you want to search any profile or exit? Enter 'S' for search and 'E' for exit.
s
Enter the name of the person: 
Bob

********************************* facebook *********************************************

                                  Bob Bugsbegone                                             
  ABOUT  
========================================================================================
  From Nevada,USA
  Lives in Seattle,Washington
  Works at Facebook
  Studied at UC Santa Cruz
  Male
  Born on 2001-09-22
========================================================================================
Friends:Ariel,Amy,Annie,
****************************************************************************************

Do you want to add this friend? Enter 'Y' for yes and 'N' for no.
y

********************************* facebook *********************************************

                                  Raj                                             
  ABOUT  
========================================================================================
  From Delhi,India
  Lives in Delhi,India
  Works at IBM,India
  Studied at Delhi public school
  Male
  Born on 1995-06-09
========================================================================================
Friends:Bob,Ria,
****************************************************************************************

Do you want to search any profile or exit? Enter 'S' for search and 'E' for exit.
s
Enter the name of the person: 
Ria

********************************* facebook *********************************************

                                  RIA SHARMA                                             
  ABOUT  
========================================================================================
  From Mumbai,India
  Lives in Berkeley,California,USA
  Works at Google
  Studied at UC Berkeley
  Female
  Born on 2001-04-11
========================================================================================
Friends:Raj,Pooh,Ariel,Nandhini,Annie,
****************************************************************************************
Ria is your friend.

Do you want to remove this friend? Enter 'Y' for yes and 'N' for no.
y
You have successfully removed Ria!

********************************************************
Your Friends:Bob,
********************************************************

Do you want to search any profile or exit? Enter 'S' for search and 'E' for exit.
s
Enter the name of the person: 
Ariel

********************************* facebook *********************************************

                                  Ariel Mermaid                                             
  ABOUT  
========================================================================================
  From Los Angeles,USA
  Lives in Orlando,USA
  Works at Disneyland
  Studied at Sea School
  Female
  Born on 1997-10-11
========================================================================================
Friends:Ria,Ron,Bob,
****************************************************************************************

Do you want to add this friend? Enter 'Y' for yes and 'N' for no.
y

********************************* facebook *********************************************

                                  Raj                                             
  ABOUT  
========================================================================================
  From Delhi,India
  Lives in Delhi,India
  Works at IBM,India
  Studied at Delhi public school
  Male
  Born on 1995-06-09
========================================================================================
Friends:Ariel,Bob,
****************************************************************************************

Do you want to search any profile or exit? Enter 'S' for search and 'E' for exit.
e

You are now leaving the network...

	 */
	

}
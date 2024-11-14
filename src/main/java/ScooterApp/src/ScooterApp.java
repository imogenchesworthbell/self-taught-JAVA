package ScooterApp.src;

public class ScooterApp {

}
/*Properties:
 - `stations` (Map<String, List<Scooter>>): A map that holds stations and their associated scooters.
 - `registeredUsers` (Map<String, User>): A map that holds registered users by their usernames.

 Methods:
 - `registerUser(username, password, age)`: Registers a new user if they meet the criteria.
 - `loginUser(username, password)`: Logs in a user by validating the username and password.
 - `logoutUser(username)`: Logs out a user by their username.
 - `createScooter(station)`: Creates a new scooter at a specified station.
 - `dockScooter(scooter, station)`: Docks a scooter at a station.
 - `rentScooter(scooter, user)`: Rents a scooter to a user from a station.
 - `print()`: Prints a summary of the registered users and scooter stations.
 */
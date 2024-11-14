# Scooter App - Mini Project

## Project Overview

This project simulates a scooter rental app. Users can register, log in, rent and return scooters, and interact with the system to check scooter availability, charge, and status. The project uses object-oriented programming principles in Java and is designed around three main classes: `Scooter`, `User`, and `ScooterApp`.

## Class Descriptions

### Class: Scooter

Represents an individual scooter in the system. Scooters can be either docked at a station or checked out by a user. They can also be broken or in need of charging.
All Scooters are docked, charged, and in good repair initially. The Scooter constructor has one parameter:
the Station the scooter is docked at.

**Properties:**
- `station` (String): The station where the scooter is located. If the scooter is checked out, this will be `null`.
- `user` (User): The user who has rented the scooter, or `null` if docked.
- `serial` (int): A unique serial number assigned to each scooter.
- `nextSerial` (static int): A counter that generates the next available serial number.
- `charge` (int): The battery percentage (0 to 100).
- `isBroken` (boolean): Indicates whether the scooter is broken.

**Methods:**
- `rent(user)`: Rent the scooter to a user, if it’s above 20% charged and not broken.
- `dock(station)`: Dock the scooter at a station and clear the assigned user.
- `recharge()`: A bonus method to recharge the scooter gradually.
- `requestRepair()`: A bonus method to request a repair after a delay.

### Class: User

Represents a user of the app. Users can register, log in, and log out.

**Properties:**
- `username` (String): The user's username.
- `password` (String): The user's password.
- `age` (int): The user's age.
- `loggedIn` (boolean): Whether the user is currently logged in.

**Methods:**
- `login(password)`: Logs the user in if the password is correct.
- `logout()`: Logs the user out.

### Class: ScooterApp

Represents the main app that handles the user interactions and keeps track of all registered users and scooters.

**Properties:**
- `stations` (Map<String, List<Scooter>>): A map that holds stations and their associated scooters.
- `registeredUsers` (Map<String, User>): A map that holds registered users by their usernames.

**Methods:**
- `registerUser(username, password, age)`: Registers a new user if they meet the criteria.
- `loginUser(username, password)`: Logs in a user by validating the username and password.
- `logoutUser(username)`: Logs out a user by their username.
- `createScooter(station)`: Creates a new scooter at a specified station.
- `dockScooter(scooter, station)`: Docks a scooter at a station.
- `rentScooter(scooter, user)`: Rents a scooter to a user from a station.
- `print()`: Prints a summary of the registered users and scooter stations.

### Tests

- Look at how to write tests and have a go at writing some tests for these classes.
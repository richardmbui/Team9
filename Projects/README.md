# Pacman Simulator
Sophie Jorgensen, Suraj Narang, Sahil Sinha, Ge Huang

## Running the code
To run the code, navigate to the P3/ directory and run the following commands:

javac -cp "src/" src/*.java

java -cp "src/" StartMenu

From here, a GUI should pop up where you can select "Start Game"

# Functions

## PacMan Class
1. move(): This method controls PacMan's moves. It gets all the possible moves by calling get_valid_moves() and uses the first Location in the list if it is valid, moving the PacMan. It returns true if the PacMan moves and false if not.

To test this, I created a PacMan at coordinates (1,1) and initialized the board to have no ghosts. Because get_valid_moves could move the PacMan up or to the right (assuming walls are on other corners), I checked if the PacMan's location is now (1,2) or (2,1). 

2. is_ghost_in_range(): This method checks where a ghost is 1 spot away from the current location of the pacman character

To test this this function, I checked every possible spot that is 1 spot away and checked whether a ghost character is located there

## Ghost Class
1. attack(): This method has the Ghost attack PacMan if the PacMan is in range of the ghost, and calls Map's attack() method if so. It returns true for a successful attack and false for not.

To test this, I created PacMan and Ghost characters that are adjacent on the board, and checked to ensure the ghost's attack() method successfully executed and returned true.

2. is_pacman_in_range(): This method checks where the pacman is 1 spot away from the current location of the ghost character

To test this this function, I checked every possible spot that is 1 spot away and checked whether a pacman character is located there

## Map Class
1. attack(): This method updates the game to be over if the Ghost attacked PacMan, returning true if so.

To test this, I called the ghost's attack() method, which relies on map's attack() method. Thus, I ensured that the ghost's attack() return type was true, and that the isGameOver() method returned true after PacMan was attacked.

2. eatCookie(): this function keeps track of the cookies on the map. This function is used to update the GUI display when a cookie is eaten

To test this function, I create a new locatoin and a pacman character. Then I check whether if a blank map returns null when eatCookie() is used
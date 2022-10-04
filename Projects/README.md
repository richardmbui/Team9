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

To test this, I created a PacMan at coordinates (9,10) and initialized the board to have no ghosts. Because get_valid_moves() is implemented to first add a new location at (x+1, y) if available, I tested if move() returned true and if the new location of the PacMan was (10,10).

## Ghost Class
1. attack(): This method has the Ghost attack PacMan if the PacMan is in range of the ghost, and calls Map's attack() method if so. It returns true for a successful attack and false for not.

To test this, I created PacMan and Ghost characters that are adjacent on the board, and checked to ensure the ghost's attack() method successfully executed and returned true.

## Map Class
1. attack(): This method updates the game to be over if the Ghost attacked PacMan, returning true if so.

To test this, I called the ghost's attack() method, which relies on map's attack() method. Thus, I ensured that the ghost's attack() return type was true, and that the isGameOver() method returned true after PacMan was attacked.
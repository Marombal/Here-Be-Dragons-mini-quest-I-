# Here-Be-Dragons-mini-quest-I-
Small game to introduce Java in the context of the "Software Design" course

FEUP / MEEC 2022

In this mini-quest, you are asked to portray the classical situation of "The Maze and The Dragon", which story follows:

"You awake still shattered from your last encounter...all is still fuzzy in your mind as you don't have any recollection on how you got to where you are...you can see a poorly-lite corridor and feel the damp smell of closed quarters. Where are your things? You are still dressed in your leather clothes but no weapons or armour. Where are you? What dangers lie beyond?... A tinkle in the back of your head tells you that you must leave this place as fast as you can..."

1. The user should be asked to enter single-character commands to move the main character ("hero") in 4 possible directions (up, down, left, right). If there is a wall or door in that direction, the hero remains in the same position. Upon entering each command, the program should update the game and reprint the game map. 
2. The hero needs to pick up (walkover) the key ('K') to open the dungeon exit door ('E'). If the hero reaches the exit without the key, it cannot leave the dungeon (the exit is closed). If the hero gets anywhere near the dragon (any adjacent square, except diagonals), it is immediately killed, and the game is over. At this point, the dragon is asleep and does not move, so the hero should be safe, as long as it keeps away from him. When reaching (stepping over) the open exit door, the game ends with victory.
3. The game starts normally, but the moment the hero picks up the key, it gets teleported to a random position two steps away from the dragon. The new position must be valid and allow for the hero to reach the exit. 

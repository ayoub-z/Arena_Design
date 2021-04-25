# Arena_Design

**This application keeps track of all 2v2 arena fights.**

It contains the following classes:
- **PlayerCharacter:** holds all the information of the players and has function to compare player ratings
- **InGameId:** each player is part of an "account" and this account will always have an id
- **ArenaPlayer:** interface makes sure "PlayerCharacter" and "Arena" implement given behavior
- **LiveStream:** each arena fight is liveStreamed, this class holds the information of where it will be livestreamed.
- **Arena:** keeps track of players that fight each other, as well as where it's streamed and who will be commentating
- **CommentaryCast:** holds the name of the commentator. During livestreames, there will be a cast commentating on the arena fights. 
- **Cast:** interface makes sure "LiveStream" and "CommentaryCast" implent given behavior


And in the main function all the information of the players will be noted down, as well as the streaming channel and the commentator.

Players that fight each other need to fit these requirements:
- Players with the same specialization may not fight each other. Only a Dps may fight other Dps.
Tanks may not fight each other and Healers also may not fight each other.
- Players with a rating between 1000-1999 can't be more than 500 rating points apart.
- Players with a rating of 2000 or above can't be more than 200 rating points apart.


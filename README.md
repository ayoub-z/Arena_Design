# Arena_Design

**This application keeps track of all 2v2 arena fights in the Online Game World of Warcraft. 
It records the players fighting in arena matches, the livestream channel where these arenafights are livestreamed and the commentator in the livestream.**

It contains the following classes:
- **PlayerCharacter:** holds all the information of the players and has function to compare player ratings.
- **InGameId:** each player is part of an "account" and this account will always have a unique id.
- **ArenaPlayer:** interface makes sure class "PlayerCharacter" and class "Arena" implement given behavior.
- **LiveStream:** each arena fight is livestreamed, this class holds the web adres of where it will be livestreamed.
- **Arena:** keeps track of players that fight each other, as well as where it's streamed and who will be commentating.
- **CommentaryCast:** holds the name of the commentator. During livestreames, there will be a cast commentating on the arena fights. 
- **Cast:** interface makes sure class "LiveStream" and class "CommentaryCast" implent given behavior.


In the Main class all the information of the players will be noted down, as well as the streaming channel and the commentator.

Players that fight each other need to fit these requirements:
- Players with the same specialization may not fight each other. Only a Dps may fight other Dps.
Tanks may not fight other Tanks and Healers also may not fight other Tanks.
- Players with a rating between 1000-1999 can't be more than 500 rating points apart.
- Players with a rating of 2000 or above can't be more than 200 rating points apart.


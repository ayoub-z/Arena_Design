# Arena_Design

**This application keeps track of all 2v2 arena fights.**

Each arena fight contains the following:
- 2 players that will be fighting each other 
- 1 streaming channel where the fight will be livestreamed  
- 1 commentator that will commentating during the livestream

All the information of the players will be noted down, as well as the streaming channel and the commentator.

Players that fight each other need to fit these requirements:
- Players with the same specialization (meaning Dps, Healer, Tank) may not fight each other. Only a Dps may fight another dps
- Players with a rating between 1000-1999 can't be more than 500 rating points apart.
- Players with a rating of 2000 or above can't be more than 200 rating points apart.


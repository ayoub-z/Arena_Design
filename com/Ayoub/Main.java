package com.Ayoub;
public class Main {
    public static void main(String[] args) throws Exception {
        // creating the players
        PlayerCharacter player1 = new PlayerCharacter("Jarvis#1234","Jarvis",80, 900,"Druid","Tank");
        PlayerCharacter player2 = new PlayerCharacter("Banzay#1234","Holyshield",80, 1 ,"Paladin","Healer");

        PlayerCharacter player3 = new PlayerCharacter("Dex#1234","Goface",80, 2100,"Hunter","Dps");
        PlayerCharacter player4 = new PlayerCharacter("Nightlune#1234","Nightpriest",80, 2300,"Priest","Healer");

        PlayerCharacter player5 = new PlayerCharacter("Kai#1234","Kevin",80, 850,"Warrior","Tank");
        PlayerCharacter player6 = new PlayerCharacter("Rowie#1234","Boneshield",80, 100,"Death Knight","Tank");


        // creating livestream channel and commentator
        LiveStream stream = new LiveStream("Twitch.tv/WoW");
        CommentaryCast cast = new CommentaryCast("Raino");

        System.out.println("Details of player 1: \n-----------------" + player1 + "\n");
        System.out.println("Details of player 2: \n-----------------" + player2 + "\n");

        // creating arena match that incorporates everything
        Arena match1 = new Arena(player1, player2, stream, cast);
        System.out.println("\n\n" + match1);
        System.out.println(match1.matchResults());
        System.out.println(match1.matchDuration());

        // at 2401 it's 201 rating apart from player 3 who is rated 2200.
        // this will give an Exception error. Setting to 2400 to circumvent
        player4.setRating(2200);

        Arena match2 = new Arena(player3, player4, stream, cast);
        System.out.println("\n\n" + match2);
        System.out.println(match2.matchResults());
        System.out.println(match2.matchDuration());

        Arena match3 = new Arena(player5, player6, stream, cast);
        System.out.println("\n\n" + match3);
        System.out.println(match3.matchResults());
        System.out.println(match3.matchDuration());
    }
}



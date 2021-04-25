package com.Ayoub;
public class Main {
    public static void main(String[] args) throws Exception {
        PlayerCharacter player1 = new PlayerCharacter("Jarvis#1234","Jarvis",80, 2100,"Druid","Tank");
        PlayerCharacter player2 = new PlayerCharacter("Banzay#1234","Holyshield",80, 1901 ,"Paladin","Healer");

        PlayerCharacter player3 = new PlayerCharacter("Dex#1234","Goface",80, 2200,"Hunter","Dps");
        PlayerCharacter player4 = new PlayerCharacter("Nightlune#1234","Nightpriest",80, 2401,"Priest","Healer");
//
        PlayerCharacter player5 = new PlayerCharacter("Kai#1234","Kevin",80, 850,"Warrior","Tank");
        PlayerCharacter player6 = new PlayerCharacter("Rowie#1234","Boneshield",80, 100,"Death Knight","Tank");

        LiveStream stream = new LiveStream("Twitch.tv/WoW");
        CommentaryCast cast = new CommentaryCast("Raino");

        System.out.println("Details of player 1: \n-----------------" + player1 + "\n");
        System.out.println("Details of player 2: \n-----------------" + player2 + "\n");

        Arena match1 = new Arena(player1, player2, stream, cast);
        System.out.println("\n\n" + match1);

        player4.setRating(2400); // at 2401 it's 201 rating apart and will give an Exception error. Setting to 2400 to circumvent
        Arena match2 = new Arena(player3, player4, stream, cast);
        System.out.println("\n\n" + match2);

        player6.setSpecType("Dps"); // both player 5 and 6 are tanks, which gives an Exception error. Setting player6's role as dps to circumvent
        Arena match3 = new Arena(player5, player6, stream, cast);
        System.out.println("\n\n" + match3);



    }
}



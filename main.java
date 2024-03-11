package com.project;
import java.util.Scanner;
public class main {


    public static void main(String[] args){

         String inp;
         Scanner inpUs= new Scanner(System.in);

        System.out.println("REKOMENDASI LAGU ");
        System.out.println(" GENRE LAGU ");

        System.out.println("1.Pop");
        System.out.println("2.Rock");
        System.out.println("3.Hip-Hop");
        System.out.println("4.Electronic");
        System.out.println("5.Country");

        System.out.println("APA GENRE YANG KAMU SUKA?? ");
        inp= inpUs.next();;

switch (inp){
    case "Pop","pop","POP":
        System.out.println(
                "Jika Genre Yang Kamu Suka Adalah " + inp +" Inilah rekomendasi lagu untuk kamu\n"+
                "\"1.Shape of You\" oleh Ed Sheeran\n" +
                "\"2.Rzar\" oleh Katy Perry\n" +
                "\"3.Uptown Funk\" oleh Mark Ronson ft. Bruno Mars\n" +
                "\"4.Someone Like You\" oleh Adele\n" +
                "\"5.Happy\" oleh Pharrell Williams");
        break;

    case "Rock","rock","ROCK":
        System.out.println(
                "Jika Genre Yang Kamu Suka Adalah " + inp +" Inilah rekomendasi lagu untuk kamu\n"+
                "1.Stairway to Heaven\" oleh Led Zeppelin\n"+
                "2.Bohemian Rhapsody\" oleh Queen\n"+
                "3.Smells Like Teen Spirit\" oleh Nirvana\n"+
                "4.Sweet Child o' Mine\" oleh Guns N' Roses\n"+
                "5.Livin' on a Prayer\" oleh Bon Jovi");
        break;

    case "Hip-Hop", "hiphop" ,"hip-hop" ,"HIPHOP" ,"HIP-HOP":
        System.out.println(
                "Jika Genre Yang Kamu Suka Adalah " + inp +" Inilah rekomendasi lagu untuk kamu\n"+
                "1.Lose Yourself\"  oleh Eminem\n"+
                "2.Sicko Mode\" oleh Travis Scott\n"+
                "3.Old Town Road\" oleh Lil Nas X ft. Billy Ray Cyrus\n"+
                "4.HUMBLE.\" oleh Kendrick Lamar\n"+
                "5.God's Plan\" oleh Drake");
        break;

    case "Electronic","electronic","ELECTRONIC":
        System.out.println(
                "Jika Genre Yang Kamu Suka Adalah " + inp +" Inilah rekomendasi lagu untuk kamu\n"+
                "1.Wake Me Up\" oleh Avicii\n"+
                "2.Titanium\" oleh David Guetta ft. Sia\n"+
                "3.Get Lucky\" oleh Daft Punk ft. Pharrell Williams\n"+
                "4.Don't You Worry Child\" oleh Swedish House Mafia ft. John Martin\n"+
                "5.Scary Monsters and Nice Sprites\" oleh Skrillex");
        break;

    case "Country","country","COUNTRY":
        System.out.println(
                "Jika Genre Yang Kamu Suka Adalah " + inp +" Inilah rekomendasi lagu untuk kamu\n"+
                "1.Wagon Wheel\" oleh Darius Rucker\n"+
                "2.Take Me Home, Country Roads\" oleh John Denver\n"+
                "3.Before He Cheats\" oleh Carrie Underwood\n"+
                "4.Need You Now\" oleh Lady A\n"+
                "5.The Dance\" oleh Garth Brooks");

}


    }


}

public class Main {
    public static void main(String[] args) {
        Playlist LOL = new Playlist();
        LOL.print();

        LOL.add("I Want to Write You a Song", "One Direction", "Pop", 2015, 3, 22);
        LOL.add("Piano Man", "Billy Joel", "Folk", 1973, 5, 39);
        LOL.add("Die With A Smile", "Bruno Mars dan Lady Gaga", "Pop", 2024, 4, 11);
        LOL.add("Nina", ".Feast", "Indonesian Rock", 2024, 4, 37);
        LOL.add("Bad", "Wave to Earth", "Korean Rock, Thai Indie", 2023, 4, 23);
        LOL.add("8 Letters", "Why Don't We", "Pop", 2018, 3, 10);
        LOL.add("There Is a Light That Never Goes Out", "The Smiths", "Indie", 1986, 4, 4);
        LOL.add("To the Bone", "Pamungkas", "Indonesian Indie", 2020, 5, 44);
        LOL.add("We are", "One Ok Rock", "Pop Rock", 2017, 4, 15);
        LOL.add("Small girl", "Lee Young Ji", "R&B", 2024, 3, 9);
        LOL.add("21 Guns", "Green Day", "Punk Pop", 2009, 5, 21);
        LOL.add("Little White Lies", "One Direction", "Pop", 2013, 3, 36);
        LOL.add("Uptown Funk", "Mark Ronson ft. Bruno Mars", "Funk",2014, 4, 29);
        LOL.add("Over Again", "One Direction", "Pop", 2013, 3, 50);
        LOL.add("Imagine", "John Lennon", "Rock",1971, 3, 4);
        LOL.add("Walking in the Wind", "One Direction", "Pop", 2015, 3, 30);
        LOL.add("End of the Day", "One Direction", "Pop", 2015, 3, 22);
        LOL.add("Heroes", "David Bowie", "Rock", 1977, 3, 35 );
        LOL.add("Still the One", "One Direction", "Pop", 2014, 3, 5);
        LOL.add("I Would", "One Direction", "Pop", 2011, 3, 10);
        LOL.add("Fireflies", "Owl City", "Synth-pop", 2009, 3, 48);
        LOL.add("I Want to Break Free", "Queen", "Rock",1984, 4, 21);
        LOL.add("Girl Almighty", "One Direction", "Pop", 2014, 3, 34);
        LOL.add("Change Your Ticket", "One Direction", "Pop", 2014, 3, 40);
        LOL.add("Love You Goodbye", "One Direction", "Pop", 2015, 3, 34);
        LOL.add("Sweet Child O' Mine", "Guns N' Roses", "Rock",1987, 5, 56);
        LOL.add("Through the Dark", "One Direction", "Pop", 2013, 3, 35);
        LOL.add("Little Things (Acoustic)", "One Direction", "Pop", 2013, 3, 37);
        LOL.add("Back for You", "One Direction", "Pop", 2013, 3, 20);
        LOL.add("Girls Just Want to Have Fun", "Cyndi Lauper", "Pop", 1983, 3, 55);
        LOL.add("Gotta Be You", "One Direction", "Pop", 2011, 3, 5);
        LOL.add("I Want", "One Direction", "Pop", 2011, 2, 55);
        LOL.add("No Control (Acoustic)", "One Direction", "Pop", 2014, 3, 15);
        LOL.add("The Man Who Can't Be Moved", "The Script", "Pop Rock", 2009, 3, 59);
        LOL.add("Up All Night", "One Direction", "Pop", 2011, 3, 17);
        LOL.add("The Story of My Life (Acoustic)", "One Direction", "Pop", 2013, 4, 5);
        LOL.add("Nobody Else", "One Direction", "Pop", 2014, 3, 22);
        LOL.add("Temporary Fix", "One Direction", "Pop", 2015, 3, 14);
        LOL.add("She’s Not Afraid", "One Direction", "Pop", 2012, 2, 55);
        LOL.add("Little White Lies (Acoustic)", "One Direction", "Pop", 2013, 3, 36);
        LOL.add("No Control (Live)", "One Direction", "Pop", 2014, 3, 20);
        LOL.add("Where Do Broken Hearts Go", "One Direction", "Pop", 2015, 3, 35);
        LOL.add("Creep", "Radiohead", "Rock", 1992, 3, 58);
        LOL.add("Love Me Like You Do", "One Direction", "Pop", 2015, 3, 22);
        LOL.add("Rehab", "Amy Winehouse", "Soul", 2006, 3, 34);
        LOL.add("Secrect Love Song", "Taylor Swift", "Pop", 2015, 3, 35);
        LOL.add("Koiiro", "Musawo", "Pop", 2022, 3, 59);
        LOL.add("Lampu Kuning", "Juicy Luicy", "Pop", 2023, 4, 5);
        LOL.add("They Don't Know About Us", "One Direction", "Pop", 2012, 3, 5);
        LOL.add("Rock Me", "One Direction", "Pop", 2012, 2, 40);
        LOL.add("American Pie", "Don McLean", "Folk Rock", 1971, 8, 33);
        LOL.print();

        System.out.println("\n");
        System.out.println("=========================================================================");
        System.out.println("||                             BUBBLE SORT                             ||");
        System.out.println("=========================================================================");
        LOL.sortbubble();
        LOL.print();

        System.out.println("\n");
        System.out.println("=========================================================================");
        System.out.println("||                           SELECTION SORT                            ||");
        System.out.println("=========================================================================");
        LOL.Selection();
        LOL.print();

        System.out.println("\n");
        System.out.println("=========================================================================");
        System.out.println("||                               SEARCH                                ||");
        System.out.println("=========================================================================");
        LOL.search("We are");
    }
}
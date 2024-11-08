public class Playlist {
    Musik head, tail;

    public void add(String lagu, String artis,String genre, int tahun, int menit, int detik){
        Musik NewMusik = new Musik(lagu, artis, genre, tahun, menit, detik);
        if (head == null){
            head = NewMusik;
            tail = NewMusik;
        }else{
            tail.next = NewMusik;
            NewMusik.prev = tail;
            tail = NewMusik;
        }
    }

    public void print(){
        Musik current = head;
        int i = 1;
        System.out.println("=========================================================================");
        System.out.println("||                            LOL PLaylist                             ||");
        System.out.println("=========================================================================");

        if(head == null){
            System.out.println("\t\t\t\t\t There is no song in the playlist yet.");
            return;
        }

        while(current != null){
            System.out.println("\t " + (i++) + ". " + current.artis + " - " + current.lagu + "(" + current.tahun + ")");
            System.out.println("\t " + current.menit + ":" + current.detik + "\t" + current.genre);
            System.out.println("=========================================================================");
            current = current.next;
        }
    }

    public void sortbubble() {
        if (head == null || head.next == null) {
            return;
        }

        long startTime;
        long elapsedTime;
        startTime = System.nanoTime();

        Musik temp1, temp2;
        boolean swap;

        do {
            swap = false;
            temp1 = head;
            while (temp1.next != null) {
                temp2 = temp1.next;
                int waktu1detik = temp1.menit * 60 + temp1.detik, waktu2detik = temp2.menit * 60 + temp2.detik;

                if (waktu1detik > waktu2detik) {
                    String tempLagu = temp1.lagu, tempArtis = temp1.artis, tempGenre = temp1.genre;
                    int tempTahun = temp1.tahun, tempMenit = temp1.menit, tempDetik = temp1.detik;

                    temp1.lagu = temp2.lagu;
                    temp1.artis = temp2.artis;
                    temp1.genre = temp2.genre;
                    temp1.tahun = temp2.tahun;
                    temp1.menit = temp2.menit;
                    temp1.detik = temp2.detik;

                    temp2.lagu = tempLagu;
                    temp2.artis = tempArtis;
                    temp2.genre = tempGenre;
                    temp2.tahun = tempTahun;
                    temp2.menit = tempMenit;
                    temp2.detik = tempDetik;

                    swap = true;
                }
                temp1 = temp1.next;
            }
        } while (swap);
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0)+ "msec");
    }

    public void Selection() {
        if (head == null || head.next == null) {
            return;
        }
        long startTime, elapsedTime;
        startTime = System.nanoTime();

        Musik temp1, temp2;
        int Year;
        String tempLagu, tempArtis, tempGenre;
        int tempTahun, tempMenit, tempDetik;

        for (temp1 = head; temp1 != null; temp1 = temp1.next) {
            temp2 = temp1.next;
            Year = temp1.tahun;

            while (temp2 != null) {
                if (temp2.tahun > Year) {
                    Year = temp2.tahun;

                    tempLagu = temp1.lagu;
                    tempArtis = temp1.artis;
                    tempGenre = temp1.genre;
                    tempTahun = temp1.tahun;
                    tempMenit = temp1.menit;
                    tempDetik = temp1.detik;

                    temp1.lagu = temp2.lagu;
                    temp1.artis = temp2.artis;
                    temp1.genre = temp2.genre;
                    temp1.tahun = temp2.tahun;
                    temp1.menit = temp2.menit;
                    temp1.detik = temp2.detik;

                    temp2.lagu = tempLagu;
                    temp2.artis = tempArtis;
                    temp2.genre = tempGenre;
                    temp2.tahun = tempTahun;
                    temp2.menit = tempMenit;
                    temp2.detik = tempDetik;
                }
                temp2 = temp2.next;
            }
        }
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0)+ "msec");
    }

    public void search(String lagu){
        Musik current = head;
        int i = 1;
        long startTime, elapsedTime;
        startTime = System.nanoTime();
        if (head == null){
            System.out.println("\t\t\t\t\t There is no song in the playlist yet.");
        }

        while (current != null){
            elapsedTime = System.nanoTime() - startTime;
            if(current.lagu.equalsIgnoreCase(lagu)){
                System.out.println("Judul lagu yang ingin dicari : " + lagu);
                System.out.println("Lagu yang sesuai dengan judul '" + lagu + "' ditemukan pada posisi ke - " + i);
                System.out.println("\t " + i + ". " + current.artis + " - " + current.lagu + "(" + current.tahun + ")");
                System.out.println("\t " + current.menit + ":" + current.detik + "\t" + current.genre);
                System.out.println("=========================================================================");
                System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0)+ "msec");
                return;
            }
            current = current.next;
            ++i;
        }
    }
}

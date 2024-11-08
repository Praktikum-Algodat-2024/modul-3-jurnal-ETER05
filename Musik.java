public class Musik {
    String lagu, artis, genre;
    int tahun, menit, detik;
    Musik next, prev;

    Musik(String lagu, String artis, String genre, int tahun, int menit, int detik){
        this.lagu = lagu;
        this.artis = artis;
        this.genre = genre;
        this.tahun = tahun;
        this.menit = menit;
        this.detik = detik;
        this.prev = null; this.next = null;
    }
}

package utsno4;

public class Main {
    public static void main(String[] args) {
        Spiderman spiderMan = new Spiderman("Peter Parker", "Archeopteryx", "Jurnalis");

        spiderMan.berubah();
        spiderMan.berburu();
        spiderMan.berburu("Sianida");
        spiderMan.mengeluarkanJaring();
        spiderMan.makan();
        spiderMan.memanjat();
        spiderMan.melompat();
        spiderMan.bekerja();
        spiderMan.tidur();
        
        System.out.println();
        
        Gatotkaca gatotkaca = new Gatotkaca("Kang Bagus", "Karnivora", "Desainer Mebel");
        
        gatotkaca.berubah();
        gatotkaca.bekerja();
        gatotkaca.istirahat();
        gatotkaca.makan();
        gatotkaca.memproduksi();
        gatotkaca.tidur();

        System.out.println();

        System.out.println(spiderMan.namaHewan);
        System.out.println(spiderMan.spesies);
        System.out.println(spiderMan.getNamaOrang());
        System.out.println(spiderMan.getPekerjaan());
        
        System.out.println();

        System.out.println(gatotkaca.namaBurung);
        System.out.println(gatotkaca.jenis);
        System.out.println(gatotkaca.getNamaOrang());
        System.out.println(gatotkaca.getPekerjaan());
    }
}
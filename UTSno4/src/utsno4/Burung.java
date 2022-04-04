package utsno4;

public abstract class Burung {
    String namaBurung;
    String jenis;

    public Burung(String namaBurung, String jenis) {
        this.namaBurung = namaBurung;
        this.jenis = jenis;
    }

    public void makan(){
        System.out.println("Burung dengan nama " + this.namaBurung + " berjenis " + this.jenis + " sedang makan.");
    }
}
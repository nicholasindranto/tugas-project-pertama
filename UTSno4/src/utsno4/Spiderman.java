package utsno4;

public class Spiderman extends LabaLaba implements Parkour{
    private String namaOrang;
    private String pekerjaan;

    public Spiderman(String namaOrang, String spesies, String pekerjaan) {
        super(namaOrang, spesies);
        this.namaOrang = namaOrang;
        this.pekerjaan = pekerjaan;
    }

    public String getNamaOrang() {
        return namaOrang;
    }

    public void setNamaOrang(String namaOrang) {
        this.namaOrang = namaOrang;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public void berubah(){
        System.out.println(this.namaOrang + " berubah menjadi Spider-Man.");
    }

    @Override
    public void berburu() {
        super.berburu();
    }

    @Override
    public void berburu(String racun) {
        super.berburu(racun);
    }

    @Override
    public void mengeluarkanJaring() {
        super.mengeluarkanJaring();
    }

    @Override
    public void makan() {
        super.makan();
    }

    @Override
    public void memanjat() {
        System.out.println(this.namaOrang + " memanjat gedung.");
    }

    @Override
    public void melompat() {
        System.out.println(this.namaOrang + " melompati 2 gedung.");
    }

    @Override
    public void bekerja() {
        System.out.println(this.namaOrang + " bekerja sebagai seorang " + this.pekerjaan + " saat tidak beraksi menjadi Spider-Man.");
    }

    @Override
    public void tidur() {
        System.out.println(this.namaOrang + " sedang tidur di rumah Bibi May.");
    }
}
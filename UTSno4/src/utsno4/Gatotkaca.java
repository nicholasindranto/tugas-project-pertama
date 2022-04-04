package utsno4;

public class Gatotkaca extends Burung implements Manusia, Mesin{
    private String namaOrang;
    private String pekerjaan;

    public Gatotkaca(String namaOrang, String jenis, String pekerjaan) {
        super(namaOrang, jenis);
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
        System.out.println(this.namaOrang + " berubah menjadi Gatotkaca.");
    }

    @Override
    public void makan() {
        super.makan();
    }

    @Override
    public void memproduksi() {
        System.out.println(this.namaOrang + " memproduksi mebel.");
    }

    @Override
    public void istirahat() {
        System.out.println(this.namaOrang + " sedang beristirahat");
    }

    @Override
    public void bekerja() {
        System.out.println(this.namaOrang + " bekerja sebagai seorang " + this.pekerjaan + " saat tidak beraksi menjadi Gatotkaca.");
    }

    @Override
    public void tidur() {
        System.out.println(this.namaOrang + " sedang tidur di rumahnya.");
    }
}
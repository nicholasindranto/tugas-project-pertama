package utsno4;

public abstract class Hewan {
    String namaHewan;
    String spesies;

    public Hewan(String namaHewan, String spesies) {
        this.namaHewan = namaHewan;
        this.spesies = spesies;
    }

    public void makan(){
        System.out.println("Hewan dengan nama " + this.namaHewan + " dengan spesies " + this.spesies + " sedang makan.");
    }
}
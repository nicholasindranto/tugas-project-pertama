package utsno4;

public class LabaLaba extends Hewan{
    public LabaLaba(String namaHewan, String spesies) {
        super(namaHewan, spesies);
    }

    public void berburu(){
        System.out.println("Hewan bernama " + this.namaHewan + " dengan spesies " + super.spesies + " sedang berburu.");
    }

    public void berburu(String racun){
        System.out.println("Hewan bernama " + this.namaHewan + " dengan spesies " + super.spesies + " mati terkena racun " + racun + ".");
    }

    public void mengeluarkanJaring(){
        System.out.println("Hewan bernama " + this.namaHewan + " dengan spesies " + super.spesies + " mengeluarkan jaring.");
    }
}
package pkg21523281;

public class Data {
    private int bilangan1;
    private int bilangan2;
    private double hasil;
    private String operasi ;
    private String tampilanStr;

    public Data(){
        this.hasil = 0;
        this.bilangan1 = 0;
        this.bilangan2 = 0;
        this.operasi = "";
        this.tampilanStr = "";
    }

    public String getTampilanStr() {
        return tampilanStr;
    }

    public void tambahStr (String string) {
        this.tampilanStr = this.tampilanStr +  string ;
    }

    public void setTampilanStr(String tampilanStr) {
        this.tampilanStr = tampilanStr;
    }

    public void setHasil(int hasil) {
        this.hasil = hasil;
    }

    public String getOperasi() {
        return this.operasi;
    }

    public void setOperasi(String operasi) {
        this.operasi = operasi;
    }

    public void setBilangan1 (int bil){
        this.bilangan1 = bil;
    }

    public void setBilangan2 (int bil){
        this.bilangan2 = bil;
    }

    public int getBilangan1(){
        return this.bilangan1;
    }

    public int getBilangan2(){
        return this.bilangan2;
    }
    public double getHasil(){
        return hasil;
    }

    public void Penjumlahan(){
        this.hasil = this.bilangan1 + this.bilangan2;
    }

    public void Pengurangan(){
        this.hasil = this.bilangan1 - this.bilangan2;
    }

    public void Perkalian() {
        this.hasil = this.bilangan1 * this.bilangan2;
    }

    public void Pembagian() {
        this.hasil = (double) this.bilangan1 / this.bilangan2;
    }
}

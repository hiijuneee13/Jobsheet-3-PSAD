import java.util.Scanner;
public class MataKuliah25 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah25(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks =  sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kode Matakuliah  : ");
        kode = sc.nextLine();
        System.out.print("Nama Matakuliah  : ");
        nama = sc.nextLine();
        System.out.print("SKS              : ");
        sks = sc.nextInt();
        System.out.print("Jumlah Jam       : ");
        jumlahJam = sc.nextInt();
    }
}
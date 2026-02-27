import java.util.Scanner;

public class MahasiswaDemo25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Mahasiswa25[] arrayofMahasiswa25 = new Mahasiswa25[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayofMahasiswa25[i] = new Mahasiswa25();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");
            arrayofMahasiswa25[i].nim = sc.nextLine();
            System.out.print("Nama    : ");
            arrayofMahasiswa25[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayofMahasiswa25[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            dummy = sc.nextLine();
            arrayofMahasiswa25[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayofMahasiswa25[i].cetakInfo();
            System.out.println("------------------------------");
        }
    }
}
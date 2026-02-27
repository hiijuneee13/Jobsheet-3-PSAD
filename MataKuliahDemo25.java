import java.util.Scanner;

public class MataKuliahDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah Matakuliah: ");
        int jumlah = sc.nextInt();

        MataKuliah25[] arrayMataKuliah25 = new MataKuliah25[jumlah];

        for (int i = 0; i < arrayMataKuliah25.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));

            arrayMataKuliah25[i] = new MataKuliah25 ("", "", 0, 0);
            arrayMataKuliah25[i].tambahData();
            System.out.println("--------------------------");
        }

        System.out.println("\nDATA MATA KULIAH");
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayMataKuliah25[i].cetakInfo();
            System.out.println("---------------------------");
        }
    }
}
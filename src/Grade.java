import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat, fzk, tr, kmy, mzk;
        int ders = 5;
        double ort;

        System.out.print("Lutfen Matematik Notunuzu Giriniz : ");
        mat = input.nextInt();
        System.out.print("Lutfen Fizik Notunuzu Giriniz : ");
        fzk = input.nextInt();
        System.out.print("Lutfen Turkce Notunuzu Giriniz : ");
        tr = input.nextInt();
        System.out.print("Lutfen Kimya Notunuzu Giriniz : ");
        kmy = input.nextInt();
        System.out.print("Lutfen Muzik Notunuzu Giriniz : ");
        mzk = input.nextInt();

        if (mat < 0 || mat > 100) {
            mat = 0;
            ders -= 1;
            System.out.println("Matematik Notunuz Belirtilen Degerler Arasinda Olmadigi icin Ortalamaya Katilmamistir ! ");
        }

        if (fzk < 0 || fzk > 100) {
            fzk = 0;
            ders -= 1;
            System.out.println("Fizik Notunuz Belirtilen Degerler Arasinda Olmadigi icin Ortalamaya Katilmamistir ! ");
        }

        if (tr < 0 || tr > 100) {
            tr = 0;
            ders -= 1;
            System.out.println("Turkce Notunuz Belirtilen Degerler Arasinda Olmadigi icin Ortalamaya Katilmamistir ! ");
        }

        if (kmy < 0 || kmy > 100) {
            kmy = 0;
            ders -= 1;
            System.out.println("Kimya Notunuz Belirtilen Degerler Arasinda Olmadigi icin Ortalamaya Katilmamistir ! ");
        }

        if (mzk < 0 || mzk > 100) {
            mzk = 0;
            ders -= 1;
            System.out.println("Muzik Notunuz Belirtilen Degerler Arasinda Olmadigi icin Ortalamaya Katilmamistir ! ");
        }

        ort = (mat + fzk + tr + kmy + mzk) / ders;

        if (ort < 55) {
            System.out.println("Sinifta Kaldiniz :( ");
            System.out.print("Ortalamaniz : " + ort);
        } else {
            System.out.println("Tebrikler Sinifi Gectiniz ! ");
            System.out.print("Ortalamaniz : " + ort);
        }
    }
}

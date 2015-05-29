
import java.util.Scanner;

 // Author Yusuf Yoga Adiutama (139)
public class utama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RuangKelas kelas;
        RuangDosen dosen; 
        int pilihan;
        
        System.out.println("Masukan Pilihan :: \n1. Ruang Kelas \n2. Ruang Dosen");
        pilihan = sc.nextInt();
        
        if(pilihan == 1){
            kelas = new RuangKelas();
            kelas.identitas();
            kelas.kondisi();
            kelas.sarana();
            kelas.kebersihan();
            kelas.kenyamanan();
            kelas.Lingkungan();
            kelas.keamanan();
            kelas.analisisruangkelas();
            kelas.analisisKelistrikan();
            kelas.analisisLCD();
            kelas.analisisLampu();
            kelas.analisisKipasAngin();
            kelas.analisisAC();
            kelas.analisisInternet();
            kelas.analisisCCTV();
            kelas.analisisjendelapintu();
            kelas.analisiskekokohan(); 
            kelas.analisispintu(); 
            kelas.analisisjendela(); 
            kelas.analisiskeamanan(); 
            kelas.analisissirkulasi();
            kelas.analisispencahayaan(); 
            kelas.analisiskelembapan(); 
            kelas.analisissuhu(); 
            kelas.analisiskebisingan(); 
            kelas.analisisbau(); 
            kelas.analisiskebocoran(); 
            kelas.analisiskerusakan(); 
            kelas.analisiskeausan(); 
            kelas.analisislingkungan(); 
        }else{
            dosen = new RuangDosen();
            dosen.kondisi();
            dosen.sarana();
            dosen.kebersihan();
            dosen.kenyamanan();
            dosen.Lingkungan();
            dosen.keamanan();
            dosen.analisisruangkelas();
            dosen.analisisKelistrikan();
            dosen.analisisLCD();
            dosen.analisisLampu();
            dosen.analisisKipasAngin();
            dosen.analisisAC();
            dosen.analisisInternet();
            dosen.analisisCCTV();
            dosen.analisisjendelapintu();
            dosen.analisiskekokohan(); 
            dosen.analisispintu(); 
            dosen.analisisjendela(); 
            dosen.analisiskeamanan(); 
            dosen.analisissirkulasi();
            dosen.analisispencahayaan(); 
            dosen.analisiskelembapan(); 
            dosen.analisissuhu(); 
            dosen.analisiskebisingan(); 
            dosen.analisisbau(); 
            dosen.analisiskebocoran(); 
            dosen.analisiskerusakan(); 
            dosen.analisiskeausan(); 
            dosen.analisislingkungan(); 
        }
        
        
    }
}

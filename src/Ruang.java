
// @author Wisnu Edo S. (169)
import java.util.Scanner;

// Input, hitung, output di pisah
// untuk method analisis diganti dengan String
// Segera konek github.
public abstract class Ruang  implements View {

    int luas;
    int rasio;
    Enskap a = new Enskap();
    Scanner sc = new Scanner(System.in);

    public void identitas(){}

    abstract String input();
  

    abstract String analisisruangkelas();
    abstract String analisisKelistrikan();
    abstract String analisisLCD();
    abstract String analisisLampu();
        
    abstract String analisisKipasAngin();
        
        
    abstract String analisisAC();
        
        abstract String analisisInternet();
        
        abstract String analisisCCTV();
        
    abstract String analisisjendelapintu();
    

    abstract String analisiskekokohan(); 

    abstract String analisispintu(); 

    abstract String analisisjendela(); 

    abstract String analisiskeamanan(); 

    abstract String analisissirkulasi();

    abstract String analisispencahayaan(); 

    abstract String analisiskelembapan(); 

    abstract String analisissuhu(); 

    abstract String analisiskebisingan(); 

    abstract String analisisbau(); 

    abstract String analisiskebocoran(); 

    abstract String analisiskerusakan(); 

    abstract String analisiskeausan(); 

    abstract String analisislingkungan(); 

 

}

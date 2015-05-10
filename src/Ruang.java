
import java.util.Scanner;

// Input, hitung, output di pisah
// untuk method analisis diganti dengan String
// Segera konek github.
public class Ruang {

    int luas;
    int rasio;
    Enskap a = new Enskap();
    Scanner sc = new Scanner(System.in);

    public void identitas() {

        System.out.println("Masukan Nama Ruang : ");
        a.setRuang(sc.nextLine());
        System.out.println("Masukan Lokasi Ruang : ");
        a.setLokasi(sc.nextLine());
        System.out.println("");//untuk inputan fakultas dan prodi

    }

    String input() {
        //ukuran dan bentuk ruang
        System.out.println("Masukan Panjang Ruang : ");
        a.setPanjang_ruang(sc.nextInt());
        System.out.println("Masukan Lebar Ruang : ");
        a.setLebar_ruang(sc.nextInt());
        hitungluas();

        //rasio
        System.out.println("Masukan Jumlah Kursi :: ");
        a.setJml_kursi(sc.nextInt());
        hitungrasio();

        //sarana
        System.out.println("Masukkan Jumlah Stopkontak/Steker : ");
        a.setJml_stek(sc.nextInt());
        System.out.println("Masukkan Kondisi Stopkontak/Steker : ");
        a.setKond_stek(sc.nextLine());
        System.out.println("Masukkan Posisi Stopkontak/Steker : ");
        a.setPos_stek(sc.nextLine());
        System.out.println("Masukkan Jumlah Kabel LCD :");
        a.setJml_klcd(sc.nextInt());
        System.out.println("Masukkan Kondisi kabel LCD : ");
        a.setKond_klcd(sc.nextLine());
        System.out.println("Masukkan Posisi kabel LCD : ");
        a.setPos_klcd(sc.nextLine());
        System.out.println("Masukkan Jumlah Lampu : ");
        a.setJml_lamp(sc.nextInt());
        System.out.println("Masukkan Kondisi Lampu : ");
        a.setKond_lamp(sc.nextLine());
        System.out.println("Masukkan Posisi Lampu : ");
        a.setPos_lamp(sc.nextLine());
        System.out.println("Masukkan Jumlah Kipas Angin : ");
        a.setJml_kipas(sc.nextInt());
        System.out.println("Masukkan Kondisi Kipas Angin : ");
        a.setKond_kipas(sc.nextLine());
        System.out.println("Masukkan Posisi Kipas Angin : ");
        a.setPos_kipas(sc.nextLine());
        System.out.println("Masukkan Jumlah AC : ");
        a.setAc(sc.nextInt());
        System.out.println("Masukkan Kondisi AC : ");
        a.setKond_ac(sc.nextLine());
        System.out.println("Masukkan Posisi AC : ");
        a.setPos_ac(sc.nextLine());
        System.out.println("Pilih SSID : ");
        a.setSSID(sc.nextLine());
        System.out.println("Masukkan Bandwidth : ");
        a.setBw(sc.nextLine());
        System.out.println("Masukkan Jumlah CCTV : ");
        a.setCctv(sc.nextInt());
        System.out.println("Masukkan Kondisi CCTV : ");
        a.setKond_cctv(sc.nextLine());
        System.out.println("Masukkan Posisi CCTV : ");
        a.setPos_cctv(sc.nextLine());

        //analisis pintu dan jendela
        System.out.println("Masukan Jumlah pintu :: ");
        a.setJml_pintu(sc.nextInt());
        System.out.println("Masukan Jumlah Jendela :: ");
        a.setJml_jendela(sc.nextInt());

        System.out.println("Masukkan kondisi sirkulasi udara (lancar/tidak) : ");
        a.setUdara(sc.nextLine());
        System.out.println("Masukkan nilai pencahayaan : ");
        a.setCahaya(sc.nextInt());
        System.out.println("Masukkan nilai kelembaban  : ");
        a.setLembab(sc.nextInt());
        System.out.println("Masukkan nilai suhu (celcius) : ");
        a.setSuhu(sc.nextInt());

        //kenyamanan
        System.out.println("Masukkan kondisi kebisingan (bising/tidak) : ");
        a.setBising(sc.nextLine());
        System.out.println("Masukkan kondisi bau (bau/tidak) : ");
        a.setBau(sc.nextLine());
        System.out.println("Masukkan kondisi kebocoran (bocor/tidak) : ");
        a.setBocor(sc.nextLine());
        System.out.println("Masukkan kondisi kerusakan (rusak/tidak) : ");
        a.setRusak(sc.nextLine());
        System.out.println("Masukkan kondisi keausan(aus/tidak) : ");
        a.setAus(sc.nextLine());

        //Lingkungan
        System.out.println("Masukkan kondisi lantai : ");
        a.setLantai(sc.nextLine());
        System.out.println("Masukkan kondisi dinding : ");
        a.setDinding(sc.nextLine());
        System.out.println("Masukkan kondisi atap : ");
        a.setAtap(sc.nextLine());
        System.out.println("Masukkan kondisi pintu : ");
        a.setPintu(sc.nextLine());
        System.out.println("Masukkan kondisi jendela : ");
        a.setJendela(sc.nextLine());
        return null;

    }

    int hitungrasio() {
        rasio = luas / a.getJml_kursi();
        return 0;
    }

    int hitungluas() {
        luas = a.getPanjang_ruang() * a.getLebar_ruang();
        return 0;
    }

    //ukuran dan bentuk ruang
    String analisisruangkelas() {
        System.out.println("Luas = " + luas);
        if (a.getPanjang_ruang() != luas) {
            System.out.println("Ruang Kelas Adalah Persegi Panjang\n");
            System.out.println("Ruang Kelas Sesuai !");
        } else {
            System.out.println("Ruang Kelas Adalah Persegi");
            System.out.println("Ruang Kelas Tidak Sesuai !");
        }

        System.out.println("Rasio : " + rasio);
        if (rasio >= 0.5) {
            System.out.println("sesuai ");
        } else {
            System.out.println("tidak sesuai");
        }
        return null;
    }

    /*
     if (a.getJml_stek() >=4 ) {
     System.out.println("Jumlah Steker : Sesuai");
     } else {
     System.out.println("Jumlah Steker : Tidak Sesuai");
     }
     if (a.getKond_stek().equalsIgnoreCase("Sesuai")) {
     System.out.println("Kondisi Steker : Sesuai");
     } else {
     System.out.println("Kondisi Steker : Tidak Sesuai");
     }
     if (a.getPos_stek().equals("Dekat Dosen") && a.getPos_stek().equals("Dipojok Ruang")){ 
     System.out.println("Posisi Steker : Sesuai");
     } else {
     System.out.println("Posisi Steker : Tidak Sesuai");
     }
     if (a.getJml_klcd() >= 1) {
     System.out.println("Jumlah kabel LCD : Sesuai");
     } else {
     System.out.println("Jumlah kabel LCD : Tidak Sesuai");
     }
     if (a.getKond_klcd().equals("Berfungsi")){
     System.out.println("Kondisi Kabel LCD : Sesuai");
     }else{
     System.out.println("Kondisi Kabel LCD : Tidak Sesuai");
     }
     if (a.getPos_klcd().equals("Dekat Dosen")){
     System.out.println("Posisi Kabel LCD : Sesuai");
     }else{
     System.out.println("Posisi Kabel LCD : Tidak Sesuai");
     }
     if(a.getJml_lamp() >= 18 ){
     System.out.println("Jumlah Lampu : Sesuai");
     }else{
     System.out.println("Jumlah Lampu : Tidak Sesuai");
     }
     if(a.getKond_lamp().equals("18") ){
     System.out.println("Kondisi Lampu : Baik");
     }else{
     System.out.println("Kondisi Lampu : Tidak Baik");
     }
     if(a.getPos_lamp().equals("Atap Ruangan")){
     System.out.println("Posisi Lampu : Sesuai");
     }else{
     System.out.println("Posisi Lampu : Tidak Sesuai");
     }
     if(a.getJml_kipas() >= 2){
     System.out.println("Jumlah Kipas Angin : Sesuai");
     }else{
     System.out.println("Jumlah Kipas Angin : Tidak Sesuai");
     }
     if(a.getKond_kipas().equals("2")){
     System.out.println("Kondisi Kipas Angin : Baik");
     }else{
     System.out.println("Kondisi Kipas Angin : Tidak Baik");
     }
     if(a.getPos_kipas().equals("Atap Ruangan")){
     System.out.println("Posisi Kipas Angin : Sesuai");
     }else{
     System.out.println("Posisi Kipas Angin : Tidak Sesuai");
     }
     if(a.getAc() >= 1){
     System.out.println("Jumlah AC : Sesuai");
     }else{
     System.out.println("Jumlah AC : Tidak Sesuai");
     }
     if(a.getKond_ac().equals("Baik")){
     System.out.println("Kondisi AC : Sesuai");
     }else{
     System.out.println("Kondisi AC : Tidak Sesuai");
     }
     if(a.getPos_ac().equals("Dibelakang/Disamping")){
     System.out.println("Posisi AC : Sesuai");
     }else{
     System.out.println("Posisi AC : Tidak Sesuai");
     }
     if(a.getSSID().equals("UMM Hotspot")){
     System.out.println("SSID : Sesuai");
     }else{
     System.out.println("SSID : Tidak Sesuai");
     }
     if(a.getBw().equals("Bisa Login")){
     System.out.println("Bandwidth  : Sesuai");
     }else{
     System.out.println("Bandwidth : Tidak Sesuai");
     }
     if(a.getCctv()== 2){
     System.out.println("Jumlah CCTV : Sesuai");
     }else{
     System.out.println("Julah CCTV : Tidak Sesuai");
     }
     if(a.getKond_cctv().equals("2")){
     System.out.println("Kondisi CCTV : Sesuai");
     }else{
     System.out.println("Kondisi CCTV : Tidak Sesuai");
     }
     if(a.getPos_cctv().equalsIgnoreCase("Depan")&&a.getPos_cctv().equalsIgnoreCase("Belakang")){
     System.out.println("Posisi CCTV : Sesuai");
     }else{
     System.out.println("Posisi CCTV : Tidak Sesuai");
     }
     */
    String analisisjendelapintu() {
        if (a.getJml_pintu() >= 2 && a.getJml_jendela() >= 2) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak Sesuai");
        }
        return null;
    }

    String analisiskekokohan() {
        if (a.getKokoh().equalsIgnoreCase("kokoh")) {
            System.out.println("sesuai");
        } else {
            System.out.println("tidak sesuai");
        }
        return null;
    }

    String analisispintu() {
        if (a.getKnc_pintu().equalsIgnoreCase("ada")) {
            System.out.println("sesuai");
        } else {
            System.out.println("tidak sesuai");
        }
        return null;
    }

    String analisisjendela() {
        if (a.getKnc_jendela().equalsIgnoreCase("ada")) {
            System.out.println("sesuai");
        } else {
            System.out.println("tidak sesuai");
        }
        return null;
    }

    String analisiskeamanan() {
        if (a.getBahaya().equalsIgnoreCase("aman")) {
            System.out.println("sesuai");
        } else {
            System.out.println("tidak sesuai");
        }
        return null;
    }

    String analisissirkulasi() {
        if (a.getUdara().equalsIgnoreCase("lancar")) {
            System.out.println("Kondisi udara : Sesuai");
        } else {
            System.out.println("Kondisi udara : Tidak Sesuai");
        }
        return null;
    }

    String analisispencahayaan() {
        if (a.getCahaya() >= 250 && a.getCahaya() <= 350) {
            System.out.println("Kondisi cahaya : Sesuai");
        } else {
            System.out.println("Kondisi cahaya : Tidak Sesuai");
        }
        return null;
    }

    String analisiskelembapan() {
        if (a.getLembab() >= 70 && a.getLembab() <= 80) {
            System.out.println("Kondisi kelembaban  : Sesuai");
        } else {
            System.out.println("Kondisi kelembaban : Tidak Sesuai");
        }
        return null;
    }

    String analisissuhu() {
        if (a.getSuhu() >= 25 && a.getSuhu() <= 35) {
            System.out.println("Kondisi suhu : Sesuai");
        } else {
            System.out.println("Kondisi suhu : Tidak Sesuai");
        }
        return null;
    }

    String analisiskebisingan() {
        if (a.getBising().equalsIgnoreCase("tidak")) {
            System.out.println("Kondisi kebisingan : Sesuai");
        } else {
            System.out.println("Kondisi kebisingan : Tidak Sesuai");
        }
        return null;
    }

    String analisisbau() {
        if (a.getBau().equalsIgnoreCase("tidak")) {
            System.out.println("Kondisi bau : Sesuai");
        } else {
            System.out.println("Kondisi bau : Tidak Sesuai");
        }
        return null;
    }

    String analisiskebocoran() {
        if (a.getBocor().equalsIgnoreCase("tidak")) {
            System.out.println("Kondisi kebocoran : Sesuai");
        } else {
            System.out.println("Kondisi kebocoran : Tidak Sesuai");
        }
        return null;
    }

    String analisiskerusakan() {
        if (a.getRusak().equalsIgnoreCase("tidak")) {
            System.out.println("Kondisi kerusakan : Sesuai");
        } else {
            System.out.println("Kondisi kerusakan : Tidak Sesuai");
        }
        return null;
    }

    String analisiskeausan() {
        if (a.getAus().equalsIgnoreCase("tidak")) {
            System.out.println("Kondisi keausan : Sesuai");
        } else {
            System.out.println("Kondisi keasusan : Tidak Sesuai");
        }
        return null;
    }

    String analisislingkungan() {
        if (a.getLantai().equalsIgnoreCase("bersih")) {
            System.out.println("Kondisi lantai : Sesuai");
        } else {
            System.out.println("Kondisi lantai : Tidak Sesuai");
        }
        if (a.getDinding().equalsIgnoreCase("bersih")) {
            System.out.println("Kondisi dinding : Sesuai");
        } else {
            System.out.println("Kondisi dinding : Tidak Sesuai");
        }
        if (a.getAtap().equalsIgnoreCase("bersih")) {
            System.out.println("Kondisi atap : Sesuai");
        } else {
            System.out.println("Kondisi atap : Tidak Sesuai");
        }
        if (a.getPintu().equalsIgnoreCase("bersih")) {
            System.out.println("Kondisi pintu : Sesuai");
        } else {
            System.out.println("Kondisi pintu : Tidak Sesuai");
        }
        if (a.getJendela().equalsIgnoreCase("bersih")) {
            System.out.println("Kondisi jendela : Sesuai");
        } else {
            System.out.println("Kondisi jendela : Tidak Sesuai");
        }
        return null;
    }

    String listinputan() {
        //list inputan identitas ruang
        System.out.println("Nama ruang : " + a.getRuang());
        System.out.println("Lokasi ruang : " + a.getLokasi());
        //list inputan kondisi ruang kelas
        System.out.println("Panjang ruang : " + a.getPanjang_ruang());
        System.out.println("Lebar ruang : " + a.getLebar_ruang());
        System.out.println("Jumlah kursi : " + a.getJml_kursi());
        System.out.println("Jumlah pintu : " + a.getJml_pintu());
        System.out.println("Jumlah Jendela : " + a.getJml_jendela());
        //list inputan lingkungan ruang kelas
        System.out.println("Kondisi lantai : " + a.getLantai());
        System.out.println("Kondisi dinding : " + a.getDinding());
        System.out.println("Kondisi atap :  " + a.getAtap());
        System.out.println("Kondisi pintu : " + a.getPintu());
        System.out.println("Kondisi jendela : " + a.getJendela());
        //list inputan kebersihan lingkungan kelas
        System.out.println("Kondisi sirkulasi udara : " + a.getUdara());
        System.out.println("Kondisi pencahayaan : " + a.getCahaya());
        System.out.println("Kondisi kelembapan(%) : " + a.getLembab());
        System.out.println("Kondisi suhu (celcius) : " + a.getSuhu());
        //list inputan kenyamanan ruang kelas
        System.out.println("Kondisi kebisingan : " + a.getBising());
        System.out.println("Kondisi bau : " + a.getBau());
        System.out.println("Kondisi kebocoran : " + a.getBocor());
        System.out.println("Kondisi kerusakan : " + a.getRusak());
        System.out.println("Kondisi keausan : " + a.getAus());
        //list inputan keamanan ruang kelas 
        System.out.println("Kondisi kekokohan : " + a.getKokoh());
        System.out.println("Kondisi kunci jendela : " + a.getKnc_jendela());
        System.out.println("Kondisi kunci pintu : " + a.getKnc_pintu());
        System.out.println("Kondisi bahaya : " + a.getBahaya());
        return null;
    }
}

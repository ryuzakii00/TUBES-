
public class utama {

    public static void main(String[] args) {
        Ruang x = new Ruang();

        x.identitas();

        x.input();
        x.analisis();
        x.output();

        RuangDosen y = new RuangDosen();
        y.ident();
        y.input();
        y.analisis();
        y.output();
    }
}

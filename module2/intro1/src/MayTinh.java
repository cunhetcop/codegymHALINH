public class MayTinh {
    String mau;
    String hang;
    int gia;

    public MayTinh ( String mau, String hang, int gia){
        this.mau = mau;
        this.hang = hang;
        this.gia = gia;
    }

    public void xemphim(){
        System.out.println("anh ý đang học tại codegym");
    }
}

class runMayTinh{
    public static void main(String[] args) {
        MayTinh anhLinhdeptrai = new MayTinh("hồng", "Apple",3000);
        System.out.println("Máy tính của anh Linh: " + "\n"
                + " - " + "màu " + anhLinhdeptrai.mau + "\n"
                + " - " + "hãng " + anhLinhdeptrai.hang + "\n"
                + " - " + "giá " + anhLinhdeptrai.gia + "\n");
        anhLinhdeptrai.xemphim();
    }

}
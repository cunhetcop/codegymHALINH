package TinhToan;

class CongHaiSoPhuc {
    //cho phần thực và phần ảo của số phức
    double real, img;

    //Hàm tạo của lớp này được sử dụng để khởi tạo các số phức.
    //constructor để khởi tạo số phức
    CongHaiSoPhuc(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public static CongHaiSoPhuc sum(CongHaiSoPhuc c1, CongHaiSoPhuc c2) {
        //tạo một số phức tạm thời để giữ tổng của hai số
        CongHaiSoPhuc temp = new CongHaiSoPhuc(0, 0);

        temp.real = c1.real + c2.real;//cộng các phần thực
        temp.img = c1.img + c2.img;//cộng các phần ảo

        //trả về số phức đầu ra
        return temp;
    }

    public static void main(String[] args) {
        CongHaiSoPhuc c1= new CongHaiSoPhuc(6.1,0.4); //nhập vào phần thực và phần ảo của số phức
        CongHaiSoPhuc c2= new CongHaiSoPhuc(29.6, 0.1); //nhập vào phần thực và phần ảo của số thức
        CongHaiSoPhuc temp= sum(c1,c2);
        System.out.println("Kết quả là: " +temp.real+"+"+temp.img +"i");
    }
}
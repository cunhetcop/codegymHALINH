package TinhToan;

class TinhLaiSuatKep {
    public void calculate(int tienGoc, int thoiGian, double laiXuatHangNam, int soLanLaiKep) {
        double soLuongLai = tienGoc * Math.pow(1 + (laiXuatHangNam / soLanLaiKep), soLanLaiKep * thoiGian);
        double tienLai = soLuongLai - tienGoc;
        System.out.println("Lãi kép sau " + thoiGian + "năm là: " + tienLai);
        System.out.println("Số tiền có được sau " + thoiGian + "năm là: " + tienLai);
    }

    public static void main(String[] args) {
        TinhLaiSuatKep obj = new TinhLaiSuatKep();
        obj.calculate(20000, 5, 0.8, 12);
    }
}
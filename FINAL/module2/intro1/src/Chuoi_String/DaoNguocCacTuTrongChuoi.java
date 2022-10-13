package Chuoi_String;

public class DaoNguocCacTuTrongChuoi {
    public void daoNguocTuNguTrongChuoiCuaToi(String str) {
        String[] cacTuNgu = str.split(" ");
        StringBuilder chuoiDaoNguoc = new StringBuilder();
        for (String tuNgu : cacTuNgu) {
            StringBuilder daoNguocTuNgu = new StringBuilder();
            for (int j = tuNgu.length() - 1; j >= 0; j--) {
                daoNguocTuNgu.append(tuNgu.charAt(j));
            }
            chuoiDaoNguoc.append(daoNguocTuNgu).append(" ");
        }
        System.out.println(str);
        System.out.println(chuoiDaoNguoc);
    }

    public static void main(String[] args) {
        DaoNguocCacTuTrongChuoi obj = new DaoNguocCacTuTrongChuoi();
        obj.daoNguocTuNguTrongChuoiCuaToi("HELLO WOLRD !!");
        obj.daoNguocTuNguTrongChuoiCuaToi("CHAO CAC BAN !!");
    }
}


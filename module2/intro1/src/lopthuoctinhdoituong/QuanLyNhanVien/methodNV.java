package lopthuoctinhdoituong.QuanLyNhanVien;


import java.util.Scanner;

public class methodNV {
    NhanVien[] nhanvienArr = new NhanVien[]{};
    Scanner scanner = new Scanner(System.in);

    public NhanVien createNhanVien() {
        String nhapVao;
        do {
            System.out.println("Nhập id nhân viên: ");
            nhapVao = scanner.nextLine();
        }while (kiemtraso(nhapVao) == false);
        int id = Integer.parseInt(nhapVao);

        System.out.println("Nhập name nhân viên: ");
        String name = scanner.nextLine();

        do {
            System.out.println("Nhập tuổi nhân viên: ");
            nhapVao = scanner.nextLine();
        }while (kiemtraso(nhapVao) == false);
        int age = Integer.parseInt(nhapVao);

        System.out.println("Nhập dịa chỉ nhân viên: ");
        String address = scanner.nextLine();
        NhanVien nv = new NhanVien(id, name, age, address);
        return nv;
    }

    public boolean kiemtraso(String str){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < '0' || str.charAt(i)>'9'){
                    return false;
            }
        }
        return true;
    }

    public void showNV(){
        for (int i = 0; i < nhanvienArr.length; i++) {
            System.out.println(nhanvienArr[i].toString());
        }
    }

    public void createNV(){
        NhanVien nv = createNhanVien();
        NhanVien[] nhanvienArrnew = new NhanVien[ nhanvienArr.length + 1];
        for(int i = 0; i < nhanvienArr.length; ++i) {
            nhanvienArrnew[i] = nhanvienArr[i];
        }
        nhanvienArrnew[nhanvienArrnew.length - 1] = nv;
        nhanvienArr = nhanvienArrnew;
    }
    public void changeNV(){
        System.out.println("Nhập vị trí index của nhân viên muốn sửa: ");
        int index = Integer.parseInt(scanner.nextLine());
        NhanVien nv = createNhanVien();
        nhanvienArr[index] = nv;
    }

    public  void deleteNV(){
        System.out.println("Nhập vị trí index của nhân viên muốn xóa: ");
        int index = Integer.parseInt(scanner.nextLine());
        NhanVien[] nhanvienArrnew = new NhanVien[ nhanvienArr.length -1];
        for (int i = 0; i < nhanvienArrnew.length; i++) {
            if(i<index){
                nhanvienArrnew[i] = nhanvienArr[i];
            }
            else {
                nhanvienArrnew[i] = nhanvienArr[i + 1];
            }
        }
        nhanvienArr = nhanvienArrnew;
    }

    public void searchNV(){
        System.out.println("Nhập id nhân viên muốn tìm kiếm: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < nhanvienArr.length; i++) {
            if(nhanvienArr[i].getId() == id){
                System.out.println(nhanvienArr[i].toString());
            }
        }
    }
}

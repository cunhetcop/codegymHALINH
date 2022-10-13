package GIT.QuanLyPhuongTien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLy {
    ArrayList<PhuongTien> ListPhuongTien = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    void addList(){
        int choice;
        do{
            System.out.println("\n==============================");
            System.out.println("========Chọn phương tiện=======");
            System.out.println("1: Oto.");
            System.out.println("2: Xe máy.");
            System.out.println("3: Xe tải.");
            System.out.println("==============================");
            System.out.print("Nhập số:........");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    Oto oto = new Oto();
                    oto.nhap();
                    ListPhuongTien.add(oto);
                    break;
                case 2:
                    XeMay xeMay = new XeMay();
                    xeMay.nhap();
                    ListPhuongTien.add(xeMay);
                    break;
                case 3:
                    XeTai xeTai = new XeTai();
                    xeTai.nhap();
                    ListPhuongTien.add(xeTai);
                    break;
            }

            System.out.println("Bạn có muốn nhập tiếp không? Y/N");

        }while (scanner.nextLine().equalsIgnoreCase("y"));
    }

    void  inDs(){
        for (PhuongTien x : ListPhuongTien) {
            x.xuat();
        }
    }

    void xoa(){
        int nhapID;
        int i=0;
        int check = 0;
        System.out.println("Nhập id muốn xóa.");
        nhapID = Integer.parseInt(scanner.nextLine());
        while (i<ListPhuongTien.size()){
            if(ListPhuongTien.get(i).getId() == nhapID){
                ListPhuongTien.remove(i);
                check = 1;
                break;
            }
            i++;
        }

        if (check == 1){
            System.out.println("Danh sách sau khi xóa: ");
            this.inDs();
        }else {
            System.out.println("Không tồn tại id này.");
        }
    }
    void sua(){
        int nhapID;
        int i=0;
        System.out.println("Nhập id cần sửa:");
        nhapID = Integer.parseInt(scanner.nextLine());
        while (i<ListPhuongTien.size()){
            if(ListPhuongTien.get(i).getId() == nhapID){
                if (ListPhuongTien.get(i) instanceof Oto){
                    ListPhuongTien.get(i).nhap();
                    break;
                }else if (ListPhuongTien.get(i) instanceof  XeMay){
                    ListPhuongTien.get(i).nhap();
                    break;
                }else if (ListPhuongTien.get(i) instanceof XeTai){
                    ListPhuongTien.get(i).nhap();
                    break;
                }else {
                    System.out.println("Không tồn tại");
                    break;
                }
            }
            i++;
        }
    }
    void sapXep() {
        Comparator<PhuongTien> com1 = new Comparator<PhuongTien>() {
            @Override
            public int compare(PhuongTien o1, PhuongTien o2) {
//                if (o1.getId()< o2.getId()){
//                    return -1;
//                } else if (o1.getId() == o2.getId()) {
//                    return 0;
//                }else {
//                    return 1;
//                }
                return o1.getMauXe().compareToIgnoreCase(o2.getMauXe());
            }
        };
        Collections.sort(ListPhuongTien,com1);
        Collections.reverse(ListPhuongTien);
        this.inDs();
    }
    void tim(){
        String namSanXuat;
        String mau;
        int i=0;
        int check = 0;
        System.out.println("Nhập năm sản xuất và màu muốn tìm");
        System.out.println("Năm sản xuất: ");
        namSanXuat = scanner.nextLine();
        System.out.println("Màu: ");
        mau = scanner.nextLine();

        while (i< ListPhuongTien.size()){
            if (ListPhuongTien.get(i).getNamSanXuat().equalsIgnoreCase(namSanXuat) && ListPhuongTien.get(i).getMauXe().equalsIgnoreCase(mau) ){
                check = 1;
                break;
            }
            i++;
        }
        if (check==1){
            ListPhuongTien.get(i).xuat();
        }else {
            System.out.println("Không tồn tại");
        }
    }
    void menu(){
        int choice;
        do {
            System.out.println("==============================");
            System.out.println("1: Thêm phương tiện");
            System.out.println("2: Sửa phương tiện theo id ");
            System.out.println("2: Xóa phương tiện theo id ");
            System.out.println("4: Tìm theo năm sản xuất và màu");
            System.out.println("5: Sắp xếp theo id ");
            System.out.println("6: Xuất danh sách");
            System.out.println("0: Thoát ");
            System.out.println("==============================");
            System.out.print("Bấm số:            ");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    this.addList();
                    break;
                case 2:
                    this.sua();
                    break;
                case 3:
                    this.xoa();
                    break;
                case 4:
                    tim();
                    break;
                case 5:
                    this.sapXep();
                    break;
                case 6:
                    this.inDs();
                    break;
                case 0:
                    System.out.println("cam on");
                    break;
            }
        }while (choice!=0);


    }
}
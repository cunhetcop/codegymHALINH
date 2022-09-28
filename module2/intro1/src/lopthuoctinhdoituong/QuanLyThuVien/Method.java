package lopthuoctinhdoituong.QuanLyThuVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Method {
    ArrayList<TheMuon> ListTheMuon = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void menu() {
        int choice;
        do {
            System.out.println("\n========================================");
            System.out.println("1: Nhập danh sách phiếu mượn: ");
            System.out.println("2: Xuất danh sách: ");
            System.out.println("3: Tên sách mượn cần trả vào cuối tháng và thông tin sinh viên đó: ");
            System.out.println("0: Exit ");
            System.out.println("\n========================================");
            System.out.println("Bấm số để chọn: ");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                NhapPhieu();
                    break;
                case 2:
                inds();
                    break;
                case 3:
                timSach();
                    break;
                case 0:
                    System.out.println("Hẹn gặp lại");
                    break;
            }
        } while (choice != 0);
    }

    void NhapPhieu() {
        do {

            TheMuon theMuon = new TheMuon();
            theMuon.nhapds();
            ListTheMuon.add(theMuon);

            System.out.println("Bạn có muốn nhập tiếp hay không? N/Y");
        }
        while (scanner.nextLine().equalsIgnoreCase("y")) ;

    }
    void inds(){
        for (TheMuon x: ListTheMuon) {
            x.xuatds();
        }
    }

    void timSach(){
        int i=0;
        while (i<ListTheMuon.size()){
            if (ListTheMuon.get(i).getHanTra().equals("30")){
                ListTheMuon.get(i).xuatds();
            }
            i++;
        }
    }
}


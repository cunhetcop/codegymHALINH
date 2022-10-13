package lopthuoctinhdoituong.QuanLySinhVien.manager;

import lopthuoctinhdoituong.QuanLySanPham.io.IOProduct;
import lopthuoctinhdoituong.QuanLySanPham.product.Product;
import lopthuoctinhdoituong.QuanLySinhVien.io.IOsinhvien;
import lopthuoctinhdoituong.QuanLySinhVien.product.SinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Manager {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    Scanner scanner = new Scanner(System.in);
    private ArrayList<SinhVien> sinhViens = new ArrayList<>();

    public void menu() {
        int choice;
        do {
            System.out.println("╔===================================================╗");
            System.out.println("║        ▂ ▃ ▅ ▆ █ QUẢN LÝ SINH VIÊN █ ▆ ▅ ▃ ▂      ║");
            System.out.println("╠===================================================╣");
            System.out.println("║[1]. XEM DANH SÁCH                                 ║");
            System.out.println("║[2]. THÊM                                          ║");
            System.out.println("║[3]. SỬA                                           ║");
            System.out.println("║[4]. XÓA                                           ║");
            System.out.println("║[5]. SĂP XẾP ĐIỂM SINH VIÊN                        ║");
            System.out.println("║[6]. ĐỌC TỪ FILE                                   ║");
            System.out.println("║[7]. GHI VÀO FILE                                  ║");
            System.out.println("║[0]. Thoát                                         ║");
            System.out.println("╚===================================================╝");
            System.out.println("Nhập lựa chọn:");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 0 || choice > 7) {
                    System.out.println();
                    System.out.println("Lựa chọn không tồn tại, mời bạn nhập lại !!!");
                }
                switch (choice) {
                    case 1:
                        this.show();
                        break;
                    case 2:
                        this.add();
                        break;
                    case 3:
                        this.update();
                        break;
                    case 4:
                        this.delete();
                        break;
                    case 5:
                        this.sort();
                        break;
                    case 6:
                        this.ReadFromFile();
                        break;
                    case 7:
                        this.WriteToFile();
                        break;
                    case 0:
                        return;

                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        } while (true);
    }

    public SinhVien createSV() {
        int ID;
        int index;
        while (true) {
            try {
                System.out.println("Nhập id sinh viên :");
                ID = Integer.parseInt(scanner.nextLine());
                index = checkID(ID);
                if (index == -1) {
                    break;
                }

            } catch (Exception e) {
                System.err.println("ID phải là một số nguyên");
                continue;
            }
            System.err.println("ID đã tồn tại!");
        }
        System.out.println("Nhập tên sinh viên: ");
        String name = scanner.nextLine();

        int age;
        while (true) {
            try {
                System.out.println("Nhập tuổi sinh viên :");
                age = Integer.parseInt(scanner.nextLine());
          break;

            } catch (Exception e) {
                System.err.println("Tuổi phải là một số nguyên");
                    continue;
            }
        }
        System.out.println("Nhập giới tính sinh viên: ");
        String gender = scanner.nextLine();

        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        int averagemark;
        while (true) {
            try {
                System.out.println("Nhập điểm trung bình");
                averagemark = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.err.println("Điểm trung bình là số, không được chứa chữ");
                continue;
            }
            break;
        }

        SinhVien sinhvien = new SinhVien(ID, name, age, gender, address, averagemark);
        System.out.println(sinhvien);
        return sinhvien;
    }

    public int checkID(int IDproduct) {
        for (int i = 0; i < sinhViens.size(); i++) {
            if (sinhViens.get(i).getID() == IDproduct) {
                return i;
            }
        }
        return -1;
    }


    public void show(){
        for (int i = 0; i < sinhViens.size(); i++) {
            System.out.println(i+1+"."+sinhViens.get(i).toString());

        }
    }

    public void add() {
        SinhVien sinhVien = createSV();
        sinhViens.add(sinhVien);
    }

    public void update() {
        int ID;
        while (true) {
            try {
                System.out.println("Nhập ID sinh viên muốn sửa: ");
                ID = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.err.println("ID chỉ là số nguyên, không chứa chữ cái");
            }
        }
        for (int i = 0; i < sinhViens.size(); i++) {
            if (sinhViens.get(i).getID() == ID) {
                sinhViens.set(i, createSV());
                System.out.println(ANSI_GREEN);
                System.out.println("Cập nhật thông tin sinh viên thành công!");
                System.out.println(ANSI_RESET);
                return;
            }
        }
        System.err.println("Không tồn tại ID này");
    }

    public void delete() {
        int ID = 0;
        while (true) {
            try {
                System.out.println("Nhập ID sinh viên bạn muốn xóa: ");
                ID = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.err.println("ID chỉ là số nguyên, không chứa chữ cái");
                return;
            }
            break;
        }
        for (int i = 0; i < sinhViens.size(); i++) {
            if (sinhViens.get(i).getID() == ID) {
                sinhViens.remove(i);
                System.out.println(ANSI_GREEN);
                System.out.println("Xóa thành công");
                System.out.println(ANSI_RESET);
                return;
            }
        }
        System.err.println("Không tồn tại ID này");
    }

    public void sort() {
        int choose = 2;
        System.out.println("1. Điểm giảm dần");
        System.out.println("2. Điểm tăng dần");
        System.out.println("Nhập số để lựa chọn: ");
        do {
            if (choose > 2) {
                System.err.println("Chỉ chọn 1 hoặc 2");
            }
            choose = Integer.parseInt(scanner.nextLine());
        } while (choose > 2);

        switch (choose) {
            case 1:
                markMinToMax();
                break;
            case 2:
                markMaxToMin();
                break;
        }
    }

    public void markMinToMax() {
        Comparator<SinhVien> com1 = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getAveragemark() < o2.getAveragemark()) {
                    return -1;
                } else if (o1.getAveragemark() == o2.getAveragemark()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        };
        Collections.sort(sinhViens, com1);
        Collections.reverse(sinhViens);
        this.show();
    }

    public void markMaxToMin() {
        Comparator<SinhVien> com1 = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getAveragemark() > o2.getAveragemark()) {
                    return -1;
                } else if (o1.getAveragemark() == o2.getAveragemark()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        };
        Collections.sort(sinhViens, com1);
        Collections.reverse(sinhViens);
        this.show();
    }

//    public void findTheMostExpensiveSV() {
//        double max = sinhViens.get(0).getID();
//        for (int i = 1; i < sinhViens.size(); i++) {
//            if (max < sinhViens.get(i).getID()) {
//                max = sinhViens.get(i).getID();
//            }
//        }
//        for (SinhVien sinhVien : sinhViens) {
//            if (max == sinhVien.getAveragemark()) {
//                String str = sinhVien.toString();
//                System.out.println(str);
//            }
//        }
//    }


    public void ReadFromFile() {
        sinhViens = IOsinhvien.read();
        System.out.println(ANSI_GREEN);
        System.out.println("Đọc file thành công");
        System.out.println(ANSI_RESET);

    }


    public void WriteToFile() {
        IOsinhvien.write(sinhViens);
        System.out.println(ANSI_GREEN);
        System.out.println("Ghi file thành công");
        System.out.println(ANSI_RESET);
    }
}

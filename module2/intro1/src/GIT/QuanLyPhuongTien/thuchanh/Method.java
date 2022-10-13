package GIT.QuanLyPhuongTien.thuchanh;

import java.util.ArrayList;
import java.util.Scanner;

public class Method {
    ArrayList<Vehicle> VehicleList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void menu(){
        int choice;
        do{
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
                    //thêm
                    this.addList();
                    break;
                case 2:
                    //Sửa
                    this.changeVehicle();
                    break;
                case 3:
                    //Xóa
                    break;
                case 4:
                    //Tìm
                    this.searchVehicle();
                    break;
                case 5:
                    //Sắp xếp
                    break;
                case 6:
                    //Xuất ds
                    this.showVehicle();
                    break;
                case 0:
                    //Thoát
                    System.out.println("Tạm biệt");
                    break;
            }
        } while ( choice != 0);
    }

    public void addList(){
            int choice;
            do {
                System.out.println("================");
                System.out.println("1. Thêm Oto");
                System.out.println("2. Thêm Xe máy");
                System.out.println("3. Thêm Xe tải");
                System.out.println("================");

            choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        Car car = new Car();
                        car.input();
                        VehicleList.add(car);
                        break;
                    case 2:
                        Motor motor = new Motor();
                        motor.input();
                        VehicleList.add(motor);
                        break;
                    case 3:
                        Truck truck = new Truck();
                        truck.input();
                        VehicleList.add(truck);
                        break;
                }
                System.out.println("Tiếp tục thêm phương tiện mới?      Y/N");
            } while (scanner.nextLine().equalsIgnoreCase("y"));
    }

    public void showVehicle(){
//        for (Vehicle x: VehicleList) {
//            x.show();
//        }

        for (int i = 0; i < VehicleList.size(); i++) {
            System.out.println(VehicleList.get(i).show());
        }
    }

    public void changeVehicle(){
        System.out.println("Nhập id của phương tiện muốn sửa");
        int idPT = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < VehicleList.size(); i++) {
            if( VehicleList.get(i).getId() == idPT){
                if(VehicleList.get(i) instanceof Car){
                    VehicleList.get(i).input();
                    break;
                }
                else if (VehicleList.get(i) instanceof Motor) {
                    VehicleList.get(i).input();
                    break;
                }
                else if (VehicleList.get(i) instanceof Truck) {
                    VehicleList.get(i).input();
                    break;
                }
                else {
                    System.out.println("Không tồn tại id này");
                    break;
                }
            }
        }
    }

    public void searchVehicle(){
        boolean check = false;
        int i =0;
        System.out.println("Nhập năm sản xuất của phương tiện muốn tìm ( định dạng dd/mm/yy )");
        String year = scanner.nextLine();
        System.out.println("Nhập màu của phương tiền muốn tìm");
        String color = scanner.nextLine();
        while (i < VehicleList.size()){
            if(VehicleList.get(i).getColor().equalsIgnoreCase(color) && VehicleList.get(i).getYear().equalsIgnoreCase(year)){
                check = true;
                break;
            }
            i++;
        }

        if (check == true){
           VehicleList.get(i).show();
        } else {
            System.out.println("Không tồn tại phương tiện này");
        }
    }


}

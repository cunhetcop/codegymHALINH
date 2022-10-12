package managers;

import IO.ReadAndWrite;
import Validate.ValidateUser;
import models.Cat;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerProduct {
    File fileProduct = new File("/Users/nguyenhalinh/Applications/codegymHALINH/module2/case_study/CaseStudy/src/File_text/product.txt");
    ReadAndWrite<Cat>readAndWrite  = new ReadAndWrite<>();
    ArrayList<Cat> CatList = readAndWrite.read(fileProduct);
    Scanner sc = new Scanner(System.in);

    public void showCat(){
        CatList = readAndWrite.read(fileProduct);
        for (Cat cat : CatList) {
            System.out.println(cat);
        }
    }

    public void add(Cat cat){
        CatList.add(cat);
        readAndWrite.write(fileProduct, CatList);
    }
    public int findIndexById(int id) {
        for (int i = 0; i < CatList.size(); i++) {
            if (CatList.get(i).getIdCat() == id) {
                return i;
            }
        }
        return -1;
    }

    public Cat create() {
        int  idProduct;
        int index;
        while (true) {
            try{
                System.out.println("Nhập id :");
                idProduct = Integer.parseInt(sc.nextLine());
                index = findIndexById( idProduct);
                if (index == -1) {
                    break;
            }

            } catch (Exception e){
                System.out.println("ID phải là một số nguyên");
                continue;
            }
            System.out.println("Nhập trùng id rồi.");
        }

                String nameCaterory =null;
                System.out.println("Nhập name");
                nameCaterory = ValidateUser.name();

        double price;
        while (true) {
            try {
                System.out.println("Nhập price");
                price = Double.parseDouble(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Giá sản phẩm là số, không được chứa chữ");
                continue;
            } break;
        }
        int amount;
        while (true) {
            try {
                System.out.println("Nhập số lượng");
                amount = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Số lượng là số nguyên, không được chứa chữ");
                continue;
            } break;
        }

        System.out.println("nhập mô tả");
        String  describe = sc.nextLine();

        return new Cat(idProduct,nameCaterory,price,amount,describe);
    }

    public void edit() {
        int IDproduct = 0;
        while (true) {
            try {
                System.out.println("Nhập ID sản phẩm bạn muốn sửa: ");
                IDproduct = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.err.println("ID chỉ là số nguyên, không chứa chữ cái");
            }break;
        }
            for (int i = 0; i < CatList.size(); i++) {
                if (i == IDproduct) {
                    CatList.set(i, create());
                }
            }
        System.err.println("Không tồn tại ID này");
        }

    public void deleteProduct(){
        int IDproduct = 0;
        while (true) {
            try {
                System.out.println("Nhập ID sản phẩm bạn muốn xóa: ");
                IDproduct = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.err.println("ID chỉ là số nguyên, không chứa chữ cái");
            }break;
        }
        for (int i = 0; i < CatList.size() ; i++) {
            if (CatList.get(i).getIdCat() == IDproduct){
                CatList.remove(i);
                break;
            }
        } System.err.println("ID không tồn tại");
    }
}

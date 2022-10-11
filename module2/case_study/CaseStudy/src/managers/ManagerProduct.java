package managers;

import IO.ReadAndWrite;
import models.AccountUser;
import models.Cat;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerProduct {
    File file = new File("/Users/nguyenhalinh/Applications/codegymHALINH/module2/case_study/CaseStudy/src/File_text/product.txt");
    ReadAndWrite<Cat>readAndWrite = new ReadAndWrite<>();
    ArrayList<Cat> CatList = readAndWrite.read(file);
    Scanner sc = new Scanner(System.in);

    public void showCat(){
        for (Cat cat : CatList) {
            System.out.println(cat);
        }
    }





    public void add(Cat cat){
        CatList.add(cat);
        readAndWrite.write(file, CatList);
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
            System.out.println("Nhập id :");
            idProduct = Integer.parseInt(sc.nextLine());
            index = findIndexById( idProduct);
            if (index == -1) {
                break;
            }
            System.out.println("Nhập trùng id rồi.");
        }
        System.out.println("Nhập name");
        String  nameCaterory = sc.nextLine();

        System.out.println("Nhập price");
        double price = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số lượng");
        int amount = Integer.parseInt(sc.nextLine());
        System.out.println("nhập mô tả");
        String  describe = sc.nextLine();

        return new Cat(idProduct,nameCaterory,price,amount,describe);
    }

    public void edit() {
        System.out.println("Nhập id :");
        int idProduct= Integer.parseInt(sc.nextLine());
        int index = findIndexById(idProduct);
//        if (index != -1) {
//            products.set(index, create());

//
        for (int i = 0; i < CatList.size() ; i++) {
            if(i == index){
                CatList.set(i, create());
            }

        }
    }
    public void deleteProduct(){
        System.out.println("Nhập id sản phẩm muốn xóa");
        int idProduct = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < CatList.size() ; i++) {
            if (CatList.get(i).getIdCat() == idProduct){
                CatList.remove(i);
            }

        }
    }
}

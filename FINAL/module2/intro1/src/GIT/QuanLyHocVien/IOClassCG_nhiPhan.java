package GIT.QuanLyHocVien;

import java.io.*;
import java.util.ArrayList;

public class IOClassCG_nhiPhan {
    static File file = new File("ClassCG.txt");

    public static void write(ArrayList<ClassCG> classCGS){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(classCGS);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static ArrayList<ClassCG> read(){
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<ClassCG> classCGS = (ArrayList<ClassCG>) objectInputStream.readObject();
            return classCGS;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}

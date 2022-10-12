package lopthuoctinhdoituong.QuanLySanPham;



import lopthuoctinhdoituong.QuanLySanPham.manager.Manager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        String menu= """
*******  ******** *********  ********   ********   ********   ****
*******  ******** *********  ********   ********   ********  *****
**       **    **      ***   **    **   **    **   **       **  **
**       **    **     ***         ***        ***   **   ***     **
**       **    **    ***        ***        ***     **   ***     **
**       **    **   ***        ***        ***      **    **     **
*******  ********  ***       ********   ********   ********   ******
*******  ********  ***       ********   ********   ********   ******


**    **    **      **       **  **     **  **    **
**    **    **      **       **  ***    **  **    **
**    **   ****     **       **  ****   **  **    **
********   *  *     **       **  *****  **  ********
********  ******    **       **  **  **7***  ********
**    **  **   **   **       **  **   ****  **    **
**    **  *     *   *******  **  **    ***  **    **
**    ** **     **  *******  **  **     **  **    **
                """;
        System.out.println(menu);
manager.menu();

    }
}

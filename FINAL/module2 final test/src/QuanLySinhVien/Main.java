package QuanLySinhVien;


import QuanLySinhVien.manager.Manager;

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
********  **  **    **       **  *****  **  ********
********  *******   **       **  **  *****  ********
**    **  **   **   **       **  **   ****  **    **
**    ** **     **  *******  **  **    ***  **    **
**    ** **     **  *******  **  **     **  **    **
                """;
        System.out.println(menu);
        manager.menu();
    }
}
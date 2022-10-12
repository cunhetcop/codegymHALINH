package lopthuoctinhdoituong.QuanLySanPham.manager;

import lopthuoctinhdoituong.QuanLySanPham.io.IOProduct;
import lopthuoctinhdoituong.QuanLySanPham.product.Product;

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
    private ArrayList<Product> products = new ArrayList<>();

    public void menu() {
        int choice;
        do {
            System.out.println("╔===================================================╗");
            System.out.println("║        ▂ ▃ ▅ ▆ █ QUẢN LÝ SẢN PHẨM █ ▆ ▅ ▃ ▂       ║");
            System.out.println("╠===================================================╣");
            System.out.println("║[1]. XEM DANH SÁCH                                 ║");
            System.out.println("║[2]. THÊM MỚI                                      ║");
            System.out.println("║[3]. CẬP NHẬT                                      ║");
            System.out.println("║[4]. XÓA                                           ║");
            System.out.println("║[5]. SĂP XẾP                                       ║");
            System.out.println("║[6]. TÌM SẢN PHẨM CÓ GIÁ ĐẮT NHẤT                  ║");
            System.out.println("║[7]. ĐỌC TỪ FILE                                   ║");
            System.out.println("║[8]. GHI VÀO FILE                                  ║");
            System.out.println("║[0]. Thoát                                         ║");
            System.out.println("╚===================================================╝");
            System.out.println("Nhập lựa chọn:");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 0 || choice > 8) {
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
                        this.findTheMostExpensiveProduct();
                        break;
                    case 7:
                        this.ReadFromFile();
                        break;
                    case 8:
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

    public Product createProduct() {
        int IDproduct;
        int index;
        while (true) {
            try {
                System.out.println("Nhập id sản phẩm :");
                IDproduct = Integer.parseInt(scanner.nextLine());
                index = checkID(IDproduct);
                if (index == -1) {
                    break;
                }

            } catch (Exception e) {
                System.out.println("ID phải là một số nguyên");
                continue;
            }
            System.err.println("ID đã tồn tại!");
        }
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();

        double price;
        while (true) {
            try {
                System.out.println("Nhập price");
                price = Double.parseDouble(scanner.nextLine());
            } catch (Exception e) {
                System.err.println("Giá sản phẩm là số, không được chứa chữ");
                continue;
            }
            break;
        }

        int quantity;
        while (true) {
            try {
                System.out.println("Nhập số lượng");
                quantity = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.err.println("Số lượng là số nguyên, không được chứa chữ");
                continue;
            }
            break;
        }

        System.out.println("Nhập mô tả sản phẩm: ");
        String describe = scanner.nextLine();

        Product product = new Product(IDproduct, name, price, quantity, describe);
        System.out.println(product);
        return product;
    }

    public int checkID(int IDproduct) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getIDproduct() == IDproduct) {
                return i;
            }
        }
        return -1;
    }

    public void show() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public void add() {
        Product product = createProduct();
        products.add(product);
    }

    public void update() {
        int IDproduct;
        while (true) {
            try {
                System.out.println("Nhập ID sản phẩm muốn sửa: ");
                IDproduct = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.err.println("ID chỉ là số nguyên, không chứa chữ cái");
            }
        }
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getIDproduct() == IDproduct) {
                products.set(i, createProduct());
                return;
            }
        }
        System.err.println("Không tồn tại ID này");
    }

    public void delete() {
        int IDproduct = 0;
        while (true) {
            try {
                System.out.println("Nhập ID sản phẩm bạn muốn sửa: ");
                IDproduct = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.err.println("ID chỉ là số nguyên, không chứa chữ cái");
            }
            break;
        }
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getIDproduct() == IDproduct) {
                products.remove(i);
                break;
            }
        }
        System.err.println("Không tồn ta ID này");
    }

    public void sort() {
        int choose = 2;
        System.out.println("1. Giá tăng dần");
        System.out.println("2. Giá giảm dần");
        System.out.println("Nhập số để lựa chọn: ");
        do {
            if (choose > 2) {
                System.err.println("Chỉ chọn 1 hoặc 2");
            }
            choose = Integer.parseInt(scanner.nextLine());
        } while (choose > 2);

        switch (choose) {
            case 1:
                priceMinToMax();
                break;
            case 2:
                priceMaxToMin();
                break;
        }
    }

    public void priceMaxToMin() {
        Comparator<Product> com1 = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        };
        Collections.sort(products, com1);
        Collections.reverse(products);
        this.show();
    }

    public void priceMinToMax() {
        Comparator<Product> com1 = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return -1;
                } else if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        };
        Collections.sort(products, com1);
        Collections.reverse(products);
        this.show();
    }

    public void findTheMostExpensiveProduct() {
        double max = products.get(0).getPrice();
        for (int i = 1; i < products.size(); i++) {
            if (max < products.get(i).getPrice()) {
                max = products.get(i).getPrice();
            }
        }
        for (Product product : products) {
            if (max == product.getPrice()) {
                String str = product.toString();
                System.out.println(str);
            }
        }
    }


    public void ReadFromFile() {
        products = IOProduct.read();
        System.out.println(ANSI_GREEN);
        System.out.println("Đọc file thành công");
        System.out.println(ANSI_RESET);

    }


    public void WriteToFile() {
        IOProduct.write(products);
        System.out.println(ANSI_GREEN);
        System.out.println("Ghi file thành công");
        System.out.println(ANSI_RESET);
    }
}

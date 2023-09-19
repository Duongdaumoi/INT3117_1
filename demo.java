import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int GK = scanner.nextInt();
        int BTL = scanner.nextInt();
        System.out.println("**************");
        ketquaString(N, GK, BTL);
        System.out.println("**************");
        // Test cases:
        // -1 3 3 --> Dau vao khong hop le.
        // 1 -3 3 --> Dau vao khong hop le.
        // 1 3 -3 --> Dau vao khong hop le.
        // 4 3 3 --> Khong du dieu kien thi.
        // 4 3 10 --> Khong du dieu kien thi.
        // 5 3 12 --> Dau vao khong hop le.
        // 6 10 -3 --> Dau vao khong hop le.
        // 10 10 8 --> Khong du dieu kien thi.
        // 11 10 10 --> Khong du dieu kien thi.
        // 11 10 11 --> Dau vao khong hop le.
        // 11 12 10 --> Dau vao khong hop le.
        // 12 -1 5 --> Dau vao khong hop le.
        // 12 5 -1 --> Dau vao khong hop le.
        // 12 7 8 --> Du dieu kien thi.
        // 12 5 10 --> Mien thi.
        // 12 5 12 --> Dau vao khong hop le.
        // 12 10 -1 --> Dau vao khong hop le.
        // 12 10 4  --> Mien thi.
        // 12 10 10 --> Mien thi.
        // 0 0 0 --> Khong du dieu kien thi.
    }
    public static void ketquaString(int N, int GK, int BTL) {
        if (N >= 0 && N <= 11) {
            if (GK >= 0 && GK <= 10) {
                if (BTL >= 0 && BTL <= 10) {
                    System.out.println("Khong du dieu kien thi.");
                } else {
                    System.out.println("Dau vao khong hop le.");
                }
            } else {
                System.out.println("Dau vao khong hop le.");
            }
        }else if (N >= 12 && N <= 15) {
            if (GK >= 0 && GK < 10) {
                if (BTL >= 0 && BTL < 10) {
                    System.out.println("Du dieu kien thi.");
                } else if (BTL == 10) {
                    System.out.println("Mien thi.");
                } else {
                    System.out.println("Dau vao khong hop le.");
                }
            } else if (GK == 10) {
                if (BTL >= 0 && BTL <= 10) {
                    System.out.println("Mien thi.");
                } else {
                    System.out.println("Dau vao khong hop le.");
                }
            } else {
                System.out.println("Dau vao khong hop le.");
            }
        } else {
            System.out.println("Dau vao khong hop le.");
        }
    }
}
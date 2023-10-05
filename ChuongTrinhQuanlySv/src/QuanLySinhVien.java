import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
    public static void main(String[] args) {
        ArrayList<SinhVienPoLy> danhSachSinhVien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1));
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Ngành: ");
            String nganh = scanner.nextLine();
            if(      ){

            }
            


        }
    }
}

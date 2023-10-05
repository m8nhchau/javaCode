import java.util.Scanner;

public class SinhVienIT extends SinhVienPoLy {
    private double diemJava;
    private double diemHTML;
    private double diemCSS;

    public SinhVienIT(String hoTen, String nganh) {
        super(hoTen, nganh);
    }

    public void nhapDiem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm Java: ");
        diemJava = scanner.nextDouble();
        System.out.print("Nhập điểm HTML: ");
        diemHTML = scanner.nextDouble();
        System.out.print("Nhập điểm CSS: ");
        diemCSS = scanner.nextDouble();
        scanner.nextLine();
    }

    public double getDiem() {
        return (2 * diemJava + diemHTML + diemCSS) / 4;
    }
}


import java.util.Scanner;

public class SinhVienBiz extends SinhVienPoLy{
    private double diemMarketing;
    private double diemSales;

    public SinhVienBiz(String hoTen, String nganh) {
        super(hoTen, nganh);
    }

    public void nhapDiem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm Marketing: ");
        diemMarketing = scanner.nextDouble();
        System.out.print("Nhập điểm Sales: ");
        diemSales = scanner.nextDouble();
        scanner.nextLine();
    }

    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}

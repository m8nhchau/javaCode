import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySinhVien {
    ArrayList<SinhVienPoLy> list = new ArrayList<>();

    public void nhap() {
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();
            if (hoTen == null || hoTen.equals(" ")) {
                break;
            }
            System.out.print("Loai Nganh:");
            String loaiNganh = scanner.nextLine();
            if (loaiNganh.equalsIgnoreCase("IT")) {
                System.out.print("Diem Java:");
                double diemJava = scanner.nextDouble();
                System.out.print("Diem CSS:");
                double diemCSS = scanner.nextDouble();
                System.out.print("Diem HTML:");
                double diemHTML = scanner.nextDouble();
                SinhVienPoLy svPoLy = new SinhVienIT(hoTen, loaiNganh, diemJava, diemCSS, diemHTML);
                list.add(svPoLy);
            } else if (loaiNganh.equalsIgnoreCase("Biz")) {
                System.out.print("Diem Marketing:");
                double diemMarketing = scanner.nextDouble();
                System.out.print("Diem Sales:");
                double diemSales = scanner.nextDouble();
                SinhVienPoLy svPoLy = new SinhVienBiz(hoTen, loaiNganh, diemMarketing, diemSales);
                list.add(svPoLy);

            }
        } while (true);
    }

    public void xuat() {
        for (SinhVienPoLy sv : list) {
            System.out.printf("Ho ten: %s  Nganh: %s DiemTB: %2f Hoc Luc: %s\n", sv.getHoTen(), sv.getLoaiNganh(), sv.getDiem(), sv.getHocLuc());
        }
    }

    public void xuatGioi() {
        for (SinhVienPoLy sv : list) {
            if (sv.getHocLuc().equalsIgnoreCase("Giỏi")) {
                System.out.printf("Ho ten: %s  Nganh: %s DiemTB: %2f Hoc Luc: %s\n", sv.getHoTen(), sv.getLoaiNganh(), sv.getDiem(), sv.getHocLuc());
            }

        }
    }

    Comparator<SinhVienPoLy> comp = new Comparator<SinhVienPoLy>() {
        @Override
        public int compare(SinhVienPoLy o1, SinhVienPoLy o2) {
            return Double.compare(o1.getDiem(), o2.getDiem());
        }
    };

    public void sapXepTheoDiem() {
        Collections.sort(list, comp);
        System.out.println("Sap xep diem tang dan:");
        xuat();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int chon;
        do {
            System.out.println("\nMenu chuong trinh");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat thong tin dnh sach sinh vien");
            System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4. Sap xep danh sach sinh vien theo diem");
            System.out.println("5. Thoat");
            System.out.println("Chon Menu:");

            chon = scanner.nextInt();
            if (chon != 0) {
                switch (chon) {
                    case 1:
                        nhap();
                        break;
                    case 2:
                        xuat();
                        break;
                    case 3:
                        xuatGioi();
                        break;
                    case 4:
                        sapXepTheoDiem();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Nhap sai, nhap lai");
                }
            }
        } while (chon != 5);
    }
}








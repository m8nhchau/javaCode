import java.util.*;
import java.util.stream.Collectors;

public class QuanLyNhanVien {
    ArrayList<NhanVien> list = new ArrayList<>();

    public void nhap(){//nhap danh sach nhan vien
        do{
           Scanner scanner = new Scanner(System.in);
           System.out.println("Nhap ma nhan vien:");
           String maNV = scanner.nextLine();
           if (maNV == null || maNV.equals(" ")){
               break;
           }
           System.out.println("Nhap ten nhan vien:");
           String hoTen = scanner.nextLine();
           System.out.println("Nhap luong thang nhan vien:");
           double  luongThang = scanner.nextDouble();
           System.out.println("Loai nhan vien:");
           String loaiNV = new Scanner(System.in).nextLine();
           if (loaiNV.equalsIgnoreCase("Truong Phong")){
               System.out.println("Luong Trach Nhiem");
               double luongTN = scanner.nextDouble();
               NhanVien luongNV = new TruongPhong(maNV, hoTen, luongThang,loaiNV, luongTN);
               list.add(luongNV);
           } else if (loaiNV.equalsIgnoreCase("Tiep Thi")) {
                System.out.println("Doanh So:");
                double doanhSo = scanner.nextDouble();
                System.out.println("Phan tram hoa hong:");
                double hoaHong = scanner.nextDouble();
                NhanVien luongNV = new TiepThi(maNV, hoTen, luongThang, loaiNV, doanhSo, hoaHong);
                list.add(luongNV);
           }else {
               System.out.println("Nhan sai. Hay nhap lai!");
           }
        } while (true);
    }
    public void xuat(){//xuất danh sách nhân viên
        for (NhanVien nv : list){
            System.out.printf("Ma nhan vien: %s |  Ho & ten: %s | luong thang: %2f| Loai nhan vien: %s| luong nhan: %2f\n", nv.getMaNV(), nv.getHoTen(), nv.getLuongThang(),nv.getLoaiNV(), nv.getLuongNhan());
        }
    }
    public void timNV(){//tìm nhân viên theo mã
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can tim:");
        String maNV = scanner.nextLine();
        Boolean check = false;
        for (NhanVien nv : list){
            if (maNV.equalsIgnoreCase(nv.getMaNV())){
                System.out.printf("Ma nhan vien: %s |  Ho & ten: %s | luong thang: %2f| Loai nhan vien: %s| luong nhan: %2f\n", nv.getMaNV(), nv.getHoTen(), nv.getLuongThang(),nv.getLoaiNV(), nv.getLuongNhan());
                check = true;
                break;
            }
        }
            if (check == false){
                System.out.println("Khong tim thay nhan vien");
            }
    }
    public void xoaNV(){//xóa nhân viên theo mã
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can xoa:");
        String maNV = scanner.nextLine();
        Boolean check = false;
        for (NhanVien nv : list){
            if (maNV.equalsIgnoreCase(nv.getMaNV())){
                list.remove(nv);
                check = true;
                System.out.println("Da xoa!");
                break;
            }
        }
        if (check == false){
            System.out.println("Nhan vien khong ton tai!");
        }
    }
    public void capNhatNV(){//cập nhật thông tin nhân vien theo mã
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can cap nhat:");
        String maNVC = scanner.nextLine();
        NhanVien tim = null;
        int index = 0;

        for (NhanVien nv : list){
            if (maNVC.equalsIgnoreCase(nv.getMaNV())){
                tim = nv;
                index = list.indexOf(nv);
                break;
            }
        }
        if (tim != null){
            System.out.println("Nhap ma nhan vien:");
            String maNV = scanner.nextLine();
            System.out.println("Nhap ten nhan vien:");
            String hoTen = scanner.nextLine();
            System.out.println("Nhap luong thang nhan vien:");
            double  luongThang = scanner.nextDouble();


            if(tim instanceof TruongPhong){
                System.out.println("Luong Trach Nhiem");
                double luongTN = scanner.nextDouble();
                NhanVien luongNV = new TruongPhong(maNV, hoTen, luongThang,"Truong Phong", luongTN);
                list.set(index, luongNV);
            }

            if(tim instanceof TiepThi){
                System.out.println("Doanh So:");
                double doanhSo = scanner.nextDouble();
                System.out.println("Phan tram hoa hong:");
                double hoaHong = scanner.nextDouble();
                NhanVien luongNV = new TiepThi(maNV, hoTen, luongThang, "Tiep Thi", doanhSo, hoaHong);
                list.set(index, luongNV);
            }
            System.out.println("Cap nhat thanh cong!");
        } else {
            System.out.println("Nhan vien khong ton tai!");
        }
    }
    public void timNVLuong(){//tìm nhân viên theo khoảng lương
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mức trong khoảng cần tìm:");
        System.out.println("Mức thấp nhất:");
        double min = scanner.nextDouble();
        System.out.println("Mức cao nhất:");
        double max = scanner.nextDouble();
        for (NhanVien nv : list) {
            if (nv.getLuongNhan() >= min && nv.getLuongNhan() <= max) {
                System.out.printf("Ma nhan vien: %s |  Ho & ten: %s | luong thang: %2f| Loai nhan vien: %s| luong nhan: %2f\n", nv.getMaNV(), nv.getHoTen(), nv.getLuongThang(), nv.getLoaiNV(), nv.getLuongNhan());
            }
            }
        }

    public void sapXepTenNV(){//sắp xếp nhân viên theo tên
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                return nv1.getHoTen().compareTo(nv2.getHoTen());
            }
        };
        Collections.sort(list,comp);
        xuat();
    }
    public void sapXepLuongNV(){//sắp xép nhân viên theo lương, thứ tự tăng dần
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                if(nv1.getLuongNhan() > nv2.getLuongNhan()) return 1;
                else return -1;
            }
        };
        Collections.sort(list,comp);
        
        //todo
//        Collections.sort(list, (o1, o2) -> (int) (o2.getLuongNhan() - o1.getLuongNhan()));
//        Collections.sort(list, Comparator.comparing(NhanVien::getLuongNhan));
//        List<NhanVien> sortedList = list.stream()
//                .sorted(Comparator.comparing(NhanVien::getLuongNhan))
//                .collect(Collectors.toList());
        xuat();
    }
    public void xuat5NV(){
        Collections.sort(list, (a,b)-> (int) (b.getLuongNhan() - a.getLuongNhan()));
        for(int i = 0; i <=5; i++){
            System.out.printf("Ma nhan vien: %s |  Ho & ten: %s | luong thang: %2f| Loai nhan vien: %s| luong nhan: %2f\n", list.get(i).getMaNV(), list.get(i).getHoTen(), list.get(i).getLuongThang(),list.get(i).getLoaiNV(), list.get(i).getLuongNhan());
        }
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int chon;
        do {
            System.out.println("\nMenu chuong trinh");
            System.out.println("1. Nhap danh sach nhan vien:");
            System.out.println("2. Xuat thong tin danh sach nhan vien:");
            System.out.println("3. Tim nhan vien theo ma nhan vien:");
            System.out.println("4. Xoa nhan vien theo ma nha vien:");
            System.out.println("5. Cap nhat nhan vien theo ma nhan vien:");
            System.out.println("6. Tim nhan vien theo khoang luong:");
            System.out.println("7. Sap xep nhan vien theo ho va ten:");
            System.out.println("8. Sap xep nhan vien theo thu nhap:");
            System.out.println("9. Xuat 5 nhan vien co luong cao nhat:");
            System.out.println("0. Thoat:");
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
                        timNV();
                        break;
                    case 4:
                        xoaNV();
                        break;
                    case 5:
                        capNhatNV();
                        break;
                    case 6:
                        timNVLuong();
                        break;
                    case 7:
                        sapXepTenNV();
                        break;
                    case 8:
                        sapXepLuongNV();
                        break;
                    case 9:
                        xuat5NV();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Nhap sai, nhap lai");
                }
            }
        } while (chon != 0);
    }
}

abstract public class SinhVienPoLy {
    protected String hoTen;
    protected String nganh;



    public SinhVienPoLy(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;

    }

    public abstract double getDiem();

    public String getHocLuc() {
        String hocLuc = null;
        double diem = getDiem();
        if (diem >= 9.0) {
            hocLuc = "Xuất sắc";
        } else if (diem >= 7.5) {
            hocLuc = "Giỏi";
        } else if (diem >= 6.5) {
            hocLuc = "Khá";
        } else if (diem >= 5.0) {
            hocLuc = "Trung bình";
        } else {
            hocLuc = "Yếu";
        }
        return hocLuc;
    }

    public void xuat() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngành: " + nganh);
        System.out.println("Điểm: " + getDiem());
        System.out.println("Học lực: " + getHocLuc());
        System.out.println();
    }
}


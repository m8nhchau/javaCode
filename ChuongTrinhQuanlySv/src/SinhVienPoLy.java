public abstract class SinhVienPoLy {
    protected String hoTen;
    protected String loaiNganh;

    public SinhVienPoLy(String hoTen, String loaiNganh) {
        this.hoTen = hoTen;
        this.loaiNganh = loaiNganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLoaiNganh() {
        return loaiNganh;
    }

    abstract double getDiem();

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


}


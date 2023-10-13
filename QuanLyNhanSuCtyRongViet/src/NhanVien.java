public abstract class NhanVien {
    protected String maNV;
    protected String hoTen;
    protected double luongThang;
    protected String loaiNV;


    public NhanVien(String maNV, String hoTen, double luongThang, String loaiNV) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongThang = luongThang;
        this.loaiNV = loaiNV;

    }

    public String getMaNV() {

        return maNV;
    }

    public void setMaNV(String maNV) {

        this.maNV = maNV;
    }

    public String getHoTen() {

        return hoTen;
    }

    public void setHoTen(String hoTen) {

        this.hoTen = hoTen;
    }
    public double getLuongThang() {

        return luongThang;
    }

    public void setLuongThang(double luongThang) {

        this.luongThang = luongThang;
    }
    public String getLoaiNV() {

        return loaiNV;
    }

    public void setLoaiNV(String loaiNV) {

        this.loaiNV = loaiNV;
    }
    abstract double getLuong(); // luong truoc thue = luong hang thang + luong duoc them
    abstract double getLuongNhan();// luong nhan (luong sau thue) = luong truoc thue - thue
    public double getThue() {
        double luong = getLuong();
        double thue = 0;
        if (luong >= 15000000) {
            thue = 0.12 * luong;
        } else if (luong >= 9000000) {
            thue = 0.1 * luong;
        } else {
            thue = 0;
        }
        return thue;
    }
}





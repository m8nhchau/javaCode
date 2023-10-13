public class TruongPhong extends NhanVien{
    protected double luongTN;

    public TruongPhong(String maNV, String hoTen, double luongThang, String loaiNV, double luongTN){
        super(maNV, hoTen, luongThang,loaiNV);
        this.luongTN = luongTN;
    }
    public double getLuongTN(){
        return luongTN;
    }
    public void setLuongTN(double luongTN){
        this.luongTN = luongTN;
    }

    @Override
    public double getLuong() {
        return (luongThang + luongTN);
    }
    public double getLuongNhan(){
        return (getLuong() - getThue());
    }
}

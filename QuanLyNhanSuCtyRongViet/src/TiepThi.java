public class TiepThi extends NhanVien{
    protected double doanhSo;
    protected double hoaHong;

    public TiepThi(String maNV, String hoTen,double luongThang, String loaiNV, double doanhSo, double hoaHong){
        super(maNV, hoTen, luongThang, loaiNV);
        this.doanhSo = doanhSo ;
        this.hoaHong = hoaHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }
    @Override
    public double getLuong() {
        return (luongThang + doanhSo*hoaHong);
    }
    public double getLuongNhan(){
        return (getLuong() - getThue());
    }
}

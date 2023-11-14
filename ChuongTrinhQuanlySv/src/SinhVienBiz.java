public class SinhVienBiz extends SinhVienPoLy {
    protected double diemMarketing;
    protected double diemSales;

    public SinhVienBiz(String hoTen, String loaiNganh, double diemMarketing, double diemSales) {
        super(hoTen, loaiNganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}

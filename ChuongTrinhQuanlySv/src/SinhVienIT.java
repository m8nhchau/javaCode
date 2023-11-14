public class SinhVienIT extends SinhVienPoLy {
    protected double diemJava;
    protected double diemHTML;
    protected double diemCSS;

    public SinhVienIT(String hoTen, String loaiNganh, double diemJava, double diemCSS, double diemHTML) {
        super(hoTen, loaiNganh);
        this.diemJava = diemJava;
        this.diemCSS = diemCSS;
        this.diemHTML = diemHTML;
    }

    public double getDiem() {
        return (2 * diemJava + diemHTML + diemCSS) / 4;
    }

}


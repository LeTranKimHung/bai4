import java.time.LocalDate;
import java.util.Scanner;

public class NHANVIEN extends CONNGUOI {
    private long luong;
    private LocalDate ngayNV;
    private PHONGBANKHOA phongbankhoa;

    public NHANVIEN(String hoTen, int namSinh, long luong, LocalDate NgayNV, PHONGBANKHOA phongbankhoa) {
        super(hoTen,namSinh);
        this.luong = luong;
        this.ngayNV = ngayNV;
        this.phongbankhoa= phongbankhoa;
    }
    public void input(){
        super.input();
        Scanner x= new Scanner(System.in);
        System.out.print("Luong: ");
        luong= x.nextLong();
        System.out.print("Ngay nhan viec: ");
        String ngaynhanviec=x.nextLine();
        ngayNV=LocalDate.parse(ngaynhanviec);
        phongbankhoa.input();
    }
    public void output(){
        System.out.println("THONG TIN NHAN VIEN");
        System.out.println("Ho ten hoc vien: "+ hoTen);
        System.out.println("Nam sinh hoc vien: "+ namSinh);
        System.out.println("Luong: " + luong);
        System.out.println("Ngay nhan viec: " +ngayNV);
        phongbankhoa.input();
    }
}
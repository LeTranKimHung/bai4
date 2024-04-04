import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("Nhap thong tin hoc vien: ");
        System.out.print("Nhap ho ten: ");
        String hoTenHV=x.nextLine();
        System.out.print("Nhap nam sinh: ");
        int namSinhHV= x.nextInt();
        System.out.print("Nhap diem 1: ");
        Double diem1= x.nextDouble();
        System.out.print("Nhap diem 2: ");
        Double diem2= x.nextDouble();
        System.out.print("Nhap diem 3: ");
        Double diem3= x.nextDouble();
        HOCVIEN hocVien = new HOCVIEN(hoTenHV, namSinhHV, diem1, diem2, diem3);
        x.nextLine();
        //thong tin nhan vien
        System.out.println("Nhao thong tin nhan vien: ");
        System.out.print("Nhap ho ten: ");
        String hoTenNV=x.nextLine();
        System.out.print("Nhap nam sinh: ");
        int namSinhNV= x.nextInt();
        System.out.print("Nhap luong: ");
        long luong= x.nextLong();
        x.nextLine();
        System.out.print("Nhap ngay nhan viec (yyyy-MM-dd): ");
        String ngayNhanViec = x.nextLine();
        LocalDate ngayNV = LocalDate.parse(ngayNhanViec);
        System.out.print("Nhap phong ban khoa: ");
        String phongbk = x.nextLine();

        PHONGBANKHOA phongbankhoa = new PHONGBANKHOA(phongbk);
        NHANVIEN nhanVien = new NHANVIEN(hoTenNV, namSinhNV, luong, ngayNV, phongbankhoa);

        hocVien.output();
        nhanVien.output();
    }
}
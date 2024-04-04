import java.util.Scanner;

public class HOCVIEN extends CONNGUOI {
    private double diem1,diem2,diem3;

    public HOCVIEN(String hoTen, int namSinh, double diem1, double diem2,double diem3) {
        super(hoTen, namSinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public void input(){
        super.input();
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap diem 1: ");
        diem1= x.nextInt();
        System.out.print("Nhap diem 2: ");
        diem2= x.nextInt();
        System.out.print("Nhap diem 3: ");
        diem3= x.nextInt();
    }
    public void output(){
        System.out.println("THONG TIN HOC VIEN");
        System.out.println("Ho ten hoc vien"+ hoTen);
        System.out.println("Nam sinh hoc vien"+ namSinh);
        System.out.println("Diem 1"+ diem1);
        System.out.println("Diem 2"+ diem2);
        System.out.println("Diem 3"+ diem3);
    }
}
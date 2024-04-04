import java.util.Scanner;

public class CONNGUOI {
    protected String hoTen;
    protected int namSinh;
    public CONNGUOI(String hoTen,int namSinh){
        this.hoTen=hoTen;
        this.namSinh=namSinh;
    }
    public void input(){
        Scanner x= new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        hoTen=x.nextLine();
        System.out.println("Nhap nam sinh: ");
        namSinh=x.nextInt();
    }
}
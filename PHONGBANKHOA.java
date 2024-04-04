import java.util.Scanner;

public class PHONGBANKHOA {
    private String phongbk;

    public PHONGBANKHOA(String phongbk){
        this.phongbk=phongbk;
    }
    public void input(){
        Scanner x= new Scanner(System.in);
        System.out.println("Nhap phong ban khoa: ");
        phongbk=x.nextLine();
    }
    public void output(){
        System.out.println("Phong ban khoa" + phongbk);
    }
}
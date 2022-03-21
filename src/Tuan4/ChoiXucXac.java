package Tuan4;
import java.util.Random;
import java.util.Scanner;
public class ChoiXucXac {
    public static void main(String[] args) throws Exception {  
        Scanner sc = new Scanner(System.in); 
        System.out.println("Nhap so mat cua con xuc xac");//Số người chơi
        int soMat=sc.nextInt();//thuoc tính
        //do con xuc xac: Phương thức
        XucXac xx1= new XucXac(soMat);
        int kq=xx1.doXucXac();
        System.out.println("Ket qua do xuc xac la: "+kq);
        System.out.println("Ket qua do xuc xac la: "+kq);
        System.out.println("Ket qua do xuc xac la: "+kq);
        System.out.println("Ket qua do xuc xac la: "+kq);



}
}

package Tuan4;
import java.util.Random;
import java.util.Scanner;
public class GameDoanSo {
    public static void main(String[] args) throws Exception {  
        Scanner sc1 = new Scanner(System.in); 
        String traLoi;
        while(true){
            ChoiGameDoanSo();//Chơi game 1 lần
            System.out.println("Ban co muon tiep tuc choi khong (y/n): ");
            traLoi = sc1.nextLine();
            if(traLoi.equals("y")||traLoi.equals("Y")) break;
        }
    }
    public static void ChoiGameDoanSo() {
        Random rd = new Random();
        int kq = rd.nextInt(101);// kq: so may phat sinh tu 0 den 100
        System.out.println("Ket qua la " + kq);
        Scanner sc = new Scanner(System.in);
        //Lap cho den khi doan qua 7 lần mà không đúng: cấu truc lập gì? While
        int soLan = 1;
        do {//Nhap vao so nguyen de doan
        System.out.println("Nhap vao so ban doan lan "+soLan+":");
        int nhap =sc.nextInt();
        System.out.println("so nguyen ban da doan la: "+nhap);
        //So sanh va in ra so minh nhap lớn hơn hay nhỏ hơn kq
        if(nhap==kq){
            System.out.println("Ban đoan dung ket qua la"+ kq);
            break;
        }
        if(nhap<kq)
            System.out.println("So ban vua doan nho hon so random");
        else
            System.out.println("So ban vua doan lon hon so random");
            soLan++;
        } while (soLan <= 7);
        if(soLan>7)  System.out.println("Ban da doan sai ca 7 lan");
        System.out.println("Game over!!!!!");
    }
    }

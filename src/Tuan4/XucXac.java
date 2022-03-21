package Tuan4;

import java.util.Random;

public class XucXac {
    private int soMat;
    public XucXac(int soMat){
        this.soMat=soMat;
    }
    public void setSoMat(int soMat){
        this.soMat=soMat;
    }
    public int getSoMat(int soMat){
        return soMat;
    }
    public int doXucXac(){
        Random rd = new Random();
        int kq=rd.nextInt(soMat)+1;
        return kq;
        

    }
}

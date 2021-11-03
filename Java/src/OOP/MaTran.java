package OOP;

import java.util.Scanner;

public class MaTran {
    private int sohang,socot;
    private int[][] matrix = new int[100][100];

    public int getSohang() {
        return sohang;
    }

    public void setSohang(int sohang) {
        this.sohang = sohang;
    }

    public int getSocot() {
        return socot;
    }

    public void setSocot(int socot) {
        this.socot = socot;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    private Scanner sc = new Scanner(System.in);
    public MaTran()
    {
        System.out.println("nhap so hang, so cot");
        setSohang(sc.nextInt());
        setSocot(sc.nextInt());
        NhapMaTran(matrix,sohang,socot);
    }
    public int[][] NhapMaTran(int[][] matrix,int sohang,int socot)
    {
        for (int i=0;i<sohang;i++)
        {
            for (int j=0;j<socot;j++)
            {
                System.out.println("matran["+i+","+j+"] =");
                matrix[i][j]=sc.nextInt();
            }
        }
        return matrix;
    }
    public MaTran (int sohang, int socot, int[][] matrix)
    {
        setSohang(sohang);
        setSocot(socot);
        setMatrix(matrix);
    }
    public MaTran Cong (MaTran mt)
    {
        if (sohang!= mt.sohang||socot!= mt.socot) {
            System.out.println("khong thoa man dieu kien cong hai ma tran");
        return null; }
        MaTran mt2 = new MaTran(sohang,socot,new int[sohang][socot]);
        for (int i=0;i<sohang;i++)
        {
            for (int j=0;j<socot;j++)
            {
                mt2.matrix[i][j]=matrix[i][j]+mt.matrix[i][j];
            }
        }
        return mt2;
    }
    public void InThongTin()
    {
        for (int i=0;i<sohang;i++)
        {
            for (int j=0;j<socot;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

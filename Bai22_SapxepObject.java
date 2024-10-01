/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
class Sinhvien{
private String ten;
private double diem;

public void setTen( String ten){
    this.ten=ten;
}
public void setDiem(double diem){
    this.diem=diem;
}
public double getDiem(){
 return diem;   
}
}
/**a
 *
 * @author Administrator
 */
public class Bai22_SapxepObject {
  public static void main(String[]arge){
      String ten;
      double diem;
      Scanner sc = new Scanner (System.in);
      System .out. println("nhap n: ");
      int n= Integer.parseInt(sc.nextLine());
      Sinhvien sv[] =new Sinhvien[n];
      for(int i=0;1 < n; i++){
          sv[i]=new Sinhvien();
          ten = sc.nextLine();
          sv[i].setTen(ten); 
           system               
      }
  }
    
}

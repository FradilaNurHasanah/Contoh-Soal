/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContohSoal;
import java.util.Scanner;
/**
 *
 * @author FRADILA
 */
public class Latihan01 {
    public static void main(String[] args)
    {
        Scanner baca = new Scanner(System.in);
        int i;
        int[] data = new int[6];
        double jumlah = 0;
        double rata;
        
       
        for(i = 0; i < data.length; i++){
            System.out.print("Masukkan umur " + " " + (i+1)+ " : " );
            data [i] = baca.nextInt();
            
            jumlah = jumlah + data[i];
            
            if (data[i] <= 10)
            {
                System.out.println("Anak - anak");
            }
            else if(data[i] <= 17)
            {
                System.out.println("Muda 17");
            }
            else if (data[i] <= 30)
            {
                System.out.println("Dewasa");  
            }
            else 
            {
                System.out.println("Tua");
            }
        }
        rata = jumlah / data.length;
        System.out.println("Nilai rata-rata :" + rata);
        
        for (i=0; i < data.length; i++) {
            System.out.print(data[i] + "" + ",");
        }
    }
}
            


            
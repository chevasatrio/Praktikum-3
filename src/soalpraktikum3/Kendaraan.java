
package soalpraktikum3;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Kendaraan {
    
    //Membuat Method Static Void
     static void data() {
         
      //Variable
      String jenis, brand;
      int cc;
      Scanner gg = new Scanner (System.in);
      
      //User Memasukkan Data
      System.out.print("Masukkan jenis : ");jenis = gg.nextLine();
      System.out.print("Masukkan brand : ");brand = gg.nextLine();
      System.out.print("Masukkan CC    : ");cc = gg.nextInt();
      
      //Output Hasil Inputan Data
      System.out.println("--------------------------");
      System.out.println("------DATA KENDARAAN------");
      System.out.println("Jenis : "+jenis);
      System.out.println("Brand : "+brand);
      System.out.println("CC    : "+cc);
      System.out.println("--------------------------");

}
}
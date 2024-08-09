import java.util.Scanner;

public class mora {
    public static void main(String[] args) {
        
      double alas,tinggi,hasil;

      Scanner input= new Scanner(System.in);
      System.out.print("Masukan Alas Segitiga: "); 
      alas = input.nextDouble();
      System.out.print("Masukan Tinggi Segitiga: "); 
      tinggi = input.nextDouble();
      hasil = (alas * tinggi) / 2;
      System.out.println("Luas Segitiga: " + hasil);


       
    
    }
}

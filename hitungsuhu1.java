import java.util.Scanner;
import java.io.*;
public class hitungsuhu1 {
    
  static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
  static BufferedReader input = new BufferedReader(inputStreamReader);
  
  
       public static void main(String args[]){
    
     
         try {
           
            
                showMenu();
            

           
        } catch (Exception e) { //pengecekan eror pada methode menu
            
        }
    }
    
   

     static void showMenu() {
			
			System.out.println("           * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * * * *");
            System.out.println("           *    #     #                                                               *");
            System.out.println("           *    #  #  # ###### #       ####   ####  #    # ######    #####  ####      *");
            System.out.println("           *    #  #  # #      #      #    # #    # ##  ## #           #   #    #     *");
            System.out.println("           *    #  #  # #####  #      #      #    # # ## # #####       #   #    #     *");
            System.out.println("           *    #  #  # #      #      #      #    # #    # #           #   #    #     *");
            System.out.println("           *    #  #  # #      #      #    # #    # #    # #           #   #    #     *");
            System.out.println("           *     ## ##  ###### ######  ####   ####  #    # ######      #    ####      *");
            System.out.println("           *                                                                          *");
            System.out.println("           *                                                                          *");
            System.out.println("           *                     Adam Permadika 201743501677                          *");
			System.out.println("           *                     Virgiawan      201743501721                          *");
			System.out.println("           * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * * *");
			
            System.out.println();
            System.out.println("* * * * *  MENU UTAMA * * * * * *");
            System.out.println("*          1. CELCIUS           *");
            System.out.println("*          2. FARENHEIT         *");
            System.out.println("*          3. REAMUR            *");
            System.out.println("*          4. KELVIN            *");
            System.out.println("*          0. Exit              *");
            System.out.println("* * * * * * * * * * * * * * * * *");
            System.out.print("PILIHAN> ");
            

            try {
               int pilihan = Integer.parseInt(input.readLine());
                System.out.println("");
               switch (pilihan) {
                case 1:
                    celcius(); //instance methode
                    break;
                case 2:
                    farenheit();
                    break;
                   
                case 3:
                    reamur();
                    break;
                case 4:
                    kelvin();
                    break;    
                    
                case 0:
                    System.exit(0);
                    break;
                    default:
                

                }
            }catch (Exception e) {
            
        }
    }    
        
        
       static void celcius(){
        
            suhu cel=new suhu();
            Scanner keyboard = new Scanner(System.in);
            System.out.println("* * * * * * * * * *  CELCIUS *  * * * * * * * * *");
            System.out.println("*        1. Konversi Celcius to Farenheitc      *");
            System.out.println("*        2. Konversi Celcius to Reamur          *");
            System.out.println("*        3. Konversi Celcius to Kelvin          *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * *");            
            System.out.print("Pilih> ");
            cel.p = keyboard.nextInt();
            System.out.println();
         
          System.out.print("Masukkan nilai suhu Celcius = ");
         try{
          cel.c = keyboard.nextInt();
          System.out.println();
          switch (cel.p){
            
            //object konversi celsius
            case 1 :
            cel.CtoF();
            break;
           
            case 2 :
            cel.CtoR();
            break;
           
            case 3 :
            cel.CtoK();
            break;
			
                                    
          }   
        }catch(Exception e){}
       }
          
       
       static void farenheit(){
        
          suhu far=new suhu();
          Scanner keyboard = new Scanner(System.in);
          System.out.println("* * * * * * * * * *  FARENHEIT *  * * * * * * * * *");
          System.out.println("*        1. Konversi Farenheit to Celcius         *");
          System.out.println("*        2. Konversi Farenheit to Reamur          *");
          System.out.println("*        3. Konversi Farenheit to Kelvin          *");
          System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * *");                        
          System.out.print("Pilih> ");
          far.p = keyboard.nextInt();
          System.out.println();
          
          System.out.print("Masukkan nilai suhu Farenheit = ");
         try{
          far.f = keyboard.nextInt();
          System.out.println();
          switch (far.p){
            
            //object konversi celsius
             case 1 :
            far.FtoC();
            break;
            
            case 2 :
            far.FtoR();
            break;
            
            case 3 :
            far.FtoK();
            break;
          }   
             
        }catch(Exception e){
        }
       }
        
        static void reamur() {
            suhu re=new suhu();
            Scanner keyboard = new Scanner(System.in);
            System.out.println("* * * * * * * * * *  REAMUR * * * * * * * * * *");
            System.out.println("*        1. Konversi Reamur to Celcius        *");
            System.out.println("*        2. Konversi Reamur to Farenheit      *");
            System.out.println("*        3. Konversi Reamur to Kelvin         *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");                        
            System.out.print("Pilih> ");
            re.p = keyboard.nextInt();
            System.out.println();
          
           System.out.print("Masukkan nilai suhu Reamur = ");
           try{
            re.r = keyboard.nextInt();
            System.out.println();
            switch (re.p){  
            //object konversi reamur
            case 1 :
            re.RtoC();
            break;
           
            case 2 :
            re.RtoF();
            break;
           
            case 3 :
            re.RtoK();
            break;
           }
               
          }catch(Exception e){}
        }
       
       
        static void kelvin() {
            suhu kel=new suhu();
            Scanner keyboard = new Scanner(System.in);
            System.out.println("* * * * * * * * * *  KELVIN * * * * * * * * * *");
            System.out.println("*        1. Konversi Kelvin to Celcius        *");
            System.out.println("*        2. Konversi Kelvin to Farenheit      *");
            System.out.println("*        3. Konversi Kelvin to Reamur         *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");                            
            System.out.print("Pilih> ");
             kel.p = keyboard.nextInt(); 
            System.out.println();
          
           System.out.print("Masukkan nilai suhu Kelvin = ");
           try{
            kel.k = keyboard.nextInt();
            System.out.println();
            switch (kel.p){ 
            //object konversi farenheit
            case 1 :
            kel.KtoC();
            break;
            
            case 2 :
            kel.KtoF();
            break;
            
            case 3 :
            kel.KtoR();
            break;
          }
         }catch(Exception e){}
        }
}

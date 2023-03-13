
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lcmin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int amount = scan.nextInt();
        if(check_Product(name, amount)) System.out.println("Co");
        else System.out.println("khong");
    }
    
    
    public static String hello(java.lang.String name){
        Client.SOAPService_Service service = new Client.SOAPService_Service();
        Client.SOAPService port = service.getSOAPServicePort();
        return port.hello(name);
    }
    public static boolean check_Product(String type, int amount){
        Client.SOAPService_Service service = new Client.SOAPService_Service();
        Client.SOAPService port = service.getSOAPServicePort();
        return port.checkProduct(type, amount);
    }
    
    
}

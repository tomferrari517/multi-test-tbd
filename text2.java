import java.util.Scanner;

public class text2 {
    Scanner sc = new Scanner(System.in);
       
    void main() throws Exception {
        boolean ok = true;
        while(ok){
            System.out.println("que desea? dir o file");
            String opcion = sc.nextLine();
            switch(opcion){
                case  "dir":
                    System.out.println("nombre directorio: ");
                    String dir = sc.nextLine();
                    ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "mkdir " + dir);
                    pb.start();
                    break;

                    case "file":
                    System.out.println("nombre fichero: ");
                    String file = sc.nextLine();
                    ProcessBuilder pb2 = new ProcessBuilder("cmd", "/c", "type nul > " + file);
                    pb2.start();
                    break;
                    default:
                        ok = false;
                        break;
    
                    
            }
        }




        

        
    }
}

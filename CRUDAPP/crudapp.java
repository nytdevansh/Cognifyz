//hello
//this is a code for crud application.

package CRUDAPP;
import java.io.*;//necessary imports
import java.util.Scanner;


public class crudapp {
    private static void create(){//code for creating a file
        
        Scanner nameimput=new Scanner(System.in);//imput name
        System.out.println("Enter the File Name: ");
        String name=nameimput.nextLine();
        

        try {
            File newfile =new File(name);//create new file
        
        if(newfile.createNewFile()){
            System.out.println("File Created: "+newfile.getName());
        }else{
            System.out.println("File already exist.");
        }
        } catch (IOException e) {//show error!
            
            System.out.println("Error While Creating New File.");
            e.printStackTrace();
        }
        
    }

    private static void read(){//to read from file
        Scanner nameimput=new Scanner(System.in);
        System.out.println("Enter The Name of the file");
        String name=nameimput.nextLine();
        
        try{
        File myobj=new File(name);
        Scanner myScanner=new Scanner(myobj);
        while (myScanner.hasNextLine()) {
            String data=myScanner.nextLine();
            System.out.println(data);

        }
        myScanner.close();
        }catch (Exception e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
        }
        
    }

    private static void write(){//to write from file
        Scanner nameimput=new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        String name=nameimput.nextLine();
        
        
        try{
            FileWriter mywrite=new FileWriter(name);
            Scanner write=new Scanner(System.in);
            System.out.println("Enter text: ");
            String wr=write.nextLine();
            mywrite.write(wr+"\n");
            mywrite.close();
            System.out.println("Sucessfully written to the file.");
        }catch (Exception e) {
                System.out.println("Error");
                e.printStackTrace();
            }
            
        }
    private static void delete(){//to delete file
        Scanner nameimput=new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        String name=nameimput.nextLine();
        File file= new File(name);
        if (file.delete()) {
            System.out.println("File deleted succesfully "+file.getName());
        }
        else{
            System.out.println("Error.");
        }
    }
    //main 
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i;
       
       do{
        
        System.out.println("1. Create New File.");
        System.out.println("2. Read a File.");
        System.out.println("3. Update a File.");
        System.out.println("4. Delete a File.");
        System.out.println("5. Exit");
        
        i=scanner.nextInt();
        //using cases for better understanding of code
       switch (i) {
        case 1:
            
            create();
            break;
        case 2:
            read();
            break;
        case 3:
            write();
            break;
        case 4:
            delete();
            break;
        case 5:
        System.out.println("Exiting.");
        break;
        default:
        System.out.println("Invalid Choice");
            break;
       }
        
    }
    while(i!=5);

scanner.close();
}
}//lets run it.

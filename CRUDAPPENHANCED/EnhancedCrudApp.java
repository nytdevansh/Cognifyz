package CRUDAPPENHANCED;

import java.io.*;
import java.util.Scanner;

public class EnhancedCrudApp {

    private static final Scanner scanner = new Scanner(System.in);

    //checking if file exist
    private static boolean fileExists(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File not found: " + fileName);
            return false;
        }
        return true;
    }

   //create a file
    private static void create() {
        System.out.print("Enter the file name to create: ");
        String fileName = scanner.nextLine();

        if (fileName.isBlank()) {
            System.out.println("File name cannot be empty.");//used for leaving name blank
            return;
        }

        try {
            File newFile = new File(fileName);
            if (newFile.createNewFile()) {
                System.out.println("File created successfully: " + newFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.err.println("Error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    //read a file
    private static void read() {
        System.out.print("Enter the name of the file to read: ");
        String fileName = scanner.nextLine();

        if (!fileExists(fileName)) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {//here we used bufferreader instead of file reader beacause it works better with big data .
            System.out.println("Contents of the file:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    //writing to an existing file 
    private static void write() {
        System.out.print("Enter the name of the file to write to: ");
        String fileName = scanner.nextLine();
    
        if (!fileExists(fileName)) return;
    
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {//same for bufferwriter
            System.out.println("Start entering lines. Type '0' on a new line to stop writing:");
            
            while (true) {
                String content = scanner.nextLine();
                if (content.equals("0")) { //if it there is only zero in new line then wirting will be stopped
                    System.out.println("Stopped writing to the file.");
                    break;
                }
                writer.write(content);
                writer.newLine(); //to keep writing even on new line.
            }
    
            System.out.println("Successfully written to the file.");
        } catch (IOException e) {
            System.err.println("Error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    //to write data to an existing file which already has data.
    //note: if you use write to do the same the previous data will be deleted
    private static void append() {
        System.out.print("Enter the name of the file to append to: ");
        String fileName = scanner.nextLine();
    
        if (!fileExists(fileName)) return;
    
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) { 
            System.out.println("Start entering lines to append. Type '0' on a new line to stop:");
    
            while (true) {
                String content = scanner.nextLine();
                if (content.equals("0")) { //use 0 to end append
                    System.out.println("Stopped appending to the file.");
                    break;
                }
                writer.write(content);
                writer.newLine(); 
            }
    
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.err.println("Error occurred while appending to the file.");
            e.printStackTrace();
        }
    }

    //to delete a file
    private static void delete() {
        System.out.print("Enter the name of the file to delete: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);
        if (file.exists() && file.delete()) {
            System.out.println("File deleted successfully: " + file.getName());
        } else {
            System.out.println("File not found or could not be deleted.");
        }
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n=== Enhanced CRUD File Operations ===");
            System.out.println("1. Create New File");
            System.out.println("2. Read File");
            System.out.println("3. Overwrite File");
            System.out.println("4. Append to File");
            System.out.println("5. Delete File");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 1 and 6.");
                scanner.next(); 
            }

            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1 -> create();
                case 2 -> read();
                case 3 -> write();
                case 4 -> append();
                case 5 -> delete();
                case 6 -> System.out.println("Exiting the application. Goodbye!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
//the main code is writin in more reasonable and understandable way than before
//now lets run it.
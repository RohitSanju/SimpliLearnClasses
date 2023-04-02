package module1;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class FileManager {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option = "";
        
        while (!option.equals("3")) {
            System.out.println("Welcome to the File Manager application.");
            System.out.println("Developed by [developer details].");
            displayOptions();
            System.out.print("Enter your choice: ");
            option = scanner.nextLine();
            System.out.println();
            
            switch (option) {
                case "1":
                    listFiles();
                    break;
                case "2":
                    fileOptions(scanner);
                    break;
                case "3":
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
    
    public static void displayOptions() {
        System.out.println("Select an option:");
        System.out.println("1. List current files in ascending order");
        System.out.println("2. File options");
        System.out.println("3. Exit");
    }
    
    public static void listFiles() {
        File[] files = new File(".").listFiles();
        Arrays.sort(files);
        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
    
    public static void fileOptions(Scanner scanner) {
        String fileOption = "";
        
        while (!fileOption.equals("4")) {
            System.out.println("File options:");
            System.out.println("1. Add a file");
            System.out.println("2. Delete a file");
            System.out.println("3. Search for a file");
            System.out.println("4. Go back to main menu");
            System.out.print("Enter your choice: ");
            fileOption = scanner.nextLine();
            System.out.println();
            
            switch (fileOption) {
                case "1":
                    addFile(scanner);
                    break;
                case "2":
                    deleteFile(scanner);
                    break;
                case "3":
                    searchFile(scanner);
                    break;
                case "4":
                    System.out.println("Going back to main menu...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
    
    public static void addFile(Scanner scanner) {
        System.out.print("Enter file name to add: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        try {
            file.createNewFile();
            System.out.println(fileName + " added successfully.");
        } catch (Exception e) {
            System.out.println("Error occurred while adding file: " + e.getMessage());
        }
    }
    
    public static void deleteFile(Scanner scanner) {
        System.out.print("Enter file name to delete: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println(fileName + " deleted successfully.");
        } else {
            System.out.println("File not found.");
        }
    }
    
    public static void searchFile(Scanner scanner) {
        System.out.print("Enter file name to search: ");
        String fileName = scanner.nextLine();
        File[] files = new File(".").listFiles();
        boolean found = false;
        for (File file : files) {
            if (file.isFile() && file.getName().equalsIgnoreCase(fileName)) {
                System.out.println(fileName + " found.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(fileName);
        }
    }
}

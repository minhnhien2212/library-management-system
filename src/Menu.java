import java.io.BufferedReader;
import java.util.Scanner;

public abstract class Menu implements Manageable{
    public void showMenu(String displayMenu) {
        System.out.println("Given the options below " + displayMenu);
        System.out.println("1- Add");
        System.out.println("2- Search");
        System.out.println("3- Update");
        System.out.println("4- Remove");
        System.out.println("5- Display All");
        System.out.println("6- Save to file");
        System.out.println("7- Read from file");
        System.out.println("0- Exit");
        System.out.println("Enter option: ");
    }
    public void menu(String displayMenu) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            showMenu(displayMenu);
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    displayAll();
                    break;
                case 6:
                    saveFile();
                    break;
                case 7:
                    readFromFile();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("The word entered is incorrect, please re-enter");
                    break;
            }
        }
    }

    public void readFromFile() {

    }

    public void saveFile() {

    }
}

package exc_lab;

public class Menu {

    /**
     * Displays the selected menu option if valid.
     * 
     * @param opt the selected menu option (should be 1, 2, or 3)
     * @throws InvalidOptionException which is a custom exception
     */
    public void displayMenuOption(int opt) throws InvalidOptionException {
        switch (opt) {
            case 1:
                System.out.println("Menu option 1 selected");
                break;
            case 2:
                System.out.println("Menu option 2 selected");
                break;
            case 3:
                System.out.println("Menu option 3 selected");
                break;
            default:
                throw new InvalidOptionException("this option doesnt exist in the menu, choose between 1,2,3");
        }
    }
}

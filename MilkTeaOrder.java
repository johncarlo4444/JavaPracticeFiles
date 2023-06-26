import javax.swing.JOptionPane;

public class MilkTeaOrder {
    public static void main(String[] args) {
        // Predefined username and password
        String validUsername = "carlo";
        String validPassword = "ilagan";

        // username
        String username = JOptionPane.showInputDialog("SINO KA?:");

        // password
        String password = JOptionPane.showInputDialog("PATUNAYAN MO:");

        // Check if the entered credentials match the predefined values
        if (username.equals(validUsername) && password.equals(validPassword)) {
            // Array of available flavors
            String[] flavors = {"Classic", "Taro", "Matcha", "Honeydew"};

            // Display a dialog box to choose a flavor
            String selectedFlavor = (String) JOptionPane.showInputDialog(null, "Select a flavor:",
                    "Milk Tea Order", JOptionPane.PLAIN_MESSAGE, null, flavors, flavors[0]);

            // Array of available sizes and their corresponding prices
            String[] sizes = {"Small", "Medium", "Large"};
            double[] prices = {29.0, 39.0, 49.0};

            // Display a dialog box to choose a size
            String selectedSize = (String) JOptionPane.showInputDialog(null, "Select a size:",
                    "Milk Tea Order", JOptionPane.PLAIN_MESSAGE, null, sizes, sizes[0]);

            // Calculate the price based on the selected size
            double price = 0.00;

            switch (selectedSize) {
                case "Small":
                    price = prices[0];
                    break;
                case "Medium":
                    price = prices[1];
                    break;
                case "Large":
                    price = prices[2];
                    break;
            }

            // Display the selected flavor, size, and price in a message dialog
            String message = "Flavor: " + selectedFlavor + "\n"
                    + "Size: " + selectedSize + "\n"
                    + "Price: Php " + price;

            JOptionPane.showMessageDialog(null, message, "Milk Tea Order", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid username or password.", "Login Program", JOptionPane.ERROR_MESSAGE);
        }
    }
}

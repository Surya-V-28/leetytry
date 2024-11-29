 /*
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CandyMachineApp extends Application {

    // Prices of the items
    private final double CANDY_PRICE = 1.50;
    private final double CHIPS_PRICE = 2.00;
    private final double GUM_PRICE = 0.75;
    private final double COOKIES_PRICE = 3.00;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Set up the UI components
        primaryStage.setTitle("Candy Machine");

        // Create checkboxes for item selection
        CheckBox candyCheckBox = new CheckBox("Candy");
        CheckBox chipsCheckBox = new CheckBox("Chips");
        CheckBox gumCheckBox = new CheckBox("Gum");
        CheckBox cookiesCheckBox = new CheckBox("Cookies");

        // Create labels for prices
        Label candyPriceLabel = new Label("$" + CANDY_PRICE);
        Label chipsPriceLabel = new Label("$" + CHIPS_PRICE);
        Label gumPriceLabel = new Label("$" + GUM_PRICE);
        Label cookiesPriceLabel = new Label("$" + COOKIES_PRICE);

        // Create text fields for quantity input
        TextField candyQuantity = new TextField();
        TextField chipsQuantity = new TextField();
        TextField gumQuantity = new TextField();
        TextField cookiesQuantity = new TextField();

        // Create non-editable text fields for price display
        TextField candyPriceField = new TextField();
        TextField chipsPriceField = new TextField();
        TextField gumPriceField = new TextField();
        TextField cookiesPriceField = new TextField();
        
        candyPriceField.setEditable(false);
        chipsPriceField.setEditable(false);
        gumPriceField.setEditable(false);
        cookiesPriceField.setEditable(false);

        // Create a button to calculate the total bill
        Button billButton = new Button("Bill");
        
        // Create a label to display the total cost
        Text totalCostText = new Text("Total Cost: $0.00");

        // Event handler for "Candy" checkbox
        candyCheckBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                updatePrice(candyCheckBox, candyQuantity, candyPriceField, CANDY_PRICE);
            }
        });

        // Event handler for "Chips" checkbox
        chipsCheckBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                updatePrice(chipsCheckBox, chipsQuantity, chipsPriceField, CHIPS_PRICE);
            }
        });

        // Event handler for "Gum" checkbox
        gumCheckBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                updatePrice(gumCheckBox, gumQuantity, gumPriceField, GUM_PRICE);
            }
        });

        // Event handler for "Cookies" checkbox
        cookiesCheckBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                updatePrice(cookiesCheckBox, cookiesQuantity, cookiesPriceField, COOKIES_PRICE);
            }
        });

        // Event handler for the "Bill" button
        billButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double totalCost = calculateTotalCost(candyPriceField, chipsPriceField, gumPriceField, cookiesPriceField);
                totalCostText.setText("Total Cost: $" + String.format("%.2f", totalCost));
            }
        });

        // Set up the layout (GridPane)
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        // Add UI components to the grid
        grid.add(candyCheckBox, 0, 0);
        grid.add(candyPriceLabel, 1, 0);
        grid.add(candyQuantity, 2, 0);
        grid.add(candyPriceField, 3, 0);

        grid.add(chipsCheckBox, 0, 1);
        grid.add(chipsPriceLabel, 1, 1);
        grid.add(chipsQuantity, 2, 1);
        grid.add(chipsPriceField, 3, 1);

        grid.add(gumCheckBox, 0, 2);
        grid.add(gumPriceLabel, 1, 2);
        grid.add(gumQuantity, 2, 2);
        grid.add(gumPriceField, 3, 2);

        grid.add(cookiesCheckBox, 0, 3);
        grid.add(cookiesPriceLabel, 1, 3);
        grid.add(cookiesQuantity, 2, 3);
        grid.add(cookiesPriceField, 3, 3);

        grid.add(billButton, 0, 4);
        grid.add(totalCostText, 1, 4, 3, 1);

        // Set up the scene and show the stage
        Scene scene = new Scene(grid, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Method to update the price based on item selection and quantity
    private void updatePrice(CheckBox checkBox, TextField quantityField, TextField priceField, double itemPrice) {
        try {
            if (checkBox.isSelected() && !quantityField.getText().isEmpty()) {
                int quantity = Integer.parseInt(quantityField.getText());
                double totalPrice = itemPrice * quantity;
                priceField.setText("$" + String.format("%.2f", totalPrice));
            } else {
                priceField.clear();
            }
        } catch (NumberFormatException e) {
            priceField.clear();
        }
    }

    // Method to calculate the total cost based on the prices of the items
    private double calculateTotalCost(TextField candyPriceField, TextField chipsPriceField, TextField gumPriceField, TextField cookiesPriceField) {
        double totalCost = 0;
        if (!candyPriceField.getText().isEmpty()) {
            totalCost += Double.parseDouble(candyPriceField.getText().substring(1)); // Remove the "$" sign
        }
        if (!chipsPriceField.getText().isEmpty()) {
            totalCost += Double.parseDouble(chipsPriceField.getText().substring(1));
        }
        if (!gumPriceField.getText().isEmpty()) {
            totalCost += Double.parseDouble(gumPriceField.getText().substring(1));
        }
        if (!cookiesPriceField.getText().isEmpty()) {
            totalCost += Double.parseDouble(cookiesPriceField.getText().substring(1));
        }
        return totalCost;
    }
 }

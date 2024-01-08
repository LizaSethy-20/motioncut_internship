package expense_income_tracker;

/**
 *
 * @author LIZA SETHY
 */

/*
* ExpenseIncomeEntry represents a single entry for expenses & incomes.
* Each entry contains a date, description, amount & type (expense or income).
*/

public class ExpenseIncomeEntry {
    
    private String date;
    private String description;
    private double amount;
    private String type; //The type of entry (expense or income).
    private String category;
    
    
    public ExpenseIncomeEntry(String date, String description, double amount, String type, String category){
        
        this.date = date;
        this.description = description;
        this.amount = amount;
        this.type = type;
        this.category = category;
        
    }
    
    public String getDate(){
        return date; 
    }
    
    public String getDescription(){
        return description; 
    }
    
    public double getAmount(){
        return amount;
    }
    
    public String getType(){
        return type;
    }
    
    public String getCategory(){
        return category;
    }
    
}

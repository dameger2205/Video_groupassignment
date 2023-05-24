
public class Item {

    private String id;

    private String title;

    private String rentalType;

    private String loanType;

    private int numberOfCopies;

    private double rentalFee;

    private String rentalStatus;

    public Item(String id, String title, String rentalType, String loanType, int numberOfCopies, double rentalFee, String rentalStatus){

             this.id = id;
             this.title = title;
             this.rentalType = rentalType;
             this.loanType = loanType;
             this.numberOfCopies = numberOfCopies;
             this.rentalFee = rentalFee;
             this.rentalStatus = rentalStatus;
    }

    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
         this.title = title;
    }

    public  String getRentalType(){
        return rentalType;
    }

    public void setRentalType(String rentalType){
        String[] availableType = {"Record", "DVD", "Game"};
        boolean matched = false;
        for (String type:availableType){
            if (rentalType.equals(type)){
                matched = true;
            }
        }
        if (matched)
            this.rentalType = rentalType;
        else
            System.out.println("Error type");
    }
    
    public String getLoanType(){
        return loanType;
    }

    public void setLoanType(String loanType){
        this.loanType = loanType;
    }

    public int getNumberOfCopies(){
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies){
        this.numberOfCopies = numberOfCopies;
    }

    public double getRentalFee(){
        return rentalFee;
    }

    public void setRentalFee(Double rentalFee){
        this.rentalFee = rentalFee;
    }

    public String getRentalStatus(){
        return rentalStatus;
    }

    public void setRentalStatus(String rentalStatus){
        this.rentalStatus = rentalStatus;
    }

    public void rent(Item item){
        if (item.numberOfCopies > 0) {
            item.numberOfCopies--;
            item.rentalStatus = "borrowed";
            System.out.println("Item rented.");
        } else{
            item.rentalStatus = "not available";
            System.out.println("Item is currently not available for rent. Please check at another time.");
        }
    }

    public void returnItem(Item item){
        item.numberOfCopies++;
        item.rentalStatus = "available";
        System.out.println("Item returned successfully");
    }


 @Override
    public String toString(){
        return "Item ID: " + id + "\nTitle: " + title + "\nRent type: " + rentalType + "\nLoan type: " + loanType + "\nNumber of copies: " + numberOfCopies + "\nRental Fee: " + rentalFee;
    }
}

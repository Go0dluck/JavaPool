import java.util.UUID;

public class Transaction {
    private UUID        Identifier;
    private User        Recipient;
    private User        Sender;
    private Transfer    Category;
    private int         Amount;

    @Override
    public String toString() {
        if (Category == Transfer.CREDITS)
            return Recipient.getName() + " -> " + Sender.getName() + ", " + getAmount() + ", OUTCOME, transaction " + getIdentifier();
        else
            return Sender.getName() + " -> " + Recipient.getName()+ ", +" + getAmount() + ", INCOME, transaction " + getIdentifier();
    }

    public Transaction(User recipient, User sender, Transfer category) {
        Recipient = recipient;
        Sender = sender;
        Category = category;
    }

    public Transaction(User recipient, User sender, Transfer category, int amount) {
        Recipient = recipient;
        Sender = sender;
        Category = category;
        setAmount(amount);
    }

    public UUID getIdentifier() {
        return Identifier;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        if (Category == Transfer.CREDITS && amount > 0){
            System.out.println("Negative amounts only");
        }
        else if (Category == Transfer.DEBITS && amount < 0){
            System.out.println("Positive amounts only");
        }
            Amount = amount;
    }
}

enum Transfer
{
    DEBITS,
    CREDITS
}
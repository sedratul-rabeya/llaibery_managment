package librarymanagementsystem;

import java.io.Serializable;
import java.util.Date;

public class Transaction implements Serializable{

    private int transactionId;
    private String borrowerUsername;
    private String bookTitle;
    private double issueFine;
    private double overdueFine;
    private double damagedFine;
    private Date transactionDate;

    public Transaction(String borrowerUsername, String bookTitle, double issueFine, double overdueFine) {
        this.transactionId = 0;
        this.borrowerUsername = borrowerUsername;
        this.bookTitle = bookTitle;
        this.issueFine = issueFine;
        this.overdueFine = overdueFine;
        this.damagedFine = 0.0;
        this.transactionDate = new Date();
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getBorrowerUsername() {
        return borrowerUsername;
    }

    public void setBorrowerUsername(String borrowerUsername) {
        this.borrowerUsername = borrowerUsername;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getIssueFine() {
        return issueFine;
    }

    public void setIssueFine(double issueFine) {
        this.issueFine = issueFine;
    }

    public double getOverdueFine() {
        return overdueFine;
    }

    public void setOverdueFine(double overdueFine) {
        this.overdueFine = overdueFine;
    }

    public double getDamagedFine() {
        return damagedFine;
    }

    public void setDamagedFine(double damagedFine) {
        this.damagedFine = damagedFine;
    }

    public double getTotalFine() {
        return issueFine + overdueFine + damagedFine;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", borrowerUsername='" + borrowerUsername + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", transactionDate=" + transactionDate +
                ", issueFine=" + issueFine +
                ", overdueFine=" + overdueFine +
                ", damagedFine=" + damagedFine +
                '}';
    }
}

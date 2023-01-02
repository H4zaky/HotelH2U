package es2_groupbf.entities;

import java.util.List;

public class Client {
    private String docIdHash;
    private List<Transaction> transactions;

    public Client(String docIdHash, List<Transaction> transactions) {
        this.docIdHash = docIdHash;
        this.transactions = transactions;
    }

    public String getDocIdHash() {
        return docIdHash;
    }

    public void setDocIdHash(String docIdHash) {
        this.docIdHash = docIdHash;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}

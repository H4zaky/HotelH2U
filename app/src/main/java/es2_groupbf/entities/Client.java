package es2_groupbf.entities;

import es2_groupbf.segmentation.indicators.MonetizationIndicator;
import es2_groupbf.segmentation.indicators.RegularityIndicator;
import es2_groupbf.segmentation.indicators.TotalPurchasesIndicator;

import java.util.List;
import java.util.Objects;

public class Client {
    private String docIdHash;
    private List<Transaction> transactions;
    private Double monetization;
    private Integer regularity;
    private Integer totalPurchases;
    private Integer monetizationScore;
    private Integer regularityScore;
    private Integer totalPurchasesScore;

    public Client() {
    }

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

    public Double getMonetization() {
        return monetization;
    }

    public void setMonetization(Double monetization) {
        this.monetization = monetization;
    }

    public Integer getRegularity() {
        return regularity;
    }

    public void setRegularity(Integer regularity) {
        this.regularity = regularity;
    }

    public Integer getTotalPurchases() {
        return totalPurchases;
    }

    public void setTotalPurchases(Integer totalPurchases) {
        this.totalPurchases = totalPurchases;
    }

    public Integer getMonetizationScore() {
        return monetizationScore;
    }

    public void setMonetizationScore(Integer monetizationScore) {
        this.monetizationScore = monetizationScore;
    }

    public Integer getRegularityScore() {
        return regularityScore;
    }

    public void setRegularityScore(Integer regularityScore) {
        this.regularityScore = regularityScore;
    }

    public Integer getTotalPurchasesScore() {
        return totalPurchasesScore;
    }

    public void setTotalPurchasesScore(Integer totalPurchasesScore) {
        this.totalPurchasesScore = totalPurchasesScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;
        return Objects.equals(getDocIdHash(), client.getDocIdHash()) && Objects.equals(getTransactions(), client.getTransactions()) && Objects.equals(getMonetization(), client.getMonetization()) && Objects.equals(getRegularity(), client.getRegularity()) && Objects.equals(getTotalPurchases(), client.getTotalPurchases()) && Objects.equals(getMonetizationScore(), client.getMonetizationScore()) && Objects.equals(getRegularityScore(), client.getRegularityScore()) && Objects.equals(getTotalPurchasesScore(), client.getTotalPurchasesScore());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDocIdHash(), getTransactions(), getMonetization(), getRegularity(), getTotalPurchases(), getMonetizationScore(), getRegularityScore(), getTotalPurchasesScore());
    }

    @Override
    public String toString() {
        return "Client{" +
                "docIdHash='" + docIdHash + '\'' +
                ", transactions=" + transactions +
                ", monetization=" + monetization +
                ", regularity=" + regularity +
                ", totalPurchases=" + totalPurchases +
                ", monetizationScore=" + monetizationScore +
                ", regularityScore=" + regularityScore +
                ", totalPurchasesScore=" + totalPurchasesScore +
                '}';
    }
}

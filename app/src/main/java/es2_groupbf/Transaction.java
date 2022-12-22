package es2_groupbf;

import com.opencsv.bean.CsvBindByName;

import java.util.Objects;

public class Transaction {
    @CsvBindByName(column = "ID")
    private String id;

    @CsvBindByName(column = "Nationality")
    private String nationality;

    @CsvBindByName(column = "Age")
    private String age;

    @CsvBindByName(column = "DaysSinceCreation")
    private String daysSinceCreation;

    @CsvBindByName(column = "NameHash")
    private String nameHash;

    @CsvBindByName(column = "DocIDHash")
    private String docIdHash;

    @CsvBindByName(column = "AverageLeadTime")
    private String averageLeadTime;

    @CsvBindByName(column = "LodgingRevenue")
    private String lodgingRevenue;

    @CsvBindByName(column = "OtherRevenue")
    private String otherRevenue;

    @CsvBindByName(column = "BookingsCanceled")
    private String bookingsCanceled;

    @CsvBindByName(column = "BookingsCheckedIn")
    private String bookingsCheckedIn;

    @CsvBindByName(column = "PersonsNights")
    private String personsNights;

    @CsvBindByName(column = "RoomNights")
    private String roomNights;

    @CsvBindByName(column = "DaysSinceLastStay")
    private String daysSinceLastStay;

    @CsvBindByName(column = "DaysSinceFirstStay")
    private String daysSinceFirstStay;

    @CsvBindByName(column = "DistributionChannel")
    private String distributionChannel;

    @CsvBindByName(column = "MarketSegment")
    private String marketSegment;

    @CsvBindByName(column = "PurchaseDate")
    private String purchaseDate;

    @CsvBindByName(column = "PaymentMethod")
    private String paymentMethod;

    public Transaction() {
    }

    public Transaction(String id, String nationality, String age, String daysSinceCreation, String nameHash, String docIdHash, String averageLeadTime, String lodgingRevenue, String otherRevenue, String bookingsCanceled, String bookingsCheckedIn, String personsNights, String roomNights, String daysSinceLastStay, String daysSinceFirstStay, String distributionChannel, String marketSegment, String purchaseDate, String paymentMethod) {
        this.id = id;
        this.nationality = nationality;
        this.age = age;
        this.daysSinceCreation = daysSinceCreation;
        this.nameHash = nameHash;
        this.docIdHash = docIdHash;
        this.averageLeadTime = averageLeadTime;
        this.lodgingRevenue = lodgingRevenue;
        this.otherRevenue = otherRevenue;
        this.bookingsCanceled = bookingsCanceled;
        this.bookingsCheckedIn = bookingsCheckedIn;
        this.personsNights = personsNights;
        this.roomNights = roomNights;
        this.daysSinceLastStay = daysSinceLastStay;
        this.daysSinceFirstStay = daysSinceFirstStay;
        this.distributionChannel = distributionChannel;
        this.marketSegment = marketSegment;
        this.purchaseDate = purchaseDate;
        this.paymentMethod = paymentMethod;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDaysSinceCreation() {
        return daysSinceCreation;
    }

    public void setDaysSinceCreation(String daysSinceCreation) {
        this.daysSinceCreation = daysSinceCreation;
    }

    public String getNameHash() {
        return nameHash;
    }

    public void setNameHash(String nameHash) {
        this.nameHash = nameHash;
    }

    public String getDocIdHash() {
        return docIdHash;
    }

    public void setDocIdHash(String docIdHash) {
        this.docIdHash = docIdHash;
    }

    public String getAverageLeadTime() {
        return averageLeadTime;
    }

    public void setAverageLeadTime(String averageLeadTime) {
        this.averageLeadTime = averageLeadTime;
    }

    public String getLodgingRevenue() {
        return lodgingRevenue;
    }

    public void setLodgingRevenue(String lodgingRevenue) {
        this.lodgingRevenue = lodgingRevenue;
    }

    public String getOtherRevenue() {
        return otherRevenue;
    }

    public void setOtherRevenue(String otherRevenue) {
        this.otherRevenue = otherRevenue;
    }

    public String getBookingsCanceled() {
        return bookingsCanceled;
    }

    public void setBookingsCanceled(String bookingsCanceled) {
        this.bookingsCanceled = bookingsCanceled;
    }

    public String getBookingsCheckedIn() {
        return bookingsCheckedIn;
    }

    public void setBookingsCheckedIn(String bookingsCheckedIn) {
        this.bookingsCheckedIn = bookingsCheckedIn;
    }

    public String getPersonsNights() {
        return personsNights;
    }

    public void setPersonsNights(String personsNights) {
        this.personsNights = personsNights;
    }

    public String getRoomNights() {
        return roomNights;
    }

    public void setRoomNights(String roomNights) {
        this.roomNights = roomNights;
    }

    public String getDaysSinceLastStay() {
        return daysSinceLastStay;
    }

    public void setDaysSinceLastStay(String daysSinceLastStay) {
        this.daysSinceLastStay = daysSinceLastStay;
    }

    public String getDaysSinceFirstStay() {
        return daysSinceFirstStay;
    }

    public void setDaysSinceFirstStay(String daysSinceFirstStay) {
        this.daysSinceFirstStay = daysSinceFirstStay;
    }

    public String getDistributionChannel() {
        return distributionChannel;
    }

    public void setDistributionChannel(String distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    public String getMarketSegment() {
        return marketSegment;
    }

    public void setMarketSegment(String marketSegment) {
        this.marketSegment = marketSegment;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getNationality(), that.getNationality()) && Objects.equals(getAge(), that.getAge()) && Objects.equals(getDaysSinceCreation(), that.getDaysSinceCreation()) && Objects.equals(getNameHash(), that.getNameHash()) && Objects.equals(getDocIdHash(), that.getDocIdHash()) && Objects.equals(getAverageLeadTime(), that.getAverageLeadTime()) && Objects.equals(getLodgingRevenue(), that.getLodgingRevenue()) && Objects.equals(getOtherRevenue(), that.getOtherRevenue()) && Objects.equals(getBookingsCanceled(), that.getBookingsCanceled()) && Objects.equals(getBookingsCheckedIn(), that.getBookingsCheckedIn()) && Objects.equals(getPersonsNights(), that.getPersonsNights()) && Objects.equals(getRoomNights(), that.getRoomNights()) && Objects.equals(getDaysSinceLastStay(), that.getDaysSinceLastStay()) && Objects.equals(getDaysSinceFirstStay(), that.getDaysSinceFirstStay()) && Objects.equals(getDistributionChannel(), that.getDistributionChannel()) && Objects.equals(getMarketSegment(), that.getMarketSegment()) && Objects.equals(getPurchaseDate(), that.getPurchaseDate()) && Objects.equals(getPaymentMethod(), that.getPaymentMethod());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNationality(), getAge(), getDaysSinceCreation(), getNameHash(), getDocIdHash(), getAverageLeadTime(), getLodgingRevenue(), getOtherRevenue(), getBookingsCanceled(), getBookingsCheckedIn(), getPersonsNights(), getRoomNights(), getDaysSinceLastStay(), getDaysSinceFirstStay(), getDistributionChannel(), getMarketSegment(), getPurchaseDate(), getPaymentMethod());
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", nationality='" + nationality + '\'' +
                ", age='" + age + '\'' +
                ", daysSinceCreation='" + daysSinceCreation + '\'' +
                ", nameHash='" + nameHash + '\'' +
                ", docIdHash='" + docIdHash + '\'' +
                ", averageLeadTime='" + averageLeadTime + '\'' +
                ", lodgingRevenue='" + lodgingRevenue + '\'' +
                ", otherRevenue='" + otherRevenue + '\'' +
                ", bookingsCanceled='" + bookingsCanceled + '\'' +
                ", bookingsCheckedIn='" + bookingsCheckedIn + '\'' +
                ", personsNights='" + personsNights + '\'' +
                ", roomNights='" + roomNights + '\'' +
                ", daysSinceLastStay='" + daysSinceLastStay + '\'' +
                ", daysSinceFirstStay='" + daysSinceFirstStay + '\'' +
                ", distributionChannel='" + distributionChannel + '\'' +
                ", marketSegment='" + marketSegment + '\'' +
                ", purchaseDate='" + purchaseDate + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}

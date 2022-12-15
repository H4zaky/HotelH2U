package es2_groupbf;

import com.opencsv.bean.CsvBindByPosition;

import java.util.Objects;

public class Client {
    @CsvBindByPosition(position = 0)
    private String id;

    @CsvBindByPosition(position = 1)
    private String nationality;

    @CsvBindByPosition(position = 2)
    private String age;

    @CsvBindByPosition(position = 3)
    private String daysSinceCreation;

    @CsvBindByPosition(position = 4)
    private String nameHash;

    @CsvBindByPosition(position = 5)
    private String docIdHash;

    @CsvBindByPosition(position = 6)
    private String averageLeadTime;

    @CsvBindByPosition(position = 7)
    private String lodgingRevenue;

    @CsvBindByPosition(position = 8)
    private String otherRevenue;

    @CsvBindByPosition(position = 9)
    private String bookingsCanceled;

    @CsvBindByPosition(position = 11)
    private String bookingsCheckedIn;

    @CsvBindByPosition(position = 12)
    private String personsNights;

    @CsvBindByPosition(position = 13)
    private String roomNights;

    @CsvBindByPosition(position = 14)
    private String daysSinceLastStay;

    @CsvBindByPosition(position = 15)
    private String daysSinceFirstStay;

    @CsvBindByPosition(position = 16)
    private String distributionChannel;

    @CsvBindByPosition(position = 17)
    private String marketSegment;

    public Client() {
    }

    public Client(String id, String nationality, String age, String daysSinceCreation, String nameHash, String docIdHash, String averageLeadTime, String lodgingRevenue, String otherRevenue, String bookingsCanceled, String bookingsCheckedIn, String personsNights, String roomNights, String daysSinceLastStay, String daysSinceFirstStay, String distributionChannel, String marketSegment) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;
        return Objects.equals(getId(), client.getId()) && Objects.equals(getNationality(), client.getNationality()) && Objects.equals(getAge(), client.getAge()) && Objects.equals(getDaysSinceCreation(), client.getDaysSinceCreation()) && Objects.equals(getNameHash(), client.getNameHash()) && Objects.equals(getDocIdHash(), client.getDocIdHash()) && Objects.equals(getAverageLeadTime(), client.getAverageLeadTime()) && Objects.equals(getLodgingRevenue(), client.getLodgingRevenue()) && Objects.equals(getOtherRevenue(), client.getOtherRevenue()) && Objects.equals(getBookingsCanceled(), client.getBookingsCanceled()) && Objects.equals(getBookingsCheckedIn(), client.getBookingsCheckedIn()) && Objects.equals(getPersonsNights(), client.getPersonsNights()) && Objects.equals(getRoomNights(), client.getRoomNights()) && Objects.equals(getDaysSinceLastStay(), client.getDaysSinceLastStay()) && Objects.equals(getDaysSinceFirstStay(), client.getDaysSinceFirstStay()) && Objects.equals(getDistributionChannel(), client.getDistributionChannel()) && Objects.equals(getMarketSegment(), client.getMarketSegment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNationality(), getAge(), getDaysSinceCreation(), getNameHash(), getDocIdHash(), getAverageLeadTime(), getLodgingRevenue(), getOtherRevenue(), getBookingsCanceled(), getBookingsCheckedIn(), getPersonsNights(), getRoomNights(), getDaysSinceLastStay(), getDaysSinceFirstStay(), getDistributionChannel(), getMarketSegment());
    }

    @Override
    public String toString() {
        return "Client{" + "id='" + id + '\'' + ", nationality='" + nationality + '\'' + ", age='" + age + '\'' + ", daysSinceCreation='" + daysSinceCreation + '\'' + ", nameHash='" + nameHash + '\'' + ", docIdHash='" + docIdHash + '\'' + ", averageLeadTime='" + averageLeadTime + '\'' + ", lodgingRevenue='" + lodgingRevenue + '\'' + ", otherRevenue='" + otherRevenue + '\'' + ", bookingsCanceled='" + bookingsCanceled + '\'' + ", bookingsCheckedIn='" + bookingsCheckedIn + '\'' + ", personsNights='" + personsNights + '\'' + ", roomNights='" + roomNights + '\'' + ", daysSinceLastStay='" + daysSinceLastStay + '\'' + ", daysSinceFirstStay='" + daysSinceFirstStay + '\'' + ", distributionChannel='" + distributionChannel + '\'' + ", marketSegment='" + marketSegment + '\'' + '}';
    }
}

package es2_groupbf.entities;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvCustomBindByName;
import es2_groupbf.converters.DateConverter;
import es2_groupbf.converters.DoubleConverter;
import es2_groupbf.converters.NullConverter;
import es2_groupbf.converters.PaymentMethodConverter;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Objects;

public class Transaction {
    @CsvCustomBindByName(column = "ID", converter = NullConverter.class)
    private Integer id;
    @CsvBindByName(column = "Nationality")
    private String nationality;
    @CsvCustomBindByName(column = "Age", converter = NullConverter.class)
    private Integer age;
    @CsvCustomBindByName(column = "DaysSinceCreation", converter = NullConverter.class)
    private Integer daysSinceCreation;
    @CsvBindByName(column = "NameHash")
    private String nameHash;
    @CsvBindByName(column = "DocIDHash")
    private String docIdHash;
    @CsvCustomBindByName(column = "AverageLeadTime", converter = NullConverter.class)
    private Integer averageLeadTime;
    @CsvCustomBindByName(column = "LodgingRevenue", converter = DoubleConverter.class)
    private Double lodgingRevenue;
    @CsvCustomBindByName(column = "OtherRevenue", converter = DoubleConverter.class)
    private Double otherRevenue;
    @CsvCustomBindByName(column = "BookingsCanceled", converter = NullConverter.class)
    private Integer bookingsCanceled;
    @CsvCustomBindByName(column = "BookingsCheckedIn", converter = NullConverter.class)
    private Integer bookingsCheckedIn;
    @CsvCustomBindByName(column = "PersonsNights", converter = NullConverter.class)
    private Integer personsNights;
    @CsvCustomBindByName(column = "RoomNights", converter = NullConverter.class)
    private Integer roomNights;
    @CsvCustomBindByName(column = "DaysSinceLastStay", converter = NullConverter.class)
    private Integer daysSinceLastStay;
    @CsvCustomBindByName(column = "DaysSinceFirstStay", converter = NullConverter.class)
    private Integer daysSinceFirstStay;
    @CsvBindByName(column = "DistributionChannel")
    private String distributionChannel;
    @CsvBindByName(column = "MarketSegment")
    private String marketSegment;
    @CsvCustomBindByName(column = "PurchaseDate", converter = DateConverter.class)
    private Date purchaseDate;
    @CsvCustomBindByName(column = "PaymentMethod", converter = PaymentMethodConverter.class)
    private Integer paymentMethod;

    public Transaction() {
    }

    public Transaction(Integer id, String nationality, Integer age, Integer daysSinceCreation, String nameHash, String docIdHash, Integer averageLeadTime, Double lodgingRevenue, Double otherRevenue, Integer bookingsCanceled, Integer bookingsCheckedIn, Integer personsNights, Integer roomNights, Integer daysSinceLastStay, Integer daysSinceFirstStay, String distributionChannel, String marketSegment, Date purchaseDate, Integer paymentMethod) {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDaysSinceCreation() {
        return daysSinceCreation;
    }

    public void setDaysSinceCreation(Integer daysSinceCreation) {
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

    public Integer getAverageLeadTime() {
        return averageLeadTime;
    }

    public void setAverageLeadTime(Integer averageLeadTime) {
        this.averageLeadTime = averageLeadTime;
    }

    public Double getLodgingRevenue() {
        return lodgingRevenue;
    }

    public void setLodgingRevenue(Double lodgingRevenue) {
        this.lodgingRevenue = lodgingRevenue;
    }

    public Double getOtherRevenue() {
        return otherRevenue;
    }

    public void setOtherRevenue(Double otherRevenue) {
        this.otherRevenue = otherRevenue;
    }

    public Integer getBookingsCanceled() {
        return bookingsCanceled;
    }

    public void setBookingsCanceled(Integer bookingsCanceled) {
        this.bookingsCanceled = bookingsCanceled;
    }

    public Integer getBookingsCheckedIn() {
        return bookingsCheckedIn;
    }

    public void setBookingsCheckedIn(Integer bookingsCheckedIn) {
        this.bookingsCheckedIn = bookingsCheckedIn;
    }

    public Integer getPersonsNights() {
        return personsNights;
    }

    public void setPersonsNights(Integer personsNights) {
        this.personsNights = personsNights;
    }

    public Integer getRoomNights() {
        return roomNights;
    }

    public void setRoomNights(Integer roomNights) {
        this.roomNights = roomNights;
    }

    public Integer getDaysSinceLastStay() {
        return daysSinceLastStay;
    }

    public void setDaysSinceLastStay(Integer daysSinceLastStay) {
        this.daysSinceLastStay = daysSinceLastStay;
    }

    public Integer getDaysSinceFirstStay() {
        return daysSinceFirstStay;
    }

    public void setDaysSinceFirstStay(Integer daysSinceFirstStay) {
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

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Integer getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public LocalDate getDate() {
        return purchaseDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
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
                "id=" + id +
                ", nationality='" + nationality + '\'' +
                ", age=" + age +
                ", daysSinceCreation=" + daysSinceCreation +
                ", nameHash='" + nameHash + '\'' +
                ", docIdHash='" + docIdHash + '\'' +
                ", averageLeadTime=" + averageLeadTime +
                ", lodgingRevenue=" + lodgingRevenue +
                ", otherRevenue=" + otherRevenue +
                ", bookingsCanceled=" + bookingsCanceled +
                ", bookingsCheckedIn=" + bookingsCheckedIn +
                ", personsNights=" + personsNights +
                ", roomNights=" + roomNights +
                ", daysSinceLastStay=" + daysSinceLastStay +
                ", daysSinceFirstStay=" + daysSinceFirstStay +
                ", distributionChannel='" + distributionChannel + '\'' +
                ", marketSegment='" + marketSegment + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", paymentMethod=" + paymentMethod +
                '}';
    }
}

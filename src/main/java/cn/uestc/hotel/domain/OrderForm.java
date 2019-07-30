package cn.uestc.hotel.domain;

import java.util.Date;

public class OrderForm {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderform.OrderFormID
     *
     * @mbg.generated Tue Jul 30 11:01:12 CST 2019
     */
    private String orderformid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderform.HotelID
     *
     * @mbg.generated Tue Jul 30 11:01:12 CST 2019
     */
    private String hotelid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderform.CustomerID
     *
     * @mbg.generated Tue Jul 30 11:01:12 CST 2019
     */
    private String customerid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderform.ArriveTime
     *
     * @mbg.generated Tue Jul 30 11:01:12 CST 2019
     */
    private Date arrivetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderform.LeftTime
     *
     * @mbg.generated Tue Jul 30 11:01:12 CST 2019
     */
    private Date lefttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderform.Price
     *
     * @mbg.generated Tue Jul 30 11:01:12 CST 2019
     */
    private Float price;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Tue Jul 30 11:01:12 CST 2019
     */
    public OrderForm(String orderformid, String hotelid, String customerid, Date arrivetime, Date lefttime, Float price) {
        this.orderformid = orderformid;
        this.hotelid = hotelid;
        this.customerid = customerid;
        this.arrivetime = arrivetime;
        this.lefttime = lefttime;
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Tue Jul 30 11:01:12 CST 2019
     */
    public OrderForm() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderform.OrderFormID
     *
     * @return the value of orderform.OrderFormID
     *
     * @mbg.generated Tue Jul 30 11:01:12 CST 2019
     */
    public String getOrderformid() {
        return orderformid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderform.OrderFormID
     *
     * @param orderformid the value for orderform.OrderFormID
     *
     * @mbg.generated Tue Jul 30 11:01:12 CST 2019
     */
    public void setOrderformid(String orderformid) {
        this.orderformid = orderformid == null ? null : orderformid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderform.HotelID
     *
     * @return the value of orderform.HotelID
     *
     * @mbg.generated Tue Jul 30 11:01:12 CST 2019
     */
    public String getHotelid() {
        return hotelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderform.HotelID
     *
     * @param hotelid the value for orderform.HotelID
     *
     * @mbg.generated Tue Jul 30 11:01:12 CST 2019
     */
    public void setHotelid(String hotelid) {
        this.hotelid = hotelid == null ? null : hotelid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderform.CustomerID
     *
     * @return the value of orderform.CustomerID
     *
     * @mbg.generated Tue Jul 30 11:01:12 CST 2019
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderform.CustomerID
     *
     * @param customerid the value for orderform.CustomerID
     *
     * @mbg.generated Tue Jul 30 11:01:12 CST 2019
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderform.ArriveTime
     *
     * @return the value of orderform.ArriveTime
     *
     * @mbg.generated Tue Jul 30 11:01:12 CST 2019
     */
    public Date getArrivetime() {
        return arrivetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderform.ArriveTime
     *
     * @param arrivetime the value for orderform.ArriveTime
     *
     * @mbg.generated Tue Jul 30 11:01:12 CST 2019
     */
    public void setArrivetime(Date arrivetime) {
        this.arrivetime = arrivetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderform.LeftTime
     *
     * @return the value of orderform.LeftTime
     *
     * @mbg.generated Tue Jul 30 11:01:12 CST 2019
     */
    public Date getLefttime() {
        return lefttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderform.LeftTime
     *
     * @param lefttime the value for orderform.LeftTime
     *
     * @mbg.generated Tue Jul 30 11:01:12 CST 2019
     */
    public void setLefttime(Date lefttime) {
        this.lefttime = lefttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderform.Price
     *
     * @return the value of orderform.Price
     *
     * @mbg.generated Tue Jul 30 11:01:12 CST 2019
     */
    public Float getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderform.Price
     *
     * @param price the value for orderform.Price
     *
     * @mbg.generated Tue Jul 30 11:01:12 CST 2019
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Tue Jul 30 11:01:12 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OrderForm other = (OrderForm) that;
        return (this.getOrderformid() == null ? other.getOrderformid() == null : this.getOrderformid().equals(other.getOrderformid()))
            && (this.getHotelid() == null ? other.getHotelid() == null : this.getHotelid().equals(other.getHotelid()))
            && (this.getCustomerid() == null ? other.getCustomerid() == null : this.getCustomerid().equals(other.getCustomerid()))
            && (this.getArrivetime() == null ? other.getArrivetime() == null : this.getArrivetime().equals(other.getArrivetime()))
            && (this.getLefttime() == null ? other.getLefttime() == null : this.getLefttime().equals(other.getLefttime()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Tue Jul 30 11:01:12 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderformid() == null) ? 0 : getOrderformid().hashCode());
        result = prime * result + ((getHotelid() == null) ? 0 : getHotelid().hashCode());
        result = prime * result + ((getCustomerid() == null) ? 0 : getCustomerid().hashCode());
        result = prime * result + ((getArrivetime() == null) ? 0 : getArrivetime().hashCode());
        result = prime * result + ((getLefttime() == null) ? 0 : getLefttime().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        return result;
    }
}
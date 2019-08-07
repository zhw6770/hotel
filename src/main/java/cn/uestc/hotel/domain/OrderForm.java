package cn.uestc.hotel.domain;

public class OrderForm {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderform.OrderFormID
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    private String orderformid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderform.HotelID
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    private String hotelid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderform.CustomerID
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    private String customerid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderform.ArriveTime
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    private String arrivetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderform.LeftTime
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    private String lefttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderform.Price
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    private Float price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderform.RoomID1
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    private String roomid1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderform.RoomID2
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    private String roomid2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderform.RoomID3
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    private String roomid3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderform.RoomID4
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    private String roomid4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderform.RoomID5
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    private String roomid5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderform.RoomNum
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    private String roomnum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderform.IsAvailable
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    private String isavailable;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    public OrderForm(String orderformid, String hotelid, String customerid, String arrivetime, String lefttime, Float price, String roomid1, String roomid2, String roomid3, String roomid4, String roomid5, String roomnum, String isavailable) {
        this.orderformid = orderformid;
        this.hotelid = hotelid;
        this.customerid = customerid;
        this.arrivetime = arrivetime;
        this.lefttime = lefttime;
        this.price = price;
        this.roomid1 = roomid1;
        this.roomid2 = roomid2;
        this.roomid3 = roomid3;
        this.roomid4 = roomid4;
        this.roomid5 = roomid5;
        this.roomnum = roomnum;
        this.isavailable = isavailable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
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
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
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
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
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
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
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
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
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
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
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
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
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
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    public String getArrivetime() {
        return arrivetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderform.ArriveTime
     *
     * @param arrivetime the value for orderform.ArriveTime
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    public void setArrivetime(String arrivetime) {
        this.arrivetime = arrivetime == null ? null : arrivetime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderform.LeftTime
     *
     * @return the value of orderform.LeftTime
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    public String getLefttime() {
        return lefttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderform.LeftTime
     *
     * @param lefttime the value for orderform.LeftTime
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    public void setLefttime(String lefttime) {
        this.lefttime = lefttime == null ? null : lefttime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderform.Price
     *
     * @return the value of orderform.Price
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
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
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderform.RoomID1
     *
     * @return the value of orderform.RoomID1
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    public String getRoomid1() {
        return roomid1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderform.RoomID1
     *
     * @param roomid1 the value for orderform.RoomID1
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    public void setRoomid1(String roomid1) {
        this.roomid1 = roomid1 == null ? null : roomid1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderform.RoomID2
     *
     * @return the value of orderform.RoomID2
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    public String getRoomid2() {
        return roomid2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderform.RoomID2
     *
     * @param roomid2 the value for orderform.RoomID2
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    public void setRoomid2(String roomid2) {
        this.roomid2 = roomid2 == null ? null : roomid2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderform.RoomID3
     *
     * @return the value of orderform.RoomID3
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    public String getRoomid3() {
        return roomid3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderform.RoomID3
     *
     * @param roomid3 the value for orderform.RoomID3
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    public void setRoomid3(String roomid3) {
        this.roomid3 = roomid3 == null ? null : roomid3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderform.RoomID4
     *
     * @return the value of orderform.RoomID4
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    public String getRoomid4() {
        return roomid4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderform.RoomID4
     *
     * @param roomid4 the value for orderform.RoomID4
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    public void setRoomid4(String roomid4) {
        this.roomid4 = roomid4 == null ? null : roomid4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderform.RoomID5
     *
     * @return the value of orderform.RoomID5
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    public String getRoomid5() {
        return roomid5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderform.RoomID5
     *
     * @param roomid5 the value for orderform.RoomID5
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    public void setRoomid5(String roomid5) {
        this.roomid5 = roomid5 == null ? null : roomid5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderform.RoomNum
     *
     * @return the value of orderform.RoomNum
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    public String getRoomnum() {
        return roomnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderform.RoomNum
     *
     * @param roomnum the value for orderform.RoomNum
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    public void setRoomnum(String roomnum) {
        this.roomnum = roomnum == null ? null : roomnum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderform.IsAvailable
     *
     * @return the value of orderform.IsAvailable
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    public String getIsavailable() {
        return isavailable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderform.IsAvailable
     *
     * @param isavailable the value for orderform.IsAvailable
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
     */
    public void setIsavailable(String isavailable) {
        this.isavailable = isavailable == null ? null : isavailable.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
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
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getRoomid1() == null ? other.getRoomid1() == null : this.getRoomid1().equals(other.getRoomid1()))
            && (this.getRoomid2() == null ? other.getRoomid2() == null : this.getRoomid2().equals(other.getRoomid2()))
            && (this.getRoomid3() == null ? other.getRoomid3() == null : this.getRoomid3().equals(other.getRoomid3()))
            && (this.getRoomid4() == null ? other.getRoomid4() == null : this.getRoomid4().equals(other.getRoomid4()))
            && (this.getRoomid5() == null ? other.getRoomid5() == null : this.getRoomid5().equals(other.getRoomid5()))
            && (this.getRoomnum() == null ? other.getRoomnum() == null : this.getRoomnum().equals(other.getRoomnum()))
            && (this.getIsavailable() == null ? other.getIsavailable() == null : this.getIsavailable().equals(other.getIsavailable()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Wed Aug 07 11:58:40 CST 2019
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
        result = prime * result + ((getRoomid1() == null) ? 0 : getRoomid1().hashCode());
        result = prime * result + ((getRoomid2() == null) ? 0 : getRoomid2().hashCode());
        result = prime * result + ((getRoomid3() == null) ? 0 : getRoomid3().hashCode());
        result = prime * result + ((getRoomid4() == null) ? 0 : getRoomid4().hashCode());
        result = prime * result + ((getRoomid5() == null) ? 0 : getRoomid5().hashCode());
        result = prime * result + ((getRoomnum() == null) ? 0 : getRoomnum().hashCode());
        result = prime * result + ((getIsavailable() == null) ? 0 : getIsavailable().hashCode());
        return result;
    }
}
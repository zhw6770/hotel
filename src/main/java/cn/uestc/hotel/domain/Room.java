package cn.uestc.hotel.domain;

public class Room {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.RoomID
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    private String roomid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.HotelID
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    private String hotelid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.OrderFormID
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    private String orderformid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.DailyPrice
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    private Float dailyprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.Type
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.IsAvailable
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    private Integer isavailable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.Breakfast
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    private String breakfast;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.Endtime
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    private String endtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public Room(String roomid, String hotelid, String orderformid, Float dailyprice, String type, Integer isavailable, String breakfast, String endtime) {
        this.roomid = roomid;
        this.hotelid = hotelid;
        this.orderformid = orderformid;
        this.dailyprice = dailyprice;
        this.type = type;
        this.isavailable = isavailable;
        this.breakfast = breakfast;
        this.endtime = endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public Room() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.RoomID
     *
     * @return the value of room.RoomID
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public String getRoomid() {
        return roomid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.RoomID
     *
     * @param roomid the value for room.RoomID
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public void setRoomid(String roomid) {
        this.roomid = roomid == null ? null : roomid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.HotelID
     *
     * @return the value of room.HotelID
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public String getHotelid() {
        return hotelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.HotelID
     *
     * @param hotelid the value for room.HotelID
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public void setHotelid(String hotelid) {
        this.hotelid = hotelid == null ? null : hotelid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.OrderFormID
     *
     * @return the value of room.OrderFormID
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public String getOrderformid() {
        return orderformid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.OrderFormID
     *
     * @param orderformid the value for room.OrderFormID
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public void setOrderformid(String orderformid) {
        this.orderformid = orderformid == null ? null : orderformid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.DailyPrice
     *
     * @return the value of room.DailyPrice
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public Float getDailyprice() {
        return dailyprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.DailyPrice
     *
     * @param dailyprice the value for room.DailyPrice
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public void setDailyprice(Float dailyprice) {
        this.dailyprice = dailyprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.Type
     *
     * @return the value of room.Type
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.Type
     *
     * @param type the value for room.Type
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.IsAvailable
     *
     * @return the value of room.IsAvailable
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public Integer getIsavailable() {
        return isavailable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.IsAvailable
     *
     * @param isavailable the value for room.IsAvailable
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public void setIsavailable(Integer isavailable) {
        this.isavailable = isavailable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.Breakfast
     *
     * @return the value of room.Breakfast
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public String getBreakfast() {
        return breakfast;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.Breakfast
     *
     * @param breakfast the value for room.Breakfast
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast == null ? null : breakfast.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.Endtime
     *
     * @return the value of room.Endtime
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.Endtime
     *
     * @param endtime the value for room.Endtime
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
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
        Room other = (Room) that;
        return (this.getRoomid() == null ? other.getRoomid() == null : this.getRoomid().equals(other.getRoomid()))
            && (this.getHotelid() == null ? other.getHotelid() == null : this.getHotelid().equals(other.getHotelid()))
            && (this.getOrderformid() == null ? other.getOrderformid() == null : this.getOrderformid().equals(other.getOrderformid()))
            && (this.getDailyprice() == null ? other.getDailyprice() == null : this.getDailyprice().equals(other.getDailyprice()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getIsavailable() == null ? other.getIsavailable() == null : this.getIsavailable().equals(other.getIsavailable()))
            && (this.getBreakfast() == null ? other.getBreakfast() == null : this.getBreakfast().equals(other.getBreakfast()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoomid() == null) ? 0 : getRoomid().hashCode());
        result = prime * result + ((getHotelid() == null) ? 0 : getHotelid().hashCode());
        result = prime * result + ((getOrderformid() == null) ? 0 : getOrderformid().hashCode());
        result = prime * result + ((getDailyprice() == null) ? 0 : getDailyprice().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getIsavailable() == null) ? 0 : getIsavailable().hashCode());
        result = prime * result + ((getBreakfast() == null) ? 0 : getBreakfast().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        return result;
    }
}
package cn.uestc.hotel.domain;

import java.util.ArrayList;
import java.util.List;

public class OrderFormExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orderform
     *
     * @mbg.generated Sun Aug 04 17:33:47 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orderform
     *
     * @mbg.generated Sun Aug 04 17:33:47 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orderform
     *
     * @mbg.generated Sun Aug 04 17:33:47 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Sun Aug 04 17:33:47 CST 2019
     */
    public OrderFormExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Sun Aug 04 17:33:47 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Sun Aug 04 17:33:47 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Sun Aug 04 17:33:47 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Sun Aug 04 17:33:47 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Sun Aug 04 17:33:47 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Sun Aug 04 17:33:47 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Sun Aug 04 17:33:47 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Sun Aug 04 17:33:47 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Sun Aug 04 17:33:47 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Sun Aug 04 17:33:47 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orderform
     *
     * @mbg.generated Sun Aug 04 17:33:47 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderformidIsNull() {
            addCriterion("OrderFormID is null");
            return (Criteria) this;
        }

        public Criteria andOrderformidIsNotNull() {
            addCriterion("OrderFormID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderformidEqualTo(String value) {
            addCriterion("OrderFormID =", value, "orderformid");
            return (Criteria) this;
        }

        public Criteria andOrderformidNotEqualTo(String value) {
            addCriterion("OrderFormID <>", value, "orderformid");
            return (Criteria) this;
        }

        public Criteria andOrderformidGreaterThan(String value) {
            addCriterion("OrderFormID >", value, "orderformid");
            return (Criteria) this;
        }

        public Criteria andOrderformidGreaterThanOrEqualTo(String value) {
            addCriterion("OrderFormID >=", value, "orderformid");
            return (Criteria) this;
        }

        public Criteria andOrderformidLessThan(String value) {
            addCriterion("OrderFormID <", value, "orderformid");
            return (Criteria) this;
        }

        public Criteria andOrderformidLessThanOrEqualTo(String value) {
            addCriterion("OrderFormID <=", value, "orderformid");
            return (Criteria) this;
        }

        public Criteria andOrderformidLike(String value) {
            addCriterion("OrderFormID like", value, "orderformid");
            return (Criteria) this;
        }

        public Criteria andOrderformidNotLike(String value) {
            addCriterion("OrderFormID not like", value, "orderformid");
            return (Criteria) this;
        }

        public Criteria andOrderformidIn(List<String> values) {
            addCriterion("OrderFormID in", values, "orderformid");
            return (Criteria) this;
        }

        public Criteria andOrderformidNotIn(List<String> values) {
            addCriterion("OrderFormID not in", values, "orderformid");
            return (Criteria) this;
        }

        public Criteria andOrderformidBetween(String value1, String value2) {
            addCriterion("OrderFormID between", value1, value2, "orderformid");
            return (Criteria) this;
        }

        public Criteria andOrderformidNotBetween(String value1, String value2) {
            addCriterion("OrderFormID not between", value1, value2, "orderformid");
            return (Criteria) this;
        }

        public Criteria andHotelidIsNull() {
            addCriterion("HotelID is null");
            return (Criteria) this;
        }

        public Criteria andHotelidIsNotNull() {
            addCriterion("HotelID is not null");
            return (Criteria) this;
        }

        public Criteria andHotelidEqualTo(String value) {
            addCriterion("HotelID =", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotEqualTo(String value) {
            addCriterion("HotelID <>", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidGreaterThan(String value) {
            addCriterion("HotelID >", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidGreaterThanOrEqualTo(String value) {
            addCriterion("HotelID >=", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidLessThan(String value) {
            addCriterion("HotelID <", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidLessThanOrEqualTo(String value) {
            addCriterion("HotelID <=", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidLike(String value) {
            addCriterion("HotelID like", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotLike(String value) {
            addCriterion("HotelID not like", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidIn(List<String> values) {
            addCriterion("HotelID in", values, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotIn(List<String> values) {
            addCriterion("HotelID not in", values, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidBetween(String value1, String value2) {
            addCriterion("HotelID between", value1, value2, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotBetween(String value1, String value2) {
            addCriterion("HotelID not between", value1, value2, "hotelid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("CustomerID is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("CustomerID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(String value) {
            addCriterion("CustomerID =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(String value) {
            addCriterion("CustomerID <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(String value) {
            addCriterion("CustomerID >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerID >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(String value) {
            addCriterion("CustomerID <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(String value) {
            addCriterion("CustomerID <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLike(String value) {
            addCriterion("CustomerID like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotLike(String value) {
            addCriterion("CustomerID not like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<String> values) {
            addCriterion("CustomerID in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<String> values) {
            addCriterion("CustomerID not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(String value1, String value2) {
            addCriterion("CustomerID between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(String value1, String value2) {
            addCriterion("CustomerID not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIsNull() {
            addCriterion("ArriveTime is null");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIsNotNull() {
            addCriterion("ArriveTime is not null");
            return (Criteria) this;
        }

        public Criteria andArrivetimeEqualTo(String value) {
            addCriterion("ArriveTime =", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotEqualTo(String value) {
            addCriterion("ArriveTime <>", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeGreaterThan(String value) {
            addCriterion("ArriveTime >", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeGreaterThanOrEqualTo(String value) {
            addCriterion("ArriveTime >=", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeLessThan(String value) {
            addCriterion("ArriveTime <", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeLessThanOrEqualTo(String value) {
            addCriterion("ArriveTime <=", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeLike(String value) {
            addCriterion("ArriveTime like", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotLike(String value) {
            addCriterion("ArriveTime not like", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIn(List<String> values) {
            addCriterion("ArriveTime in", values, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotIn(List<String> values) {
            addCriterion("ArriveTime not in", values, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeBetween(String value1, String value2) {
            addCriterion("ArriveTime between", value1, value2, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotBetween(String value1, String value2) {
            addCriterion("ArriveTime not between", value1, value2, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andLefttimeIsNull() {
            addCriterion("LeftTime is null");
            return (Criteria) this;
        }

        public Criteria andLefttimeIsNotNull() {
            addCriterion("LeftTime is not null");
            return (Criteria) this;
        }

        public Criteria andLefttimeEqualTo(String value) {
            addCriterion("LeftTime =", value, "lefttime");
            return (Criteria) this;
        }

        public Criteria andLefttimeNotEqualTo(String value) {
            addCriterion("LeftTime <>", value, "lefttime");
            return (Criteria) this;
        }

        public Criteria andLefttimeGreaterThan(String value) {
            addCriterion("LeftTime >", value, "lefttime");
            return (Criteria) this;
        }

        public Criteria andLefttimeGreaterThanOrEqualTo(String value) {
            addCriterion("LeftTime >=", value, "lefttime");
            return (Criteria) this;
        }

        public Criteria andLefttimeLessThan(String value) {
            addCriterion("LeftTime <", value, "lefttime");
            return (Criteria) this;
        }

        public Criteria andLefttimeLessThanOrEqualTo(String value) {
            addCriterion("LeftTime <=", value, "lefttime");
            return (Criteria) this;
        }

        public Criteria andLefttimeLike(String value) {
            addCriterion("LeftTime like", value, "lefttime");
            return (Criteria) this;
        }

        public Criteria andLefttimeNotLike(String value) {
            addCriterion("LeftTime not like", value, "lefttime");
            return (Criteria) this;
        }

        public Criteria andLefttimeIn(List<String> values) {
            addCriterion("LeftTime in", values, "lefttime");
            return (Criteria) this;
        }

        public Criteria andLefttimeNotIn(List<String> values) {
            addCriterion("LeftTime not in", values, "lefttime");
            return (Criteria) this;
        }

        public Criteria andLefttimeBetween(String value1, String value2) {
            addCriterion("LeftTime between", value1, value2, "lefttime");
            return (Criteria) this;
        }

        public Criteria andLefttimeNotBetween(String value1, String value2) {
            addCriterion("LeftTime not between", value1, value2, "lefttime");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andRoomid1IsNull() {
            addCriterion("RoomID1 is null");
            return (Criteria) this;
        }

        public Criteria andRoomid1IsNotNull() {
            addCriterion("RoomID1 is not null");
            return (Criteria) this;
        }

        public Criteria andRoomid1EqualTo(String value) {
            addCriterion("RoomID1 =", value, "roomid1");
            return (Criteria) this;
        }

        public Criteria andRoomid1NotEqualTo(String value) {
            addCriterion("RoomID1 <>", value, "roomid1");
            return (Criteria) this;
        }

        public Criteria andRoomid1GreaterThan(String value) {
            addCriterion("RoomID1 >", value, "roomid1");
            return (Criteria) this;
        }

        public Criteria andRoomid1GreaterThanOrEqualTo(String value) {
            addCriterion("RoomID1 >=", value, "roomid1");
            return (Criteria) this;
        }

        public Criteria andRoomid1LessThan(String value) {
            addCriterion("RoomID1 <", value, "roomid1");
            return (Criteria) this;
        }

        public Criteria andRoomid1LessThanOrEqualTo(String value) {
            addCriterion("RoomID1 <=", value, "roomid1");
            return (Criteria) this;
        }

        public Criteria andRoomid1Like(String value) {
            addCriterion("RoomID1 like", value, "roomid1");
            return (Criteria) this;
        }

        public Criteria andRoomid1NotLike(String value) {
            addCriterion("RoomID1 not like", value, "roomid1");
            return (Criteria) this;
        }

        public Criteria andRoomid1In(List<String> values) {
            addCriterion("RoomID1 in", values, "roomid1");
            return (Criteria) this;
        }

        public Criteria andRoomid1NotIn(List<String> values) {
            addCriterion("RoomID1 not in", values, "roomid1");
            return (Criteria) this;
        }

        public Criteria andRoomid1Between(String value1, String value2) {
            addCriterion("RoomID1 between", value1, value2, "roomid1");
            return (Criteria) this;
        }

        public Criteria andRoomid1NotBetween(String value1, String value2) {
            addCriterion("RoomID1 not between", value1, value2, "roomid1");
            return (Criteria) this;
        }

        public Criteria andRoomid2IsNull() {
            addCriterion("RoomID2 is null");
            return (Criteria) this;
        }

        public Criteria andRoomid2IsNotNull() {
            addCriterion("RoomID2 is not null");
            return (Criteria) this;
        }

        public Criteria andRoomid2EqualTo(String value) {
            addCriterion("RoomID2 =", value, "roomid2");
            return (Criteria) this;
        }

        public Criteria andRoomid2NotEqualTo(String value) {
            addCriterion("RoomID2 <>", value, "roomid2");
            return (Criteria) this;
        }

        public Criteria andRoomid2GreaterThan(String value) {
            addCriterion("RoomID2 >", value, "roomid2");
            return (Criteria) this;
        }

        public Criteria andRoomid2GreaterThanOrEqualTo(String value) {
            addCriterion("RoomID2 >=", value, "roomid2");
            return (Criteria) this;
        }

        public Criteria andRoomid2LessThan(String value) {
            addCriterion("RoomID2 <", value, "roomid2");
            return (Criteria) this;
        }

        public Criteria andRoomid2LessThanOrEqualTo(String value) {
            addCriterion("RoomID2 <=", value, "roomid2");
            return (Criteria) this;
        }

        public Criteria andRoomid2Like(String value) {
            addCriterion("RoomID2 like", value, "roomid2");
            return (Criteria) this;
        }

        public Criteria andRoomid2NotLike(String value) {
            addCriterion("RoomID2 not like", value, "roomid2");
            return (Criteria) this;
        }

        public Criteria andRoomid2In(List<String> values) {
            addCriterion("RoomID2 in", values, "roomid2");
            return (Criteria) this;
        }

        public Criteria andRoomid2NotIn(List<String> values) {
            addCriterion("RoomID2 not in", values, "roomid2");
            return (Criteria) this;
        }

        public Criteria andRoomid2Between(String value1, String value2) {
            addCriterion("RoomID2 between", value1, value2, "roomid2");
            return (Criteria) this;
        }

        public Criteria andRoomid2NotBetween(String value1, String value2) {
            addCriterion("RoomID2 not between", value1, value2, "roomid2");
            return (Criteria) this;
        }

        public Criteria andRoomid3IsNull() {
            addCriterion("RoomID3 is null");
            return (Criteria) this;
        }

        public Criteria andRoomid3IsNotNull() {
            addCriterion("RoomID3 is not null");
            return (Criteria) this;
        }

        public Criteria andRoomid3EqualTo(String value) {
            addCriterion("RoomID3 =", value, "roomid3");
            return (Criteria) this;
        }

        public Criteria andRoomid3NotEqualTo(String value) {
            addCriterion("RoomID3 <>", value, "roomid3");
            return (Criteria) this;
        }

        public Criteria andRoomid3GreaterThan(String value) {
            addCriterion("RoomID3 >", value, "roomid3");
            return (Criteria) this;
        }

        public Criteria andRoomid3GreaterThanOrEqualTo(String value) {
            addCriterion("RoomID3 >=", value, "roomid3");
            return (Criteria) this;
        }

        public Criteria andRoomid3LessThan(String value) {
            addCriterion("RoomID3 <", value, "roomid3");
            return (Criteria) this;
        }

        public Criteria andRoomid3LessThanOrEqualTo(String value) {
            addCriterion("RoomID3 <=", value, "roomid3");
            return (Criteria) this;
        }

        public Criteria andRoomid3Like(String value) {
            addCriterion("RoomID3 like", value, "roomid3");
            return (Criteria) this;
        }

        public Criteria andRoomid3NotLike(String value) {
            addCriterion("RoomID3 not like", value, "roomid3");
            return (Criteria) this;
        }

        public Criteria andRoomid3In(List<String> values) {
            addCriterion("RoomID3 in", values, "roomid3");
            return (Criteria) this;
        }

        public Criteria andRoomid3NotIn(List<String> values) {
            addCriterion("RoomID3 not in", values, "roomid3");
            return (Criteria) this;
        }

        public Criteria andRoomid3Between(String value1, String value2) {
            addCriterion("RoomID3 between", value1, value2, "roomid3");
            return (Criteria) this;
        }

        public Criteria andRoomid3NotBetween(String value1, String value2) {
            addCriterion("RoomID3 not between", value1, value2, "roomid3");
            return (Criteria) this;
        }

        public Criteria andRoomid4IsNull() {
            addCriterion("RoomID4 is null");
            return (Criteria) this;
        }

        public Criteria andRoomid4IsNotNull() {
            addCriterion("RoomID4 is not null");
            return (Criteria) this;
        }

        public Criteria andRoomid4EqualTo(String value) {
            addCriterion("RoomID4 =", value, "roomid4");
            return (Criteria) this;
        }

        public Criteria andRoomid4NotEqualTo(String value) {
            addCriterion("RoomID4 <>", value, "roomid4");
            return (Criteria) this;
        }

        public Criteria andRoomid4GreaterThan(String value) {
            addCriterion("RoomID4 >", value, "roomid4");
            return (Criteria) this;
        }

        public Criteria andRoomid4GreaterThanOrEqualTo(String value) {
            addCriterion("RoomID4 >=", value, "roomid4");
            return (Criteria) this;
        }

        public Criteria andRoomid4LessThan(String value) {
            addCriterion("RoomID4 <", value, "roomid4");
            return (Criteria) this;
        }

        public Criteria andRoomid4LessThanOrEqualTo(String value) {
            addCriterion("RoomID4 <=", value, "roomid4");
            return (Criteria) this;
        }

        public Criteria andRoomid4Like(String value) {
            addCriterion("RoomID4 like", value, "roomid4");
            return (Criteria) this;
        }

        public Criteria andRoomid4NotLike(String value) {
            addCriterion("RoomID4 not like", value, "roomid4");
            return (Criteria) this;
        }

        public Criteria andRoomid4In(List<String> values) {
            addCriterion("RoomID4 in", values, "roomid4");
            return (Criteria) this;
        }

        public Criteria andRoomid4NotIn(List<String> values) {
            addCriterion("RoomID4 not in", values, "roomid4");
            return (Criteria) this;
        }

        public Criteria andRoomid4Between(String value1, String value2) {
            addCriterion("RoomID4 between", value1, value2, "roomid4");
            return (Criteria) this;
        }

        public Criteria andRoomid4NotBetween(String value1, String value2) {
            addCriterion("RoomID4 not between", value1, value2, "roomid4");
            return (Criteria) this;
        }

        public Criteria andRoomid5IsNull() {
            addCriterion("RoomID5 is null");
            return (Criteria) this;
        }

        public Criteria andRoomid5IsNotNull() {
            addCriterion("RoomID5 is not null");
            return (Criteria) this;
        }

        public Criteria andRoomid5EqualTo(String value) {
            addCriterion("RoomID5 =", value, "roomid5");
            return (Criteria) this;
        }

        public Criteria andRoomid5NotEqualTo(String value) {
            addCriterion("RoomID5 <>", value, "roomid5");
            return (Criteria) this;
        }

        public Criteria andRoomid5GreaterThan(String value) {
            addCriterion("RoomID5 >", value, "roomid5");
            return (Criteria) this;
        }

        public Criteria andRoomid5GreaterThanOrEqualTo(String value) {
            addCriterion("RoomID5 >=", value, "roomid5");
            return (Criteria) this;
        }

        public Criteria andRoomid5LessThan(String value) {
            addCriterion("RoomID5 <", value, "roomid5");
            return (Criteria) this;
        }

        public Criteria andRoomid5LessThanOrEqualTo(String value) {
            addCriterion("RoomID5 <=", value, "roomid5");
            return (Criteria) this;
        }

        public Criteria andRoomid5Like(String value) {
            addCriterion("RoomID5 like", value, "roomid5");
            return (Criteria) this;
        }

        public Criteria andRoomid5NotLike(String value) {
            addCriterion("RoomID5 not like", value, "roomid5");
            return (Criteria) this;
        }

        public Criteria andRoomid5In(List<String> values) {
            addCriterion("RoomID5 in", values, "roomid5");
            return (Criteria) this;
        }

        public Criteria andRoomid5NotIn(List<String> values) {
            addCriterion("RoomID5 not in", values, "roomid5");
            return (Criteria) this;
        }

        public Criteria andRoomid5Between(String value1, String value2) {
            addCriterion("RoomID5 between", value1, value2, "roomid5");
            return (Criteria) this;
        }

        public Criteria andRoomid5NotBetween(String value1, String value2) {
            addCriterion("RoomID5 not between", value1, value2, "roomid5");
            return (Criteria) this;
        }

        public Criteria andRoomnumIsNull() {
            addCriterion("RoomNum is null");
            return (Criteria) this;
        }

        public Criteria andRoomnumIsNotNull() {
            addCriterion("RoomNum is not null");
            return (Criteria) this;
        }

        public Criteria andRoomnumEqualTo(String value) {
            addCriterion("RoomNum =", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotEqualTo(String value) {
            addCriterion("RoomNum <>", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumGreaterThan(String value) {
            addCriterion("RoomNum >", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumGreaterThanOrEqualTo(String value) {
            addCriterion("RoomNum >=", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLessThan(String value) {
            addCriterion("RoomNum <", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLessThanOrEqualTo(String value) {
            addCriterion("RoomNum <=", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLike(String value) {
            addCriterion("RoomNum like", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotLike(String value) {
            addCriterion("RoomNum not like", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumIn(List<String> values) {
            addCriterion("RoomNum in", values, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotIn(List<String> values) {
            addCriterion("RoomNum not in", values, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumBetween(String value1, String value2) {
            addCriterion("RoomNum between", value1, value2, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotBetween(String value1, String value2) {
            addCriterion("RoomNum not between", value1, value2, "roomnum");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orderform
     *
     * @mbg.generated do_not_delete_during_merge Sun Aug 04 17:33:47 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orderform
     *
     * @mbg.generated Sun Aug 04 17:33:47 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
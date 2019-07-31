package cn.uestc.hotel.domain;

import java.util.ArrayList;
import java.util.List;

public class OrderFormExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orderform
     *
     * @mbg.generated Wed Jul 31 14:02:19 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orderform
     *
     * @mbg.generated Wed Jul 31 14:02:19 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orderform
     *
     * @mbg.generated Wed Jul 31 14:02:19 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Wed Jul 31 14:02:19 CST 2019
     */
    public OrderFormExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Wed Jul 31 14:02:19 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Wed Jul 31 14:02:19 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Wed Jul 31 14:02:19 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Wed Jul 31 14:02:19 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Wed Jul 31 14:02:19 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Wed Jul 31 14:02:19 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Wed Jul 31 14:02:19 CST 2019
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
     * @mbg.generated Wed Jul 31 14:02:19 CST 2019
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
     * @mbg.generated Wed Jul 31 14:02:19 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Wed Jul 31 14:02:19 CST 2019
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
     * @mbg.generated Wed Jul 31 14:02:19 CST 2019
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

        public Criteria andRoomidIsNull() {
            addCriterion("RoomID is null");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNotNull() {
            addCriterion("RoomID is not null");
            return (Criteria) this;
        }

        public Criteria andRoomidEqualTo(String value) {
            addCriterion("RoomID =", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotEqualTo(String value) {
            addCriterion("RoomID <>", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThan(String value) {
            addCriterion("RoomID >", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThanOrEqualTo(String value) {
            addCriterion("RoomID >=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThan(String value) {
            addCriterion("RoomID <", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThanOrEqualTo(String value) {
            addCriterion("RoomID <=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLike(String value) {
            addCriterion("RoomID like", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotLike(String value) {
            addCriterion("RoomID not like", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidIn(List<String> values) {
            addCriterion("RoomID in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotIn(List<String> values) {
            addCriterion("RoomID not in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidBetween(String value1, String value2) {
            addCriterion("RoomID between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotBetween(String value1, String value2) {
            addCriterion("RoomID not between", value1, value2, "roomid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orderform
     *
     * @mbg.generated do_not_delete_during_merge Wed Jul 31 14:02:19 CST 2019
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
     * @mbg.generated Wed Jul 31 14:02:19 CST 2019
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
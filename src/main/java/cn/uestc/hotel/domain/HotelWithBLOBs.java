package cn.uestc.hotel.domain;

import java.util.Arrays;

public class HotelWithBLOBs extends Hotel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.Img
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    private byte[] img;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.TypeImg1
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    private byte[] typeimg1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.TypeImg2
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    private byte[] typeimg2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.TypeImg3
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    private byte[] typeimg3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.TypeImg4
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    private byte[] typeimg4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.TypeImg5
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    private byte[] typeimg5;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public HotelWithBLOBs(String hotelid, String hotelname, Integer numroom, String address, String englishname, String country, String city, String url, String tel, String zipcode, Integer isavailable, String roomtype2, String imgname, String hotelclass, String roomtype1, String roomtype3, String roomtype4, String roomtype5, String imgtype, String typeimgname1, String typeimgname2, String typeimgname3, String typeimgname4, String typeimgname5, byte[] img, byte[] typeimg1, byte[] typeimg2, byte[] typeimg3, byte[] typeimg4, byte[] typeimg5) {
        super(hotelid, hotelname, numroom, address, englishname, country, city, url, tel, zipcode, isavailable, roomtype2, imgname, hotelclass, roomtype1, roomtype3, roomtype4, roomtype5, imgtype, typeimgname1, typeimgname2, typeimgname3, typeimgname4, typeimgname5);
        this.img = img;
        this.typeimg1 = typeimg1;
        this.typeimg2 = typeimg2;
        this.typeimg3 = typeimg3;
        this.typeimg4 = typeimg4;
        this.typeimg5 = typeimg5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public HotelWithBLOBs() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.Img
     *
     * @return the value of hotel.Img
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public byte[] getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.Img
     *
     * @param img the value for hotel.Img
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public void setImg(byte[] img) {
        this.img = img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.TypeImg1
     *
     * @return the value of hotel.TypeImg1
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public byte[] getTypeimg1() {
        return typeimg1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.TypeImg1
     *
     * @param typeimg1 the value for hotel.TypeImg1
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public void setTypeimg1(byte[] typeimg1) {
        this.typeimg1 = typeimg1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.TypeImg2
     *
     * @return the value of hotel.TypeImg2
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public byte[] getTypeimg2() {
        return typeimg2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.TypeImg2
     *
     * @param typeimg2 the value for hotel.TypeImg2
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public void setTypeimg2(byte[] typeimg2) {
        this.typeimg2 = typeimg2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.TypeImg3
     *
     * @return the value of hotel.TypeImg3
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public byte[] getTypeimg3() {
        return typeimg3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.TypeImg3
     *
     * @param typeimg3 the value for hotel.TypeImg3
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public void setTypeimg3(byte[] typeimg3) {
        this.typeimg3 = typeimg3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.TypeImg4
     *
     * @return the value of hotel.TypeImg4
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public byte[] getTypeimg4() {
        return typeimg4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.TypeImg4
     *
     * @param typeimg4 the value for hotel.TypeImg4
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public void setTypeimg4(byte[] typeimg4) {
        this.typeimg4 = typeimg4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.TypeImg5
     *
     * @return the value of hotel.TypeImg5
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public byte[] getTypeimg5() {
        return typeimg5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.TypeImg5
     *
     * @param typeimg5 the value for hotel.TypeImg5
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    public void setTypeimg5(byte[] typeimg5) {
        this.typeimg5 = typeimg5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel
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
        HotelWithBLOBs other = (HotelWithBLOBs) that;
        return (this.getHotelid() == null ? other.getHotelid() == null : this.getHotelid().equals(other.getHotelid()))
            && (this.getHotelname() == null ? other.getHotelname() == null : this.getHotelname().equals(other.getHotelname()))
            && (this.getNumroom() == null ? other.getNumroom() == null : this.getNumroom().equals(other.getNumroom()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getEnglishname() == null ? other.getEnglishname() == null : this.getEnglishname().equals(other.getEnglishname()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getZipcode() == null ? other.getZipcode() == null : this.getZipcode().equals(other.getZipcode()))
            && (this.getIsavailable() == null ? other.getIsavailable() == null : this.getIsavailable().equals(other.getIsavailable()))
            && (this.getRoomtype2() == null ? other.getRoomtype2() == null : this.getRoomtype2().equals(other.getRoomtype2()))
            && (this.getImgname() == null ? other.getImgname() == null : this.getImgname().equals(other.getImgname()))
            && (this.getHotelclass() == null ? other.getHotelclass() == null : this.getHotelclass().equals(other.getHotelclass()))
            && (this.getRoomtype1() == null ? other.getRoomtype1() == null : this.getRoomtype1().equals(other.getRoomtype1()))
            && (this.getRoomtype3() == null ? other.getRoomtype3() == null : this.getRoomtype3().equals(other.getRoomtype3()))
            && (this.getRoomtype4() == null ? other.getRoomtype4() == null : this.getRoomtype4().equals(other.getRoomtype4()))
            && (this.getRoomtype5() == null ? other.getRoomtype5() == null : this.getRoomtype5().equals(other.getRoomtype5()))
            && (this.getImgtype() == null ? other.getImgtype() == null : this.getImgtype().equals(other.getImgtype()))
            && (this.getTypeimgname1() == null ? other.getTypeimgname1() == null : this.getTypeimgname1().equals(other.getTypeimgname1()))
            && (this.getTypeimgname2() == null ? other.getTypeimgname2() == null : this.getTypeimgname2().equals(other.getTypeimgname2()))
            && (this.getTypeimgname3() == null ? other.getTypeimgname3() == null : this.getTypeimgname3().equals(other.getTypeimgname3()))
            && (this.getTypeimgname4() == null ? other.getTypeimgname4() == null : this.getTypeimgname4().equals(other.getTypeimgname4()))
            && (this.getTypeimgname5() == null ? other.getTypeimgname5() == null : this.getTypeimgname5().equals(other.getTypeimgname5()))
            && (Arrays.equals(this.getImg(), other.getImg()))
            && (Arrays.equals(this.getTypeimg1(), other.getTypeimg1()))
            && (Arrays.equals(this.getTypeimg2(), other.getTypeimg2()))
            && (Arrays.equals(this.getTypeimg3(), other.getTypeimg3()))
            && (Arrays.equals(this.getTypeimg4(), other.getTypeimg4()))
            && (Arrays.equals(this.getTypeimg5(), other.getTypeimg5()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel
     *
     * @mbg.generated Sun Aug 04 15:55:02 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHotelid() == null) ? 0 : getHotelid().hashCode());
        result = prime * result + ((getHotelname() == null) ? 0 : getHotelname().hashCode());
        result = prime * result + ((getNumroom() == null) ? 0 : getNumroom().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getEnglishname() == null) ? 0 : getEnglishname().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getZipcode() == null) ? 0 : getZipcode().hashCode());
        result = prime * result + ((getIsavailable() == null) ? 0 : getIsavailable().hashCode());
        result = prime * result + ((getRoomtype2() == null) ? 0 : getRoomtype2().hashCode());
        result = prime * result + ((getImgname() == null) ? 0 : getImgname().hashCode());
        result = prime * result + ((getHotelclass() == null) ? 0 : getHotelclass().hashCode());
        result = prime * result + ((getRoomtype1() == null) ? 0 : getRoomtype1().hashCode());
        result = prime * result + ((getRoomtype3() == null) ? 0 : getRoomtype3().hashCode());
        result = prime * result + ((getRoomtype4() == null) ? 0 : getRoomtype4().hashCode());
        result = prime * result + ((getRoomtype5() == null) ? 0 : getRoomtype5().hashCode());
        result = prime * result + ((getImgtype() == null) ? 0 : getImgtype().hashCode());
        result = prime * result + ((getTypeimgname1() == null) ? 0 : getTypeimgname1().hashCode());
        result = prime * result + ((getTypeimgname2() == null) ? 0 : getTypeimgname2().hashCode());
        result = prime * result + ((getTypeimgname3() == null) ? 0 : getTypeimgname3().hashCode());
        result = prime * result + ((getTypeimgname4() == null) ? 0 : getTypeimgname4().hashCode());
        result = prime * result + ((getTypeimgname5() == null) ? 0 : getTypeimgname5().hashCode());
        result = prime * result + (Arrays.hashCode(getImg()));
        result = prime * result + (Arrays.hashCode(getTypeimg1()));
        result = prime * result + (Arrays.hashCode(getTypeimg2()));
        result = prime * result + (Arrays.hashCode(getTypeimg3()));
        result = prime * result + (Arrays.hashCode(getTypeimg4()));
        result = prime * result + (Arrays.hashCode(getTypeimg5()));
        return result;
    }
}
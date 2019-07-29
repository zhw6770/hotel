package cn.uestc.hotel.domain;

public class Hotel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.HotelID
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    private String hotelid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.HotelName
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    private String hotelname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.NumRoom
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    private Integer numroom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.Address
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.EnglishName
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    private String englishname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.Country
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    private String country;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.City
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.Url
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.Tel
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.Zipcode
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    private String zipcode;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    public Hotel(String hotelid, String hotelname, Integer numroom, String address, String englishname, String country, String city, String url, String tel, String zipcode) {
        this.hotelid = hotelid;
        this.hotelname = hotelname;
        this.numroom = numroom;
        this.address = address;
        this.englishname = englishname;
        this.country = country;
        this.city = city;
        this.url = url;
        this.tel = tel;
        this.zipcode = zipcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    public Hotel() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.HotelID
     *
     * @return the value of hotel.HotelID
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    public String getHotelid() {
        return hotelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.HotelID
     *
     * @param hotelid the value for hotel.HotelID
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    public void setHotelid(String hotelid) {
        this.hotelid = hotelid == null ? null : hotelid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.HotelName
     *
     * @return the value of hotel.HotelName
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    public String getHotelname() {
        return hotelname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.HotelName
     *
     * @param hotelname the value for hotel.HotelName
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    public void setHotelname(String hotelname) {
        this.hotelname = hotelname == null ? null : hotelname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.NumRoom
     *
     * @return the value of hotel.NumRoom
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    public Integer getNumroom() {
        return numroom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.NumRoom
     *
     * @param numroom the value for hotel.NumRoom
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    public void setNumroom(Integer numroom) {
        this.numroom = numroom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.Address
     *
     * @return the value of hotel.Address
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.Address
     *
     * @param address the value for hotel.Address
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.EnglishName
     *
     * @return the value of hotel.EnglishName
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    public String getEnglishname() {
        return englishname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.EnglishName
     *
     * @param englishname the value for hotel.EnglishName
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    public void setEnglishname(String englishname) {
        this.englishname = englishname == null ? null : englishname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.Country
     *
     * @return the value of hotel.Country
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.Country
     *
     * @param country the value for hotel.Country
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.City
     *
     * @return the value of hotel.City
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.City
     *
     * @param city the value for hotel.City
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.Url
     *
     * @return the value of hotel.Url
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.Url
     *
     * @param url the value for hotel.Url
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.Tel
     *
     * @return the value of hotel.Tel
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.Tel
     *
     * @param tel the value for hotel.Tel
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.Zipcode
     *
     * @return the value of hotel.Zipcode
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.Zipcode
     *
     * @param zipcode the value for hotel.Zipcode
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
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
        Hotel other = (Hotel) that;
        return (this.getHotelid() == null ? other.getHotelid() == null : this.getHotelid().equals(other.getHotelid()))
            && (this.getHotelname() == null ? other.getHotelname() == null : this.getHotelname().equals(other.getHotelname()))
            && (this.getNumroom() == null ? other.getNumroom() == null : this.getNumroom().equals(other.getNumroom()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getEnglishname() == null ? other.getEnglishname() == null : this.getEnglishname().equals(other.getEnglishname()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getZipcode() == null ? other.getZipcode() == null : this.getZipcode().equals(other.getZipcode()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel
     *
     * @mbg.generated Mon Jul 29 08:39:59 CST 2019
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
        return result;
    }
}
package cn.uestc.hotel.domain;

public class Hotel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.HotelID
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private String hotelid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.HotelName
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private String hotelname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.NumRoom
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private Integer numroom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.Address
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.EnglishName
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private String englishname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.Country
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private String country;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.City
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.Url
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.Tel
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.Zipcode
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private String zipcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.IsAvailable
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private Integer isavailable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.RoomType2
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private String roomtype2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.ImgName
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private String imgname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.HotelClass
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private String hotelclass;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.RoomType1
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private String roomtype1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.RoomType3
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private String roomtype3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.RoomType4
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private String roomtype4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.RoomType5
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private String roomtype5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.ImgType
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private String imgtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.TypeImgName1
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private String typeimgname1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.TypeImgName2
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private String typeimgname2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.TypeImgName3
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private String typeimgname3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.TypeImgName4
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private String typeimgname4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.TypeImgName5
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    private String typeimgname5;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public Hotel(String hotelid, String hotelname, Integer numroom, String address, String englishname, String country, String city, String url, String tel, String zipcode, Integer isavailable, String roomtype2, String imgname, String hotelclass, String roomtype1, String roomtype3, String roomtype4, String roomtype5, String imgtype, String typeimgname1, String typeimgname2, String typeimgname3, String typeimgname4, String typeimgname5) {
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
        this.isavailable = isavailable;
        this.roomtype2 = roomtype2;
        this.imgname = imgname;
        this.hotelclass = hotelclass;
        this.roomtype1 = roomtype1;
        this.roomtype3 = roomtype3;
        this.roomtype4 = roomtype4;
        this.roomtype5 = roomtype5;
        this.imgtype = imgtype;
        this.typeimgname1 = typeimgname1;
        this.typeimgname2 = typeimgname2;
        this.typeimgname3 = typeimgname3;
        this.typeimgname4 = typeimgname4;
        this.typeimgname5 = typeimgname5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
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
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
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
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
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
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
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
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
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
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
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
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
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
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
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
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
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
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
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
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
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
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
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
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
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
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
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
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
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
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
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
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
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
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
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
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
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
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
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
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.IsAvailable
     *
     * @return the value of hotel.IsAvailable
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public Integer getIsavailable() {
        return isavailable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.IsAvailable
     *
     * @param isavailable the value for hotel.IsAvailable
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public void setIsavailable(Integer isavailable) {
        this.isavailable = isavailable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.RoomType2
     *
     * @return the value of hotel.RoomType2
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public String getRoomtype2() {
        return roomtype2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.RoomType2
     *
     * @param roomtype2 the value for hotel.RoomType2
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public void setRoomtype2(String roomtype2) {
        this.roomtype2 = roomtype2 == null ? null : roomtype2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.ImgName
     *
     * @return the value of hotel.ImgName
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public String getImgname() {
        return imgname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.ImgName
     *
     * @param imgname the value for hotel.ImgName
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public void setImgname(String imgname) {
        this.imgname = imgname == null ? null : imgname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.HotelClass
     *
     * @return the value of hotel.HotelClass
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public String getHotelclass() {
        return hotelclass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.HotelClass
     *
     * @param hotelclass the value for hotel.HotelClass
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public void setHotelclass(String hotelclass) {
        this.hotelclass = hotelclass == null ? null : hotelclass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.RoomType1
     *
     * @return the value of hotel.RoomType1
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public String getRoomtype1() {
        return roomtype1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.RoomType1
     *
     * @param roomtype1 the value for hotel.RoomType1
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public void setRoomtype1(String roomtype1) {
        this.roomtype1 = roomtype1 == null ? null : roomtype1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.RoomType3
     *
     * @return the value of hotel.RoomType3
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public String getRoomtype3() {
        return roomtype3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.RoomType3
     *
     * @param roomtype3 the value for hotel.RoomType3
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public void setRoomtype3(String roomtype3) {
        this.roomtype3 = roomtype3 == null ? null : roomtype3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.RoomType4
     *
     * @return the value of hotel.RoomType4
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public String getRoomtype4() {
        return roomtype4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.RoomType4
     *
     * @param roomtype4 the value for hotel.RoomType4
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public void setRoomtype4(String roomtype4) {
        this.roomtype4 = roomtype4 == null ? null : roomtype4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.RoomType5
     *
     * @return the value of hotel.RoomType5
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public String getRoomtype5() {
        return roomtype5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.RoomType5
     *
     * @param roomtype5 the value for hotel.RoomType5
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public void setRoomtype5(String roomtype5) {
        this.roomtype5 = roomtype5 == null ? null : roomtype5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.ImgType
     *
     * @return the value of hotel.ImgType
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public String getImgtype() {
        return imgtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.ImgType
     *
     * @param imgtype the value for hotel.ImgType
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public void setImgtype(String imgtype) {
        this.imgtype = imgtype == null ? null : imgtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.TypeImgName1
     *
     * @return the value of hotel.TypeImgName1
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public String getTypeimgname1() {
        return typeimgname1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.TypeImgName1
     *
     * @param typeimgname1 the value for hotel.TypeImgName1
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public void setTypeimgname1(String typeimgname1) {
        this.typeimgname1 = typeimgname1 == null ? null : typeimgname1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.TypeImgName2
     *
     * @return the value of hotel.TypeImgName2
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public String getTypeimgname2() {
        return typeimgname2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.TypeImgName2
     *
     * @param typeimgname2 the value for hotel.TypeImgName2
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public void setTypeimgname2(String typeimgname2) {
        this.typeimgname2 = typeimgname2 == null ? null : typeimgname2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.TypeImgName3
     *
     * @return the value of hotel.TypeImgName3
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public String getTypeimgname3() {
        return typeimgname3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.TypeImgName3
     *
     * @param typeimgname3 the value for hotel.TypeImgName3
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public void setTypeimgname3(String typeimgname3) {
        this.typeimgname3 = typeimgname3 == null ? null : typeimgname3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.TypeImgName4
     *
     * @return the value of hotel.TypeImgName4
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public String getTypeimgname4() {
        return typeimgname4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.TypeImgName4
     *
     * @param typeimgname4 the value for hotel.TypeImgName4
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public void setTypeimgname4(String typeimgname4) {
        this.typeimgname4 = typeimgname4 == null ? null : typeimgname4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.TypeImgName5
     *
     * @return the value of hotel.TypeImgName5
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public String getTypeimgname5() {
        return typeimgname5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.TypeImgName5
     *
     * @param typeimgname5 the value for hotel.TypeImgName5
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
     */
    public void setTypeimgname5(String typeimgname5) {
        this.typeimgname5 = typeimgname5 == null ? null : typeimgname5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
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
            && (this.getTypeimgname5() == null ? other.getTypeimgname5() == null : this.getTypeimgname5().equals(other.getTypeimgname5()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel
     *
     * @mbg.generated Mon Aug 05 15:17:39 CST 2019
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
        return result;
    }
}
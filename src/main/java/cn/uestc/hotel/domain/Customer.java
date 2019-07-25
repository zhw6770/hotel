package cn.uestc.hotel.domain;

public class Customer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.CustomerID
     *
     * @mbg.generated Thu Jul 25 13:40:27 CST 2019
     */
    private String customerid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.RoleID
     *
     * @mbg.generated Thu Jul 25 13:40:27 CST 2019
     */
    private String roleid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.CustomerPassword
     *
     * @mbg.generated Thu Jul 25 13:40:27 CST 2019
     */
    private String customerpassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.CustomerName
     *
     * @mbg.generated Thu Jul 25 13:40:27 CST 2019
     */
    private String customername;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.Sex
     *
     * @mbg.generated Thu Jul 25 13:40:27 CST 2019
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.Phone
     *
     * @mbg.generated Thu Jul 25 13:40:27 CST 2019
     */
    private String phone;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Thu Jul 25 13:40:27 CST 2019
     */
    public Customer(String customerid, String roleid, String customerpassword, String customername, String sex, String phone) {
        this.customerid = customerid;
        this.roleid = roleid;
        this.customerpassword = customerpassword;
        this.customername = customername;
        this.sex = sex;
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Thu Jul 25 13:40:27 CST 2019
     */
    public Customer() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.CustomerID
     *
     * @return the value of customer.CustomerID
     *
     * @mbg.generated Thu Jul 25 13:40:27 CST 2019
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.CustomerID
     *
     * @param customerid the value for customer.CustomerID
     *
     * @mbg.generated Thu Jul 25 13:40:27 CST 2019
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.RoleID
     *
     * @return the value of customer.RoleID
     *
     * @mbg.generated Thu Jul 25 13:40:27 CST 2019
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.RoleID
     *
     * @param roleid the value for customer.RoleID
     *
     * @mbg.generated Thu Jul 25 13:40:27 CST 2019
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.CustomerPassword
     *
     * @return the value of customer.CustomerPassword
     *
     * @mbg.generated Thu Jul 25 13:40:27 CST 2019
     */
    public String getCustomerpassword() {
        return customerpassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.CustomerPassword
     *
     * @param customerpassword the value for customer.CustomerPassword
     *
     * @mbg.generated Thu Jul 25 13:40:27 CST 2019
     */
    public void setCustomerpassword(String customerpassword) {
        this.customerpassword = customerpassword == null ? null : customerpassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.CustomerName
     *
     * @return the value of customer.CustomerName
     *
     * @mbg.generated Thu Jul 25 13:40:27 CST 2019
     */
    public String getCustomername() {
        return customername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.CustomerName
     *
     * @param customername the value for customer.CustomerName
     *
     * @mbg.generated Thu Jul 25 13:40:27 CST 2019
     */
    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.Sex
     *
     * @return the value of customer.Sex
     *
     * @mbg.generated Thu Jul 25 13:40:27 CST 2019
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.Sex
     *
     * @param sex the value for customer.Sex
     *
     * @mbg.generated Thu Jul 25 13:40:27 CST 2019
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.Phone
     *
     * @return the value of customer.Phone
     *
     * @mbg.generated Thu Jul 25 13:40:27 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.Phone
     *
     * @param phone the value for customer.Phone
     *
     * @mbg.generated Thu Jul 25 13:40:27 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Thu Jul 25 13:40:27 CST 2019
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
        Customer other = (Customer) that;
        return (this.getCustomerid() == null ? other.getCustomerid() == null : this.getCustomerid().equals(other.getCustomerid()))
            && (this.getRoleid() == null ? other.getRoleid() == null : this.getRoleid().equals(other.getRoleid()))
            && (this.getCustomerpassword() == null ? other.getCustomerpassword() == null : this.getCustomerpassword().equals(other.getCustomerpassword()))
            && (this.getCustomername() == null ? other.getCustomername() == null : this.getCustomername().equals(other.getCustomername()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Thu Jul 25 13:40:27 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustomerid() == null) ? 0 : getCustomerid().hashCode());
        result = prime * result + ((getRoleid() == null) ? 0 : getRoleid().hashCode());
        result = prime * result + ((getCustomerpassword() == null) ? 0 : getCustomerpassword().hashCode());
        result = prime * result + ((getCustomername() == null) ? 0 : getCustomername().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        return result;
    }
}
package cn.uestc.hotel.mapper;

import cn.uestc.hotel.domain.OrderForm;
import cn.uestc.hotel.domain.OrderFormExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderFormMapper extends HotelMapperExt {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Thu Aug 01 12:31:06 CST 2019
     */
    long countByExample(OrderFormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Thu Aug 01 12:31:06 CST 2019
     */
    int deleteByExample(OrderFormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Thu Aug 01 12:31:06 CST 2019
     */
    int deleteByPrimaryKey(String orderformid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Thu Aug 01 12:31:06 CST 2019
     */
    int insert(OrderForm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Thu Aug 01 12:31:06 CST 2019
     */
    int insertSelective(OrderForm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Thu Aug 01 12:31:06 CST 2019
     */
    List<OrderForm> selectByExample(OrderFormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Thu Aug 01 12:31:06 CST 2019
     */
    OrderForm selectByPrimaryKey(String orderformid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Thu Aug 01 12:31:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") OrderForm record, @Param("example") OrderFormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Thu Aug 01 12:31:06 CST 2019
     */
    int updateByExample(@Param("record") OrderForm record, @Param("example") OrderFormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Thu Aug 01 12:31:06 CST 2019
     */
    int updateByPrimaryKeySelective(OrderForm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderform
     *
     * @mbg.generated Thu Aug 01 12:31:06 CST 2019
     */
    int updateByPrimaryKey(OrderForm record);
}
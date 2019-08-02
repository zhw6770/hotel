package cn.uestc.hotel.mapper;

import cn.uestc.hotel.domain.Room;
import cn.uestc.hotel.domain.RoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomMapper extends HotelMapperExt {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Fri Aug 02 15:14:03 CST 2019
     */
    long countByExample(RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Fri Aug 02 15:14:03 CST 2019
     */
    int deleteByExample(RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Fri Aug 02 15:14:03 CST 2019
     */
    int deleteByPrimaryKey(String roomid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Fri Aug 02 15:14:03 CST 2019
     */
    int insert(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Fri Aug 02 15:14:03 CST 2019
     */
    int insertSelective(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Fri Aug 02 15:14:03 CST 2019
     */
    List<Room> selectByExampleWithBLOBs(RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Fri Aug 02 15:14:03 CST 2019
     */
    List<Room> selectByExample(RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Fri Aug 02 15:14:03 CST 2019
     */
    Room selectByPrimaryKey(String roomid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Fri Aug 02 15:14:03 CST 2019
     */
    int updateByExampleSelective(@Param("record") Room record, @Param("example") RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Fri Aug 02 15:14:03 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") Room record, @Param("example") RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Fri Aug 02 15:14:03 CST 2019
     */
    int updateByExample(@Param("record") Room record, @Param("example") RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Fri Aug 02 15:14:03 CST 2019
     */
    int updateByPrimaryKeySelective(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Fri Aug 02 15:14:03 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Fri Aug 02 15:14:03 CST 2019
     */
    int updateByPrimaryKey(Room record);
}
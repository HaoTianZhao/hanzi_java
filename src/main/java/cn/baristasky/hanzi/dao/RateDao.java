package cn.baristasky.hanzi.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

import cn.baristasky.hanzi.pojo.Rate;

/**
 * Created by 赵 on 2018/5/7
 */
@Repository
public interface RateDao {
    @Select("SELECT * FROM rate")
    @Results({
            @Result(property = "errorTime", column = "error_time"),
    })
    List<Rate> findAllRate();

    @Select("SELECT * FROM rate where name = #{name}")
    @Results({
            @Result(property = "errorTime", column = "error_time"),
    })
    Rate findByName(@Param("name") String name);

    @Insert("INSERT INTO rate (name, section, error_time) VALUES(#{name},#{section},#{errorTime}) ON DUPLICATE KEY UPDATE " +
            "section = #{section}, error_time = #{errorTime}")
    int saveRate(Rate rate);

}

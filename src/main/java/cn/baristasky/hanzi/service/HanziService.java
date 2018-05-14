package cn.baristasky.hanzi.service;

import java.util.List;

import cn.baristasky.hanzi.pojo.Rate;

/**
 * Created by 赵 on 2018/5/7
 */
public interface HanziService {
    int saveRate(Rate rate);

    List<Rate> findAllRate();

    Rate findByName(String name);
}

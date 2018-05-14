package cn.baristasky.hanzi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import cn.baristasky.hanzi.dao.RateDao;
import cn.baristasky.hanzi.pojo.Rate;
import cn.baristasky.hanzi.service.HanziService;

/**
 * Created by 赵 on 2018/5/7
 */
@Service
public class HanziServiceImpl implements HanziService {
    @Autowired
    RateDao rateDao;

    @Override
    public int saveRate(Rate rate) {
        Rate old = rateDao.findByName(rate.getName());
        if (rate.compareTo(old) > 0)
            return rateDao.saveRate(rate);
        return 0;
    }

    @Override
    public List<Rate> findAllRate() {
        return rateDao.findAllRate();
    }

    @Override
    public Rate findByName(String name) {
        return rateDao.findByName(name);
    }
}

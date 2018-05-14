package cn.baristasky.hanzi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.baristasky.hanzi.pojo.Rate;
import cn.baristasky.hanzi.service.HanziService;

/**
 * Created by 赵 on 2018/5/6
 */
@RestController
@RequestMapping(value = "/hanzi")
public class HanziController {
    @Autowired
    private HanziService hanziService;

    @GetMapping(value = "/download/{name}")
    public Rate getByName(@PathVariable String name) {
        return hanziService.findByName(name);
    }

    // 除了@ModelAttribute绑定参数以外，还可以通过@RequestParam从页面中传递参数
    @PostMapping(value = "/upload")
    public void saveRate(@ModelAttribute Rate rate) {
        hanziService.saveRate(rate);
    }


}

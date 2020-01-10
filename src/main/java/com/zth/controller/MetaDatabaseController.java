package com.zth.controller;

import com.zth.domain.MetaDatabase;
import com.zth.service.MetaDatabaseService;
import com.zth.utils.ResultVO;
import com.zth.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: 3zZ.
 * Date: 2020/1/11 3:46 上午
 * @author 3zz
 */
@RestController
@RequestMapping("/meta/database")
public class MetaDatabaseController {
    @Autowired
    private MetaDatabaseService metaDatabaseService;

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public ResultVO save(@ModelAttribute MetaDatabase metaDatabase){
        metaDatabaseService.save(metaDatabase);
        return ResultVOUtil.success();
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResultVO query(){
        return ResultVOUtil.success(metaDatabaseService.query());
    }
}

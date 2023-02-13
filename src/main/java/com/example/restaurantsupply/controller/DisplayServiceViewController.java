package com.example.restaurantsupply.controller;

import com.example.restaurantsupply.service.DisplayServiceViewService;
import org.springframework.web.bind.annotation.*;
import com.example.restaurantsupply.model.DisplayServiceView;
import com.example.restaurantsupply.util.Result;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * (DisplayServiceView)表控制层
 *
 * @author 
 */
@RestController
@RequestMapping("displayServiceView")
public class DisplayServiceViewController {
    /**
     * 服务对象
     */
    @Autowired
    private DisplayServiceViewService displayServiceViewService;


    @PostMapping("/findAll")
    public Result findAll(@RequestParam(required = false) Integer pageNum ,
                     @RequestParam(required = false) Integer pageSize,
                     DisplayServiceView displayServiceView){
        Map<String, Object> params = new HashMap<>(8);
        params.put("pageNum", pageNum);
        params.put("pageSize", pageSize);
        params.put("entity", displayServiceView);
        return Result.ok().data(displayServiceViewService.findAllByPage(params));
    }


}

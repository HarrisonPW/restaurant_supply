package com.example.restaurantsupply.controller;

import com.example.restaurantsupply.service.DisplayLocationViewService;
import org.springframework.web.bind.annotation.*;
import com.example.restaurantsupply.model.DisplayLocationView;
import com.example.restaurantsupply.util.Result;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * (DisplayLocationView)表控制层
 *
 * @author 
 */
@RestController
@RequestMapping("displayLocationView")
public class DisplayLocationViewController {
    /**
     * 服务对象
     */
    @Autowired
    private DisplayLocationViewService displayLocationViewService;


    @PostMapping("/findAll")
    public Result findAll(@RequestParam(required = false) Integer pageNum ,
                     @RequestParam(required = false) Integer pageSize,
                     DisplayLocationView displayLocationView){
        Map<String, Object> params = new HashMap<>(8);
        params.put("pageNum", pageNum);
        params.put("pageSize", pageSize);
        params.put("entity", displayLocationView);
        return Result.ok().data(displayLocationViewService.findAllByPage(params));
    }


}

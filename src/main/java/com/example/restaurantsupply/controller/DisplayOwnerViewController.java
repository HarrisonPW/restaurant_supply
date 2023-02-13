package com.example.restaurantsupply.controller;

import com.example.restaurantsupply.service.DisplayOwnerViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.restaurantsupply.model.DisplayOwnerView;
import com.example.restaurantsupply.util.Result;
import java.util.HashMap;
import java.util.Map;

/**
 * (DisplayOwnerView)表控制层
 *
 * @author 
 */
@RestController
@RequestMapping("displayOwnerView")
public class DisplayOwnerViewController {
    /**
     * 服务对象
     */
    @Autowired
    private DisplayOwnerViewService displayOwnerViewService;


    @PostMapping("/findAll")
    public Result findAll(@RequestParam(required = false) Integer pageNum ,
                     @RequestParam(required = false) Integer pageSize,
                     DisplayOwnerView displayOwnerView){
        Map<String, Object> params = new HashMap<>(8);
        params.put("pageNum", pageNum);
        params.put("pageSize", pageSize);
        params.put("entity", displayOwnerView);
        return Result.ok().data(displayOwnerViewService.findAllByPage(params));
    }


}

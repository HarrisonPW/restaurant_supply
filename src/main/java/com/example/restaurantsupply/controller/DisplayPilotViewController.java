package com.example.restaurantsupply.controller;

import com.example.restaurantsupply.service.DisplayPilotViewService;
import org.springframework.web.bind.annotation.*;
import com.example.restaurantsupply.model.DisplayPilotView;
import com.example.restaurantsupply.util.Result;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * (DisplayPilotView)表控制层
 *
 * @author 
 */
@RestController
@RequestMapping("displayPilotView")
public class DisplayPilotViewController {
    /**
     * 服务对象
     */
    @Autowired
    private DisplayPilotViewService displayPilotViewService;


    @PostMapping("/findAll")
    public Result findAll(@RequestParam(required = false) Integer pageNum ,
                     @RequestParam(required = false) Integer pageSize,
                     DisplayPilotView displayPilotView){
        Map<String, Object> params = new HashMap<>(8);
        params.put("pageNum", pageNum);
        params.put("pageSize", pageSize);
        params.put("entity", displayPilotView);
        return Result.ok().data(displayPilotViewService.findAllByPage(params));
    }


}

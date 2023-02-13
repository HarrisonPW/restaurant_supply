package com.example.restaurantsupply.controller;

import com.example.restaurantsupply.service.DisplayIngredientViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.restaurantsupply.model.DisplayIngredientView;
import com.example.restaurantsupply.util.Result;
import java.util.HashMap;
import java.util.Map;

/**
 * (DisplayIngredientView)表控制层
 *
 * @author 
 */
@RestController
@RequestMapping("displayIngredientView")
public class DisplayIngredientViewController {
    /**
     * 服务对象
     */
    @Autowired
    private DisplayIngredientViewService displayIngredientViewService;


    @PostMapping("/findAll")
    public Result findAll(@RequestParam(required = false) Integer pageNum ,
                     @RequestParam(required = false) Integer pageSize,
                     DisplayIngredientView displayIngredientView){
        Map<String, Object> params = new HashMap<>(8);
        params.put("pageNum", pageNum);
        params.put("pageSize", pageSize);
        params.put("entity", displayIngredientView);
        return Result.ok().data(displayIngredientViewService.findAllByPage(params));
    }


}

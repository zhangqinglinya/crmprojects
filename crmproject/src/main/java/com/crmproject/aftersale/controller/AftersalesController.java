package com.crmproject.aftersale.controller;

import com.crmproject.aftersale.po.Aftersales;
import com.crmproject.aftersale.service.impl.AftersalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("aftersales")
public class AftersalesController {
    @Autowired
    private AftersalesService afterSalesService;

    //测试
    @ResponseBody
    @RequestMapping("listA.action")
    public List<Aftersales> listA(){
        return afterSalesService.list();
    }

}

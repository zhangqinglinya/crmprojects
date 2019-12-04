package com.crmproject.aftersale.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.crmproject.aftersale.mapper.AftersalesMapper;
import com.crmproject.aftersale.po.Aftersales;
import com.crmproject.aftersale.service.IAftersales;
import org.springframework.stereotype.Service;

@Service
public class AftersalesService extends ServiceImpl<AftersalesMapper, Aftersales> implements IAftersales {
}

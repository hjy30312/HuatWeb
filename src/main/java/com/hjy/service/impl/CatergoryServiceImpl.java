package com.hjy.service.impl;


import com.hjy.model.Category;
import com.hjy.service.ICatergoryService;

import java.util.List;

public class CatergoryServiceImpl implements ICatergoryService{

    @Override
    public List<Category> findAllCategory() {
        List<Category> categoryList = null;
        categoryList = categoryDao.selectAll();

        return null;
    }
}
package com.hjy.service.impl;


import com.hjy.dao.ICatergory;
import com.hjy.model.Category;
import com.hjy.service.ICatergoryService;
import com.hjy.util.MyFactory;
import sun.org.mozilla.javascript.internal.xml.XMLLib;

import java.util.List;


public class CatergoryServiceImpl implements ICatergoryService{

    private final ICatergory catergory = MyFactory.getCategoryDao();

    @Override
    public List<Category> findAllCategory() {
        List<Category> categoryList = null;
        categoryList = catergory.selectAll();

        return categoryList;
    }
}
package com.anju.service;

import com.anju.dao.AppFileMapper;
import com.anju.dao.model.AppFile;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppFileService {
    @Autowired
    private AppFileMapper appFileMapper;

    public List<AppFile> getAll() {
//        if (city.getPage() != null && city.getRows() != null) {
//            PageHelper.startPage(city.getPage(), city.getRows());
//        }
        return appFileMapper.selectAll();
    }

    public AppFile getById(Integer id) {
        return appFileMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {
        appFileMapper.deleteByPrimaryKey(id);
    }

    public void save(AppFile country) {
        if (country.getId() != null) {
            appFileMapper.updateByPrimaryKey(country);
        } else {
            appFileMapper.insert(country);
        }

    }
}
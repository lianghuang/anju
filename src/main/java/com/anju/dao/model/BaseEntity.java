package com.anju.dao.model;
import javax.persistence.*;
/**
 * Created by huangliangliang on 1/31/17.
 */
public class BaseEntity {
    @Transient
    private Integer page = 1;

    @Transient
    private Integer rows = 10;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}
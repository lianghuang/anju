package com.anju.dao;

import com.anju.dao.model.AppPromo;

public interface AppPromoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_promo
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_promo
     *
     * @mbggenerated
     */
    int insert(AppPromo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_promo
     *
     * @mbggenerated
     */
    int insertSelective(AppPromo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_promo
     *
     * @mbggenerated
     */
    AppPromo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_promo
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AppPromo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_promo
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AppPromo record);
}
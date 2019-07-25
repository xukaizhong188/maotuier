package com.springboot.maotuier.dao;

import com.springboot.maotuier.entity.Area;

import java.util.List;

public interface AreaDao {
    /*
    * 列出区域列表
    *
    * @retrun areaList
    * */
    List<Area> queryArea();
    /*
     * 根据id列出具体区域
     *
     * @retrun area
     * */
    Area queryAreaById(int areaId);
    /*
     * 插入区域信息
     *
     * @param area
     * @retrun
     * */
    int insertArea(Area area);
    /*
     * 更新区域信息
     *
     * @param area
     * @retrun
     * */
    int updateArea(Area area);
    /*
     * 删除区域信息
     *
     * @param areaId
     * @retrun
     * */
    int deleteArea(int areaId);
}

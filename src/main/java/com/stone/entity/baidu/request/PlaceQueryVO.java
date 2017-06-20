package com.stone.entity.baidu.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Place区域检索通用接口参数
 * Created by zhaoc on 2017/4/24.
 */
@Data
public class PlaceQueryVO extends BaseQueryVO implements Serializable {
    private static final long serialVersionUID = -6474589928434224453L;
    /**
     * 检索关键字，周边检索和矩形区域内检索支持多个关键字并集检索，
     * 不同关键字间以$符号分隔，最多支持10个关键字检索。如:”银行$酒店”。
     */
    @NotNull(message = "检索关键字不能为空") private String query;
    /**
     * 标签项，与q组合进行检索，以“,”分隔
     */
    private String tag;
    /**
     * 输出格式为json或者xml
     */
    private String output;
    /**
     * 检索结果详细程度。取值为1 或空，则返回基本信息；取值为2，返回检索POI详细信息
     */
    @NotNull(message = "scope不能为空") private int scope;
    private String filter;//
    /**
     * 坐标类型，
     * 1（wgs84ll即GPS经纬度），
     * 2（gcj02ll即国测局经纬度坐标），
     * 3（bd09ll即百度经纬度坐标），
     * 4（bd09mc即百度米制坐标）
     */
    private int coord_type;
    /**
     * 可选参数，添加后POI返回国测局经纬度坐标
     */
    private String ret_coordtype;
    /**
     * 范围记录数量，默认为10条记录，最大返回20条。多关键字检索时，返回的记录数为关键字个数*page_size。
     */
    private int page_size;
    /**
     * 分页页码，默认为0,0代表第一页，1代表第二页，以此类推
     */
    private int page_num;
}

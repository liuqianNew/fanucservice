package com.avatech.edi.materials.model.dto;

/**
 * @author Fancy
 * @date 2019/7/9
 */
public class MaterialParam {

    public MaterialParam(){}

    public MaterialParam(String itemCode,String whsCode,String groupCode,Integer pageIndex,Integer pageSize) {
        this.itemCode = itemCode;
        this.whsCode = whsCode;
        this.groupCode = groupCode;
        this.pageIndex = pageIndex == 0 ? 1 : pageIndex;
        this.pageSize = pageSize == 0 ? 30 : pageSize;
        this.beginIndex = (this.pageIndex - 1) * this.pageSize + 1;
        this.endIndex = this.pageIndex * this.pageSize;
    }

    /**
     * 物料编码
     */
    private String itemCode;

    /**
     * 仓库编码
     */
    private String whsCode;

    /**
     * 物料组编码
     */
    private String groupCode;

    /**
     * 页数索引
     */
    private Integer pageIndex;

    /**
     * 每页显示数量
     */
    private Integer pageSize;

    /**
     * 起始索引
     */
    private Integer beginIndex;

    /**
     * 结束索引
     */
    private Integer endIndex;

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getWhsCode() {
        return whsCode;
    }

    public void setWhsCode(String whsCode) {
        this.whsCode = whsCode;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getBeginIndex() {
        return beginIndex;
    }

    public void setBeginIndex(Integer beginIndex) {
        this.beginIndex = beginIndex;
    }

    public Integer getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }
}

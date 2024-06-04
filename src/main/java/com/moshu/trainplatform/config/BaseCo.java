package com.moshu.trainplatform.config;

//import io.swagger.annotations.ApiParam;


/**
 * 基础查询条件
 *
 * @author hxjxiaojun
 * @time 2016年8月30日
 */
public class BaseCo {
    //@ApiParam(value="第几页",defaultValue="1",required=false)
    /**
     * 页号
     */
    private int pageNo = 1;

    //@ApiParam(value="每页显示的记录数",defaultValue="10",required=false)
    /**
     * 页容量
     */
    private int pageSize = 10;

    //@ApiParam(value="是否全部显示",defaultValue="false",required=false)
    /**
     * 是否全部显示
     */
    private boolean all = false;

    /**
     * 未使用
     */
    @SuppressWarnings("unused")
    private int start;


    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean getAll() {
        return all;
    }

    public void setAll(boolean all) {
        this.all = all;
    }

    public int getStart() {
        return (pageNo - 1) * pageSize;
    }
}

package com.pil0txia.dormitory.manage.dto;

import java.io.Serializable;

/**
 * 数据库数据导出Excel
 *
 * @author pil0txia
 * @version 0.0.1
 * @since 0.0.1
 */
public class RestDataExcelExportRequest extends AbstractExcelExportRequest implements Serializable {

    /**
     * rest url
     */
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

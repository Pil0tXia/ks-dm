package com.pil0txia.dormitory.manage.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 指定数据导出Excel
 *
 * @author pil0txia
 * @version 0.0.1
 * @since 0.0.1
 */
public class DataExcelExportRequest extends AbstractExcelExportRequest implements Serializable {

    /**
     * 数据
     */
    private List<Map<String, String>> data;

    public List<Map<String, String>> getData() {
        return data;
    }

    public void setData(List<Map<String, String>> data) {
        this.data = data;
    }
}

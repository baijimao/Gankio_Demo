package com.baijimao.gankio_demo.json;

import com.baijimao.gankio_demo.json.today.ResultsBean;

import java.util.List;


/**
 * @author: baijimao
 * @date: 2019/3/31
 * Description:
 */
public class GankIoToday {
    private boolean error;
    private ResultsBean results;
    private List<String> category;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public ResultsBean getResults() {
        return results;
    }

    public void setResults(ResultsBean results) {
        this.results = results;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "GankIoToday{" +
                "error=" + error +
                ", results=" + results +
                ", category=" + category +
                '}';
    }
}

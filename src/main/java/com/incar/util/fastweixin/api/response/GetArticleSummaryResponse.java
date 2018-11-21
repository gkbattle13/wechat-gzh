package com.incar.util.fastweixin.api.response;

import com.incar.util.fastweixin.api.entity.ArticleSummary;

import java.util.List;

/**
 * @author peiyu
 */
public class GetArticleSummaryResponse extends BaseResponse {

    private List<ArticleSummary> list;

    public List<ArticleSummary> getList() {
        return list;
    }

    public void setList(List<ArticleSummary> list) {
        this.list = list;
    }
}

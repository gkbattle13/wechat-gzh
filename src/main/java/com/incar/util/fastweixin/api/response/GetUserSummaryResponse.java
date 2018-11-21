package com.incar.util.fastweixin.api.response;

import com.incar.util.fastweixin.api.entity.UserSummary;

import java.util.List;

/**
 * @author peiyu
 */
public class GetUserSummaryResponse extends BaseResponse {

    private List<UserSummary> list;

    public List<UserSummary> getList() {
        return list;
    }

    public void setList(List<UserSummary> list) {
        this.list = list;
    }
}

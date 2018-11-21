package com.incar.util.fastweixin.api.response;

import com.incar.util.fastweixin.api.entity.UpstreamMsgMonth;

import java.util.List;

/**
 * @author peiyu
 */
public class GetUpstreamMsgMonthResponse extends BaseResponse {

    private List<UpstreamMsgMonth> list;

    public List<UpstreamMsgMonth> getList() {
        return list;
    }

    public void setList(List<UpstreamMsgMonth> list) {
        this.list = list;
    }
}

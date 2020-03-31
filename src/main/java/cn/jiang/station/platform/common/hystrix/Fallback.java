package cn.jiang.station.platform.common.hystrix;

import cn.jiang.station.platform.common.constants.HttpStatusConstants;
import cn.jiang.station.platform.common.dto.BaseResult;
import cn.jiang.station.platform.common.utils.MapperUtils;
import com.google.common.collect.Lists;

public class Fallback {
    /**
     * 熔断：502错误
     *
     * @return
     */
    public static String badGateway() {
        BaseResult baseResult = BaseResult.notOk(Lists.newArrayList(new BaseResult.Error(String.valueOf(HttpStatusConstants.BAD_GATEWAY.getStatus()), HttpStatusConstants.BAD_GATEWAY.getContent())));
        try {
            return MapperUtils.obj2json(baseResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

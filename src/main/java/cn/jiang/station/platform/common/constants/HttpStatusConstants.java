package cn.jiang.station.platform.common.constants;

import lombok.Getter;

@Getter
public enum HttpStatusConstants {
    BAD_GATEWAY(502, "从上游服务器接收到无效的响应");

    private int status;
    private String content;

    public static HttpStatusConstants getHttpStatusConstants(int status) {
        HttpStatusConstants[] values = HttpStatusConstants.values();
        for (HttpStatusConstants httpStatusConstants : values) {
            if (status == httpStatusConstants.getStatus()) {
                return httpStatusConstants;
            }
        }
        return null;
    }

    HttpStatusConstants(int status, String content) {
        this.status = status;
        this.content = content;
    }

}

package result;

import lombok.Data;

/**
 * @author Wilson
 * @description: TODO
 * @date 2022/11/26 12:59
 */
@Data
public class ResultModel<T> {
    /**
     * 返回值
     */
    private T resultValue;
    /**
     * 状态
     */
    private Boolean resultSuccess;
    /**
     * 错误信息
     */
    private String ErrorMessage;
}

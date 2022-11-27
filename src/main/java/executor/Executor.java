package executor;

import result.ResultModel;

/**
 * @author Wilson
 * @description: TODO
 * @date 2022/11/26 15:13
 */
public interface Executor<T> {
    public ResultModel<T> execute();
}

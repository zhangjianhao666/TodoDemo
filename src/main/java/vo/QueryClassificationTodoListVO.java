package vo;

import lombok.Data;

import java.util.List;

/**
 * @author Wilson
 * @description:
 * @date 2022/11/26 14:08
 */
@Data

public class QueryClassificationTodoListVO {
    /**
     * 特定类别todo
     */
    private List<TodoDO> todoVOList;
}

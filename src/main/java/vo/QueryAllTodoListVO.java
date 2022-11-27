package vo;

import lombok.Data;

import java.util.List;

/**
 * @author Wilson
 * @description: TODO
 * @date 2022/11/26 13:47
 */
@Data
public class QueryAllTodoListVO {
    /**
     * 该用户所有Todo
     */
    List<TodoDO> todoVOList;
}

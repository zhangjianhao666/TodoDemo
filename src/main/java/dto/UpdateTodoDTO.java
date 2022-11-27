package dto;

import lombok.Data;
import vo.TodoDO;

/**
 * @author Wilson
 * @description: TODO
 * @date 2022/11/26 14:20
 */
@Data
public class UpdateTodoDTO {
    /**
     * 要更新的todo
     */
    private TodoDO todoDO;
}

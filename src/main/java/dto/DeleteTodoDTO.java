package dto;

import lombok.Data;

/**
 * @author Wilson
 * @description: TODO
 * @date 2022/11/26 13:41
 */
@Data
public class DeleteTodoDTO {
    /**
     * 要删除的todoId
     */
    private String deletedTodoId;
}

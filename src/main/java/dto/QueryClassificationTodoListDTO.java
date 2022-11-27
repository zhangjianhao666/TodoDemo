package dto;

import lombok.Data;

/**
 * @author Wilson
 * @description: TODO
 * @date 2022/11/26 14:12
 */
@Data
public class QueryClassificationTodoListDTO {
    /**
     * 查询的用户的id
     */
    private String userId;
    /**
     * todo类别
     */
    private String todoType;
}

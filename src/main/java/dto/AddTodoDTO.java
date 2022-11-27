package dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author Wilson
 * @description: 添加todo
 * @date 2022/11/25 16:54
 */
@Data
public class AddTodoDTO {
    /**
     * todo名字
     */
    private String todoName;
    /**
     * todo描述
     */
    private String description;
    /**
     * 子步骤
     */
    private List<String> subStep;
    /**
     * 到期时间
     */
    private Date dueDate;
    /**
     * 是否重要
     */
    private Boolean isImportant;
}

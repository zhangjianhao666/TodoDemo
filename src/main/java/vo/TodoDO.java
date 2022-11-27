package vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author Wilson
 * @description: TODO
 * @date 2022/11/26 13:47
 */
@Data
public class TodoDO {
    /**
     * todo所属用户id
     */
    private String userId;
    /**
     * todoId
     */
    private String todoId;
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
    /**
     * todo类别
     */
    private String todoType;
}

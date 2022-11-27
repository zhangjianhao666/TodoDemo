package entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author Wilson
 * @description: TodoEntity层
 * @date 2022/11/25 16:22
 */
@Data
public class TodoEntity {
    /**
     * todo的id
     */
    private String todoId;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 修改时间
     */
    private Date modifiedDate;
    /**
     * 创建人id
     */
    private String creatorId;
    /**
     * 修改人id
     */
    private String modifierId;
    /**
     * 是否删除
     */
    private Boolean isDeleted;
    /**
     * todo所属用户id
     */
    private String userId;
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

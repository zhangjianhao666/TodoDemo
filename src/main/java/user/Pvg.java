package user;

import lombok.Data;

/**
 * @author Wilson
 * @description: 用户信息类
 * @date 2022/11/25 16:36
 */
@Data
public class Pvg {
    private String userId;
    private String userName;
    /**
     * 用户所处小组
     */
    private String groupId;
}

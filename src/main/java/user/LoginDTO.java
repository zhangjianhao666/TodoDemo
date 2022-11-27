package user;

import lombok.Data;

/**
 * @author Wilson
 * @description: 登录信息
 * @date 2022/11/27 14:16
 */
@Data
public class LoginDTO {
    private String userId;
    private String password;
}

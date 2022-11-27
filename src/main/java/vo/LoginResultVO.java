package vo;

import lombok.Data;
import user.Pvg;

/**
 * @author Wilson
 * @description: 登陆操作
 * @date 2022/11/27 14:18
 */
@Data
public class LoginResultVO {
    private Boolean loginSuccess;
    private Pvg pvg;
}

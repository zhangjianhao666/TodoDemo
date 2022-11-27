package executor;

import mapper.TodoMapper;
import result.ResultModel;
import user.LoginDTO;
import vo.LoginResultVO;

/**
 * @author Wilson
 * @description: 登录exe
 * @date 2022/11/27 14:21
 */
public class LoginExe implements Executor<LoginResultVO> {
    private LoginDTO loginDTO;
    public LoginExe(LoginDTO loginDTO) {
        this.loginDTO = loginDTO;
    }
    @Override
    public ResultModel<LoginResultVO> execute() {
        ResultModel<LoginResultVO> resultModel = new ResultModel<>();
        resultModel.setResultSuccess(true);
        if(loginDTO == null) {
            resultModel.setResultSuccess(false);
            resultModel.setErrorMessage("loginDTO is null");
        }
        if(loginDTO.getPassword().isBlank() || loginDTO.getUserId().isBlank()) {
            resultModel.setResultSuccess(false);
            resultModel.setErrorMessage("loginDTO.userId or password is blank");
        }
        TodoMapper todoMapper = new TodoMapper();
        try {
            resultModel.setResultValue(todoMapper.loginCheck(loginDTO));
        } catch (Exception e) {
            resultModel.setResultSuccess(false);
            resultModel.setErrorMessage(e.getMessage());
        }
        return resultModel;
    }
}

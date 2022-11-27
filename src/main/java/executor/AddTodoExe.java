package executor;

import dto.AddTodoDTO;
import mapper.TodoMapper;
import result.ResultModel;
import vo.AddTodoVO;

/**
 * @author Wilson
 * @description: TODO
 * @date 2022/11/26 15:20
 */
public class AddTodoExe implements Executor<AddTodoVO>{
    private AddTodoDTO addTodoDTO;
    public AddTodoExe (AddTodoDTO addTodoDTO) {
        this.addTodoDTO = addTodoDTO;
    }
    @Override
    public ResultModel<AddTodoVO> execute() {
        TodoMapper todoMapper = new TodoMapper();
        ResultModel<AddTodoVO> resultModel = new ResultModel<AddTodoVO>();
        // 入参合法性判断
        if(addTodoDTO==null) {
            resultModel.setResultSuccess(false);
            resultModel.setErrorMessage("addTodoDTO is null!");
            return resultModel;
        } else if(addTodoDTO.getTodoName().isBlank()) {
            resultModel.setResultSuccess(false);
            resultModel.setErrorMessage("todoName is blank!");
            return resultModel;
        }
        resultModel.setResultSuccess(true);
        try {
            AddTodoVO addTodoVO = todoMapper.addTodo(addTodoDTO);
            resultModel.setResultValue(addTodoVO);
        } catch (Exception e) {
            resultModel.setResultSuccess(false);
            resultModel.setErrorMessage(e.getMessage());
        }
        return resultModel;
    }

}

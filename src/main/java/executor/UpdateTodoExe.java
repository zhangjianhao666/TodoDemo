package executor;

import dto.UpdateTodoDTO;
import mapper.TodoMapper;
import result.ResultModel;
import vo.UpdateTodoVO;

/**
 * @author Wilson
 * @description: TODO
 * @date 2022/11/27 12:13
 */
public class UpdateTodoExe implements Executor<UpdateTodoVO> {
    private UpdateTodoDTO updateTodoDTO;
    public UpdateTodoExe(UpdateTodoDTO updateTodoDTO) {
        this.updateTodoDTO = updateTodoDTO;
    }

    @Override
    public ResultModel<UpdateTodoVO> execute() {
        ResultModel<UpdateTodoVO> resultModel = new ResultModel<>();
        resultModel.setResultSuccess(true);
        if(updateTodoDTO == null) {
            resultModel.setResultSuccess(false);
            resultModel.setErrorMessage("updateTodoDTO is null");
        }
        if(updateTodoDTO.getTodoDO() == null) {
            resultModel.setResultSuccess(false);
            resultModel.setErrorMessage("updateTodoDTO.todoDO is null");
        }
        if(updateTodoDTO.getTodoDO().getTodoId().isBlank()) {
            resultModel.setResultSuccess(false);
            resultModel.setErrorMessage("updateTodoDTO.todoDO.todoId is blank");
        }
        TodoMapper todoMapper = new TodoMapper();
        try {
            resultModel.setResultValue(todoMapper.updateTodo(updateTodoDTO));
        } catch (Exception e) {
            resultModel.setResultSuccess(false);
            resultModel.setErrorMessage(e.getMessage());
        }
        return resultModel;
    }
}

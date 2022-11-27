package executor;

import dto.DeleteTodoDTO;
import mapper.TodoMapper;
import result.ResultModel;
import vo.DeleteTodoVO;

/**
 * @author Wilson
 * @description: TODO
 * @date 2022/11/26 16:25
 */
public class DeleteTodoExe implements Executor<DeleteTodoVO>{
    private DeleteTodoDTO deleteTodoDTO;
    public DeleteTodoExe(DeleteTodoDTO deleteTodoDTO) {
        this.deleteTodoDTO = deleteTodoDTO;
    }

    @Override
    public  ResultModel<DeleteTodoVO> execute() {
        ResultModel<DeleteTodoVO> resultModel = new ResultModel<>();
        resultModel.setResultSuccess(true);
        if(deleteTodoDTO==null) {
            resultModel.setResultSuccess(false);
            resultModel.setErrorMessage("deleteTodoDTO false");
            return resultModel;
        } else if(deleteTodoDTO.getDeletedTodoId().isBlank()) {
            resultModel.setResultSuccess(false);
            resultModel.setErrorMessage("deletedTodoId is blank");
            return resultModel;
        }
        TodoMapper todoMapper = new TodoMapper();
        try {
            DeleteTodoVO deleteTodoVO = todoMapper.deleteTodo(deleteTodoDTO);
            resultModel.setResultValue(deleteTodoVO);
        } catch (Exception e) {
            resultModel.setResultSuccess(false);
            resultModel.setErrorMessage(e.getMessage());
        }
        return resultModel;
    }
}

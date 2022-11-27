package executor;

import dto.QueryAllTodoListDTO;
import mapper.TodoMapper;
import result.ResultModel;
import vo.QueryAllTodoListVO;

/**
 * @author Wilson
 * @description: TODO
 * @date 2022/11/26 16:48
 */
public class QueryAllTodoListExe implements Executor<QueryAllTodoListVO> {
    private QueryAllTodoListDTO queryAllTodoListDTO;
    public QueryAllTodoListExe(QueryAllTodoListDTO queryAllTodoListDTO) {
        this.queryAllTodoListDTO = queryAllTodoListDTO;
    }
    @Override
    public ResultModel<QueryAllTodoListVO> execute() {
        ResultModel<QueryAllTodoListVO> resultModel = new ResultModel<>();
        resultModel.setResultSuccess(true);
        if(queryAllTodoListDTO==null) {
            resultModel.setResultSuccess(false);
            resultModel.setErrorMessage("queryAllTodoListDTO is null");
            return resultModel;
        } else if(queryAllTodoListDTO.getUserId().isBlank()) {
            resultModel.setResultSuccess(false);
            resultModel.setErrorMessage("userId is blank");
            return resultModel;
        }
        TodoMapper todoMapper = new TodoMapper();
        try {
            resultModel.setResultValue(todoMapper.queryAllTodoList(queryAllTodoListDTO));
        } catch (Exception e) {
            resultModel.setResultSuccess(false);
            resultModel.setErrorMessage(e.getMessage());
        }
        return resultModel;
    }
}

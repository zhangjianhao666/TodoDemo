package executor;

import dto.QueryClassificationTodoListDTO;
import mapper.TodoMapper;
import result.ResultModel;
import vo.QueryClassificationTodoListVO;

/**
 * @author Wilson
 * @description: TODO
 * @date 2022/11/27 11:48
 */
public class QueryClassificationTodoListExe implements Executor<QueryClassificationTodoListVO>{
    private QueryClassificationTodoListDTO queryClassificationTodoListDTO;
    public QueryClassificationTodoListExe(QueryClassificationTodoListDTO queryClassificationTodoListDTO) {
        this.queryClassificationTodoListDTO = queryClassificationTodoListDTO;
    }
    @Override
    public ResultModel<QueryClassificationTodoListVO> execute() {
        ResultModel<QueryClassificationTodoListVO> resultModel = new ResultModel<>();
        resultModel.setResultSuccess(true);
        if(queryClassificationTodoListDTO == null) {
            resultModel.setResultSuccess(false);
            resultModel.setErrorMessage("queryClassificationTodoListDTO is null");
        }
        if (queryClassificationTodoListDTO.getUserId().isBlank()) {
            resultModel.setResultSuccess(false);
            resultModel.setErrorMessage("queryClassificationTodoListDTO.userId is blank");
        }
        TodoMapper todoMapper = new TodoMapper();
        try {
            resultModel.setResultValue(todoMapper.queryClassificationTodoList(queryClassificationTodoListDTO));
        } catch (Exception e) {
            resultModel.setResultSuccess(false);
            resultModel.setErrorMessage(e.getMessage());
        }
        return resultModel;
    }
}

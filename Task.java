/**
 * @author Funato
 * @version 1.1
 */

import java.util.*;

public class Task implements SetParam{
    static int _task_id = 0;
    int task_id;
    ArrayList<SubTask> subTasks = new ArrayList<SubTask>();
    Random random = new Random();
    public int subTaskNum = random.nextInt(4)+3;;

    /**
     * コンストラクタ
     * パラメータで指定されたタイプのサブタスクをランダムに生成する.
     * @param taskType
     */
    Task( int taskType ){
        this.task_id = _task_id;
        _task_id++;
        setSubTasks(taskType);
    }

    /**
     * setSubTasksメソッド
     * パラメータで指定されたタイプのサブタスクを指定数作成する.
     * @param taskType
     */
    private void setSubTasks(int taskType){
        for( int i = 0; i < subTaskNum; i++){
            if( i == 0 ) subTasks.add(new SubTask(UNIFORM, RESET) );
            else subTasks.add(new SubTask(UNIFORM, CONT) );
        }
    }

    @Override
    public String toString(){
        String str = "Task " + task_id + ", Subtasks :" + subTaskNum + "\n" ;
        for( int i = 0; i < subTaskNum ;i++ ){
            str +=  subTasks.get(i) +"\n" ;
        }
        return str;
    }
}

package co.fatboa.myutils.mypoi;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hl
 * @Description: 自定义sheet类
 * @Date: 16:49 2018/8/8
 * @Modified By:
 * @Version 1.0
 */
public class MySheet {
    private List<MyCell> myCells = new ArrayList<MyCell>();

    public List<MyCell> getMyCells() {
        return myCells;
    }

    public void setMyCells(List<MyCell> myCells) {
        this.myCells = myCells;
    }

    public void add(MyCell myCell) {
        this.myCells.add(myCell);
    }
}

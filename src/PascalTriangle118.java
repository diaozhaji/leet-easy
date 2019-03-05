import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PascalTriangle118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        List<Integer> preItem = new ArrayList<>();

        if (numRows > 0) {
            List<Integer> item = new ArrayList<>();
            item.add(1);
            result.add(item);
            preItem = item;
        }

        if (numRows > 1) {
            List<Integer> item = new ArrayList<>();
            item.add(1);
            item.add(1);
            result.add(item);
            preItem = item;
        }

        if (numRows > 2) {
            for (int i = 3; i <= numRows; i++) {
                List<Integer> item = new ArrayList<>();
                for (int j = 1; j < i + 1; j++) {
                    if (j == 1 || j == i) {
                        item.add(1);
                    } else {
                        item.add(preItem.get(j - 2) + preItem.get(j - 1));
                    }
                }
                preItem = item;
                result.add(item);

            }
        }

        return result;
    }

    public static List<Integer> getRow(int rowIndex) {
        rowIndex++;
        List<Integer> preItem = new ArrayList<>();

        if (rowIndex == 0) {
            return preItem;
        }

        if (rowIndex > 0) {
            List<Integer> item = new ArrayList<>();
            item.add(1);
            preItem = item;
        }

        if (rowIndex > 1) {
            List<Integer> item = new ArrayList<>();
            item.add(1);
            item.add(1);
            preItem = item;
        }

        if (rowIndex > 2) {
            for (int i = 3; i <= rowIndex; i++) {
                List<Integer> item = new ArrayList<>();
                for (int j = 1; j < i + 1; j++) {
                    if (j == 1 || j == i) {
                        item.add(1);
                    } else {
                        item.add(preItem.get(j - 2) + preItem.get(j - 1));
                    }
                }
                preItem = item;
            }
        }

        return preItem;
    }

    //上面的方法内存使用过多，可以考虑只是用1个list的方案，在内部模拟杨辉三角形的性质
    //回头再背
    public static List<Integer> getRow1(int rowIndex) {
        List<Integer> list = new LinkedList<>();
        if (rowIndex < 0) {
            return list;
        }
        for (int i = 0; i < rowIndex + 1; i++) {
            list.add(0, 1);
            for (int j = 1; j < list.size() - 1; j++) {
                list.set(j, list.get(j) + list.get(j + 1));
            }
        }

        return list;
    }

}

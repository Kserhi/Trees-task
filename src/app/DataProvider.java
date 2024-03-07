package app;

import java.util.Arrays;
import java.util.List;

public class DataProvider {
    public BinaryTree getTree(){

//        List<Integer> list = Arrays.asList(1,3,5,7,9,11,12,10,8,6,4,2);
        List<Integer> list = Arrays.asList(12,11,10,9,8,7,6,5,4,3,2,1);

        BinaryTree tree=new BinaryTree();

        list.forEach((value)->tree.insert(value.intValue()));
        return tree;
    }
}

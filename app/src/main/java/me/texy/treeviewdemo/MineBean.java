package me.texy.treeviewdemo;

import me.texy.treeview.TreeNode;

/**
 * Info:
 * Created by Umbrella.
 * CreateTime: 2020/5/13 20:15
 */
public class MineBean extends TreeNode {
    public MineBean(Object value, int level) {
        super(value, level);
    }
    private String s;

    public String getS() {
        return s == null ? "" : s;
    }

    public void setS(String s) {
        this.s = s == null ? "" : s;
    }
}

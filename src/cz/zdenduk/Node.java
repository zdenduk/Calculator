package cz.zdenduk;

import cz.zdenduk.steps.PlusStep;
import cz.zdenduk.steps.Step;

import java.util.ArrayList;
import java.util.List;

public class Node {
    final public int data;
    final public Step step;
    final public List<Node> sub;

    private Node(int data, Step step, List<Node> sub) {
        this.data = data;
        this.step = step;
        this.sub = sub;
    }

    public static Node create(int data, Step step, List<Node> sub) {
        return new Node(data, step, sub);
    }

    @Override
    public String toString() {
        return "data=" + data + "children=" + sub;
    }
}

package cz.zdenduk;

import cz.zdenduk.steps.PlusStep;
import cz.zdenduk.steps.Step;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {
    List<Step> steps;
    private Node node;

    public Calculator(List<Step> steps, int round, int start) {
        this.steps = steps;
        node = createTree(round, start, new PlusStep(0));
    }

    private Node createTree(int round, int start, Step lastStep) {
        return round == 0 ? Node.create(start, lastStep, new ArrayList<>()) :
                Node.create(start, lastStep, steps.stream().map(step -> createTree(round - 1, step.calculate(start), step)).collect(Collectors.toList()));
    }

    public void printTree() {
        System.out.println(node.toString());
    }

    private List<Solution> solve(final Node node, final int aim, List<Step> solutions) {
        if (aim == node.data && node.sub.isEmpty()) {
            return new ArrayList<Solution>() {{
                add(new Solution(solutions));
            }};
        } else if (node.sub.isEmpty()) {
            return new ArrayList<>();
        } else {
            return node.sub.stream().flatMap(i -> {
                ArrayList<Step> newSteps = new ArrayList(solutions) {{
                    add(i.step);
                }};
                return solve(i, aim, newSteps).stream();
            }).collect(Collectors.toList());
        }
    }
    
    public List<Solution> solve(int end) {
        return solve(node, end, new ArrayList<>());
    }
}

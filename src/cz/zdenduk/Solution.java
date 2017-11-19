package cz.zdenduk;

import cz.zdenduk.steps.Step;

import java.util.List;

public class Solution {
    public Solution(List<Step> solutions) {
        this.solutions = solutions;
    }

    final public List<Step> solutions;

    @Override
    public String toString() {
        solutions.forEach(System.out::println);
        return "";
    }
}

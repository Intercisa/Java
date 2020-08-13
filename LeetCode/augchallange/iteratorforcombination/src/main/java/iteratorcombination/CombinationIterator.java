package main.java.iteratorcombination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombinationIterator {
    private StringBuilder builder;
    private final String input;
    private final int targetLength;
    private final int numberOfSubsets;
    private final List<String> results;
    private int index;

    public CombinationIterator(String characters, int combinationLength) {
        builder = new StringBuilder();
        this.input = characters;
        this.targetLength = combinationLength;
        this.numberOfSubsets = setNumberOfSubsets();
        this.results = new ArrayList<>(numberOfSubsets);
        processCombinations();
    }


    public String next() {
        return results.get(index++);
    }

    public boolean hasNext() {
        return index < results.size();
    }

    
    private int setNumberOfSubsets() {
        return 1 << input.length();
    }

    private void processCombinations(){
        for (int i = 0; i < numberOfSubsets; i++) {
            for (int j = 0; j < input.length(); j++)
                appendSubsetCharToCurrentSubset(i, j);

            addSubsetToResults();
        }
        Collections.sort(results);
    }

    private void addSubsetToResults() {
        if(isTargetLength()) results.add(builder.toString());
        builder = new StringBuilder();
    }

    private void appendSubsetCharToCurrentSubset(int index, int candidate) {
        if (isSubsetChar(index, candidate)) builder.append(input.charAt(candidate));
    }

    private boolean isTargetLength() {
        return builder.length() == targetLength;
    }

    private boolean isSubsetChar(int index, int candidate) {
        return (index & (1 << candidate)) > 0;
    }
}

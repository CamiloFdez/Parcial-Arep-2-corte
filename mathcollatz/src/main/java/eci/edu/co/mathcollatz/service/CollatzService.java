package eci.edu.co.mathcollatz.service;

import java.util.ArrayList;
import java.util.List;

public class CollatzService {

    public String getCollatzSequence(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("El valor debe ser un entero positivo");
        }

        List<Integer> sequence = new ArrayList<>();
        int current = value;

        while (current != 1) {
            sequence.add(current);
            if (current % 2 == 0) {
                current = current / 2;
            } else {
                current = 3 * current + 1;
            }
        }
        sequence.add(1);

        String result = "";
        for (int i = 0; i < sequence.size(); i++) {
            result += sequence.get(i);
            if (i < sequence.size() - 1) {
                result += " -> ";
            }
        }
        return result;
    }
}

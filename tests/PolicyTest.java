package io.portfolio;

public final class PolicyTest {
    public static void main(String[] args) {
        var signalcase_1 = new Policy.Signal(57, 73, 23, 6, 9);
        if (Policy.score(signalcase_1) != 153) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_1).equals("review")) throw new AssertionError("decision mismatch");
        var signalcase_2 = new Policy.Signal(96, 87, 27, 7, 13);
        if (Policy.score(signalcase_2) != 254) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_2).equals("accept")) throw new AssertionError("decision mismatch");
        var signalcase_3 = new Policy.Signal(103, 101, 14, 6, 8);
        if (Policy.score(signalcase_3) != 285) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_3).equals("accept")) throw new AssertionError("decision mismatch");
    }
}

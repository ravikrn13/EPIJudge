package epi;

import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;

import java.util.Set;

public class StringTransformability {

  @EpiTest(testfile = "string_transformability.tsv")

  // Uses BFS to find the least steps of transformation.
  public static int transformString(Set<String> D, String s, String t) {
    // Implement this placeholder.
    return 0;
  }

  public static void main(String[] args) {
    System.exit(GenericTest
                    .runFromAnnotations(
                        args, new Object() {}.getClass().getEnclosingClass())
                    .ordinal());
  }
}

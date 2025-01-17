package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029037 Expansion of 1/((1-x)(1-x^3)(1-x^4)(1-x^11)).
 * @author Sean A. Irvine
 */
public class A029037 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029037() {
    super(new long[] {-1, 1, 0, 1, 0, -1, 0, -1, 1, 0, 0, 1, -1, 0, -1, 0, 1, 0, 1}, new long[] {1, 1, 1, 2, 3, 3, 4, 5, 6, 7, 8, 10, 12, 13, 15, 18, 20, 22, 25});
  }
}

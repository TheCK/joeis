package irvine.oeis.a058;

import irvine.oeis.DistinctMultiplicativeClosureSequence;
import irvine.oeis.a000.A000142;

/**
 * A058295 Products of distinct factorials.
 * @author Sean A. Irvine
 */
public class A058295 extends DistinctMultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A058295() {
    super(new A000142());
  }
}

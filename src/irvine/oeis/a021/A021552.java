package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021552.
 * @author Sean A. Irvine
 */
public class A021552 extends PrependSequence {

  /** Construct the sequence. */
  public A021552() {
    super(new PeriodicSequence(1, 8, 2, 4, 8, 1, 7, 5), 0, 0);
  }
}

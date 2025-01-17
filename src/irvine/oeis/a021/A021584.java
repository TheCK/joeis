package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021584 Decimal expansion of 1/580.
 * @author Sean A. Irvine
 */
public class A021584 extends PrependSequence {

  /** Construct the sequence. */
  public A021584() {
    super(new PeriodicSequence(1, 7, 2, 4, 1, 3, 7, 9, 3, 1, 0, 3, 4, 4, 8, 2, 7, 5, 8, 6, 2, 0, 6, 8, 9, 6, 5, 5), 0, 0);
  }
}

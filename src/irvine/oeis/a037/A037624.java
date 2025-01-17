package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037624 Decimal expansion of a(n) is given by the first n terms of the periodic sequence with initial period 2,0,3.
 * @author Sean A. Irvine
 */
public class A037624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037624() {
    super(new long[] {-10, 1, 0, 10}, new long[] {2, 20, 203, 2032});
  }
}

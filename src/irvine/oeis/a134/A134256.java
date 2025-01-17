package irvine.oeis.a134;
// Generated by gen_seq4.pl posins at 2021-05-28 23:02
// DO NOT EDIT here!

import irvine.oeis.PositionSequence;
import irvine.oeis.a049.A049541;


/**
 * A134256 Positions of 6 after decimal point in decimal expansion of 1/Pi.
 *
 * @author Georg Fischer
 */
public class A134256 extends PositionSequence {

  /** Construct the sequence. */
  public A134256() {
    super(0, new A049541(), 6);
    ++mN;
  }
}

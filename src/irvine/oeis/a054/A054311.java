package irvine.oeis.a054;
// Generated by gen_seq4.pl posins at 2021-05-28 23:02
// DO NOT EDIT here!

import irvine.oeis.PositionSequence;
import irvine.oeis.a001.A001620;


/**
 * A054311 Positions of 5's in the decimal expansion of Euler's constant.
 *
 * @author Georg Fischer
 */
public class A054311 extends PositionSequence {

  /** Construct the sequence. */
  public A054311() {
    super(0, new A001620(), 5);
    ++mN;
  }
}

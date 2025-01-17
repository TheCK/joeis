package irvine.oeis.a335;
// Generated by gen_seq4.pl partsum at 2021-05-28 22:45
// DO NOT EDIT here!

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a162.A162510;

/**
 * A335073 a(n) = Sum_{k=1..n} 2^(bigomega(k) - omega(k)).
 *
 * @author Georg Fischer
 */
public class A335073 extends PartialSumSequence {

  /** Construct the sequence. */
  public A335073() {
    super(new A162510());
  }
}

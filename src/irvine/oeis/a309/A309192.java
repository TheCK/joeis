package irvine.oeis.a309;
// Generated by gen_seq4.pl partsum at 2021-06-29 22:31
// DO NOT EDIT here!

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a048.A048250;

/**
 * A309192 a(n) = Sum_{k=1..n} mu(k)^2 * k * floor(n/k).
 * @author Georg Fischer
 */
public class A309192 extends PartialSumSequence {

  /** Construct the sequence. */
  public A309192() {
    super(new A048250());
  }
}

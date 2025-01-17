package irvine.oeis.a327;
// Generated by gen_seq4.pl moebiusix 1 A002131 1 at 2020-09-22 21:54
// DO NOT EDIT here!

import irvine.oeis.transform.InverseMobiusTransformSequence;
import irvine.oeis.a002.A002131;


/**
 * A327096 Expansion of Sum_{k&gt;=1} sigma(k) * x^k / (1 - x^(2*k)), where sigma = A000203.
 * @author Georg Fischer
 */
public class A327096 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A327096() {
    super(new A002131(), 0);
    next();
  }
}

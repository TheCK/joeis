package irvine.oeis.a086;
// Generated by gen_seq4.pl moebiusix 1 A064911 1 at 2020-09-22 21:54
// DO NOT EDIT here!

import irvine.oeis.transform.InverseMobiusTransformSequence;
import irvine.oeis.a064.A064911;


/**
 * A086971 Number of semiprime divisors of n.
 * @author Georg Fischer
 */
public class A086971 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A086971() {
    super(new A064911(), 0);
    next();
  }
}

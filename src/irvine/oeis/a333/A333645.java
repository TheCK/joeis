package irvine.oeis.a333;
// Generated by gen_seq4.pl moebiusix 1 A047994 1 at 2020-09-22 21:54
// DO NOT EDIT here!

import irvine.oeis.transform.InverseMobiusTransformSequence;
import irvine.oeis.a047.A047994;


/**
 * A333645 a(n) = Sum_{d|n} uphi(d).
 * @author Georg Fischer
 */
public class A333645 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A333645() {
    super(new A047994(), 0);
    next();
  }
}

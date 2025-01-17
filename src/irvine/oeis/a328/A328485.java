package irvine.oeis.a328;
// Generated by gen_seq4.pl moebiusix 1 A034448 1 at 2020-09-22 21:54
// DO NOT EDIT here!

import irvine.oeis.transform.InverseMobiusTransformSequence;
import irvine.oeis.a034.A034448;


/**
 * A328485 Dirichlet g.f.: zeta(s)^2 * zeta(s-1) / zeta(2*s-1).
 * @author Georg Fischer
 */
public class A328485 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A328485() {
    super(new A034448(), 0);
    next();
  }
}

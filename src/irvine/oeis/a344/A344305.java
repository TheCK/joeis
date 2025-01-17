package irvine.oeis.a344;
// Generated by gen_seq4.pl moebiusix 1 A160953 1 at 2021-06-29 22:31
// DO NOT EDIT here!

import irvine.oeis.transform.InverseMobiusTransformSequence;
import irvine.oeis.a160.A160953;


/**
 * A344305 Number of cyclic subgroups of the group (C_n)^9, where C_n is the cyclic group of order n.
 * @author Georg Fischer
 */
public class A344305 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A344305() {
    super(new A160953(), 0);
    next();
  }
}

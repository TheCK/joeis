package irvine.oeis.a188;
// Generated by gen_seq4.pl insect/union2 at 2022-02-24 19:57

import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000079;
import irvine.oeis.a000.A000290;

/**
 * A188915 Union of squares and powers of 2.
 * @author Georg Fischer
 */
public class A188915 extends UnionSequence {

  /** Construct the sequence. */
  public A188915() {
    super(new A000290(), new A000079());
  }
}

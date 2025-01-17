package irvine.oeis.a319;
// Generated by gen_seq4.pl weighx at 2021-05-28 22:45
// DO NOT EDIT here!

import irvine.oeis.transform.WeighTransformSequence;
import irvine.oeis.a000.A000225;


/**
 * A319919 Expansion of Product_{k&gt;=1} (1 + x^k)^(2^k-1).
 *
 * @author Georg Fischer
 */
public class A319919 extends WeighTransformSequence {

  /** Construct the sequence. */
  public A319919() {
    super(new A000225());
  }
}

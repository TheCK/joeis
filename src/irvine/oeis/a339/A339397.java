package irvine.oeis.a339;
// Generated by gen_seq4.pl moebiusx 1 A027187 at 2021-05-28 22:45
// DO NOT EDIT here!

import irvine.oeis.transform.MobiusTransformSequence;
import irvine.oeis.a027.A027187;


/**
 * A339397 Number of partitions of n into an even number of relatively prime parts.
 *
 * @author Georg Fischer
 */
public class A339397 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A339397() {
    super(new A027187(), 1);
    next();
  }
}

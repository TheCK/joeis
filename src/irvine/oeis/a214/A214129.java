package irvine.oeis.a214;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A214129 Partitions of n into parts congruent to +-1, +-5 (mod 13).
 * @author Georg Fischer
 */
public class A214129 extends EulerTransform {

  /** Construct the sequence. */
  public A214129() {
    super(new PeriodicSequence(1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0), 1);
  }
}

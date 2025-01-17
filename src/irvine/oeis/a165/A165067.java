package irvine.oeis.a165;
// Generated by gen_seq4.pl bref at 2020-11-27 17:17
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.BriefSequence;


/**
 * A165067 Consider the base-6 Kaprekar map x-&gt;K(x) described in A165051. Sequence gives the smallest number that belongs to a cycle of length n under repeated iteration of this map, or -1 if there is no cycle of length n.
 *
 * @author Georg Fischer
 */
public class A165067 extends BriefSequence {

  /** Construct the sequence. */
  public A165067() {
    super(Z.ZERO, new Z("4305"), new Z("16840"));
  }
}

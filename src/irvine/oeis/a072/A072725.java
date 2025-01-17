package irvine.oeis.a072;
// Generated by gen_seq4.pl bref at 2020-11-27 17:17
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.BriefSequence;


/**
 * A072725 Integers which are exactly the concatenation of the first m numbers (A007908) divided by their sum (A000217 = m*(m+1)/2).
 *
 * @author Georg Fischer
 */
public class A072725 extends BriefSequence {

  /** Construct the sequence. */
  public A072725() {
    super(Z.ONE, Z.FOUR, new Z("823"));
  }
}

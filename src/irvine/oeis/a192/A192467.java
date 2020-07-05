package irvine.oeis.a192;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A192467 <code>(A192466)/2</code>.
 * @author Georg Fischer
 */
public class A192467 implements Sequence {

  final Sequence mA192466 = new A192466();
  /** Construct the sequence. */
  public A192467() {
  }
  
  @Override
  public Z next() {
    return mA192466.next().divide(Z.TWO);
  }

}

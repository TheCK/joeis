package irvine.oeis.a285;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A285344 (A285342)/2.
 * @author Georg Fischer
 */
public class A285344 implements Sequence {

  final Sequence mA285342 = new A285342();
  @Override
  public Z next() {
    return mA285342.next().divide(Z.TWO);
  }

}

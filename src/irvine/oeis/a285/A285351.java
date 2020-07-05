package irvine.oeis.a285;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A285351 <code>a(n) = 2n + 1 - A285346(n)</code>.
 * @author Georg Fischer
 */
public class A285351 implements Sequence {

  final Sequence mA285346 = new A285346();
  protected long mN;
  /** Construct the sequence. */
  public A285351() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.TWO.multiply(Z.valueOf(mN)).add(Z.ONE).subtract(mA285346.next());
  }

}

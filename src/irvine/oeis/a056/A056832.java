package irvine.oeis.a056;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a096.A096268;

/**
 * A056832 All a(n) = 1 or 2; a(1) = 1; get next 2^k terms by repeating first 2^k terms and changing last element so sum of first 2^(k+1) terms is odd.
 * @author Georg Fischer
 */
public class A056832 implements Sequence {

  final Sequence mA096268 = new A096268();
  @Override
  public Z next() {
    return mA096268.next().add(Z.ONE);
  }

}

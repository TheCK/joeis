package irvine.oeis.a194;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a056.A056040;
import irvine.oeis.a152.A152271;

/**
 * A194590 a(n) = (-1)^n*(A056040(n+1)*A152271(n)-2^n)/2.
 * @author Georg Fischer
 */
public class A194590 implements Sequence {

  final Sequence mA056040 = new A056040();
  final Sequence mA152271 = new A152271();
  protected long mN;
  /** Construct the sequence. */
  public A194590() {
    mN = -1;
    mA056040.next();
  }
  
  @Override
  public Z next() {
    ++mN;
    return ((mN & 1L) == 0 ? Z.ONE : Z.NEG_ONE).multiply(mA056040.next().multiply(mA152271.next()).subtract(Z.TWO.pow(Z.valueOf(mN)))).divide(Z.TWO);
  }

}

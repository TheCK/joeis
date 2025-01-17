package irvine.oeis.a057;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005867;

/**
 * A057857 Number of residue classes modulo n-th primorial number which contain a prime.
 * @author Georg Fischer
 */
public class A057857 implements Sequence {

  final Sequence mA005867 = new A005867();
  protected long mN;
  /** Construct the sequence. */
  public A057857() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA005867.next().add(Z.valueOf(mN));
  }

}

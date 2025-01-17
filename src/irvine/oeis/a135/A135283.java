package irvine.oeis.a135;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001359;
import irvine.oeis.a054.A054735;
/**
 * A135283 Sum of staircase twin primes according to the rule: top + bottom + next top.
 * @author Georg Fischer
 */
public class A135283 implements Sequence {

  private final Sequence mA001359 = new A001359();
  private final Sequence mA054735 = new A054735();
  /** Construct the sequence. */
  public A135283() {
    mA001359.next();
  }
  
  @Override
  public Z next() {
    return mA054735.next().add(mA001359.next());
  }

}

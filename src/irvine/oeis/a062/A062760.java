package irvine.oeis.a062;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007947;
import irvine.oeis.a051.A051904;
/**
 * A062760 a(n) is n divided by the largest power of the squarefree kernel of n (A007947) which divides it.
 * @author Georg Fischer
 */
public class A062760 implements Sequence {

  private final Sequence mA007947 = new A007947();
  private final Sequence mA051904 = new A051904();
  protected long mN;
  /** Construct the sequence. */
  public A062760() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).divide(mA007947.next().pow(mA051904.next()));
  }

}

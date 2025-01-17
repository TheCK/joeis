package irvine.oeis.a051;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007949;

/**
 * A051064 3^a(n) exactly divides 3n. Or, 3-adic valuation of 3n.
 * @author Georg Fischer
 */
public class A051064 implements Sequence {

  final Sequence mA007949 = new A007949();
  @Override
  public Z next() {
    return mA007949.next().add(Z.ONE);
  }

}

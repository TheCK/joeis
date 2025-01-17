package irvine.oeis.a069;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a053.A053574;

/**
 * A069177 Maximal power of 2 that divides Phi(n), or the size of the Sylow 2-subgroup of the group of units mod n.
 * @author Georg Fischer
 */
public class A069177 implements Sequence {

  final Sequence mA053574 = new A053574();
  @Override
  public Z next() {
    return Z.TWO.pow(mA053574.next());
  }

}

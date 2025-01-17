package irvine.oeis.a145;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a002.A002654;

/**
 * A145392 Number of inequivalent sublattices of index n in square lattice, where two sublattices are considered equivalent if one can be rotated by a multiple of Pi/2 to give the other.
 * @author Georg Fischer
 */
public class A145392 implements Sequence {

  final Sequence mA000203 = new A000203();
  final Sequence mA002654 = new A002654();
  @Override
  public Z next() {
    return mA000203.next().add(mA002654.next()).divide(Z.TWO);
  }

}

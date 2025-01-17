package irvine.oeis.a308;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a193.A193346;

/**
 * A308586 Number of (undirected) Hamiltonian paths on the n X n X n grid graph.
 * @author Georg Fischer
 */
public class A308586 implements Sequence {

  final Sequence mA193346 = new A193346();
  @Override
  public Z next() {
    return mA193346.next().divide(Z.TWO);
  }

}

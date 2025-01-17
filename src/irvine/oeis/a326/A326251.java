package irvine.oeis.a326;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a054.A054726;

/**
 * A326251 Number of digraphs with vertices {1..n} whose increasing edges are not crossing.
 * @author Georg Fischer
 */
public class A326251 implements Sequence {

  final Sequence mA054726 = new A054726();
  protected long mN;
  /** Construct the sequence. */
  public A326251() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.TWO.pow(Z.valueOf(mN).multiply(Z.valueOf(mN).add(Z.ONE)).divide(Z.TWO)).multiply(mA054726.next());
  }

}

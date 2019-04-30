package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A010060 Thue-Morse sequence: let A_k denote the first <code>2^k</code> terms; then A_0 <code>= 0</code> and for <code>k &gt;= 0</code>, A_{k+1} = A_k B_k, where B_k is obtained from A_k by interchanging 0's and 1's.
 * @author Sean A. Irvine
 */
public class A010060 extends MemorySequence {

  @Override
  protected Z computeNext() {
    return size() == 0 ? Z.ZERO : get(size() / 2).add(size()).mod(Z.TWO);
  }
}


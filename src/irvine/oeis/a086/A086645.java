package irvine.oeis.a086;
// Generated by gen_seq4.pl latriang at 2020-07-28 21:29

import irvine.math.z.Z;
import irvine.oeis.LatticeCoordinationSequence;


/**
 * A086645 Triangle read by rows: T(n, k) = binomial(2n, 2k).
 * @author Georg Fischer
 */
public class A086645 extends LatticeCoordinationSequence {

  /** Construct the sequence. */
  public A086645() {
    super("C", 0);
  }

  @Override
  public Z next() {
    return nextTriangleElement("C", 0); 
  } 
}

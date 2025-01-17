package irvine.oeis.a136;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001349;
import irvine.oeis.a011.A011782;

/**
 * A136722 Number of preferential arrangements (or hierarchical orderings) on the connected graphs on n unlabeled nodes.
 * @author Georg Fischer
 */
public class A136722 implements Sequence {

  final Sequence mA001349 = new A001349();
  final Sequence mA011782 = new A011782();
  @Override
  public Z next() {
    return mA001349.next().multiply(mA011782.next());
  }

}

package irvine.oeis.a087;
// Generated by gen_seq4.pl moderiv at 2020-07-25 14:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a008.A008275;


/**
 * A087755 Triangle read by rows: Stirling numbers of the first kind (A008275) mod 2.
 * @author Georg Fischer
 */
public class A087755 extends A008275 {

  /** Construct the sequence. */
  public A087755() {
    super();
  }

  @Override
  public Z next() {
    return super.next().mod(Z.TWO);
  }
}

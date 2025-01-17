package irvine.oeis.a057;
// Generated by gen_seq4.pl floor at 2021-08-28 23:11

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A057073 floor[11^11/n].
 * @author Georg Fischer
 */
public class A057073 extends FloorSequence {
  /** Construct the sequence. */
  public A057073() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.valueOf(285311670611L).divide(CR.valueOf(n)).floor();
  }

}

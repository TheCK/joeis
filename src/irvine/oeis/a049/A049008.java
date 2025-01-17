package irvine.oeis.a049;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a004.A004396;

/**
 * A049008 Greatest possible number of right angles that can occur as interior angles in a planar n-gon.
 * @author Sean A. Irvine
 */
public class A049008 extends PrependSequence {

  /** Construct the sequence. */
  public A049008() {
    super(new SkipSequence(new A004396(), 7), 1, 4, 3);
  }
}

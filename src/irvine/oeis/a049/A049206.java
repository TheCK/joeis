package irvine.oeis.a049;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a004.A004525;

/**
 * A049206 Maximum mean distance between cards during perfect faro shuffles, with cut, to return to original order in A024222.
 * @author Sean A. Irvine
 */
public class A049206 extends PrependSequence {

  /** Construct the sequence. */
  public A049206() {
    super(new SkipSequence(new A004525(), 2), 0);
  }
}
